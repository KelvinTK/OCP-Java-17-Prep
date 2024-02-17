public class Main {
    //Pipeline
    /*
        - a stream in java is a sequence of data
        - stream pipeline is a set of operations that run on the stream to produce the result
        - can be thought of as an assembly line
            - every line has a beginning (source)
                - where the stream comes from
            - after that, elements in the line are processed one-by-one (intermediate operations), not mandatory
                - transforms the stream into another stream
                - there can be many of these operations
                - intermediate operations don't run until the terminal operations run (lazy)
            - and finally, the result (terminal operation)
                - produces results, and can be used only once
                - after the terminal operation completes, stream is no longer valid
        - data in the stream is not processed upfront
            - rather, each element is created when needed - lazy evaluation
    */
    public static void main(String[] args){

    }
}
