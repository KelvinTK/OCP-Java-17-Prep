import java.io.*;

public class SerialisationExample {
    public static void serialize(Object object, String fileName)throws IOException {
        try (var out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)))){
            out.writeObject(object);
        }
    }

    public static Object deserialize(String fileName) throws IOException, ClassNotFoundException{
        try(var in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(fileName)))){
            return  in.readObject();
        }
    }

    public static void main(String[] args) {
        User user = new User("Kelvin K", "Password");

        try{
            //serialization
            serialize(user, "user.ser");

            //deserialization
            User deserializedUser = (User)deserialize("user.ser");

            System.out.println(deserializedUser);
        }catch(IOException | ClassNotFoundException e){
            throw new RuntimeException();
        }
    }
}
