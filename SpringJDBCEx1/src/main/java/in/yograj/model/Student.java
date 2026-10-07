package in.yograj.model;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private int roll;
    private String name;
    private double percent;

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

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    @Override
    public String toString() {
        return "Roll:"+roll+" Name:"+name+" Percentage:"+percent;
    }
}
