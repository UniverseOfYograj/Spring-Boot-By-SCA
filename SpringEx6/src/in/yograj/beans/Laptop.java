package in.yograj.beans;

public class Laptop {
    private String brand;

    public Laptop() {
        this.brand = brand;
        System.out.println("Laptop bean created!");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return this.getBrand();
    }
}
