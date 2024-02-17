abstract class Main {
    static final int a;
    public Main(String name){
        System.out.println("Constructor " + name);
    }
//     abstract void greet(String name);
     static void hello(){
         System.out.println("hello");
     }
    static { a = 19;}

    void hi(){
        System.out.println("hi!!!!!!!!!");
    }

}
class B extends Main implements MyInt {

    public B(){
        super("prints");
    }
//    @Override
//    public void greet(String name) {
//
//    }

    void readMess(){

    }

    public static void main(String[] args) {
        B b = new B();
//        greetings();
        MyInt.greetings();
        b.hi();
        hello();
        System.out.println(a);
    }
}