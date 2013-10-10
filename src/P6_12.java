/**
 * Created with IntelliJ IDEA.
 * User: E
 * Date: 10/10/13
 * Time: 9:04 AM
 * To change this template use File | Settings | File Templates.
 */
public class P6_12 {

    public static void main(String[] args) {
        int[] values = gen20_random();

        //Set a boolean variable inRun to false.
        boolean inRun = false;

        //For each valid index i in the array
        for (int i = 0; i < 20 ; i++) {
            //If inRun (is true)
            if (inRun){
                //If values[i] is different from th preceding value
                if (values[i] != values[i-1]){
                //Print )
                System.out.print(")");
                    //inRun = false
                    inRun = false;
                }
            }
            //If not inRun
            if (!inRun){
                //Print the last value and break out of the loop if i = 19 (that is the last index.)  This is because
                //i+1 is out of the array.  From the previous if statement we know that the last number isn't in a run
                //and it can't start a run, so we print it and exit.
                if (i == values.length-1){
                    System.out.print(values[i]);
                    break;
                }
                //If values[i] is the same as the following value
                else if (values[i] == values[i+1]){
                    //Print (
                    System.out.print("(");
                    //inRun = true
                    inRun = true;
                }
                //Print values[i]
            }
            System.out.print(values[i]);
        }
        //If inRun, print )
        if (inRun){
            System.out.print(")");

        }

    }

    public static int[] gen20_random(){

        int[] returnArray = new int[20];
        for (int i = 0; i < 20 ; i++) {
            //Generate random dice throws and place them in an array.

            int intRandom = (int) (Math.random() * 6) + 1;
            System.out.print(intRandom);
            returnArray[i] = intRandom;
        }
        System.out.println();
        return returnArray;
    }
}
