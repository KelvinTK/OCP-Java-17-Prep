public class Main {

    //Enum
    /*
        - enumeration is a fixed set of constants
        - provides type-safe checking
            -is impossible to create an invalid enum
        -common examples
            seasons, compass directions, days of the week, etc
    */

    public static void main(String[] args){
        Compass N = Compass.NORTH; //= Compass.valueOf("NORTH")
        System.out.println(N);
        System.out.println(N==Compass.NORTH);
        System.out.println();

        for (var direction: Compass.values())
            System.out.println(direction.ordinal() + ": " + direction.name());

        System.out.println();

        //often used in switch expressions
        switch (N){
            case NORTH -> System.out.println("Heading North"); //only the value works in the cases
            case EAST -> System.out.println("Heading East");
            case WEST -> System.out.println("Heading West");
            case SOUTH -> System.out.println("Heading South");
            default -> System.out.println("Lost?");
        }

        System.out.println();

        Compass2 E = Compass2.EAST;
        System.out.println(E);
        E.printInstruction();
        System.out.println();

        Compass3 S = Compass3.SOUTH;
        System.out.println(S.getDirection());
        System.out.println();

        System.out.println(Compass4.NORTH.getDirection());
        System.out.println(Compass4.EAST.getDirection());
        System.out.println();

        System.out.println(Compass5.WEST.getName());
    }

    //simple enums
    public enum Compass{
        NORTH, SOUTH, EAST, WEST
    }

    //enums have constructors and instance methods
    enum Compass2{
        NORTH("Up"), SOUTH("Down"), EAST("Right"), WEST("Left"); //constructor calls
        private final String instruction;
        private Compass2(String instruction){ //is implicitly private
            this.instruction = instruction;
        }
        public void printInstruction(){
            System.out.println(instruction);
        }
    }

    //enums can also implement abstract methods
    enum Compass3{
        //Values must be listed first!
        NORTH{
            public String getDirection(){return "Up";}
        },
        SOUTH{
            public String getDirection(){return "Down";}
        },
        EAST{
            public String getDirection(){return "Right";}
        },
        WEST{
            public String getDirection(){return "Left";} //implementation
        };
        public abstract String getDirection();//abstract method.
    }

    //methods can be overridden by certain enums
    enum  Compass4{
        NORTH{
            public String getDirection(){return  "Up";}
        },
        SOUTH{
            public String getDirection(){return  "Down";}
        },
        EAST, WEST; //use default implementation

        public String getDirection(){return "Sideways";}
    }

    //enums cannot extend a class but can implement an interface
    interface Planet{
        String getName();
    }
    public enum Compass5 implements Planet{
        NORTH, SOUTH, EAST, WEST;

        @Override
        public String getName() {
            return "Earth";
        }
    }
}
