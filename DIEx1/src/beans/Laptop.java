package beans;

public class Laptop implements Computer{
    String name;

    public Laptop(String name){
        this.name=name;
    }

    public void start(){
        System.out.println("Laptop started!");
    }

}
