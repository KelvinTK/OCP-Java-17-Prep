public class Shoe extends CovariantReturnTypes{
    @Override
    public Double calculatePrice(float shoePrice){ //Double is a subtype of Number, so it's ok
        return (shoePrice + shoePrice*0.2) *1.05;
    }
}
