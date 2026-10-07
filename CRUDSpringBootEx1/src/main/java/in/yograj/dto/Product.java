package in.yograj.dto;

import jakarta.persistence.*;

@Entity
@Table(name="product_table")
public class Product { //product_table
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "product_name",nullable = false)
    private String name;//name
    private double prize;

    public Product(){
        System.out.println("Product Bean created!");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", prize=" + prize +
                '}';
    }
}
