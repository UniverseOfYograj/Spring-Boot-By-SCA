package beans;

public class Programmer {
    private Computer computer;

    public Programmer(Computer computer){
        super();
        this.computer=computer;
    }

    public void writeCode(){
        computer.start();
        System.out.println("Writing the code!");
    }
}
