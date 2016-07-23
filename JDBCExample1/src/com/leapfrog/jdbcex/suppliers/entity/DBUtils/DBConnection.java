/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.jdbcex.suppliers.entity.DBUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Anonymous
 */
public class DBConnection {

    private Connection conn;
    PreparedStatement stmt;

    public void open() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/eshop", "root", null);

    }

    public PreparedStatement initStatement(String sql) throws SQLException, ClassNotFoundException {

        stmt = conn.prepareStatement(sql);
        return stmt;
    }

    public void close() throws ClassNotFoundException, SQLException {
        conn.close();

    }

    public int executeUpdate() throws SQLException {
        return stmt.executeUpdate();
    }

    public ResultSet executeQuery() throws SQLException {
        return stmt.executeQuery();
    }

}
