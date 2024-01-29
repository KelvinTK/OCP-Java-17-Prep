public interface Car {
    int getMaxSpeed();
    int getHorsePower();

    default void carFeatures(){
        System.out.println("Max speed: "+ getMaxSpeed());
        System.out.println("Horse power: "+ getHorsePower());
    }
}
