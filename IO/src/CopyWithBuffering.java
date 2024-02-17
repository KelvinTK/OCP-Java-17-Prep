import java.io.*;

public class CopyWithBuffering {
    public static void main(String[] args) {
        //Copy text file - with buffering
        File srcFile = new File("C:\\Users\\ktkut\\Desktop\\Phoenix.txt");
        File destFile = new File("C:\\Users\\ktkut\\Desktop\\PhoenixCopy2.txt");
        try (var reader = new BufferedReader(new FileReader(srcFile));
             var writer = new BufferedWriter(new FileWriter(destFile))){
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
                writer.write(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
