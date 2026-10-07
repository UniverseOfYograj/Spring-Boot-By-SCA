package in.yograj.beans;

public class AddNum {
    private int a;
    private int b;
    private int c;

    public AddNum(String s1, String s2) {
        a = Integer.parseInt(s1);
        b = Integer.parseInt(s2);

        c = a + b;
        System.out.println("Constructor with String-String called!");
    }

    public AddNum(int a, int b) {
        this.a = a;
        this.b = b;
        c = a + b;
        System.out.println("Constructor with Int-Int called!");
    }

    public AddNum(float a, float b) {
        this.a = (int) a;
        this.b = (int) b;
        c=this.a+this.b;
        System.out.println("Constructor with float-float called!");
    }

    public void show(){
        System.out.println("Value of a:"+a);
        System.out.println("Value of b:"+b);
        System.out.println("Value of c:"+c);
    }

}
