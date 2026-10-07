package in.yograj.beans;

public class Laptop implements Computer {
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

    public void start(){
        System.out.println("Laptop Started!");
    }

    @Override
    public String toString() {
        return this.getBrand()+" Laptop";
    }
}
