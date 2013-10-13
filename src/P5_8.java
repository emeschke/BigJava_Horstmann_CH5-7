import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: E
 * Date: 10/9/13
 * Time: 10:38 AM
 * To change this template use File | Settings | File Templates.

 It is a well-known phenomenon that most people are easily able to read a text whose words have two characters flipped,
 provided the first and last letter of each word are not changed.  For example,
    "I dn'ot gvie a dman for a man taht can olny sepll a wrod one way. (Mrack Taiwn)"
 Write a method "String scramble" that constructs a scrambled versino of a given word, randomly flipping two characters
 other than the first and las one.  Then write a program that reads words and prints the scrambled words.
 */

public class P5_8 {
    public static void main(String[] args) {

        //Main program that reads words and then sends them to be scrambled.
        //Prompt user to input a line to scramble.
        System.out.println("Please enter a line to scramble:");

        //Read in the line and send it to th scramble method.
        Scanner in = new Scanner(System.in);
        String[] sWord = in.nextLine().split(" ");

        for (int i = 0; i < sWord.length; i++) {
            System.out.print(scramble(sWord[i] + " "));

        }
    }
    public static String scramble(String word){
        //if word length is < 4 return word.
        if (word.length() <5){
            return word;
        }

        //else, generate two random numbers.  Multiply those by word length -3 and add 2 to represent the middle
        //letters of the words.  Flip those two letter in a new array and return that array.
        //System.out.println(word.length());
        int flip1 = (int)(Math.random()*(word.length()-3)+1);
        int flip2 = 0;
        do{
            flip2 = (int) (Math.random()*(word.length()-3)+1);
            //System.out.println("Randomizing");
        } while(flip1 == flip2);

        //System.out.print(flip1 +" "+ flip2);
        //Create a new array to flip, flip the letters and return the new array.

        char[] cFlip = word.toCharArray();
        char cTemp = cFlip[flip1];
        cFlip[flip1] = cFlip[flip2];
        cFlip[flip2] = cTemp;
        String flipped = new String(cFlip);

        return flipped;

    }
}


