import java.text.MessageFormat;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

public class Main {

    //Resource Bundle
    /*
        - properties file which contains the locale-specific objects for the program
            - basically a map with keys and values
        - the keys and values in the properties file are separated by either = or :
        - the properties file name is like this: Museum_en.properties
            - <name_of_the_bundle>_<target_locale>.properties
        - to load a resource bundle:
            ResourceBundle.getBundle(bundle, locale)

        //Museum_en.properties
        greeting=Hello
        open=The museum is open

        //Museum_it.properties
        greeting:Ciao
        open:Il museo e aperto

        //formatting messages (in the resource bundle)
        greetByName=Ciao, {0} e {1}
    */

    public static void main(String[] args){
        /*var enRb = ResourceBundle.getBundle("Museum", new Locale("en", "US"));
        var itRb = ResourceBundle.getBundle("Museum", new Locale("it", "ITALY"));
        System.out.println(enRb.getString("greeting")+ "! "+ enRb.getString("open"));
        System.out.println(itRb.getString("greeting")+ "! "+ itRb.getString("open"));


        //formatting messages
        String greet = itRb.getString("greetingByName");
        System.out.println(MessageFormat.format(greet, "Bruno", "Luka"));*/


        //using Properties class to define properties outside rb file
        var p = new Properties();
        p.setProperty("name", "Natural Museum");
        System.out.println("Welcome to " + p.getProperty("name"));
        //works like a HashMap with String key and values

    }
}
