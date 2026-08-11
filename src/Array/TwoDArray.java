package Array;

public class TwoDArray {
    public static void main(String[] args){

//        2D array = An array where each element is an array

        String[] fruits = {"apple","orange","banana"};
        String[] vegetables = {"potato","onion","carrot"};
        String[] meats = {"chicken","pork","beef","fish"};


        String[][]groceries = {fruits,vegetables,meats};

        System.out.println(groceries[0][1]);
        for(String[] foods: groceries){
            for(String food: foods){
                System.out.print(food+" ");

            }
            System.out.println();
        }

        char[][] telephone = {{'1','2','3'},{'4','5','6'},{'7','8','9'},{'*','0','#'}};
        for(char[] row: telephone){
            for(char number: row){
                System.out.print(number+" ");
            }
            System.out.println();

        }

    }
}
