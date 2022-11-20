package _Encapsulation;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();

        car.setColor("Sliver");
        car.setModel("KIA");
        car.setEngine(2.8);
        car.setDoors(4);

        System.out.println("car color: "+car.getColor());
        System.out.println("car model: "+car.getModel());
        System.out.println("car engine: "+car.getEngine());
        System.out.println("car doors: "+car.getDoors());
    }

}
