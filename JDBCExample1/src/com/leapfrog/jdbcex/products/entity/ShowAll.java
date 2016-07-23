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
public class ShowAll {
    public static void main(String[] args) {
        try {
            ProductDAO productDAO = new ProductDAOImpl();
            productDAO.getAll().forEach(p->{
                System.out.println("---------------------------");
                System.out.println("Product Id: " + p.getId());
                System.out.println("Product Name: " + p.getName());
                System.out.println("Product Discription: " + p.getDescription());
                System.out.println("Product Added on: " + p.getAddedDate());
                //   System.out.println("Product Id Modified on: "+p.getModifiedDate());
                System.out.println("Product Status: " + p.isStatus());

            
            });
        
        
        
        
        
        
        
        
        } catch (ClassNotFoundException | SQLException ce) {
            System.out.println(ce.getMessage());
        }
    } 
}
