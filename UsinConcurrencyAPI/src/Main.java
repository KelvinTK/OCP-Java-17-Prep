import java.util.concurrent.*;

public class Main {
    public static final void main(String[] args){
        ExecutorService service = Executors.newSingleThreadExecutor();
        Future<?> result = service.submit(()->{
            int count = 0;
            for(long i = 0; i < 1_000_000_000L; i++){
                count++;
//                System.out.println(count);
            } //takes several us to complete
        });

        try {
            var value = result.get(1, TimeUnit.MICROSECONDS); //get result in 1 us
            if (value == null) System.out.println("Task completed");
        } catch (TimeoutException e) {
            System.out.println("Didn't complete in time"); //task was not completed in 1 us
        }
        catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        service.shutdown();
    }
}
