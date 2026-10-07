package in.yograj.beans;

public class Programmer {
    private String name;
    private Computer computer;

    Programmer(){
        System.out.println("Programmer Bean Created!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }
}
