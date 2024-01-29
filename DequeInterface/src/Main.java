import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Main {

    //Deque Interface as a Stack
    /*
        - implemented by LinkedList and ArrayQueue
        - adds elements from the front but reads from the back - LIFO
        - proper methods: - error - false
            -peek(), push(E e), poll()
        - methods inherited from Collection --error - exception
            - element(), add(E e), remove()
    */

    //Deque Interface as a double-ended queue
    /*
        - proper methods: - error - false
            -peekFirst(), offerFirst(E e), pollFirst()
            -peekLast(), offerLast(E e), pollLast()
        - methods inherited from Collection --error - exception
            - getFirst(), addFirst(), removeFirst()
            - getLast(), addLast(), removeLast()
    */

    public static void main(String[] args){
        //as Stack
        Deque<String> colors = new ArrayDeque<>();
        colors.push("blue"); colors.push("green"); colors.push("yellow"); colors.push("red");
        System.out.println(colors);
        System.out.println(colors.peek());
        colors.pop();
        System.out.println(colors.peek());
        colors.pop();
        colors.pop();
        colors.pop();
        System.out.println(colors.peek());
        System.out.println();

        //as double-ended queue
        Deque<Integer> nums = new LinkedList<>();
        nums.addFirst(8); nums.offerFirst(65); nums.addLast(82);
        System.out.println(nums);
        System.out.println(nums.getFirst());
        System.out.println(nums.peekLast());
        nums.pollFirst();
        System.out.println(nums);
        nums.pollLast();
        System.out.println(nums);


    }
}
