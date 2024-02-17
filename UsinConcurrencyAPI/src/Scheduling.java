import java.util.concurrent.*;

public class Scheduling {
    public static void main(String... args){
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        Runnable task1 = () -> System.out.println("Hello");
        Callable<String> task2 = () -> "Hi!";
        ScheduledFuture<?> result1 = service.schedule(task1, 20, TimeUnit.SECONDS);
        ScheduledFuture<?> result2 = service.schedule(task2, 10, TimeUnit.MINUTES);

    }
}
