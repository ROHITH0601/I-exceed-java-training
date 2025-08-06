class sample {
    int x=10;
    static int y=20;

    public void display() {
        System.out.println("Non-static variable x: " + x);
        System.out.println("Static variable y: " + y);
    }
    static void display1() {
        System.out.println("Static method display called" + y);
        System.out.println("Instance variable: " + new sample().x);

    }

}

public class static3 {
    public static void main(String[] args) {
        sample obj = new sample();
        obj.display(); // Calling non-static method
        sample.display1(); // Calling static method
    }
}