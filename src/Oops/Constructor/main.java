package Oops.Constructor;

public class main {
    public static void main(String[] args){

        student student1 = new student("Spongebobo",30,3.2);
        student student2 = new student("shikhar",90,8.9);


//          constructor = A special method to intialize objects you can pass arguments to a constructor
//        and set up intital values

//        System.out.println(student1.name);
//        System.out.println(student1.age);
//        System.out.println(student1.gpa);
//
//
//        System.out.printxln(student2.name);
//        System.out.println(student2.age);
//        System.out.println(student2.gpa);

        student1.study();
        student2.study();

    }
}
