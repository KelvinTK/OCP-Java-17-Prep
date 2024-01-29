public class MyClass {
    private int id;
    private String fullName;

    public MyClass(int id, String fullName){
        if (id<10||fullName.length()>100)
            throw new IllegalArgumentException();
        this.id = id;
        this.fullName = fullName;
    }
}
