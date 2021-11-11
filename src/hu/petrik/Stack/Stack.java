package hu.petrik.Stack;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {

     private List<T> elements;

    public Stack() {
        this.elements = new ArrayList<>();
        this.elements.clear();
    }

    public void push(T element) {
        this.elements.add(element);
    }
}
