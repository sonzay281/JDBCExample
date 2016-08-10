/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.jdbcex.customers;

import com.leapfrog.jdbcex.customers.entity.AddCustomer;
import com.leapfrog.jdbcex.Program;
import com.leapfrog.jdbcex.customers.entity.DeleteCustomer;
import com.leapfrog.jdbcex.customers.entity.ShowAll;
import com.leapfrog.jdbcex.customers.entity.UpdateCustomer;
import java.util.Scanner;

/**
 *
 * @author Anonymous
 */
public class CustomersMenu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("==============Customer Menu=================");
        System.out.println("1.Add\t2.Update\t3.Delete\n4.Search\t5.Show all\t6.Back");
        System.out.print("\nChoose option[1-6]:");
        int option = input.nextInt();
        switch (option) {
            case 1:
                AddCustomer.main(args);
                break;
            case 2:
                UpdateCustomer.main(args);
                break;
            case 3:
                DeleteCustomer.main(args);
                break;
            case 4:
                System.out.println("Under construction :P\nVisit again after few hours.");
                // SearchById.main(args);
                break;
            case 5:
                ShowAll.main(args);
                break;
            case 6:
                Program.main(args);
                break;
        }

    }

}
