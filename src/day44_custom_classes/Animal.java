package day44_custom_classes;

public class Animal {
    String type = "cat";

    public void eat() {
        System.out.println("the " + type + " eats");
    }

    public void speak() {
        System.out.println("the " + type + " sleeps");
    }

    public void eat(String food) {
        System.out.println("the " + type + " is eating " + food);
    }
}
