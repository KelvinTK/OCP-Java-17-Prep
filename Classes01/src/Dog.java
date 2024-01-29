public class Dog extends Mammal{

    //without using super
    /*protected void setNameAge(String dogName, int age){
        name = dogName;
        setAge(age);
    }*/

    //using super
    protected void setNameAge(String name, int age){
        super.name = name;
        setAge(age);
    }

    public void barks(){
        System.out.println(name + ", "+ getAge() + ": Houff! Houff-houff!");
    }
}
