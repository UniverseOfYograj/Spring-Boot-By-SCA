package in.yograj.beans;

public class Address {
    private String houseNo;
    private String city;

    public Address(){
        System.out.println("Address bean created using np constructor!");
    }
    public Address(String houseNo,String city){
        this.houseNo=houseNo;
        this.city=city;
        System.out.println("Address bean created using parameterized Constructor!");
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public String toString(){
        return this.houseNo+","+this.city;
    }
}
