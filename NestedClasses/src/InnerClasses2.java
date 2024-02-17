public class InnerClasses2 {
    private int t = 0;
    class Nested1{
        private int t = 1;
        class  Nested2 {
            private  int t = 2;
            public void printT(){
                System.out.println(t);
                System.out.println(this.t);
                System.out.println(Nested1.this.t);
                System.out.println(InnerClasses2.this.t);
            }
        }
    }

//    public static void main(String[] args){
//        InnerClasses2 inner2 = new InnerClasses2();
//        Nested1 nested1 = inner2.new Nested1(); //var nested1 = inner2.new Nested1();
//        Nested1.Nested2 nested2 = nested1.new Nested2(); //var nested2 = nested1.new Nested2();
//        nested2.printT();
//    }
}
