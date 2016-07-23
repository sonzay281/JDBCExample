/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.jdbcex.products.Dao.impl;

import com.leapfrog.jdbcex.products.Dao.ProductDAO;
import com.leapfrog.jdbcex.products.Product;
import com.leapfrog.jdbcex.products.entity.DBUtil.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Anonymous
 */
public class ProductDAOImpl implements ProductDAO {
    
    private final DBConnection db = new DBConnection();
    
    @Override
    public int insert(Product p) throws ClassNotFoundException, SQLException {
        String sql = "INSERT INTO tbl_products(product_name,product_description,status) values(?,?,?)";
        db.open();
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setString(1, p.getName());
        stmt.setString(2, p.getDescription());
        stmt.setBoolean(3, p.isStatus());
        int result = db.executeUpdate();
        db.close();
        return result;
    }
    
    @Override
    public int update(Product p) throws ClassNotFoundException, SQLException {
        String sql = "UPDATE  tbl_products SET product_name=?,product_description=?,status=?WHERE product_id=?";
        db.open();
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setString(1, p.getName());
        stmt.setString(2, p.getDescription());
        stmt.setBoolean(3, p.isStatus());
        stmt.setInt(4, p.getId());
        int result = db.executeUpdate();
        db.close();
        return result;
    }
    
    @Override
    public int delete(int id) throws ClassNotFoundException, SQLException {
        String sql = "DELETE FROM  tbl_products WHERE product_id=?";
        db.open();
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setInt(1, id);
        int result = db.executeUpdate();
        db.close();
        return result;
    }
    
    @Override
    public Product getById(int id) throws ClassNotFoundException, SQLException {
        Product product = null;
        String sql = "SELECT * FROM tbl_products WHERE product_id=?";
        db.open();
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            product = new Product();
            product.setId(rs.getInt("product_id"));
            product.setName(rs.getString("product_name"));
            product.setDescription(rs.getString("product_description"));
            product.setAddedDate(rs.getDate("added_date"));
            //  product.setModifiedDate(rs.getDate("modified_date"));
            product.setStatus(rs.getBoolean("status"));            
        }
        db.close();
        return null;
        
    }
    
    @Override
    public List<Product> getAll() throws ClassNotFoundException, SQLException {
        List<Product> productList = new ArrayList<>();
        String sql = "SELECT * FROM tbl_products";
        db.open();
        PreparedStatement stmt = db.initStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Product product = new Product();
            product.setId(rs.getInt("product_id"));
            product.setName(rs.getString("product_name"));
            product.setDescription(rs.getString("product_description"));
            product.setAddedDate(rs.getDate("added_date"));
            //  product.setModifiedDate(rs.getDate("modified_date"));
            product.setStatus(rs.getBoolean("status"));
            productList.add(product);
        }
        db.close();
        return productList;
        
    }
    
}
