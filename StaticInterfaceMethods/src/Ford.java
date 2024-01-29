public class Ford implements Car{

    //accessing getMaxSpeed
    public int getMaxSpeedCar(){//interface static methods can be used but not overridden
        return Car.getMaxSpeed();
    }
}
