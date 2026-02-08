package dao.base;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

import connection.DbConnection;
import utils.IoUtils;

public class GenericDao<E> {
	
	protected static final int BATCH_SIZE = 1000;

	protected Connection conn;
	protected Statement st;
	protected PreparedStatement pst;
	protected ResultSet rs;

	public GenericDao() {
		conn = DbConnection.getConnection();
	}
	
	protected List<E> getAll(String sql, Function<ResultSet, E> funcReturn) {
		final var result = new ArrayList<E>();
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				E element = funcReturn.apply(rs);
				result.add(element);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			IoUtils.close(rs, st);
		}
		return result;
	}
	
	protected <T> List<T> getList(String sql, Function<ResultSet, T> funcReturn) {
		return getList(sql, pst -> {}, funcReturn);
	}
	
	protected <T> List<T> getList(String sql, Consumer<PreparedStatement> paramSetters, Function<ResultSet, T> funcReturn) {
		final var result = new ArrayList<T>();
		try {
			pst = conn.prepareStatement(sql);
			paramSetters.accept(pst);
			rs = pst.executeQuery();
			while (rs.next()) {
				T element = funcReturn.apply(rs);
				result.add(element);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			IoUtils.close(rs, pst);
		}
		return result;
	}

	protected E get(String sql, Consumer<PreparedStatement> paramSetters, Function<ResultSet, E> funcReturn) {
		E result = null;
		try {
			pst = conn.prepareStatement(sql);
			paramSetters.accept(pst);
			rs = pst.executeQuery();
			if (rs.next()) {
				result = funcReturn.apply(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			IoUtils.close(rs, pst);
		}
		return result;
	}

	protected void executeUpdate(String sql, Consumer<PreparedStatement> paramSetters) {
		try {
			pst = conn.prepareStatement(sql);
			paramSetters.accept(pst);
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			IoUtils.close(pst);
		}
	}

}
