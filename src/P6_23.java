import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: E
 * Date: 10/11/13
 * Time: 1:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class P6_23 {

    public static void main(String[] args) {
        //Make two arraysLists for name and value.  There is for sure a better way to do this using classes or
        //dictionaries, but I am not that advanced yet.  It should definitely be a single data structure.
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<Integer> values = new ArrayList<Integer>();
        String currentName;
        int iValue;
        int counter = 0;

        //Prompt the user to input a string and an int value > 0.
        //Read in the string and int and put them in the array unless the String is length 0 or the int is not an int.
        System.out.println("Program will print a pretty sideways histogram with data you enter.");
        do {
            Scanner in = new Scanner(System.in);
            System.out.printf("Enter category label or blank to print histogram:");
            currentName = in.nextLine();

            //If String name input length is 0, break from loop and proceed to print histogram.
            if (currentName.length() == 0){
                break;
            }
            //Otherwise try to read in an int.
            System.out.print("Enter category value (positive integer)");
            try{
                iValue = in.nextInt();
                if (iValue >= 0){
                    names.add(counter, currentName);
                    values.add(counter, iValue);
                    counter += 1;
                }
                else{
                    System.out.println("Value was negative, printing histogram...");
                }
            }
            catch (InputMismatchException ex){
                System.out.println("Not an integer.  Printing histogram...");
                break;
            }
        }while(iValue >= 0 && currentName.length()>0);

        //Find the max value that was entered in the int arrayList.
        int maxInt = Collections.max(values);

        for (int i = 0; i < names.size(); i++) {
            //Print the category names.
            System.out.printf("%15s ", names.get(i));
            //Print the starts normalized to 40.
            for (int j = 0; j < (int) Math.round(40.0*values.get(i)/maxInt) ; j++) {
                System.out.print("*");

            }
            System.out.println();
        }


    }
}
