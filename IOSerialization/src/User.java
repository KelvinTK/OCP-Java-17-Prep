import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private transient String password; //won't be serialized

    public User(String name, String password){
        this.name = name;
        this.password = password;
    }

    public String getName(){
        return  name;
    }

    public  String getPassword(){
        return password;
    }

    @Override
    public String toString(){
        return "User {name = " + name + "password = " + password + "}";
    }
    public static void main(String[] args) {

    }
}
