/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.jdbcex.products.Dao;

import com.leapfrog.jdbcex.products.Product;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Anonymous
 */
public interface ProductDAO {

    int insert(Product p) throws ClassNotFoundException, SQLException;

    int update(Product p) throws ClassNotFoundException, SQLException;

    int delete(int id) throws ClassNotFoundException, SQLException;

    Product getById(int id) throws ClassNotFoundException, SQLException;

    List<Product> getAll() throws ClassNotFoundException, SQLException;

}
