public class Mammal {
    private int age;
    protected String name;
    public int getAge(){ //getter
        return age;
    }

    //setter method without using this
    /*public void setAge(int theAge){ //return type** -setter
        age = theAge;
    }*/

    //setter method using this
    public void setAge(int age){
        this.age = age;
    }
}
