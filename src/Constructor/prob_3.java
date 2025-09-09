package Constructor;

public class prob_3 {
    private String ownerName;
    private String vehicleType;
    private static double registrationFee = 5000;

    public prob_3(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: ₹" + registrationFee);
        System.out.println("--------------------------------");
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        prob_3 v1 = new prob_3("Rahul", "Car");
        prob_3 v2 = new prob_3("Sneha", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        prob_3.updateRegistrationFee(7000);

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
