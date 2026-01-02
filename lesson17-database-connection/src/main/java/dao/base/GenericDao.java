package dao.base;

import bean.ItemGroup;
import connection.DbConnection;
import utils.IoUtils;

import java.sql.*;
import java.util.function.Consumer;

public class GenericDao {
    protected Connection connection;
    protected PreparedStatement ps;
    protected ResultSet rs;
    protected Statement statement;

    public GenericDao() {
        connection = DbConnection.getConnection();
    }

    protected <E> void excuteUpdate(String sql, Consumer<PreparedStatement> paramSetters, E element) {
        try {
            ps = connection.prepareStatement(sql);
            paramSetters.accept(ps);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            IoUtils.close(ps);
        }
    }
}
