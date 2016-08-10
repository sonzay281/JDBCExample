/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.jdbcex.customers.entity;

import com.leapfrog.jdbcex.customers.dao.CustomerDAO;
import com.leapfrog.jdbcex.customers.dao.impl.CustomerDAOImpl;
import com.leapfrog.jdbcex.customers.Customer;
import java.sql.SQLException;

/**
 *
 * @author Anonymous
 */
public class UpdateCustomer {
      public static void main(String[] args) {
        try {
            CustomerDAO customerdao = new CustomerDAOImpl();
            customerdao.update(new Customer(3, "RamU Khadka", "New Customer", true));
        } catch (ClassNotFoundException | SQLException ce) {
            System.out.println(ce.getMessage());
        }
    }
}
