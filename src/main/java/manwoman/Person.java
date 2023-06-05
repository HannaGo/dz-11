package manwoman;

//package src.main.java.manwoman;

import java.util.ArrayList;

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

//    public Person(Person partner) {
//
//        this.partner = partner;
//    }
//
//    public Person(String maidenName) {
//        this.maidenName = maidenName;
//    }

    public ArrayList<Person> registerPartnership(Person partner) {
        this.partner = partner;
        partner.partner = this;
        partner.lastName = this.lastName;
        ArrayList<Person> partnership = new ArrayList<Person>();
        partnership.add(this);
        partnership.add(partner);

        return partnership;

    }
}