public class Strings {
    static public void main(String[] args){
        String name = "Kelvin";
        System.out.println(name.charAt(4));
        System.out.println(name.indexOf('v'));
        System.out.println(name.indexOf('v', 4));
        System.out.println(name.indexOf("vin"));
        System.out.println(name.substring(3));
        System.out.println(name.substring(2, 5));

        String name1 = new String("Tafadzwa");
        String name2 = new String("TaFadzwa");

        System.out.println(name1==name2); //not referencing the same object
        System.out.println(name1.equals(name2)); // compares values but vase-sensitive
        System.out.println(name1.equalsIgnoreCase(name2)); //compares values,NOT case-sensitive
        System.out.println(name1.startsWith("t")); //case sensitive
        System.out.println(name1.contains("Taf"));
        System.out.println(name1.replace("T", "t"));

        String word = "    Spaces ";
        System.out.println(word);
        System.out.println(word.strip()); //removes white spaces
        System.out.println(word.trim());
        System.out.println(name.indent(2)); //indentation
        System.out.println(name.indent(-2)); //indentation
        System.out.println(word.stripIndent()); //indentation

        String word2 = "Kelvin\\tKutsukutsa";
        System.out.println(word2);
        System.out.println(word2.translateEscapes());

        String newString = " ";
        System.out.println(newString.isEmpty());
        System.out.println(newString.isBlank());

        //Formatting
        /*
        %s - for any type, usually a string
        %d - for integral values
        %f - for decimal numbers
        %n - inserts a system-dependent line separator
        */
        int letters = 4;
        String out1 = String.format("%s has %d letters", name, letters);  //in place of concatenation
        System.out.println(out1);

        //method chaining
        System.out.println(word.trim().replace("S", "s"));

        //Strings are immutable
        name.toLowerCase();
        System.out.println(name); //no changes
        name = name1;
        System.out.println(name);
    }
}
