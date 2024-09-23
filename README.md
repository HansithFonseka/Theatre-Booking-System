# Theatre Booking System

Welcome to the **Theatre Booking System**, a Java-based console application for managing seat reservations, cancellations, and ticket information at the theatre. This system allows users to book, cancel, and view seat availability, along with additional functionalities such as saving and loading booking data.

## Features

- **Buy Ticket**: Reserve a seat in any of the three available rows.
- **Cancel Ticket**: Cancel an existing reservation.
- **Print Seating Area**: Display the current seating layout showing booked (X) and available (O) seats.
- **List Available Seats**: View all the available seats in each row.
- **Save to File**: Save the current seating and ticket data to a file.
- **Load from File**: Load saved seating and ticket data from a file.
- **Print Ticket Information and Total Price**: Display all the purchased tickets and their details.
- **Sort Tickets by Price**: Sort and display tickets based on their price.

## How to Use

1. Clone this repository:
    ```bash
    git clone https://github.com/your-username/theatre-booking-system.git
    ```
2. Navigate to the project directory:
    ```bash
    cd theatre-booking-system
    ```
3. Compile and run the Java program:
    ```bash
    javac Theatre.java
    java Theatre
    ```

4. Follow the menu options in the console to interact with the system.

## Menu Options

1. Buy a ticket
2. Print seating area
3. Cancel ticket
4. List available seats
5. Save to file
6. Load from file
7. Print ticket information and total price
8. Sort tickets by price
9. Quit


### Buying a Ticket
- Choose a row (1-3).
- Select an available seat in the chosen row.
- Enter your name, surname, and a valid email address to book the ticket.

### Cancelling a Ticket
- Choose the row number.
- Enter the seat number to cancel the corresponding ticket.

### Print Seating Area
- Displays the current seating layout with `O` representing available seats and `X` representing booked seats.

### Save/Load to File
- Save the current bookings to a file and load them later to resume operations.

### Sorting and Viewing Tickets
- List all the tickets purchased, their details, and the total price.
- Sort tickets based on their price in ascending order.

## Data Model

- **Rows**: Three rows (1, 2, and 3) with different seat counts:
    - Row 1: 12 seats
    - Row 2: 16 seats
    - Row 3: 20 seats
- **Ticket**: Stores information about the row, seat number, price, and buyer details.
- **Person**: Stores the buyer's name, surname, and email address.

## Classes Overview

- `Theatre`: Main class responsible for handling user input, booking, and managing seats.
- `Ticket`: Represents a ticket purchased by a customer, including the row, seat, price, and buyer details.
- `Person`: Represents the personal details of a ticket buyer, including name, surname, and email.

## Example Usage

1. **Booking a Ticket**:
    ```
    Enter the row number you need(1-3): 1
    Enter your seat according to the rows: 5
    Enter your name: John
    Enter your surname: Doe
    Enter your email: john.doe@example.com
    You have booked seat 5 in row 1.
    ```

2. **Canceling a Ticket**:
    ```
    Enter the Row no you need(1-3): 1
    Enter the seat you want to remove: 5
    You have cleared seat 5 in row 1.
    ```

## File Handling

- **Save to File**: Saves the current seating and ticket data to a `.txt` file.
- **Load from File**: Loads previously saved data from a file to restore seat availability and ticket information.

## Future Enhancements

- Add a GUI interface for better usability.
- Include pricing customization based on seat location or time of day.
- Integrate with an online payment system.


---

Feel free to modify and extend the system for your own needs. Contributions are welcome!



