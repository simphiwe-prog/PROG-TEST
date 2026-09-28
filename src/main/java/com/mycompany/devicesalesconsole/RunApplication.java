/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.devicesalesconsole;

/**
 *
 * @author simph
 */
import java.util.Scanner;

public class RunApplication {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // One dimensional array
        String[] types = {"PS5", "XBOX", " SWITCH"};

        System.out.println("Select a console type:");

        for (int i = 0; i < types.length; i++) {
            System.out.println((i + 1) + ". " + types[i]);
        }

        int choice;

        do {
            System.out.print("Enter choice (1-3): ");

            while (!in.hasNextInt()) {
                in.next();
                System.out.print("Enter choice (1-3): ");
            }

            choice = in.nextInt();

        } while (choice < 1 || choice > 3);

        in.nextLine();

        // Print report
        System.out.print("Enter store name: ");
        String store = in.nextLine();

        System.out.print("Enter total amount of sales: ");

        while (!in.hasNextInt()) {
            in.next();
            System.out.print("Enter a whole number: ");
        }

        int total = in.nextInt();

        ConsoleSales sale = new ConsoleSales(
                types[choice - 1],
                store,
                total
        );

        sale.printReport();
    }
}