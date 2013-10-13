import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created with IntelliJ IDEA.
 * User: E
 * Date: 10/10/13
 * Time: 9:53 AM
 * To change this template use File | Settings | File Templates.
 Main calls a method that creates a random list of size n and then sorts it.  It calls that method twice.  It then
 passes those two lists to a method that sorts it and returns the output listarray.  It prints all that.
 */
public class P6_28 {

    public static void main(String[] args) {

        //Create two lists.
        ArrayList<Integer> list1s = create_list(15);
        ArrayList<Integer> list2s = create_list(20);

        //Sort lists using method mergeSorted

        ArrayList<Integer> sortedLists = mergeSorted(list1s, list2s);

        //Print list1, list2 and the sorted list.

        System.out.print("List1: ");

        for (int i = 0; i < list1s.size() ; i++) {
            System.out.print(list1s.get(i) +" ");
            }

        System.out.println();
        System.out.print("List2: ");

        for (int i = 0; i < list2s.size(); i++) {
            System.out.print(list2s.get(i) + " ");
            }

        System.out.println();
        System.out.print("Merged List: ");

        for (int i = 0; i < sortedLists.size(); i++) {
            System.out.print(sortedLists.get(i)+ " ");
            }
    }

    public static ArrayList<Integer> create_list(int list_length){

        ArrayList<Integer> lists = new ArrayList<Integer>();

        //Generate a list of list_length of random numbers.
        for (int i = 0; i < list_length ; i++) {
            int rand = (int) (Math.random()*25);
            lists.add(rand);
        }

        Collections.sort(lists);

        return lists;
    }

    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> mergeArrays = new ArrayList<Integer>();
        int counterA = 0;
        int counterB = 0;
        int counterMerge = 0;
        //While the total of the a counter and b counter are less than the sum of the size of the two arrayLists.
        while (counterMerge < (a.size() + b.size())){
            //Check if the final value has been used, and if so go with the other one.
            //System.out.println(counterA + " " + counterB + " " + counterMerge);
            if (counterA == a.size()){
                mergeArrays.add(counterMerge, b.get(counterB));
                counterB +=1;
                counterMerge +=1;
            }
            else if (counterB == b.size()){
                mergeArrays.add(counterMerge, a.get(counterA));
                counterA += 1;
                counterMerge += 1;
            }
            //Then implement the intuitive way of merging, compare the two and add the minimum one, then bump the
            //counter += 1.
            else{
                int aVal = a.get(counterA);
                int bVal = b.get(counterB);
                //System.out.println("****" + aVal + " " + bVal);
                if (aVal < bVal){
                    mergeArrays.add(counterMerge, aVal);
                    counterA += 1;
                    counterMerge += 1;
                }
                else{
                    mergeArrays.add(counterMerge, bVal);
                    counterB += 1;
                    counterMerge += 1;
                    }
            }
        }
        return mergeArrays;
    }
}
