import java.io.*;

public class Main {
    //catching multiple exceptions
    public static void main(String[] args){

    }

    //1. one exception is a subclass of another
    void readFirstByteFromeFile (File fileName){
        try{
            FileInputStream file = new FileInputStream(fileName);
            byte x = (byte) file.read();
            System.out.println(x);
        }catch(FileNotFoundException e){ //subclass of IOException - this order works
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    //2.1 exceptions are independent of each other - works
    void readFirstByteFromeFile2 (File fileName){
        try{
            FileInputStream file = new FileInputStream(fileName);
            byte x = (byte) file.read();
            System.out.println(x);
        }catch(IOException e){
            e.printStackTrace();
        }catch (NumberFormatException e){
            e.printStackTrace();
        }
    }

    //2.2 better
    void readFirstByteFromeFile3 (File fileName){
        try{
            FileInputStream file = new FileInputStream(fileName);
            byte x = (byte) file.read();
            System.out.println(x);
        }catch(IOException | NumberFormatException e){
            e.printStackTrace();
        }
    }

    //finally block
    void readFirstByteFromeFile4 (File fileName){
        try{
            FileInputStream file = new FileInputStream(fileName);
            byte x = (byte) file.read();
            System.out.println(x);
        }catch(IOException | NumberFormatException e){
            e.printStackTrace();
        }finally { //careful - this block is ALWAYS executed!
            System.out.println("Internal error occured");
        }
    }
}
