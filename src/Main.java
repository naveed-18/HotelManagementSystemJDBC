import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HotelManagementSystemDAO dao = new HotelManagementSystemDAO();

        while (true) {
            System.out.println("\nHOTEL MANAGEMENT SYSTEM");
            System.out.println("1. Reserve a Room");
            System.out.println("2. View Reservations");
            System.out.println("3. Get Room Number");
            System.out.println("4. Update Reservation");
            System.out.println("5. Delete Reservation");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int option;
            try {
                option = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input!");
                continue;
            }

            switch (option) {

                case 1 -> {
                    System.out.print("Guest Name: ");
                    String guestName = sc.nextLine();

                    System.out.print("Room Number: ");
                    int roomNumber = Integer.parseInt(sc.nextLine());

                    System.out.print("Phone Number: ");
                    String phoneNumber = sc.nextLine();

                    boolean success = dao.reserveRoom(guestName, roomNumber, phoneNumber);
                    System.out.println(success ? "Reservation successful!" : "Reservation failed.");
                }

                case 2 -> dao.viewReservations();

                case 3 -> {
                    System.out.print("Reservation ID: ");
                    int id = Integer.parseInt(sc.nextLine());

                    System.out.print("Guest Name: ");
                    String name = sc.nextLine();

                    Integer room = dao.getRoomNumber(id, name);
                    if (room == null)
                        System.out.println("Reservation not found.");
                    else
                        System.out.println("Room Number: " + room);
                }

                case 4 -> {
                    System.out.print("Reservation ID: ");
                    int id = Integer.parseInt(sc.nextLine());

                    System.out.print("New Guest Name: ");
                    String name = sc.nextLine();

                    System.out.print("New Room Number: ");
                    int room = Integer.parseInt(sc.nextLine());

                    System.out.print("New Phone Number: ");
                    String phone = sc.nextLine();

                    boolean updated = dao.updateReservation(id, name, room, phone);
                    System.out.println(updated ? "Reservation updated!" : "Reservation not found.");
                }

                case 5 -> {
                    System.out.print("Reservation ID: ");
                    int id = Integer.parseInt(sc.nextLine());

                    boolean deleted = dao.deleteReservation(id);
                    System.out.println(deleted ? "Reservation deleted!" : "Reservation not found.");
                }

                case 6 -> {
                    System.out.println("Thank You!");
                    return;
                }

                default -> System.out.println("Invalid option!");
            }
        }
    }
}