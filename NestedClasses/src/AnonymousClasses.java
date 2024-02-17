public class AnonymousClasses {
    abstract  class Sale{
        abstract  int discount();
    }

    public int newPrice(int oldPrice){
        Sale sale = new Sale() { //Anonymous Class: no name but an instance
            @Override
            int discount() {
                return 2;
            }
        };
        return oldPrice - sale.discount();
    }
}
