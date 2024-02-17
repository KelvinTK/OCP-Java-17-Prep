public class Door implements AutoCloseable{
    public void close() throws IllegalStateException{
        throw new IllegalStateException("Can't close the door");
    }
}
