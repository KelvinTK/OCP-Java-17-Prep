public class BoxingUnboxing {

    public static void main(String[] args){
        //Boxing: converting a primitive into its wrapper class, Unboxing - the opposite
        //Explicit boxing
        int a = 3;
        Integer b = Integer.valueOf(a); //into wrapper class - boxing

        //Explicit unboxing
        int c = b.intValue();

        //Implicit boxing (autoboxing)
        Integer d = a;

        //Implicit unboxing (auto-unboxing)
        int e = d;

        //however, casting and boxing CAN'T happen at the same time
        int x = 7;
//        Long y = x; //won't compile
        //one of the operations must be explicit
        Long y = Long.valueOf(x);
        //or
        Long z = (long)x;
        //or
        Long w = Long.valueOf((long)x);

        //APPLIES to unboxing
    }
}
