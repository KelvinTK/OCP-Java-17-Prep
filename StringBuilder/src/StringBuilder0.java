public class StringBuilder0 {
    public static void main(String[] args){
        //is mutable
        StringBuilder name = new StringBuilder("Kelvin");
        name.append(" Kutsukutsa");
        System.out.println(name);
        name.append(1).append(true);
        System.out.println(name);
        System.out.println(name.insert(16, " "));
        System.out.println(name.delete(20, 20));
        System.out.println(name.reverse());
        System.out.println(name.toString());
        //equals() is the same as == - points to the references
        //convert to string to compare content

        System.out.println(name.substring(0,6)); //doesn't change the stringBuilder
        System.out.println(name);


    }
}
