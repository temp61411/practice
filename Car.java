// Demo for class structures
// A class is a blueprint
public class Car {
    int speed;
    String model;
    String type;

    // Main method
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.speed = 100;
        myCar.model = "Toyota";
        myCar.type = "Sedan";

        System.out.println("Car Model: " + myCar.model);
        System.out.println("Car Type: " + myCar.type);
        System.out.println("Car Speed: " + myCar.speed + " km/h");
    }
}
