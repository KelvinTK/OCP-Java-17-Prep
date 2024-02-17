public class LocalClasses {
    public int a = 10;
    public void calculateArea(){
        final int b = 15;

        class Computer{
            public void multiply(){
                System.out.println(a*b);
            }
        }

        var computer = new Computer(); //accessible in the scope of the method
        computer.multiply();
    }
}
