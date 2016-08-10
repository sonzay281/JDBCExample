/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.jdbcex.customers.entity;

import com.leapfrog.jdbcex.customers.dao.CustomerDAO;
import com.leapfrog.jdbcex.customers.dao.impl.CustomerDAOImpl;
import java.sql.SQLException;

/**
 * 
 * @author Anonymous
 */
public class DeleteCustomer {

    public static void main(String[] args) {
        try {
            CustomerDAO customerdao = new CustomerDAOImpl();
            customerdao.delete(4);
        } catch (ClassNotFoundException | SQLException ce) {
            System.out.println(ce.getMessage());
        }
    }
}
