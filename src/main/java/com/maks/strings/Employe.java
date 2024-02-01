package com.maks.strings;

public class Employe {
    private String name;
    private int age;
    private int salary;
    public Employe(String name, int age){
        setName(name);
        setAge(age);
        setSalary(2000);
    }

    public Employe(String name, int age, int salary){
        
        this(name, age);
        setSalary(salary);
    }

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
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employe [name=" + name + ", age=" + age + ", salary=" + salary + "]";
    }
    public static void main(String[] args) {
        
        Employe e2=new Employe("jack", 50);
        Employe e3=new Employe("chloe", 40,5000);
      
        System.out.println(  e2.toString());
    }
}
