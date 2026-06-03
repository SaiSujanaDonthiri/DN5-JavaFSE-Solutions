public class Car17 {  
    String make;
    String model;
    int year;
    void displayDetails(){
        System.out.println("Make:" + make);
        System.out.println("Model:" + model);
        System.out.println("Year:" + year);
    }
    public static void main(String[] args) {
        Car17 car1 = new Car17();
        car1.make="Toyota";
        car1.model="Camry";
        car1.year=2023;
        car1.displayDetails();
        Car17 car2 = new Car17();
        car2.make="Honda";
        car2.model="City";
        car2.year=2022;
        car2.displayDetails();
    }
}
