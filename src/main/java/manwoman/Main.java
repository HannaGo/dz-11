package manwoman;
//package src.main.java.manwoman;

public class Main {
    public static void main(String[] args) {
        Man man = new Man("Mykola", "Jonsoniuk", 35);
        Man man2 = new Man("Andrij", "Lek", 66);

        System.out.println("His name is " + man.firstName + " " + man.lastName + ", and he is " + man.age + " years old , retired: " + man.isRetired());
        System.out.println("His name is " + man2.firstName + " " + man2.lastName + ", and he is " + man2.age + " years old , retired: " + man2.isRetired());

        Woman woman = new Woman("Anna", "Gogo", 30);
        Woman woman2 = new Woman("Maria", "Sen", 55);

        System.out.println("Her name is " + woman.firstName + " " + woman.lastName + ", and she is " + woman.age + " years old , retired: " + woman.isRetired());
        System.out.println("Her name is " + woman2.firstName + " " + woman2.lastName + ", and she is " + woman2.age + " years old , retired: " + woman2.isRetired());



        man.registerPartnership(woman);
        System.out.println(man.firstName + " " + man.lastName + ", age: " + man.age);
        System.out.println(woman.firstName + " " + woman.lastName + ", age: " + woman.age);

        woman.deregisterPartnership(true);
        System.out.println(man.firstName + " " + man.lastName + ", age: " + man.age);
        System.out.println(woman.firstName + " " + woman.lastName + ", age: " + woman.age);



        man2.registerPartnership(woman2);
        System.out.println(man2.firstName + " " + man2.lastName + ", age: " + man2.age);
        System.out.println(woman2.firstName + " " + woman2.lastName + ", age: " + woman2.age);

        woman2.deregisterPartnership(true);
        System.out.println(man2.firstName + " " + man2.lastName + ", age: " + man2.age);
        System.out.println(woman2.firstName + " " + woman2.lastName + ", age: " + woman2.age);



        man.registerPartnership(man2);
        System.out.println(man.firstName + " " + man.lastName + ", age: " + man.age);
        System.out.println(man2.firstName + " " + man2.lastName + ", age: " + man2.age);

        man2.deregisterPartnership(true);
        System.out.println(man.firstName + " " + man.lastName + ", age: " + man.age);
        System.out.println(man2.firstName + " " + man2.lastName + ", age: " + man2.age);



        woman.registerPartnership(woman2);
        System.out.println(woman.firstName + " " + woman.lastName + ", age: " + woman.age);
        System.out.println(woman2.firstName + " " + woman2.lastName + ", age: " + woman2.age);

        woman2.deregisterPartnership(true);
        System.out.println(woman.firstName + " " + woman.lastName + ", age: " + woman.age);
        System.out.println(woman2.firstName + " " + woman2.lastName + ", age: " + woman2.age);

    }
}