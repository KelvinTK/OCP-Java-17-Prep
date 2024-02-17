import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //Copy text file - no buffering
        File srcFile = new File("C:\\Users\\ktkut\\Desktop\\Phoenix.txt");
        File destFile = new File("C:\\Users\\ktkut\\Desktop\\PhoenixCopy1.txt");
        try (var reader = new FileReader(srcFile);
             var writer = new FileWriter(destFile)){
            int c;
            while ((c = reader.read()) != -1){
                writer.write(c);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
