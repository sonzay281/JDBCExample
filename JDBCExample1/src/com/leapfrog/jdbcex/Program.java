/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.jdbcex;

import com.leapfrog.jdbcex.products.ProductsMenu;
import com.leapfrog.jdbcex.suppliers.SuppliersMenu;
import java.util.Scanner;

/**
 *
 * @author Anonymous
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("=============Main menu===============");
            System.out.println("1.Product\t2.Category\n3.Suppliers\t4.customers\n\t5.Exit");
            System.out.print("Choose option[1-5]:");
            int option = input.nextInt();
            switch (option) {
                case 1:
                    ProductsMenu.main(args);
                    break;
                case 2:

                    break;
                case 3:
                    SuppliersMenu.main(args);
                    break;
                case 4:

                    break;
                case 5:
                    System.out.println("Thanks dear.See you again :D");
                    System.exit(0);
                default:
                    System.out.println("Please choose a valid option.");
            }
            System.out.println("Do you want to continue.[Y/N]");
            if (input.next().equalsIgnoreCase("n")) {
                System.exit(0);
            }

        }

    }
}
