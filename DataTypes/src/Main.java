public class Main {

    public static void main(String[] args) {

//        supported digital formats
        /*octal digits - 0 prefix, eg. 09067
        hexadecimal - 0X prefix, eg. 0XA56
        binary - 0b prefix, eg. 0b10110

        readability - use underscore btwn digits, eg. 454_____657 - still compiles*/

        // Wrapper classes - most common way to create an object from a primitive and also from a string
        // use static method valueOf()
        //Examples
        Integer x = Integer.valueOf(6);
        Byte y = Byte.valueOf((byte) 12); // implicit casting where necessary
        Integer z = Integer.valueOf("455"); //from a string

        System.out.println(x.intValue()); //System.out.println(x);
        System.out.println(y.byteValue());
        System.out.println(z.intValue());


        //other useful methods of wrapper classes
        int m = Integer.parseInt("6786");
        System.out.println(m);

        //Strings - reference type



    }
}