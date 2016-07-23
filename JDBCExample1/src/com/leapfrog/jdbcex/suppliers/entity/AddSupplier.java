/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.jdbcex.suppliers.entity;

import com.leapfrog.jdbcex.suppliers.dao.SupplierDAO;
import com.leapfrog.jdbcex.suppliers.dao.impl.SupplierDAOImpl;
import com.leapfrog.jdbcex.suppliers.Supplier;
import java.sql.SQLException;

/**
 *
 * @author Anonymous
 */
public class AddSupplier {

    public static void main(String[] args) {
        try {
            SupplierDAO supplierDAO = new SupplierDAOImpl();
            supplierDAO.insert(new Supplier(0, "Siddhartha Store", "Mens wear", true));
        } catch (ClassNotFoundException | SQLException ce) {
            System.out.println(ce.getMessage());
        }
    }

}
