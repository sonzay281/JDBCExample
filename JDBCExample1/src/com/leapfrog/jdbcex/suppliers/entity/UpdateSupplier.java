/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.jdbcex.suppliers.entity;

import com.leapfrog.jdbcex.suppliers.dao.impl.SupplierDAOImpl;
import com.leapfrog.jdbcex.suppliers.Supplier;
import com.leapfrog.jdbcex.suppliers.dao.SupplierDAO;
import java.sql.SQLException;

/**
 *
 * @author Anonymous
 */
public class UpdateSupplier {
      public static void main(String[] args) {
        try {
            SupplierDAO supplierDAO = new SupplierDAOImpl();
            supplierDAO.update(new Supplier(3, "Siddhi Store", "Womens wear", true));
        } catch (ClassNotFoundException | SQLException ce) {
            System.out.println(ce.getMessage());
        }
    }
}
