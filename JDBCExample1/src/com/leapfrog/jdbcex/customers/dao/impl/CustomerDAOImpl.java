/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.jdbcex.customers.dao.impl;

import com.leapfrog.jdbcex.customers.dao.CustomerDAO;
import com.leapfrog.jdbcex.customers.Customer;
import com.leapfrog.jdbcex.customers.entity.DBUtil.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Anonymous
 */
public class CustomerDAOImpl implements CustomerDAO {

    private final DBConnection db = new DBConnection();

    @Override
    public int insert(Customer c) throws ClassNotFoundException, SQLException {
        String sql = "INSERT INTO tbl_customer(customer_name,customer_description,status) values(?,?,?)";
        db.open();
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setString(1, c.getName());
        stmt.setString(2, c.getDescription());
        stmt.setBoolean(3, c.isStatus());
        int result = db.executeUpdate();
        db.close();
        return result;
    }

    @Override
    public int update(Customer c) throws ClassNotFoundException, SQLException {
        String sql = "UPDATE  tbl_customer SET customer_name=?,customer_description=?,status=?WHERE customer_id=?";
        db.open();
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setString(1, c.getName());
        stmt.setString(2, c.getDescription());
        stmt.setBoolean(3, c.isStatus());
        stmt.setInt(4, c.getId());
        int result = db.executeUpdate();
        db.close();
        return result;
    }

    @Override
    public int delete(int id) throws ClassNotFoundException, SQLException {
        String sql = "DELETE FROM  tbl_customer WHERE customer_id=?";
        db.open();
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setInt(1, id);
        int result = db.executeUpdate();
        db.close();
        return result;
    }

    @Override
    public Customer getById(int id) throws ClassNotFoundException, SQLException {
        Customer customer = null;
        String sql = "SELECT * FROM tbl_customer WHERE customer_id=?";
        db.open();
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            customer = new Customer();
            customer.setId(rs.getInt("customer_id"));
            customer.setName(rs.getString("customer_name"));
            customer.setDescription(rs.getString("customer_description"));
            customer.setAddedDate(rs.getDate("added_date"));
            //  customer.setModifiedDate(rs.getDate("modified_date"));
            customer.setStatus(rs.getBoolean("status"));
        }
        db.close();
        return null;

    }

    @Override
    public List<Customer> getAll() throws ClassNotFoundException, SQLException {
        List<Customer> customerList = new ArrayList<>();
        String sql = "SELECT * FROM tbl_customer";
        db.open();
        PreparedStatement stmt = db.initStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Customer customer = new Customer();
            customer.setId(rs.getInt("customer_id"));
            customer.setName(rs.getString("customer_name"));
            customer.setDescription(rs.getString("customer_description"));
            customer.setAddedDate(rs.getDate("added_date"));
            //  customer.setModifiedDate(rs.getDate("modified_date"));
            customer.setStatus(rs.getBoolean("status"));
            customerList.add(customer);
        }
        db.close();
        return customerList;

    }

}
