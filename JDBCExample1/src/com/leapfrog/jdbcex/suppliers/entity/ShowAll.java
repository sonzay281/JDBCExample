/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.jdbcex.suppliers.entity;

import com.leapfrog.jdbcex.suppliers.dao.SupplierDAO;
import com.leapfrog.jdbcex.suppliers.dao.impl.SupplierDAOImpl;

import java.sql.SQLException;


/**
 *
 * @author Anonymous
 */
public class ShowAll {
    public static void main(String[] args) {
        try {
            SupplierDAO supplierDAO = new SupplierDAOImpl();
            supplierDAO.getAll().forEach(p->{
                System.out.println("---------------------------");
                System.out.println("Supplier Id: " + p.getId());
                System.out.println("Supplier Name: " + p.getName());
                System.out.println("Supplier Discription: " + p.getDescription());
                System.out.println("Supplier Added on: " + p.getAddedDate());
                //   System.out.println("Supplier Id Modified on: "+p.getModifiedDate());
                System.out.println("Supplier Status: " + p.isStatus());

            
            });
        
        
        
        
        
        
        
        
        } catch (ClassNotFoundException | SQLException ce) {
            System.out.println(ce.getMessage());
        }
    } 
}
