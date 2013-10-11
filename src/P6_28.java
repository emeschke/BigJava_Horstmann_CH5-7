import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created with IntelliJ IDEA.
 * User: E
 * Date: 10/10/13
 * Time: 9:53 AM
 * To change this template use File | Settings | File Templates.
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
            System.out.print(sortedLists);
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
        return mergeArrays;
    }
}
