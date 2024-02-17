import java.io.Console;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Console console = System.console();
        if(console != null){
           String name = console.readLine("What's your name? ");
           console.format("Hello, %s!%n", name);
           console.writer().println("-".repeat(30));
           char[] password = console.readPassword("Enter Password: ");
            char[] repeatPassword = console.readPassword("Repeat Password: ");

            if(Arrays.equals(password, repeatPassword)){
                console.printf("Access Granted!!!");
            }else{
                console.printf("Passwords do not match!\n");
            }
        }else{System.err.println("Console unavailable");}
    }
}
