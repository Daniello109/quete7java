public class Hangar {

    public static void main(String[] args)
    {
        Car myCar1 = new Car ("Toyota");

        myCar1.setKilometres(20000);
        /*System.out.println(myCar1.getBrand() + myCar1.getKilometres());*/
        System.out.println(myCar1.doStuff(myCar1.getBrand()));

        Boat myBoat1 = new Boat ("Sailor Dream");

        myBoat1.setKilometres(2000);
        /*System.out.println(myBoat1.getBrand() + myBoat1.getKilometres());*/
        System.out.println(myBoat1.doStuff(myBoat1.getBrand()));
    }

}
