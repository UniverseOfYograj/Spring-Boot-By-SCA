package main;
import beans.*;

public class UseProgrammer {
     static void main() {

        Computer c1=new Laptop("Dell");
        Programmer obj=new Programmer(c1);
        obj.writeCode();

        Computer c2=new Desktop("Samsung");
        Programmer obj2=new Programmer(c2);
        obj2.writeCode();

    }
}
