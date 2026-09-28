/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.devisesalesconsole;

/**
 *
 * @author simph
 */
public class DeviseSalesConsole {

    public interface IConsoles {
    String getConsoleType();
    String getStore();
    int getTotalSales();
    }
}
public class ConsoleSales {
    public abstract class Consoles implements IConsoles {
    protected String consoleType;
    protected String store;
    protected int totalSales;

    public Consoles(String consoleType, String store, int totalSales) {
        this.consoleType = consoleType;
        this.store = store;
        this.totalSales = totalSales;
    }

    @Override
    public String getConsoleType() { return consoleType; }

    @Override
    public String getStore() { return store; }

    @Override
    public int getTotalSales() { return totalSales; }

    public abstract void printReport();
}
}
public class RunApplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //One dimensional array
        String[] types = {"PS5", "XBOX", "NINTENDO SWITCH"};

        System.out.println("Select a console type:");
        for (int i = 0; i < types.length; i++) {
            System.out.println((i + 1) + ". " + types[i]);
        }
        int choice;
        do {
            System.out.print("Enter choice (1-3): ");
            while (!in.hasNextInt()) { in.next(); System.out.print("Enter choice (1-3): "); }
            choice = in.nextInt();
        } while (choice < 1 || choice > 3);
        in.nextLine();

        //Print report
        System.out.print("Enter store name: ");
        String store = in.nextLine();

        System.out.print("Enter total amount of sales: ");
        while (!in.hasNextInt()) { in.next(); System.out.print("Enter a whole number: "); }
        int total = in.nextInt();

        Console sale = new ConsoleSales(types[choice - 1], store, total);
        sale.printReport();
    }
}

