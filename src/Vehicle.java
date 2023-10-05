public abstract class Vehicle {

    private String brand;
    private int kilometres = 0;


    public String getBrand() {
        return brand;
    }


    public int getKilometres() {
        return kilometres;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }


    public void setKilometres(int kilometres) {
        this.kilometres = kilometres;
    }


    public Vehicle (String brand) {
        this.brand = brand;
        this.kilometres = 0;
    }


    public abstract String doStuff(String brand);
}