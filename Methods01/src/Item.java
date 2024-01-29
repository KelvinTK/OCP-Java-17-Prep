public class Item {
    public double tax = 0.2;
    public double getPrice(double inputPrice){
        final double margin = 0.05; //const but an array's content can still be changed
        return inputPrice*(1+tax)*1+margin;
    }

    //variable arguments
    public void greet(String greeting, String... names){
        for (String name: names){
            System.out.println(greeting + ", " + name);
        }
    }



}
