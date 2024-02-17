import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Main {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3);
        Runnable workerTask = ()->{
            String name = Thread.currentThread().getName();
            System.out.println(name + " is performing the first task");

            try {
                barrier.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (BrokenBarrierException e) {
                throw new RuntimeException(e);
            }

            //the following code will be executed only after 3 threads finish executing the above code
            System.out.println(name + " is executing the code after the barrier");

        };

        Thread worker1 = new Thread(workerTask, "worker1");
        Thread worker2 = new Thread(workerTask, "worker2");
        Thread worker3 = new Thread(workerTask, "worker3");
//        Thread worker4 = new Thread(workerTask, "worker4");

        worker1.start();
        worker2.start();
        worker3.start();

//        worker4.start();
    }
}
