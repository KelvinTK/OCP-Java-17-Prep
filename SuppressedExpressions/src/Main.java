public class Main {
    //Suppressed Expressions
    /*
        - suppose close() can throw an exception, eg.
            public void close() throws IllegalStateExpression{
                throw new IllegalStateExpression("Can't close the door")
            }
        - if try-with-resources bloc also throws an exception in catch bloc then:
            - only the first expression will be caught
            - other expressions will be suppressed
    */

    public static void main(String[] args){
        try (Door door = new Door()){
            throw new IllegalStateException("Smth ain't right");
        }catch (IllegalStateException e){
            System.out.println("Caught: " + e.getMessage());
            for (Throwable t:e.getSuppressed()) //access suppressed exceptions
                System.out.println("Supressed: " + t.getMessage());

        }
    }


}
