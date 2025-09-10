package assignment_2;

import java.util.ArrayList;

class Product {
    String productName;
    double price;

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    void showProduct() {
        System.out.println("Product: " + productName + ", Price: " + price);
    }
}

class Order {
    int orderId;
    ArrayList<Product> products;

    Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    void addProduct(Product p) {
        products.add(p);
    }

    void showOrderDetails() {
        System.out.println("\nOrder ID: " + orderId);
        for (Product p : products) {
            p.showProduct();
        }
    }
}

class Customer {
    String customerName;
    ArrayList<Order> orders;

    Customer(String customerName) {
        this.customerName = customerName;
        this.orders = new ArrayList<>();
    }

    void placeOrder(Order o) {
        orders.add(o);
        System.out.println(customerName + " placed Order ID: " + o.orderId);
    }

    void showCustomerOrders() {
        System.out.println("\nCustomer: " + customerName);
        for (Order o : orders) {
            o.showOrderDetails();
        }
    }
}

public class prob_4 {
    public static void main(String[] args) {
        Customer c1 = new Customer("Shivansh");
        Customer c2 = new Customer("Rahul");

        Product p1 = new Product("Laptop", 50000);
        Product p2 = new Product("Headphones", 2000);
        Product p3 = new Product("Smartphone", 15000);

        Order o1 = new Order(101);
        o1.addProduct(p1);
        o1.addProduct(p2);

        Order o2 = new Order(102);
        o2.addProduct(p2);
        o2.addProduct(p3);

        c1.placeOrder(o1);
        c2.placeOrder(o2);

        c1.showCustomerOrders();
        c2.showCustomerOrders();
    }
}
