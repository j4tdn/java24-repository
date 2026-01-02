package base;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.function.Consumer;

import connection.DbConnection;
import utils.IoUtils;

public class GenericDao {

	protected Connection conn;
	protected Statement st;
	protected PreparedStatement pst;
	protected ResultSet rs;

	public GenericDao() {
		conn = DbConnection.getConnection();
	}

	protected <E> void executeUpdate(String sql, Consumer<PreparedStatement> paramSetters, E element) {
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