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
public class SearchById {

    public static void main(String[] args) {
        try {
            CustomerDAO customerDAO = new CustomerDAOImpl();
            Customer c= customerDAO.getById(1);
            System.out.println("---------------------------");
            System.out.println("Customer Id: " + c.getId());
            System.out.println("Customer Name: " +c.getName());
            System.out.println("Customer Discription: " + c.getDescription());
            System.out.println("Customer Added on: " + c.getAddedDate());
            // System.out.println("Customer Id Modified on: "+p.getModifiedDate());
            System.out.println("Customer Status: " + c.isStatus());

        } catch (ClassNotFoundException | SQLException ce) {
            System.out.println(ce.getMessage());
        }
    }
}
