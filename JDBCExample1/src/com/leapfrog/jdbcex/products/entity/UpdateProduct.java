/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.jdbcex.products.entity;

import com.leapfrog.jdbcex.products.Dao.ProductDAO;
import com.leapfrog.jdbcex.products.Dao.impl.ProductDAOImpl;
import com.leapfrog.jdbcex.products.Product;
import java.sql.SQLException;

/**
 *
 * @author Anonymous
 */
public class UpdateProduct {
      public static void main(String[] args) {
        try {
            ProductDAO productdao = new ProductDAOImpl();
            productdao.update(new Product(3, "Shirt", "Mens wear", true));
        } catch (ClassNotFoundException | SQLException ce) {
            System.out.println(ce.getMessage());
        }
    }
}
