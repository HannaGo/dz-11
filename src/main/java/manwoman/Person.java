package manwoman;

//package src.main.java.manwoman;

public class Person {
    public  String firstName;
    public  String lastName;
    public  int age;
    public  Person partner;
    public String maidenName;




    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public Person(Person partner) {

        this.partner = partner;
    }

    public Person(String maidenName) {
        this.maidenName = maidenName;
    }
}