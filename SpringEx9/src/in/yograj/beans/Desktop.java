package in.yograj.beans;

public class Desktop implements Computer{
    private String brand;


    Desktop(){
        System.out.println("Desktop Bean Created!");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void start(){
        System.out.println("Desktop started!");
    }

    public String toString(){
        return this.getBrand()+" Desktop";
    }
}
