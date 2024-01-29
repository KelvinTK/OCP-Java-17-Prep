public class MultiDimArrays {
    public static void main(String[] args){
        int[][] myArray = {{1, 4, 2}, {3}, {7, 9}, {4, 6, 4, 1}};//sub-arrays can be of any size
        for(int i =0; i<myArray.length; i++){
            for(int j=0;j< myArray[i].length; j++) {
                System.out.println("myArray(%d, %d) = %d".formatted(i, j, myArray[i][j]));
            }
        }

        for (int[] row: myArray){
            for (int element: row){
                System.out.println(element);
            }
        }
    }
}
