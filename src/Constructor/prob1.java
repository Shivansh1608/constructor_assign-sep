package Constructor;

public class prob1 {

    static class Book {
        String title, author;
        double price;

        Book() {
            title = "Unknown";
            author = "Unknown";
            price = 0.0;
        }

        Book(String title, String author, double price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }

        void display() {
            System.out.println("Book => Title: " + title + ", Author: " + author + ", Price: " + price);
        }
    }

    static class Circle {
        double radius;

        Circle() {
            this(1.0);
        }

        Circle(double radius) {
            this.radius = radius;
        }

        void display() {
            System.out.println("Circle => Radius: " + radius);
        }
    }

    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        Person(Person p) {
            this.name = p.name;
            this.age = p.age;
        }

        void display() {
            System.out.println("Person => Name: " + name + ", Age: " + age);
        }
    }

    static class HotelBooking {
        String guestName, roomType;
        int nights;

        HotelBooking() {
            guestName = "Unknown";
            roomType = "Standard";
            nights = 1;
        }

        HotelBooking(String guestName, String roomType, int nights) {
            this.guestName = guestName;
            this.roomType = roomType;
            this.nights = nights;
        }

        HotelBooking(HotelBooking hb) {
            this.guestName = hb.guestName;
            this.roomType = hb.roomType;
            this.nights = hb.nights;
        }

        void display() {
            System.out.println("HotelBooking => Guest: " + guestName + ", Room: " + roomType + ", Nights: " + nights);
        }
    }

    static class LibraryBook {
        String title, author;
        double price;
        boolean available;

        LibraryBook(String title, String author, double price) {
            this.title = title;
            this.author = author;
            this.price = price;
            this.available = true;
        }

        void borrowBook() {
            if (available) {
                available = false;
                System.out.println(title + " borrowed successfully!");
            } else {
                System.out.println(title + " is not available.");
            }
        }

        void display() {
            System.out.println("LibraryBook => Title: " + title + ", Author: " + author + ", Price: " + price + ", Available: " + available);
        }
    }

    static class CarRental {
        String customerName, carModel;
        int rentalDays;
        double costPerDay = 1000.0;

        CarRental() {
            customerName = "Unknown";
            carModel = "Standard";
            rentalDays = 1;
        }

        CarRental(String customerName, String carModel, int rentalDays) {
            this.customerName = customerName;
            this.carModel = carModel;
            this.rentalDays = rentalDays;
        }

        double calculateTotalCost() {
            return rentalDays * costPerDay;
        }

        void display() {
            System.out.println("CarRental => Customer: " + customerName + ", Car: " + carModel +
                    ", Days: " + rentalDays + ", Total Cost: " + calculateTotalCost());
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java Basics", "Shivansh", 500);
        b1.display();
        b2.display();

        Circle c1 = new Circle();
        Circle c2 = new Circle(5);
        c1.display();
        c2.display();

        Person p1 = new Person("Rahul", 22);
        Person p2 = new Person(p1);
        p1.display();
        p2.display();

        HotelBooking h1 = new HotelBooking();
        HotelBooking h2 = new HotelBooking("Aman", "Deluxe", 3);
        HotelBooking h3 = new HotelBooking(h2);
        h1.display();
        h2.display();
        h3.display();

        LibraryBook lb = new LibraryBook("Algorithms", "CLRS", 1200);
        lb.display();
        lb.borrowBook();
        lb.borrowBook();

        CarRental cr1 = new CarRental("Shiv", "BMW", 5);
        cr1.display();
    }
}
