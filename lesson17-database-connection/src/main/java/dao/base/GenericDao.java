package dao.base;

import connection.DbConnection;
import utils.IoUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.function.Consumer;

public class GenericDao {
    protected Connection connection;
    protected Statement st;
    protected PreparedStatement pst;
    protected ResultSet rs;

    public GenericDao() {
        connection = DbConnection.getConnection();
    }
    protected <E> void excuteUpdate (String sql, Consumer<PreparedStatement> paramSetter, E element){
        try {
             pst = connection.prepareStatement(sql);
             paramSetter.accept(pst);
             pst.executeUpdate();
         } catch (Exception e) {
             e.printStackTrace();
         } finally {
             IoUtils.close(pst);
         }
    }
}
