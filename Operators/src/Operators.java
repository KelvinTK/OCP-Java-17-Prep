public class Operators {
    public static void main(String[] args){
        //Unary operators, eg. x++
        //Binary operators, eg. a = b+c;
        //Ternary operator, eg. a = (b>0) ? 3: 2
        //BODMAS and also check slides for precedence
        //bitwise complement: ~a
        // positivity, negativity: +1, -b
        //cast: (int)a
        int a =19;
        int b = a++;
        System.out.println(a);
        System.out.println(b);

        int x = 17;
        x = x++;
        System.out.println(x);

        //implicit casting / auto-casting
        short i = 17;
        float j = 15;
        double k = 35;
        System.out.println(i*j/k); //casts to the largest - double

        //short, byte, char are always  converted to int first - won't compile without explicit casting
        short m = 5;
        short n = 7;
        short p = (short) (m + n);

        int r = 748;
        double q = r;
        int z = (int) q; //explicit casting needed when assigning a small to a larger type

        int g = 6;
        int f = (g=4)*2;
        System.out.println(g);
        System.out.println(f);

        boolean ok = false;
        if (ok = true) //CAREFUL, ok has been reassigned to true. Use ==
            System.out.println(ok);
        else
            System.out.println(ok);

        //comparison operators
        //compares if the objects are pointing to the same object
        System.out.println("----Comparison-----");
        String name1 = "Kelvin";
        String name2 = "Kelvin";
        System.out.println(name1 == name2);

        //new creates a new reference
        String name3 = new String("Kelvin");
        String name4 = new String("Kelvin");
        System.out.println(name3 == name4);

        //Relational: <, >, <=, >=, instanceof
        //don't compare smth wc is not comparable, null-object = false
        System.out.println("----Relational-----");
        Number num = 7;
        System.out.println(num instanceof Integer? true: false);

        //Logical: &, |, ^=(XOR) - evaluate everything!
        System.out.println("----Logical-----");
        System.out.println(0b10&0b01);
        System.out.println(0b10^0b01);
        System.out.println(5<10&16<10);

        //Conditional: &&, ||, - terminates (short-circuits) whenever it evaluates to true
        //short-circuit also happens with the ternary operator
    }

}
