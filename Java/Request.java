package Trident;


/**
 * Write a description of class Request here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.io.*;
public class Request
{
    Scanner input = new Scanner(System.in);
    public String option = " ";
    public  static void  Requests()
    {
       String option = " ";
       Scanner input = new Scanner(System.in);
       while(option!=("E"))
         {
            System.out.println("\n Please enter one of the options below: ");
            System.out.println("V - View current requests");
            System.out.println("C - Cancel requests");
            System.out.println("E - Exit");
            System.out.print("Selected option: ");
            option = input.nextLine().toUpperCase();
            switch(option){
                case "V": adminviewrequests();
                break;
                case "C": admincancelrequests();
                break;
                case "E": System.exit(1);
                break;
                default: System.out.println("Invalid option");
                break;
            }
         }
    }
    public static void Requests1()
    {
         String option = " ";
         Scanner input = new Scanner(System.in);
         while(option!=("E"))
         {
            System.out.println("\n Please enter one of the options below: ");
            System.out.println("M - Make a request");
            System.out.println("C - Cancel requests");
            System.out.println("E - Exit");
            System.out.print("Selected option: ");
            option = input.nextLine().toUpperCase();
            switch(option){
                case "M": makerequest();
                break;
                case "C": admincancelrequests();
                break;
                default: System.out.println("Invalid option");
                break;
                case "E": System.exit(1);
                break;
            }
         }
    }

    
    public static void adminviewrequests()
    {
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader("C:\\Users\\Britt\\Desktop\\Trident\\Trident\\Requests.txt"));
            String str;
            while((str = br.readLine()) !=null){
                System.out.println(str);
                str = br.readLine();
            }
            br.close();
        } catch(IOException e){
            System.out.println("Error! File not found");
        }
    }
    public  static void admincancelrequests()
    {
        // code to cancel a request that has been made
        int row=0;
    }
    public static void makerequest()
    {
        String type, date, qty, time;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the resource: ");
        type = input.nextLine();
        System.out.print("Enter the quantity: ");
        qty = input.nextLine();
        System.out.print("Enter the date: ");
        date = input.nextLine();
        System.out.print("Enter the time: ");
        time = input.nextLine();
        
        try{
            FileWriter fw = new FileWriter("C:\\Users\\Britt\\Desktop\\Trident\\Trident\\Requests.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            
            pw.println(type);
            pw.println(qty);
            pw.println(date);
            pw.println(time);
            pw.close();
        }catch(IOException e){
            System.out.println("Error! File does not exist");
         }
         System.out.println("Request successfully made");
    }
}
