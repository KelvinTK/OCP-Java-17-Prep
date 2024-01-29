public class GarbageCollector {

    static public void main(String[] args){
        String a, b;
        a = new String("Emperor");
        b = new String("King");
        a = b; //the object Emperor is now eligible for garbage collection
        String  c = a;
        a = null;

        //NOTE: only objects and NOT references are eligible for garbage collection. 'a' can't be collected

    }
}
