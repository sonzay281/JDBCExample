/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.jdbcex.suppliers.dao.impl;

import com.leapfrog.jdbcex.suppliers.dao.SupplierDAO;
import com.leapfrog.jdbcex.suppliers.Supplier;
import com.leapfrog.jdbcex.suppliers.entity.DBUtils.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Anonymous
 */
public class SupplierDAOImpl implements SupplierDAO {
    
    private final DBConnection db = new DBConnection();

   
    
    @Override
    public int insert(Supplier s) throws ClassNotFoundException, SQLException {
        String sql = "INSERT INTO tbl_suppliers(supplier_name,supplier_description,status) values(?,?,?)";
        db.open();
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setString(1, s.getName());
        stmt.setString(2, s.getDescription());
        stmt.setBoolean(3, s.isStatus());
        int result = db.executeUpdate();
        db.close();
        return result;
    }
    
    @Override
    public int update(Supplier s) throws ClassNotFoundException, SQLException {
        String sql = "UPDATE  tbl_suppliers SET supplier_name=?,supplier_description=?,status=?WHERE supplier_id=?";
        db.open();
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setString(1, s.getName());
        stmt.setString(2, s.getDescription());
        stmt.setBoolean(3, s.isStatus());
        stmt.setInt(4, s.getId());
        int result = db.executeUpdate();
        db.close();
        return result;
    }
    
    @Override
    public int delete(int id) throws ClassNotFoundException, SQLException {
        String sql = "DELETE FROM  tbl_suppliers WHERE supplier_id=?";
        db.open();
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setInt(1, id);
        int result = db.executeUpdate();
        db.close();
        return result;
    }
    
    @Override
    public Supplier getById(int id) throws ClassNotFoundException, SQLException {
        Supplier supplier = null;
        String sql = "SELECT * FROM tbl_suppliers WHERE supplier_id=?";
        db.open();
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            supplier = new Supplier();
            supplier.setId(rs.getInt("supplier_id"));
            supplier.setName(rs.getString("supplier_name"));
            supplier.setDescription(rs.getString("supplier_description"));
            supplier.setAddedDate(rs.getDate("added_date"));
            //  supplier.setModifiedDate(rs.getDate("modified_date"));
            supplier.setStatus(rs.getBoolean("status"));            
        }
        db.close();
        return null;
        
    }
    
    @Override
    public List<Supplier> getAll() throws ClassNotFoundException, SQLException {
        List<Supplier> supplierList = new ArrayList<>();
        String sql = "SELECT * FROM tbl_suppliers";
        db.open();
        PreparedStatement stmt = db.initStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Supplier supplier = new Supplier();
            supplier.setId(rs.getInt("supplier_id"));
            supplier.setName(rs.getString("supplier_name"));
            supplier.setDescription(rs.getString("supplier_description"));
            supplier.setAddedDate(rs.getDate("added_date"));
            //  supplier.setModifiedDate(rs.getDate("modified_date"));
            supplier.setStatus(rs.getBoolean("status"));
            supplierList.add(supplier);
        }
        db.close();
        return supplierList;
        
    }
    
}
