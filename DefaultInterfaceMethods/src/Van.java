public class Van implements Car, Truck{
    public int getMaxSpeed(){return 90;} //- if the class inherits 2 or more default methods with the same signature, then it must override the method
    public int getMaxSpeedCar(){//still can access the original default method
        return Car.super.getMaxSpeed();
    }
}
