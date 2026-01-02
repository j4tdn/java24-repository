package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.ItemGroup;
import connection.DbConnection;
import base.GenericDao;
import utils.IoUtils;

public class JdbcItemGroupDao extends GenericDao implements ItemGroupDao {
	
	private static final int BATCH_SIZE = 1000;
	
	private Connection conn;
	
	public JdbcItemGroupDao() {
		conn = DbConnection.getConnection();
	}
	
	private static final String GET_ALL_ITEM_GROUPS = ""
			+ "SELECT * FROM T07_ITEM_GROUP";
	
	private static final String GET_ITEM_GROUP_BY_ID = ""
			+ "SELECT * \n"
			+ "  FROM T07_ITEM_GROUP\n"
			+ " WHERE C07_ITEM_GROUP_ID = ?";
	
	private static final String INSERT_ITEM_GROUP = ""
			+ "INSERT INTO T07_ITEM_GROUP(C07_ITEM_GROUP_NAME, C07_STATUS)\n"
			+ "VALUES(?, ?)";
	
	private static final String UPDATE_ITEM_GROUP = ""
			+ "UPDATE T07_ITEM_GROUP\n"
			+ "   SET C07_ITEM_GROUP_NAME = ?,\n"
			+ "       C07_STATUS = ?\n"
			+ " WHERE C07_ITEM_GROUP_ID = ?";
	
	@Override
	public List<ItemGroup> getAll() {
		final var result = new ArrayList<ItemGroup>();
		try {
			st = conn.createStatement();
			rs = st.executeQuery(GET_ALL_ITEM_GROUPS);
			while (rs.next()) {
				ItemGroup group = new ItemGroup(
						rs.getInt("C07_ITEM_GROUP_ID"), 
						rs.getString("C07_ITEM_GROUP_NAME"), 
						rs.getBoolean("C07_STATUS"));
				result.add(group);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			IoUtils.close(rs, st);
		}
		return result;
	}

	@Override
	public ItemGroup get(int id) {
		ItemGroup result = null;
		try {
			pst = conn.prepareStatement(GET_ITEM_GROUP_BY_ID);
			pst.setInt(1, id);
			rs = pst.executeQuery();
			if (rs.next()) {
				result = new ItemGroup(
					rs.getInt("C07_ITEM_GROUP_ID"), 
					rs.getString("C07_ITEM_GROUP_NAME"), 
					rs.getBoolean("C07_STATUS"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			IoUtils.close(rs, pst);
		}
		return result;
	}
	
	@Override
	public void save(ItemGroup group) {
		executeUpdate(INSERT_ITEM_GROUP, pst -> {
			try {
				pst.setString(1, group.getName());
				pst.setBoolean(2, group.getStatus());
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}, group);
	}
	
	@Override
	public void saveGroups(List<ItemGroup> groups) {
		try {
			pst = conn.prepareStatement(INSERT_ITEM_GROUP);
			int counter = 0;
			for (ItemGroup group: groups) {
				pst.setString(1, group.getName());
				pst.setBoolean(2, group.getStatus());
				pst.addBatch();
				if (++counter % BATCH_SIZE == 0) {
					pst.executeBatch();
				}
			}
			pst.executeBatch();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			IoUtils.close(pst);
		}
	}
	
	@Override
	public void update(ItemGroup group) {
		executeUpdate(UPDATE_ITEM_GROUP, pst -> {
			try {
				pst.setString(1, group.getName());
				pst.setBoolean(2, group.getStatus());
				pst.setInt(3, group.getId());
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}, group);
	}

	@Override
	public ItemGroup get(String name) {
		ItemGroup result = null;
		String sql = "SELECT * FROM T07_ITEM_GROUP WHERE C07_ITEM_GROUP_NAME = ?";
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, name);
			rs = pst.executeQuery();
			if(rs.next()) {
				result = new ItemGroup(rs.getInt("C07_ITEM_GROUP_ID"), rs.getString("C07_ITEM_GROUP_NAME"), rs.getBoolean("C07_STATUS"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			IoUtils.close(rs, pst);
		}
		
		return result;
	}
}
