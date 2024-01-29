public class Ford implements Car{
    public int getMaxSpeed(){
        return 100;
    }

    public int getHorsePower(){
        return 900;
    }

    public void specs(){
        Car.super.carFeatures();
    }
}
