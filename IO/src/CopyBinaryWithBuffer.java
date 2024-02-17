import java.io.*;

public class CopyBinaryWithBuffer {
    public static void main(String[] args) {
        //no buffering
        File srcFile = new File("C:\\Users\\ktkut\\Pictures\\IMG_20231222_101200.jpg");
        File destFile = new File("C:\\Users\\ktkut\\Pictures\\dest2.jpg");

        try(var in = new BufferedInputStream(new FileInputStream(srcFile));
            var out = new BufferedOutputStream(new FileOutputStream(destFile))){
            var buffer = new byte[1024];
            int numBytesRead;
            while ((numBytesRead = in.read(buffer)) > 0){
                out.write(buffer, 0, numBytesRead);
                out.flush(); //allows you to continue from where you left
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
