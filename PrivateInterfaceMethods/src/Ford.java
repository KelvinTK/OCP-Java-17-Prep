public class Ford implements Car{
    public void speed(){
        System.out.println("Recommended speed is "+ Car.super.getRecommendedSpeed());
    }
}
