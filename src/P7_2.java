import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 * Created with IntelliJ IDEA.
 * User: E
 * Date: 10/10/13
 * Time: 4:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class P7_2 {
    public static void main(String[] args) throws FileNotFoundException{
        //Prompt the user to enter a file name to read.
        System.out.printf("Please enter a filename to read:");
        Scanner reader = new Scanner(System.in);
        String inFile = reader.next();

        //Prompt the user to enter a destination file.
        System.out.print("\nPlese enter a destination file:");
        String outFile = reader.next();

        //Construct the Scanner and PrintWriter objects for reading and writing.
        File inputFile = new File(inFile);
        Scanner in = new Scanner(inputFile);
        PrintWriter out = new PrintWriter(outFile);

        //Read in each line and write it to the new file.
        String eachLine;
        int counter = 1;

        while(in.hasNext()){
            eachLine = in.nextLine();
            out.println("/* " + counter + " */" + eachLine);
            counter += 1;
        }

        //Exit both the reader and writer.
        in.close();
        out.close();


        in.close();
        out.close();
    }
}
