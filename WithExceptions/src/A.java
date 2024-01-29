import java.io.FileNotFoundException;
import java.io.IOException;

public class A {
    //checked exception FileNotFoundException is a subclass of IOException
    public void greet() throws IOException{}
    public void sayHello() {}
    public void leave() throws FileNotFoundException{}
}
