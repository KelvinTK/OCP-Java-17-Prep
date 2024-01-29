public class FlowControl {
    public static void main(String[] args){
        switchStat(10);
        switchExp(4);
        switchNew(4);
        switchAB(5, 10);

        //as a variable
        int a = 1;
        String greeting =  switch (a){
            case 0, 1, 2, 3 -> "Hello";
            case 4, 5 -> "hi";
            default -> "Bye";
        };
        System.out.println(greeting);

        //yield keyword
        a = 4;
        String greeting2 =  switch (a){
            case 0, 1, 2, 3 -> "Hello";
            case 4, 5 -> {
                String s1 = "good";
                String s2 = "afternoon";
                yield s1+s2;
            }
            default -> {yield "Bye"; } //yield can be used in a single line but in a block of code
        };
        System.out.println(greeting2);

        //to be revisited
       /* enum Compass {North, South, East, West}
        String getDirection (Compass value) {
            return switch(value){
                case North -> "north";
                case South -> "South";
                case East -> "East";
                case West -> "West";
            };
        }*/


    }

    //Switch statement - default can be put anywhere
    //NO deafult - all expressions from when it evaluates to true are executed
    //long, boolean and decimals not allowed
    static void switchStat(int a){
        switch (a){
            case 0: //case 0 or case 1....., can be put in the same line
            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("Privyet");
                break;
            default:
                System.out.println("ndeip");
        }
    }

    //Switch expression
    static void switchExp(int a){
        System.out.println();
        switch (a){
            case 0, 1, 2, 3: //case 0 or case 1....., can be put in the same line
                System.out.println("hello");
                break;
            case 4, 5:
                System.out.println("Privyet");
                break;
            default:
                System.out.println("ndeip");
        }
    }

    //Switch Exp new syntax
    //no need for break
    static void switchNew(int a){
        System.out.println();
        switch (a){
            case 0, 1, 2, 3 -> System.out.println("hello");
            case 4, 5 -> {System.out.println("Privyet");
                System.out.println("Use block fro multiple expressions");}
            default -> System.out.println("ndeip");
        }
    }

    static void switchAB(int a, int b){
        String greeting =  switch (a){
            case 0, 1, 2, 3 -> "Hello";
            case 4, 5 -> {
                if (b>0)
                    yield "Hi Kelvin";
                    else
                        yield "Hi Tafadzwa";
            }
            default -> "Bye"; //default is a must in this case as the covered cases don't represent all integers else use enums
        };
        System.out.println(greeting);
    }


}
