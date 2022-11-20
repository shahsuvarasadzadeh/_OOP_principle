package _Encapsulation;

public class Car {
    //Fields,Properties
    private String color;
    private String model;
    private double engine;
    private int doors;

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public double getEngine() {
        return engine;
    }

    public int getDoors() {
        return doors;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public void setDoors(int doors) {
        if (doors==2 || doors == 4)
        this.doors = doors;
    }


}
