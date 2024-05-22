import java.util.*;

public class loopArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> mArrayList = new ArrayList<>(Arrays.asList(10, 20, 40, 52));

        int arrLen = mArrayList.size();

        for (int index = 0; index < arrLen; index++) {
            System.out.println("Index" + index + "values" + mArrayList.get(index));
        }

        // looping
        for (Integer current : mArrayList) {
            System.out.println(current);
        }
        for (var each : mArrayList) { // looping through a collection
            System.out.println(each);
        }
 
    }
}
