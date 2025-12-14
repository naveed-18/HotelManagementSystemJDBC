# Hotel Management System (JDBC)

A beginner-level Java project demonstrating CRUD operations for a hotel reservation system using JDBC and MySQL.

## Features

1. **Reserve a Room** – Add a new guest reservation.  
2. **View Reservations** – List all current reservations.  
3. **Get Room Number** – Retrieve room number by reservation ID and guest name.  
4. **Update Reservation** – Update guest details or room number.  
5. **Delete Reservation** – Remove a reservation by ID.  

## Database

- **Database Name:** `hotel_management_system_db`  
- **Table:** `reservations`  

| Column Name       | Type            | Notes                         |
|------------------|----------------|-------------------------------|
| reservation_id    | INT             | Primary Key, Auto Increment   |
| guest_name        | VARCHAR(255)    | Not Null                     |
| room_number       | INT             | Not Null                     |
| phone_number      | VARCHAR(20)     | Not Null                     |
| reservation_date  | TIMESTAMP       | Defaults to CURRENT_TIMESTAMP|

## Setup Instructions

1. Install **MySQL** and create the database `hotel_management_system_db`.  
2. Create the `reservations` table using the SQL script provided in the project.  
3. Update the `USER` and `PASS` constants in `HotelManagementSystemDAO.java` with your database credentials.  
4. Run `Main.java` to start the hotel management console application.  

## Technologies Used

- Java 25  
- JDBC (Java Database Connectivity)  
- MySQL  
- IntelliJ IDEA  

## How to Use

1. Run the `Main.java` file in your IDE.  
2. Choose an option from the menu:  
   - Reserve a room  
   - View reservations  
   - Get room number  
   - Update reservation  
   - Delete reservation  
   - Exit  

## Notes

- Phone numbers are stored as strings to support international formats.  
- The project uses try-with-resources to ensure all database connections are properly closed.  

---

