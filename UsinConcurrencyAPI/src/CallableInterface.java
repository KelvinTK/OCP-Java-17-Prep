import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableInterface {
    public static void main(String... args){
        var service = Executors.newSingleThreadExecutor();
        try {
            Future<Integer> result = service.submit(()->11*12);
            System.out.println(result.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally{
            service.shutdown();
        }
    }
}
