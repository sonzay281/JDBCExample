/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.jdbcex.products.entity;

import com.leapfrog.jdbcex.products.Dao.ProductDAO;
import com.leapfrog.jdbcex.products.Dao.impl.ProductDAOImpl;
import java.sql.SQLException;

/**
 * 
 * @author Anonymous
 */
public class DeleteProduct {

    public static void main(String[] args) {
        try {
            ProductDAO productdao = new ProductDAOImpl();
            productdao.delete(4);
        } catch (ClassNotFoundException | SQLException ce) {
            System.out.println(ce.getMessage());
        }
    }
}
