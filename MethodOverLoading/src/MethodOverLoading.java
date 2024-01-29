public class MethodOverLoading {
    //Overloading: Having 2 or more methods with the SAME name but DIFFERENT parameter list
    public static void main(String[] args){
        MethodOverLoading overLoading = new MethodOverLoading();
        overLoading.greet(1);
        overLoading.greet(1.0);
        overLoading.greet(1, 1);

    }

    public void greet (int x){
        System.out.println("Hello");
    }

    public void greet(double x){
        System.out.println("Good day!");
    }

    public void greet(double x, double y){
        System.out.println("Good afternoon!");
    }
}
