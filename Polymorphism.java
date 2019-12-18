public class Polymorphism {

    public static void main(String[] args) {
        Cycle bicycle = new  Bicycle();
        bicycle.setName("自行车");
        bicycle.ride(bicycle);
        Cycle unicycle = new Unicycle();
        unicycle.setName("独轮车");
        unicycle.ride(unicycle);
    }

}
