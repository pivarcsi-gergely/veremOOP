package hu.petrik.Stack;

public class StackEmptyException extends RuntimeException {

    public StackEmptyException() {
        System.err.println("A verem üres, nem lehet belőle elemet kivenni");
    }

}
