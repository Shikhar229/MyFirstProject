package Oops.OverloadConstructor;

public class main {
    public static void main(String[] args){
        user user1 = new user("Spongebob");
        user user2 = new user("Patrick","PStar@gmailocm");
        user user3 = new user("Sandy","SCheek@gmail.com",27);

        System.out.println("For user1 : ");
        System.out.println(user1.username);

        System.out.println("For user2: ");
        System.out.println(user2.username);
        System.out.println(user2.email);



    }

}

