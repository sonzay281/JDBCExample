/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.jdbcex.products;

import com.leapfrog.jdbcex.products.entity.AddProduct;
import com.leapfrog.jdbcex.Program;
import com.leapfrog.jdbcex.products.entity.DeleteProduct;
import com.leapfrog.jdbcex.products.entity.ShowAll;
import com.leapfrog.jdbcex.products.entity.UpdateProduct;
import java.util.Scanner;

/**
 *
 * @author Anonymous
 */
public class ProductsMenu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("==============Product Menu=================");
        System.out.println("1.Add\t2.Update\t3.Delete\n4.Search\t5.Show all\t6.Back");
        System.out.print("\nChoose option[1-6]:");
        int option = input.nextInt();
        switch (option) {
            case 1:
                AddProduct.main(args);
                break;
            case 2:
                UpdateProduct.main(args);
                break;
            case 3:
                DeleteProduct.main(args);
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
