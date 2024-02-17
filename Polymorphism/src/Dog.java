public class Dog {
    public  boolean canRun(){
        return true;
    }


//    public int getSpeed(){return 25;} // since getSpeed() is overridden in a subclass, all calls to this method will be replaced at runtime
//    public  void printSpeed(){
//        System.out.println(this.getSpeed());
//    }

    //if made final/static, it can't be overridden, you can hide instead

    public  static int getSpeed(){return 25;}
    public void printSpeed(){
        System.out.println(this.getSpeed());
    }
}


