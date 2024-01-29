import java.io.*;

public class Main {
    //Checked exception
    /*
        - must be declared or handled by the application code where it is thrown
        - all checked exceptions inherit Exception, but not RunTimeException
        - exception is declared when defining a method
            - using keyword throws
        - can also be handled using the try-catch block
    */
    public static void main(String [] args){
        int a[] = {1, 43, 24};
//        element4(a);
        element04(a);

        MyClass myClass = new MyClass(2, "Kelvin Kutsukutsa");

        MyClass02 myClass02 = new MyClass02();
        try{
            myClass02.readTime();
        }catch (TimeUpException e){
            System.out.println("Gotchya!!");
        }
    }

    //fix 1. declare exception (checked)
    void readFirstByteFromeFile (File fileName) throws IOException { //compiles but the exception is still not handled
        FileInputStream file = new FileInputStream(fileName);
        byte x = (byte) file.read();
        System.out.println(x);
    }

    //fix 2. handle exception (checked)
    void readFirstByteFromeFile2 (File fileName) { //compiles, considered good practice
        try{
            FileInputStream file = new FileInputStream(fileName);
            byte x = (byte) file.read();
            System.out.println(x);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    //Unchecked

    private static void element4(int[] a){ //compiles but gives unhandled unchecked exception
        System.out.println(a[3]);
    }

    private static void element04(int[] a){ //compiles but gives unhandled unchecked exception
       try {
           System.out.println(a[3]);
       }catch(ArrayIndexOutOfBoundsException e){
           System.out.println("Array too small");
//           e.printStackTrace();
       }
    }




}
