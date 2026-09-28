/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gamingconsolereport1;

/**
 *
 * @author simph
 */
public class GamingConsoleReport1 {

    public static void main(String[] args) {

        // Single dimensional arrays
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
        String[] consoles = {"PS5", "XBOX", "SWITCH"};

        // Two dimensional array
        int[][] sales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };

        int highestSales = 0;
        String highestCity = "";

        System.out.println("Gaming Console Report");
        System.out.println("----------------------");

        for (int i = 0; i < sales.length; i++) {

            int total = 0;

            for (int j = 0; j < sales[i].length; j++) {
                total = total + sales[i][j];
            }

            System.out.println("City: " + cities[i]);
            System.out.println("PS5 sales: " + sales[i][0]);
            System.out.println("XBOX sales: " + sales[i][1]);
            System.out.println("SWITCH sales: " + sales[i][2]);
            System.out.println("Total sales: " + total);
            System.out.println();

            if (total > highestSales) {
                highestSales = total;
                highestCity = cities[i];
            }
        }

        System.out.println("City with the highest number of sales: " + highestCity);
        System.out.println("Highest total: " + highestSales);
    }
}