public class StaticMembers {
    //static methods can only access static fields or other static methods

    public static final double VALUE_ADDED_TAX;
    static{ //static block used to initialize final variables. Is evaluated once
        VALUE_ADDED_TAX = 0.25;
    }

    public double calculatePrice (double price){
        return price + price*VALUE_ADDED_TAX;
    }

    //static blocks are useful when you need to calculate values. they are executed in the order in which they are written
    public static double MASS;
    public static double VOLUME;
    public static double DENSITY;
    static{
        MASS = 100;
        VOLUME = 0.01;
    }
    static {
        DENSITY = MASS / VOLUME;
    }

    public static void main(String[] args){
        StaticMembers members = new StaticMembers();
        System.out.println(members.calculatePrice(100));
        System.out.println(DENSITY);
    }


}
