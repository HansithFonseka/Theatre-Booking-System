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
            
            }
        }
    }
}
