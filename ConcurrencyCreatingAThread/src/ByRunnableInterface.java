public class ByRunnableInterface implements Runnable{
    @Override
    public void run(){
        System.out.println("Thread (runnable interface) '" + Thread.currentThread().getName() + "' is being executed");
    }
}
