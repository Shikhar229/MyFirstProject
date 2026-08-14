package Oops.Constructor;

public class student {
    String name = "Spongebob";
    int age;
    double gpa;
    boolean isEnrolled;

    student(String name, int age, double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        isEnrolled = true;

    }
    void study(){
        System.out.println(this.name + " is studying");
    }


}
