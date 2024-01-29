public class FordModelT implements Car, Ford {

    @Override
    public int maxDist(int tankVolume){
        return tankVolume*9;
    }


    public String getColor(){
        return "black";
    }
}
