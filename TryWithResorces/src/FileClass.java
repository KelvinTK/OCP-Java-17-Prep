public class FileClass implements AutoCloseable{

    //can be used as a resource in the try and catch bloc
    private final int num;
    public FileClass(int num){
        this.num = num;
    }
    @Override
    public void close(){
        System.out.println("ClosingFileClass #" + num);
    }
}
