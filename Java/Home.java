package Trident;

import Trident.Request; 
import java.util.Scanner;
import java.util.*;
public class Home
{
    Scanner input = new Scanner(System.in);
    public String option = " ";
    /**
     * Constructor for objects of class Home
     */
    public Home()
    {
        
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in); 
        String option = " ";
        while(option!=("E"))
        {
            System.out.print("\n Main Menu:\n C - Client View \n A - Administrative View \n E  - Exit \n Select an option: ");
            option = input.nextLine().toUpperCase();
            switch(option){
                case "C": clientmenu();
                break;
                case "A": adminmenu();
                break;
                default: System.out.println("Invalid option");
                break;
                case "E": System.exit(1);
                break;
            }
        }
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static void clientmenu()
    {
        Scanner input = new Scanner(System.in);
        String option = " ";
        while(option!=("E"))
        {
            System.out.println("\n Please enter one of the options below: ");
            System.out.println("R - Requests");
            System.out.println("I - View Inventory");
            System.out.println("E - Exit Client Menu");
            System.out.print("Selected option: ");
            option = input.nextLine().toUpperCase();
            switch(option){
                case "R": Request.Requests1();
                break;
                case "I": Inventory.viewinventory();
                break;
                default: System.out.println("Invalid option");
                break;
                case "E": System.exit(1);
                break;
            }
        }  
    }
    public static void adminmenu()
    {
        Scanner input = new Scanner(System.in);
        String option = " ";
        while(option!=("E"))
        {
            System.out.println("\n Please enter one of the options below \n");
            System.out.println("R - Requests");
            System.out.println("I - Inventory");
            //System.out.println("S - Schedule");
            System.out.println("E - Exit Admin Menu");
            System.out.print("Selected option: ");
            option = input.nextLine().toUpperCase();
            switch(option){
                case "R": Request.Requests();
                break;
                case "I": Inventory.inventories();
                break;
                //case "S": schedule();
                //break;
                default: System.out.println("Invalid option");
                break;
                case "E": System.exit(1);
                break;
            }
        }  
    }
}
