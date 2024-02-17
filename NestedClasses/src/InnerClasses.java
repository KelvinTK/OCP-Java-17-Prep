public class InnerClasses {
    private String str = "Hello";
    protected class Nested{
        private static  void printOut(String s){
            System.out.println(s);
        }
        public void printHello2(){
            printOut(str);
            printOut(str);
        }
    }

    public void printTwice(){
        var nested = new Nested();
        nested.printHello2();

    }


}
