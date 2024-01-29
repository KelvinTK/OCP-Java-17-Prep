public class Methods01 {
    public static void main(String[] args){
        Item item = new Item();
        System.out.println(item.getPrice(100));
        System.out.println();

        Item item2 = new Item();
        item2.tax = 0.1;
        System.out.println(item2.getPrice(1000));

        item.greet("Hi", "Kelvin", "Tafazwa");
        //can pass an array as varargs
        String[] names = {"Kelvin", "Tafazwa"};
        System.out.println();
        item.greet("Hello", names);

    }

}
