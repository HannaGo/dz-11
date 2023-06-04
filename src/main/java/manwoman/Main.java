package manwoman;
//package src.main.java.manwoman;

public class Main {
    public static void main(String[] args) {
        Man man = new Man("Mykola", "Jonsoniuk", 35);

        System.out.println("His name is " + man.firstName + " " + man.lastName + ", and he is " + man.age + " years old , retired: " + man.isRetired());

        Woman woman = new Woman("Anna", "Gogo", 30);
        System.out.println("Her name is " + woman.firstName + " " + woman.lastName + ", and she is " + woman.age + " years old , retired: " + woman.isRetired());

        man.registerPartnership(woman);
        System.out.println(man.firstName + " " + man.lastName + ", age: " + man.age);
        System.out.println(woman.firstName + " " + woman.lastName + ", age: " + woman.age);

        man.deregisterPartnership(true);
        System.out.println(man.firstName + " " + man.lastName + ", age: " + man.age);
        System.out.println(woman.firstName + " " + woman.lastName + ", age: " + woman.age);
    }
}