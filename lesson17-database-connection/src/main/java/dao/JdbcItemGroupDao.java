package dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import bean.ItemGroup;
import bean.ItemGroupDto;
import dao.base.GenericDao;
import utils.IoUtils;

public class JdbcItemGroupDao extends GenericDao<ItemGroup> implements ItemGroupDao {

	private static final String GET_ALL_ITEM_GROUPS = "" + "SELECT * FROM T07_ITEM_GROUP";
	
	private static final String GET_ALL_ITEM_GROUPS_DETAILS = "" 
			+ "SELECT t07.C07_ITEM_GROUP_ID "+ItemGroupDto.PROP_ID+",\n"
			+ "	      t07.C07_ITEM_GROUP_NAME "+ItemGroupDto.PROP_NAME+",\n"
			+ "	      SUM(t03.C03_AMOUNT) "+ItemGroupDto.PROP_AMOUNT_OF_ITEM+",\n"
			+ "	      GROUP_CONCAT(concat(t01.C01_ITEM_NAME, '-', t03.C03_SIZE_ID, '-', t03.C03_AMOUNT))"+ItemGroupDto.PROP_ITEM_DETAIL+"\n"
			+ "  FROM t07_item_group t07\n"
			+ "  JOIN t01_item t01\n"
			+ "    ON t01.C01_ITEM_GROUP_ID = t07.C07_ITEM_GROUP_ID\n"
			+ "  JOIN t03_item_detail t03\n"
			+ "    ON t03.C03_ITEM_ID = t01.C01_ITEM_ID\n"
			+ " GROUP BY t07.C07_ITEM_GROUP_ID;";

	private static final String GET_ITEM_GROUP_BY_ID = "" + "SELECT * \n" + "  FROM T07_ITEM_GROUP\n"
			+ " WHERE C07_ITEM_GROUP_ID = ?";

	private static final String GET_ITEM_GROUP_BY_NAME = "" + "SELECT * \n" + "  FROM T07_ITEM_GROUP\n"
			+ " WHERE C07_ITEM_GROUP_NAME = ?";

	private static final String INSERT_ITEM_GROUP = "" + "INSERT INTO T07_ITEM_GROUP(C07_ITEM_GROUP_NAME, C07_STATUS)\n"
			+ "VALUES(?, ?)";

	private static final String UPDATE_ITEM_GROUP = "" + "UPDATE T07_ITEM_GROUP\n" + "   SET C07_ITEM_GROUP_NAME = ?,\n"
			+ "       C07_STATUS = ?\n" + " WHERE C07_ITEM_GROUP_ID = ?";

	@Override
	public List<ItemGroup> getAll() {
		return getAll(GET_ALL_ITEM_GROUPS, rs -> {
			ItemGroup group = null;
			try {	
				group = transform(rs);
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return group;
		});	
	}
	
	@Override
	public List<ItemGroupDto> getItemGroupDetails() {
		return getList(GET_ALL_ITEM_GROUPS_DETAILS, rs -> {
			ItemGroupDto group = null;
			try {
				group = transformItemGroupDto(rs);
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return group;
		});	
	}

	@Override
	public ItemGroup get(int id) {
		return get(GET_ITEM_GROUP_BY_ID, pst -> {
			try {
				pst.setInt(1, id);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}, rs -> {
			ItemGroup group = null;
			try {
				group = transform(rs);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return group;
		});
	}

	@Override
	public ItemGroup get(String name) {
		return get(GET_ITEM_GROUP_BY_NAME, pst -> {
			try {
				pst.setString(1, name);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}, rs -> {
			ItemGroup group = null;
			try {
				group = transform(rs);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return group;
		});
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
		});
	}

	@Override
	public void saveGroups(List<ItemGroup> groups) {
		try {
			pst = conn.prepareStatement(INSERT_ITEM_GROUP);
			int counter = 0;
			for (ItemGroup group : groups) {
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
		});
	}

	public static ItemGroup transform(ResultSet rs) throws SQLException {
		return new ItemGroup(rs.getInt("C07_ITEM_GROUP_ID"), rs.getString("C07_ITEM_GROUP_NAME"),
				rs.getBoolean("C07_STATUS"));
	}
	
	public static ItemGroupDto transformItemGroupDto(ResultSet rs) throws SQLException {
		return new ItemGroupDto(
				rs.getInt(ItemGroupDto.PROP_ID), 
				rs.getString(ItemGroupDto.PROP_NAME),
				rs.getInt(ItemGroupDto.PROP_AMOUNT_OF_ITEM), 
				rs.getString(ItemGroupDto.PROP_ITEM_DETAIL));
	}
}