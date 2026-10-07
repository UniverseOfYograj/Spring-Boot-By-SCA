package beans;

public class Desktop implements Computer{
    String name;
    public Desktop(String name){
        this.name=name;

    }

    @Override
    public void start() {
        System.out.println("beans.Desktop started!");

    }
//
//    public void start(){
//        System.out.println("beans.Desktop started!");
//    }
}
