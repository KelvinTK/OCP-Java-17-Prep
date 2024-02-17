import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        //using reentrantLock - equivalent to using synchronized block but gives more access
        Lock myLock = new ReentrantLock();
        try{
            myLock.lock();
            //code that needs to be executed one thread at a  time
        }finally {
            myLock.unlock();
        }

    }

    //using synchronized block
    void doSomething(){
        synchronized (this){
            //code that needs to be executed one thread at a  time
        }
    }

    //another way
    synchronized void doSomething2(){
        //code that needs to be executed one thread at a  time
    }


}
