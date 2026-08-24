package oops.polymorphism;

public interface Vehicle {
    public static void main(String[] args) {


        Car car = new Car("Mercedes", "S-Class", "Black", 2025);
        Boat boat = new Boat();
        Bike bike = new Bike();

        Vehicle[] vehicles = {bike, car, boat};
        for (Vehicle vehicle : vehicles) {
            vehicle.go();
        }
    }

    void go();
}
    class Bike implements Vehicle {
//    void start2(){
//        System.out.println("The bike's engine has been started!");
//    }
//
//    String make = "Royal Enfield";
//    String model = "GT650";
//    String color = "Silver-Blue";
//    int year = 2025;
//
//    Bike(String make, String model, String color, int year){
//        this.make = make;
//        this.model = model;
//        this.color = color;
//        this.year = year;
//    }

        @Override
        public void go() {
            System.out.println("You're riding a bike");
        }
    }

    class Car implements Vehicle {
        public Car() {
        }

        public void start1() {
            System.out.println("The car's engine has been started!");
        }

        public String make = "BMW";
        public String model = "Z4";
        public String color = "Black";
        public int year = 2026;

        public Car(String make, String model, String color, int year) {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
        }

        @Override
        public void go() {
            System.out.println("You're driving a car");
        }
    }

    class Boat implements Vehicle {

        @Override
        public void go() {
            System.out.println("You're sailing a boat");
        }
    }


