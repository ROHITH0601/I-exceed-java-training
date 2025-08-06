class Address {
    int plotno, pin;
    String st, city;

    // Constructor: Initializes the address fields
    Address(String st, String city, int plotno, int pin) {
        this.plotno = plotno;
        this.pin = pin;
        this.st = st;
        this.city = city;
    }

    // Method to display the address details
    public void displayAddress() {
        System.out.println("Plot " + plotno);
        System.out.println("Street " + st);
        System.out.println("City " + city);
        System.out.println("Pincode " + pin);
    }
}


public class Main {
    public static void main(String[] args) {
        Address myAddress = new Address("Near 1st street indirangar", "Bengaluru", 24, 560082);
        myAddress.displayAddress();
    }
}
