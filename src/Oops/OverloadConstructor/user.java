package Oops.OverloadConstructor;

public class user {
    String username;
    String email;
    int age;

    user(String username){
        this.username = username;
        this.email = "Not provided";

    }

    user(String username, String email){
        this.username = username;
        this.email = email;
    }

    user(String username, String email, int age){
        this.username = username;
        this.email = email;
        this.age = age;

    }





}
