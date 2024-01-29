public class LocalVariableTypeInference {

    static public void main(String[] args){
        /*
        - local variable - can be used only with local variables
        - type inference - the type of the variable is inferred by the compiler

        - cannot be reassigned to another type
        - cannot be assigned to null
        - var is NOT a reserved word
        - cannot be used for method params
        */

        var a = 5; //the compiler will figure out the type
        var name = "Kelvin";

        System.out.println();

        //
    }
}
