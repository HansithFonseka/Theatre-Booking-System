import java.util.*;

import java.io.*;
public class Theatre {
    static Scanner optionIn = new Scanner(System.in);
    static int[] row1= new int[12];
    static int[] row2= new int[16];
    static int[] row3= new int[20];
    static ArrayList <Ticket> buyers = new ArrayList<>();   //array list to save all the tickets

    public static void main(String[] args) {
        System.out.println("Welcome to the New Theatre");

        //setting all the seats to 0
        for (int i = 0;i<row1.length;i++){
            row1[i] = 0;
        }
        for (int i = 0;i<row2.length;i++){
            row2[i] = 0;
        }
        for (int i = 0;i<row3.length;i++){
            row3[i] = 0;
        }

        boolean process = true;
        while(process){
            try {   //printing the Menu
                System.out.println("\n--------------------------------------------------");
                System.out.println("""
                Please select an option :
                1) Buy a ticket
                2) Print seating area
                3) Cancel ticket
                4) List available seats
                5) Save to file
                6) Load from file
                7) Print ticket information and total price
                8) Sort tickets by price
                    0) Quit""");
                System.out.println("--------------------------------------------------");
                System.out.println("\nEnter Option ");
                Scanner optionIn = new Scanner(System.in);
            
                int menuNumber = optionIn.nextInt();
                switch (menuNumber) {
                    case 1:
                        buy_ticket();
                        break;
                    case 2:
                        print_seating_area();
                        break;
                    case 3:
                        cancel_ticket();
                        break;
                    case 4:
                        show_available();
                        break;
                    case 5:
                        System.out.println("Saved to file");
                        save();
                        break;
                    case 6:
                        System.out.println("Load from file");
                        load();
                        break;
                    case 7:
                        System.out.println("Tickets Information");
                        show_tickets_info();
                        break;
                    case 8:
                        sort_tickets();
                        break;
                    case 0:
                        System.out.println("Thank you,Have a Nice Day!");
                        process = false;
                        break;
                    default:
                        System.out.println("invalid input.\nEnter a valid option!");
                        break;
                }
            }catch (Exception e) {
                System.out.println("Invalid input.\nEnter a valid option!");
            }
        }

    
