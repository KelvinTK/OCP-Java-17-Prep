import java.io.FileNotFoundException;
import java.io.IOException;

public class B extends A{
    @Override
    public void greet() throws FileNotFoundException {}  //should throw at MOST the same exceptions

    @Override
    public void sayHello()  {}

    @Override
    public void leave() throws FileNotFoundException {}
}
