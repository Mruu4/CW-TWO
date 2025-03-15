package cars;

public class Car {
    private String model;
    private int year;

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void displayCar() {
        System.out.println("Car Model: " + model);
    }
}