
public class BreakAndContinue {
    public static void main(String[] args) {

        //break = break out of a loop (STOP)
        // Continue = skip current iteration of a loop (SKIP)


        for (int i = 0; i < 10; i++)
        {
            if (i == 5)
            {
                continue;          //skip number 5
            }
            System.out.println(i + " ");
        }

        /*for(int i = 0; i < 10; i++)
        {
            if (i == 5)
            {
                break;          makes it stop after 5 times
            }
            System.out.print(i + " ");
        }
         */

    }
}