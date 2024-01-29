public class StringPool {
    static public void main(String[] args){
        //string pool is sometimes called the intern pool
        //Both references point to the same memory
        String name = "Kelvin";
        String ename = "Kelvin";
        System.out.println(name==ename);

        String eename = " Kelvin".trim();
        System.out.println(name==eename); //pool is created at compile-time and .trim() is evaluated at run-time
        String eeename = "Kel" + "vin";
        System.out.println(name == eeename); //concatenation is done at compile-time, evaluates to true

        //instruct the compiler to use the pool
        String s = " Kelvin".trim().intern();
        System.out.println(name==s); //now, .trim() is executed at compile-time

        String s1 = " Kelvin ".trim(); //new memory - not the goal but it works
        System.out.println(name==s1.intern());

        //NOT  pointing to the same memory
        String naame = "Tafadzwa";
        String naaame = new String("Tafazwa");
        System.out.println(naame == naaame); //returns false
    }
}
