
public class TwoDarrays {
    public static void main(String[] args) {

        // 2D array = An array where each element is an array, useful for storing a matrix of data

        String[] fruits = {"apple","orange","banana"};
        String[] vegetables = {"potato","onion","carrot"};
        String[] meats = {"chicken", "pork", "beef", "fish"};

        String[][] groceries = {fruits, vegetables, meats};

                /*
        String[][] groceries = {{"apple","orange","banana"};            works the same as previously
                               {"potato","onion","carrot"};
                               {"chicken", "pork", "beef", "fish"}};
         */

        groceries [0][0] = "pineapple"; // first is row then column so we change apple to pineapple
        groceries [1][0] = "celery";

        for (String[] foods : groceries) {
            for(String food : foods) {
                System.out.print(food + " ");
            }
            System.out.println();
        }

        //Row with 2D Arrays

        char[][] telephone = {{'1', '2', '3'},
                              {'4','5','6'},
                              {'7','8','9'},
                              {'*','0','#'}};

        for (char[] row : telephone) {
            for (char number : row) {
                System.out.print(number + " ");
            }
            System.out.println();
        }


    }
}