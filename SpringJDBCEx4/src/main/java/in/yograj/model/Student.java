package in.yograj.model;



public class Student {
    private int roll;
    private String name;
    private double percentage;

    public Student() {
        System.out.println("Student Bean Created!");
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public String toString() {
        return "roll:" + roll + " Name:" + name + " Percentage:" + percentage;
    }
}
