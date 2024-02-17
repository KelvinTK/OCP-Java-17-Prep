public class Main {

    //Java Platform Module System (JPMS)
    /*
        - in practice you often need to use libraries (code) written by others
        - one way to make these libraries part of your program is by using JAR files
            - you have to make sure you have compatible versions of all libraries at runtime
            - this creates a complex chain of dependencies and min versions
        - another way is to use modules
            - they provide groups of related packages with some set of functionalities
            - the developer can choose which packages are accessible outside the module

        Benefits of modules
        - better control
            - you can have packages which are only accessible to other packages
        - clearer dependency manager
            - if some dependency is missing, Java will complain when starting the program
        - custom java builds
            - you can choose which parts of the JDK you need
        - improved security
            - you only have to worry about the modules you use
        - improved performance
            - comes with smaller package
    */
    public static void main(String[] args){

    }
}
