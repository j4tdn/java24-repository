package view;

import java.sql.Connection;

import connection.DbConnection;

public class Ex01TestConnection {
    public static void main(String[] args) {
        Connection connection = DbConnection.getConnection();

        System.out.println(connection);

    }
}
