package Lab8.exercise1;

public class TestVehicle {

    public static void main(String[] args) {
       // String output="";

        Car car1 = new Car();
        System.out.println("Testing the Car no-arg constructor\n\n" +
                car1.toString());

        Car car2 = new Car(100000.0, 4.5, 1.25, 2000.0, "Ferrari", "F2", 2, "05KY1");
        System.out.println("Testing the Car multi-arg constructor\n\n" +
                car2.toString());

        Bicycle bicycle1 = new Bicycle();
        System.out.println("Testing the Bicycle no-arg constructor\n\n" +
                bicycle1.toString());

        Bicycle bicycle2 = new Bicycle(500, 1.5, 1, 50, "Raleigh", "Mountainbike", 4, false);
        System.out.println("Testing the Bicycle multi-arg constructor\n\n" +
                bicycle2.toString());


    }


}
