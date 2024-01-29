public class ThisSuper {
    private String name;
    private int age;


    //Special method this() is used to call another constructor in a constructor
    public ThisSuper(String name, int age){
        this.name = name;
        this.age = age;
    }

    public ThisSuper(){
        this("Rex", 1); //can only be in the first line and can be called only once
        System.out.println("Houff!!");
    }



    public static void main(String[] args){
        ThisSuper dog = new ThisSuper();
    }
}

