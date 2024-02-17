import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBinaryFile {
    public static void main(String[] args) {
        //no buffering
        File srcFile = new File("C:\\Users\\ktkut\\Pictures\\IMG_20231222_101200.jpg");
        File destFile = new File("C:\\Users\\ktkut\\Pictures\\dest.jpg");

        try(var in = new FileInputStream(srcFile);
        var out = new FileOutputStream(destFile)){
            int b;
            while ((b = in.read()) !=-1){
                out.write(b);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
