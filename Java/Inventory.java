package Trident;

import java.util.*;
import java.io.*;
/**
 * Write a description of class Inventory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inventory
{

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    
    public static void inventories()
    {
        Scanner input = new Scanner(System.in);
        String option = " ";
        while(option!=("E"))
         {
            System.out.println("\n Please enter one of the options below: ");
            System.out.println("V - View Inventory");
            System.out.println("A - Add resource");
            System.out.println("E - Exit");
            System.out.print("Selected option: ");
            option = input.nextLine().toUpperCase();
            switch(option){
                case "V": viewinventory();
                break;
                case "A": addresource();
                break;
                case "E": System.exit(1);
                break;
                default: System.out.println("Invalid option");
                break;
            }
         }
    }
    public static void viewinventory()
    {
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader("C:\\Users\\Britt\\Desktop\\Trident\\Trident\\Inventory.txt"));
            String str;
            System.out.println(" ");
            while((str = br.readLine()) !=null){
                System.out.println(str);
                str = br.readLine();
            }
            br.close();
        } catch(IOException e){
            System.out.println("Error! File not found");
        }
        
    }
    public static void addresource()
    {
        Scanner input = new Scanner(System.in);
        String type, option = " ";
        int qty;
        System.out.print("\nEnter the type of resource: ");
        type = input.nextLine();
        System.out.print("\nEnter the quantity: ");
        qty= input.nextInt();
        try{
            FileWriter fw = new FileWriter("C:\\Users\\Britt\\Desktop\\Trident\\Trident\\Inventory.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.println(type);
            pw.println(qty);
            pw.close();
        }catch(IOException e){
            System.out.println("\nError! File does not exist\n");
         }
        System.out.println("\n resource added to the inventory");
    }
}
