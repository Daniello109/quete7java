public class Boat extends Vehicle {


    public Boat(String brand) {
        super(brand);
    }


    @Override
    public String doStuff(String brand){
        return "I'm a " + getBrand() + " and im doing gloo gloo";
    }
}
}
