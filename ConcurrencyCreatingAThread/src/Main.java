public class Main extends Thread {

    @Override
    public void run(){ //should be overridden when extending the thread class
        System.out.println("Thread '" + getName() + "' is being executed");
    }
    public static void main(String[] args){
        //by extending thread
        new Main().start(); //runs the thread
        System.out.println("Thread '"+Thread.currentThread().getName() + "' is being executed"); //another thread

        //by implementing Runnable interface
        new Thread(new ByRunnableInterface()).start();

        //by implementing Runnable with lambda expression
        new Thread(
                () -> System.out.println("Thread (lambda) '"+Thread.currentThread().getName() + "' is being executed"))
                .start();
    }

    //implementing runnable interface
}
