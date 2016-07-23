/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.jdbcex.suppliers;


import com.leapfrog.jdbcex.suppliers.entity.AddSupplier;
import com.leapfrog.jdbcex.Program;
import com.leapfrog.jdbcex.suppliers.entity.DeleteSupplier;
import com.leapfrog.jdbcex.products.entity.ShowAll;
import com.leapfrog.jdbcex.suppliers.entity.UpdateSupplier;
import java.util.Scanner;

/**
 *
 * @author Anonymous
 */
public class SuppliersMenu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("==============Suppliers Menu=================");
        System.out.println("1.Add\t2.Update\t3.Delete\n4.Search\t5.Show all\t6.Back");
        System.out.print("\nChoose option[1-6]:");
        int option = input.nextInt();
        switch (option) {
            case 1:
                AddSupplier.main(args);
                break;
            case 2:
                UpdateSupplier.main(args);
                break;
            case 3:
                DeleteSupplier.main(args);
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
