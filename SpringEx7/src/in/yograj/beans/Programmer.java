package in.yograj.beans;

public class Programmer {
    private String name;
    private Laptop laptop;

    Programmer(){
        System.out.println("Programmer Bean Created!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
}
