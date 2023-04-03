package collection;

import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {


        Stack<String> animal = new Stack<>();

        animal.push("lion ");
        animal.push("Dog");
        animal.push("Horse");
        animal.push("Cat");
        System.out.println(animal);

        System.out.println(animal.peek());
        animal.pop();
        System.out.println(animal.peek());

    }
}
