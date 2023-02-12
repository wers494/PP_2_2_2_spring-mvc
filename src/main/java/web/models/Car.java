package web.models;

public class Car {
    private String brand;
    private String model;
    private int horsePowers;

    public Car(String brand, String model, int horsePowers) {
        this.brand = brand;
        this.model = model;
        this.horsePowers = horsePowers;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getHorsePowers() {
        return horsePowers;
    }


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", horsePowers=" + horsePowers +
                '}';
    }
}
