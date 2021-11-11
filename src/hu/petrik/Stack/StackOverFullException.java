package hu.petrik.Stack;

public class StackOverFullException extends RuntimeException {
    public StackOverFullException() {
        System.err.println("A verem tele van, nem lehet további elemet hozzá adni!");
    }
}
