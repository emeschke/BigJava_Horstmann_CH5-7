import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 * Created with IntelliJ IDEA.
 * User: E
 * Date: 10/13/13
 * Time: 1:35 PM
 * To change this template use File | Settings | File Templates.
The program follows along these lines--Create variables for each of the four categories.  Open the file
and read in the data line by line.  Split the lines by the ; and check that each of the categories exist and are of the
correct format.  Then either write each category to a new file or append it to the existing file.  The assumption is
that the category names will be identical in order to be in the same file (ie not a conference and a Conference category.
A file tester.txt is included.  It has six entries that are legitimate and two that are not, one with a non-double in
the amount field and one that only is of length 3.  The six legitimate fields are written to files, the other two are
omitted.
 */

public class P7_17 {
    public static void main(String[] args) throws IOException {
        //Create variables for each of the columns in the file.
        String sName = new String();
        String sCat = new String();
        double dAmount;
        String sDate = new String();

        try{
        //Prompt the user to enter a file name to read in the try clause.
        System.out.printf("Please enter a filename to read:");
        Scanner reader = new Scanner(System.in);
        String inFile = reader.next();
        File inputFile = new File(inFile);
        Scanner in = new Scanner(inputFile);


        //Create an array of strings of length 4 to store the values.  Read in each line in order and check that
        //there are four values and that the third value is an int.  If both are true then write to a new file or
        //append to a file with the name of the category.

            while(in.hasNextLine()){
                String[] inputLine = in.nextLine().split(";");
                //Check to see that the line has length 4 and the third input can be read as a double.  If that is not
                //the case, skip the line (but continue to parse the rest of the file.)
                if(inputLine.length != 4 || !(isDub(inputLine[2]))){
                    System.out.println("Line is improperly formatted.");
                }
                //Use fileWriter class to write the information to file.  The "true" when initializing makes it
                //check whether to create the file or append the file.  It took me a long time to figure that out.
                else{
                    String outputFile = inputLine[1]+ ".txt";
                    //System.out.println(outputFile);
                    FileWriter outWrite = new FileWriter(outputFile, true);
                    //System.out.println(inputLine[0] + ";" + inputLine[1] + ";" + inputLine[2] + ";" + inputLine[3]);
                    outWrite.write(inputLine[0] + ";" + inputLine[1] + ";" + inputLine[2] + ";" + inputLine[3]+ "\n");
                    outWrite.close();
                }
            }
            in.close();
        }
        catch (FileNotFoundException e ){
            System.out.println("*****Invalid File Name*****");
            System.out.println(e);
        }


    }
    //Simple method to determine whether a string is a double or not.
    public static boolean isDub( String input )
    {
        try{
            Double.parseDouble(input);
            return true;
        }
        catch( Exception e){
            return false;
        }
    }
}




