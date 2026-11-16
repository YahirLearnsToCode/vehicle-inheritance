public class Main {

    public static void main(String[] args) {
        Moped slowRide = new Moped("Orange", 2, 1, 2);

        System.out.println("Moped: " + slowRide.getColor()  + " " +slowRide.getFuelCapacity());

        Car mcqueen = new Car("Red", 4, 3, 2);

        System.out.println("Car: " + mcqueen.getColor() + " " + mcqueen.getFuelCapacity());

        //Rest of classes should work as they follow the same pattern.


    }
}
