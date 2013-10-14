import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: E
 * Date: 10/13/13
 * Time: 6:20 PM
 * To change this template use File | Settings | File Templates.
 Two methods are implemented, printDigit and printBarCode.  They are called from main; the printDigit prints the barCode
 the user entered and the printBarCode prints the Bar code that corresponds with the value the user entered.
 */
public class P5_25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int iZip = 0;

        //Prompt the user for input and check that it is a proper zip code.
        try{
            System.out.println("Enter a five digit zip code to convert to bar code.  Can't start with 0:");
            iZip = in.nextInt();

        //Check that the number is a valid zip code.
            if(iZip < 10000 || iZip > 99999){
                System.out.println("Not a valid zip code.  Please run program again.");
                System.exit(1);
            }

            printBarCode(iZip);

        }
        catch(InputMismatchException ex){
            System.out.println("Not in integer format.  Please run program again.");
            System.out.println(ex);
            System.exit(1);
        }
    }

    public static void printDigit(int d){
        String[] sBars = {"||:::", ":::||", "::|:|","::||:", ":|::|", ":|:|:", ":||::", "|:::|", "|::|:", "|:|::"};
        System.out.print(sBars[d]);
    }


    public static void printBarCode(int zipCode){
        //Define an array of strings that correspond to the five numbers and the checksum.
        System.out.println("The zip code is " + zipCode + ".");
        String sZip = Integer.toString(zipCode);
        System.out.println("********Here is the bar code*********");
        System.out.print("|");
        int total = 0;
        //Swapped to a string in order to iterate over the digits.  For loop it, convert to a digit, and call printDigit
        //Also calculate a running total of the sum of the digits.
        for (int i = 0; i < sZip.length() ; i++) {
            int index = Integer.parseInt(sZip.substring(i,i+1));
            printDigit(index);
            total += index;
        }
        //Also the amount that will make the total of the form 10x (the checksum condition)
        printDigit(10 - (total % 10));
        System.out.print("|");
    }
}



