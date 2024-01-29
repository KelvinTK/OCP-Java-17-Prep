public class FlowControl2 {
    static public void main(String[] args){

        //break nested loops with labels
        int i = 0, j = 0;
        OUTER_LOOP: while (true){
            i++;
            j = 0;
            INNER_LOOP: while(true){
                j++;
                System.out.println("("+i+","+j+")" );
                if (j==3) break OUTER_LOOP; //will break all nested loops
            }
//            System.out.println("Hello"); // won't work - unreachable code
        }

        int k = -1;
        while(k<10){
            k++;
            if(k%2==1)continue;
            System.out.println(k);
        }

        returnKill();
    }

    static void returnKill(){
        int i=0,j=0;
        while (true){
            i++;
            while (true){
                j++;
                System.out.println("("+i+","+j+")" );
                if (j==5) return; //exits the method
            }
        }
    }
}
