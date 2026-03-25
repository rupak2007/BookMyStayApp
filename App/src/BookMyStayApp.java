/**
 * UseCase2RoomInitialization
 *
 * Demonstrates Room Types using Abstraction & Inheritance
 * and Static Availability display.
 *
 * @author Rupak Raj
 * @version 2.0
 */

// Abstract Class
abstract class Room {
    protected String roomType;
    protected int beds;
    protected double price;

    // Constructor
    public Room(String roomType, int beds, double price) {
        this.roomType = roomType;
        this.beds = beds;
        this.price = price;
    }

    // Method to display room details
    public void displayRoomDetails() {
        System.out.println("Room Type : " + roomType);
        System.out.println("Beds      : " + beds);
        System.out.println("Price     : ₹" + price);
    }
}

// Single Room Class
class SingleRoom extends Room {
    public SingleRoom() {
        super("Single Room", 1, 2000);
    }
}

// Double Room Class
class DoubleRoom extends Room {
    public DoubleRoom() {
        super("Double Room", 2, 3500);
    }
}

// Suite Room Class
class SuiteRoom extends Room {
    public SuiteRoom() {
        super("Suite Room", 3, 6000);
    }
}

// Main Class
public class BookMyStayApp {

    public static void main(String[] args) {

        System.out.println("====== Book My Stay App ======");
        System.out.println("Hotel Booking System v2.0\n");

        // Create Room Objects (Polymorphism)
        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        // Static Availability
        int singleAvailable = 10;
        int doubleAvailable = 5;
        int suiteAvailable = 2;

        // Display Details
        System.out.println("---- Single Room ----");
        single.displayRoomDetails();
        System.out.println("Available : " + singleAvailable + "\n");

        System.out.println("---- Double Room ----");
        doubleRoom.displayRoomDetails();
        System.out.println("Available : " + doubleAvailable + "\n");

        System.out.println("---- Suite Room ----");
        suite.displayRoomDetails();
        System.out.println("Available : " + suiteAvailable + "\n");

        System.out.println("Application Ended.");
    }
}