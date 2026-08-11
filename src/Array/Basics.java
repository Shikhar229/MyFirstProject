package Array;

public class Basics {
    public static void main(String[] args){

        String[] fruits = {"apple","orange","banana","coconut"};
        System.out.println(fruits[1]);
        fruits[1] = "pineapple";
        System.out.println(fruits[1]);

        for(int i = 0;i < fruits.length; i++){
            System.out.print(fruits[i]+ " ");
        }

        System.out.println();
        for(String fruit : fruits){
            System.out.println(fruit);
        }







    }
}
