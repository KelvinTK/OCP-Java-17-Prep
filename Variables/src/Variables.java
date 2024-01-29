public class Variables {
    public static void main(String[] args){
        int x, y = 1; //x is not initialized
        int a = 3, b = 100; //both are initialized
        System.out.println(a+b);

        Variables variables = new Variables();
        System.out.println(variables.compiles());
        System.out.println(variables.doesntCompile(false));

        //kinds of variables
        /*
        local variables - exist only in the  code block
        instance variables - defined withing a specific instance of the object
        class variables - belong to a class and are shared with all instances of the class. they are marked with static


        instance and class variables don't require initialization and assume default values of their type
        x in the example above is not initialized!
        */

        //constants
        final int MAX_HEIGHT = 178;
        final int[] NUMBERS = {4537, 6373, 23}; //can be applied to reference types

        //variabe scope
        /*
        1. Local variables: in scope in a code block
        2. Method parameters: in scope for the duration of the method
        3. Instance variables: in scope from declaration until the object is eligible for garbage collector
        4. class variables: in scope from declaration until the program ends
        */
    }

    public int compiles(){
       int i = 28, j = 637;
       int k; //it's never used so it compiles
       return i+j;
    }

     //initialization within if-statements
    public boolean doesntCompile(boolean ok){ //recheck
        int a;
        if (ok) {
            a = 378;
            System.out.println(a);
        }
        return ok;
    }

}
