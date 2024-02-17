public class AnonymousClasses2 {
    interface  Sale{
        int discount();
    }
    public int newPrice(int oldPrice){
        Sale sale = new Sale() {
            @Override
            public int discount() { //has to be public
                return 2;
            }
        };
        return oldPrice = sale.discount();
    }
}
