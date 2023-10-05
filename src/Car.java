public class Car extends Vehicle {


    public Car (String brand)
    {
        super(brand);
    }


    @Override
    public String doStuff(String brand){
        return "I'm a " + getBrand() + " and im doing vroom vroom";
    }
}