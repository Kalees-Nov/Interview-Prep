package org.example.Oops;

public class Encapsulation {

    private String name;
    private int age;
    private String email;

    public Polymorphisum getPolymorphisum() {
        return polymorphisum;
    }

    public void setPolymorphisum(Polymorphisum polymorphisum) {
        this.polymorphisum = polymorphisum;
    }

    private Polymorphisum polymorphisum;

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<=0) {
            System.out.println("age is must be greater than 0");
            throw new IllegalArgumentException("age is must be greater than 0");
        }
        else
         this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Encapsulation(String name, int age, String email) {
        this.name = name;
        if(age<=0) {
            System.out.println("age is must be greater than 0");
            throw new IllegalArgumentException("age is must be greater than 0");
        }
        else
            this.age = age;
        this.email = email;
    }

    public Encapsulation(){
        this.polymorphisum =new Polymorphisum();
    }



}
