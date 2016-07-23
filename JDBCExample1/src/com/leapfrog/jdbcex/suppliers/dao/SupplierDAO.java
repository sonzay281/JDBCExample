/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.jdbcex.suppliers.dao;

import com.leapfrog.jdbcex.suppliers.Supplier;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Anonymous
 */
public interface SupplierDAO {

    int insert(Supplier s) throws ClassNotFoundException, SQLException;

    int update(Supplier s) throws ClassNotFoundException, SQLException;

    int delete(int id) throws ClassNotFoundException, SQLException;

    Supplier getById(int id) throws ClassNotFoundException, SQLException;

    List<Supplier> getAll() throws ClassNotFoundException, SQLException;

}
