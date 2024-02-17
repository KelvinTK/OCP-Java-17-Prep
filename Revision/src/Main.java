public class Main {

    private static int counter = 0;
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i< 1_000_000; i++) counter++;
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i< 1_000_000; i++) counter++;
        });

        thread1.start();
        thread2.start();

        //wait for threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(counter);
    }
    //the same number can be increased two times by both threads: thread1: 100+1 at the same time thread2: 100+1
}
