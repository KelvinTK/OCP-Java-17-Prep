public interface Car {
    private static  int calculateSpeed(){//helps make code readable
        int speed = 26*3;
        return speed;
    }

    public default int getMaxSpeed(){
        return calculateSpeed();
    }

    public default int getRecommendedSpeed(){
        return (int)(calculateSpeed()*0.9);
    }
}
