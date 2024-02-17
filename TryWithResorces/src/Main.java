import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    //Resource Management
    /*
        - any external data sources - resources
        - dealing with resources almost always requires3 steps
            - opening the resource
            - read/write
            - closing the resource
        - forgetting to close the resource can lead to many things
            - resource leakage - results in the resource becoming in accessible etc
    */
    public static void main(String[] args){
        Main mainMethods = new Main();
        mainMethods.readFile("file.txt");
        mainMethods.readFile2("file.txt");
        System.out.println();

        //resources with explicit try catch bloc
        try(FileClass reader = new FileClass(1); FileClass movie = new FileClass(2)){
            System.out.println("Try bloc");
            throw new RuntimeException();
        }catch (Exception e){
            System.out.println("Catch block");
        }finally{
            System.out.println("finally bloc");
        }

    }

    public void readFile(String file){
        FileInputStream is = null;
        try{
            is = new FileInputStream(("myFile.txt"));
            //read, write etc
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if (is != null){
                try{
                    is.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }

    }

    //same thing but with try-with-resources block - known as automatic resource management
    public  void readFile2(String file){
        try (FileInputStream is = new FileInputStream("myFile.txt")){//has implicit finally bloc*
            System.out.println("do smth");
            //read, write etc
        }catch (IOException e){
            e.printStackTrace();
        }
    }


}
