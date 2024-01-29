import java.util.LinkedList;
import java.util.Queue;

public class Main {
    //Queue
    /*
        - implemented by LinkedList class
        - adds element in the back, reads from the front - FIFO
        - proper methods  - return false in the case of an unsuccessful operation
            -peek(), offer(E e), remove()
        - methods inherited from collection - return exceptions in the case of an unsuccessful operation
            -element(), add(), remove()
    */
    public static void main(String[] args){
        Queue<String> colors = new LinkedList<>();
        colors.offer("blue"); colors.offer("yellow"); colors.offer("red"); colors.offer("orange"); colors.offer("green");
        System.out.println(colors);
        System.out.println(colors.peek());
        colors.poll();
        System.out.println(colors);
        System.out.println(colors.peek());
    }
}

