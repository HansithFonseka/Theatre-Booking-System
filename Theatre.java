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

        private static void buy_ticket() {
            while (true) {
                try {
                    Scanner rowIn = new Scanner(System.in);   //getting row number as input
                    System.out.println("Enter the row number you need(1-3):");
                    int row_Number = rowIn.nextInt();
                    if (row_Number > 3 || row_Number < 1) {
                        System.out.println("Enter a valid row number according to the row!");
                        continue;
                    }
                    while (true) {
                        try {
                            Scanner seatIn = new Scanner(System.in);   //getting seat number as input
                            System.out.println("Enter your seat according to the rows:");
                            int seat_Number = seatIn.nextInt();
                            int[] choseRow;
                            //check validity in row 1
                            if (row_Number == 1) {
                                choseRow = row1;
                                if (seat_Number < 0 || seat_Number > 13) {
                                    System.out.println("Enter a valid seat number!");
                                }
                                if (seat_Number < 13 && seat_Number > 0) {
                                    if (choseRow[seat_Number - 1] == 0) {
                                        choseRow[seat_Number - 1] = 1;
    
                                        System.out.print("\nEnter your name: ");   //extended method to get the information of a Person
                                        String name = optionIn.next();
                                        System.out.print("\nEnter your surname: ");
                                        String surname = optionIn.next();
                                        String email = "";
                                        while (!email.matches("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b")) {
                                            if (!email.equals("")) {
                                                System.out.println("Invalid email.");
                                            }
                                            System.out.print("\nEnter your email: ");
                                            email = optionIn.next();
                                        }
                                        Person person = new Person(name, surname, email);
                                        Ticket ticket = new Ticket(1, seat_Number, 100, person);   //create a new ticket and adds the ticket in the new array list
                                        buyers.add(ticket);
                                        System.out.println("You have booked seat " +seat_Number + " in row " + row_Number + ".");
                                        break;
                                    } else {
                                        System.out.println("The seat is already booked!");
                                        continue;
                                    }
                                }
                            }
                            if (row_Number == 2) {
                                //check validity in row 2
                                choseRow = row2;
                                if (seat_Number < 0 || seat_Number > 17) {
                                    System.out.println("Enter a valid seat number!");
                                }
                                if (seat_Number < 17 && seat_Number > 0) {
                                    if (choseRow[seat_Number - 1] == 0) {
                                        choseRow[seat_Number - 1] = 1;
    
                                        System.out.print("\nEnter your name: ");   //extended method to get the information of a Person
                                        String name = optionIn.next();
                                        System.out.print("\nEnter your surname: ");
                                        String surname = optionIn.next();
                                        String email = "";
                                        while (!email.matches("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b")) {
                                            if (!email.equals("")) {
                                                System.out.println("Invalid email.");
                                            }
                                            System.out.print("\nEnter your email: ");
                                            email = optionIn.next();
                                        }
                                        Person person = new Person(name, surname, email);
                                        Ticket ticket = new Ticket(2, seat_Number, 200, person);   //create a new ticket and adds the ticket in the new array list
                                        buyers.add(ticket);
                                        System.out.println("You have booked seat " + seat_Number + " in row " + row_Number + ".");
                                        break;
                                    } else {
                                        System.out.println("The seat is already booked!");
                                        continue;
                                    }
                                }
                            }
                            if (row_Number == 3) {
                                //check validity in row 3
                                choseRow= row3;
                                if (seat_Number < 0 || seat_Number > 21) {
                                    System.out.println("Enter a valid seat number!");
                                }
                                if (seat_Number < 21 && seat_Number > 0) {
                                    if (choseRow[seat_Number - 1] == 0) {
                                        choseRow[seat_Number - 1] = 1;
    
                                        System.out.print("\nEnter your name: ");   //extended method to get the information of a Person
                                        String name = optionIn.next();
                                        System.out.print("\nEnter your surname: ");
                                        String surname = optionIn.next();
                                        String email = "";                        //https://www.javatpoint.com/java-email-validation
                                        while (!email.matches("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b")) {
                                            if (!email.equals("")) {
                                                System.out.println("Invalid email.");
                                            }
                                            System.out.print("\nEnter your email: ");
                                            email = optionIn.next();
                                        }
                                        Person person = new Person(name, surname, email);
                                        Ticket ticket = new Ticket(3, seat_Number, 300, person);   //create a new ticket and adds the ticket in the new array list
                                        buyers.add(ticket);
                                        System.out.println("You have booked seat " + seat_Number + " in row " + row_Number + ".");
                                        break;
                                    } else {
                                        System.out.println("The seat is already booked!");
                                        continue;
                                    }
                                }
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input.\nEnter a valid option!");
                        }
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid input.\nEnter a valid option!");
                }
            }
        }

        private static void print_seating_area() {
            System.out.println("     ***********");
            System.out.println("     *  STAGE  *");
            System.out.println("     ***********");
            System.out.print("    ");
            for (int i = 0; i < row1.length; i++) {   //print seating area row1
                if (row1[i] == 0) {
                    System.out.print("O");
                }
                if (row1[i] == 1) {
                    System.out.print("X");
                }
                if (i == (row1.length / 2) - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
            System.out.print("  ");
            for (int i = 0; i < row2.length; i++) {   //print seating area row2
                if (row2[i] == 0) {
                    System.out.print("O");
                }
                if (row2[i] == 1) {
                    System.out.print("X");
                }
                if (i == (row2.length / 2) - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
            for (int i = 0; i < row3.length; i++) {   //print seating area row3
                if (row3[i] == 0) {
                    System.out.print("O");
                }
                if (row3[i] == 1) {
                    System.out.print("X");
                }
                if (i == (row3.length / 2) - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        private static void cancel_ticket() {
            while (true) {
                try {
                    Scanner rowInput = new Scanner(System.in);
                    System.out.println("Enter the Row no you need(1-3):");
                    int rowNumber = rowInput.nextInt();
                    if (rowNumber > 3 || rowNumber < 1) {
                        System.out.println("Enter a Valid row number!");
                        continue;
                    }
                    while (true) {
                        try {
                            Scanner seatInput = new Scanner(System.in);
                            System.out.println("Enter the seat you want to remove:");
                            int seatNumber = seatInput.nextInt();
                            int[] removeRow;
                            if (rowNumber == 1) {
                                //check validity in row 1
                                removeRow = row1;
                                if (seatNumber < 0 || seatNumber > 13) {
                                    System.out.println("Enter a valid seat number according to the rows!");
                                }
                                if (seatNumber < 13 && seatNumber > 0) {
                                    if (removeRow[seatNumber - 1] == 1) {
                                        removeRow[seatNumber - 1] = 0;
    
                                        for (Ticket newObject : buyers) {
                                            if (newObject.getRow() == 1 && newObject.getSeat() == seatNumber) {
                                                buyers.remove(newObject);   //remove the object
                                                break;
                                            }
                                        }
                                        System.out.println("You have cleared seat " + seatNumber + " in row " + rowNumber + ".");
                                    } else {
                                        System.out.println("The seat is not booked!");
                                        continue;
                                    }
                                    break;
                                }
                            }
                            if (rowNumber == 2) {
                                //check validity in row 2
                                removeRow = row2;
                                if (seatNumber < 0 || seatNumber > 17) {
                                    System.out.println("Enter a valid seat number according to the rows!");
                                }
                                if (seatNumber < 17 && seatNumber > 0) {
                                    if (removeRow[seatNumber - 1] == 1) {
                                        removeRow[seatNumber - 1] = 0;
    
                                        for (Ticket newObject : buyers) {
                                            if (newObject.getRow() == 2 && newObject.getSeat() == seatNumber) {
                                                buyers.remove(newObject);   //remove the object
                                                break;
                                            }
                                        }
                                        System.out.println("You have cleared seat " + seatNumber + " in row " + rowNumber + ".");
                                    } else {
                                        System.out.println("The seat is not booked!");
                                        continue;
                                    }
                                    break;
                                }
                            }
                            if (rowNumber == 3) {
                                //check validity in row 3
                                removeRow = row3;
                                if (seatNumber < 0 || seatNumber > 21) {
                                    System.out.println("Enter a valid seat number according to the rows!");
                                }
                                if (seatNumber < 21 && seatNumber > 0) {
                                    if (removeRow[seatNumber - 1] == 1) {
                                        removeRow[seatNumber - 1] = 0;
    
                                        for (Ticket newObject : buyers) {
                                            if (newObject.getRow() == 3 && newObject.getSeat() == seatNumber) {
                                                buyers.remove(newObject);   //remove the object
                                                break;
                                            }
                                        }
                                        System.out.println("You have cleared seat " + seatNumber + " in row " + rowNumber + ".");
                                    } else {
                                        System.out.println("The seat is not booked!");
                                        continue;
                                    }
                                    break;
                                }
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input.\nEnter a valid option!");
                        }
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid input.\nEnter a valid option!");
                }
            }
        }
    

    
