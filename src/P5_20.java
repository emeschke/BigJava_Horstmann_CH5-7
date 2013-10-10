/**
 * Created with IntelliJ IDEA.
 * User: E
 * Date: 10/9/13
 * Time: 10:56 AM
 * To change this template use File | Settings | File Templates.
 *
 * Leap years.  Write a method
 *       public static boolean isLeapYear(int Year)
 * that tests whether a year is a leap year; that is, a year with 366 days.  In this exercise, use multiple if
 * statements and return statements to return the result as soon as you know it.
 *
 */
public class P5_20 {
    public static void main(String[] args) {
        //Call isLeapYear on a number of years to test method.
        for (int i = 1900; i < 2025; i=i+2) {
            System.out.println(i + " " + isLeapYear(i));

        }
    }

    public static boolean isLeapYear(int intYear){
        //If not divisible by four, return False
        if (intYear%4 != 0){
            return false;
        }

        //Else If divisible by four and not by 100, return True.  Captures all leap years not on the century
        else if (intYear % 4 == 0 && intYear % 100 != 0){
            return true;
        }

        //Else If divisible by 400, return True.  Checks leap year on the century for being divisible by 400 also.
        else if (intYear % 400 == 0){
            return true;
        }

        //Else return false.  This condition covers all the century years that are not divisible by 400 because
        //everything else has return now.
        else{
            return false;
        }
    }
}
