import java.util.Objects;

//old way of creating encapsulated class
public final class Student {
    //1. declare private final fields
    private final String fname;
    private final String lname;
    private final int id;

    //2. define the constructor
    public Student(String fname, String lname, int id){
        this.fname = fname;
        this.lname = lname;
        this.id = id;
    }

    //3. define getters
    public  int getId(){
        return id;
    }
    public  String getFName(){
        return fname;
    }
    public  String getLName(){
        return lname;
    }

    //4. override toString() method
    @Override
    public String toString(){
        return "Student{" + "fname = " + fname + '\'' +
                ", lname = " + lname + '\'' +
                ", id = " + id + '}';
    }

    //5. Override equals() method
    @Override
    public boolean equals(Object o){
        if(this == o) return  true;
        if(o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(fname, student.fname) && Objects.equals(lname, student.lname);
    }

    //6. override hashCode() method
    @Override
    public int hashCode(){
        return  Objects.hash(fname, lname, id);
    }

    //all this can be replaced by ONE line of code
//    public  record  Student2 (String fName, String LName, int Id);
}
