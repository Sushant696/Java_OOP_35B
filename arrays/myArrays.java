import java.util.Arrays;

public class myArrays {

   public static int ArrayFinder(String[] array, String find) {

      for (int i = 0; i < array.length; i++) {
         if (array[i] == find) {
            return i;

         }

      }
      return -1;
   }

   public static void main(String[] args) {

      // array declaration

      // int[] myFirstArray;

      // memory allocation
      // myFirstArray = new int[5];

      // array declaration and memory allocation
      // int[] mySecondArray = new int[3];
      // mySecondArray[0] = 353;

      // array declaration memory allocation and initilization
      // int[] mythirdArray = { 102, 20, 30, 40 };
      // System.out.println(mythirdArray[0]);

      // Task 1

      // System.out.println(arrays[3]);
      // int[] myArray = new int[10];

      // int[] mySecondArray = { 1, 2, 3 };
      // mySecondArray[0] = 353;
      // mySecondArray[1] = 35;
      // mySecondArray[2] = 15;

      // mySecondArray[3] = 323;
      // System.out.println(
      // Arrays.toString(mySecondArray));

      // adding new element to an array
      // for (int i = 0; i < 4; i++) {
      // if (i == 2) {
      // mySecondArray[i] = 291;
      // }
      // }

      // task 2
      String[] arrays = { "Cat", "Dog", "Tiger", "Snake" };

      // int count = 0;
      // while (count < arrays.length) {
      // System.out.println(arrays[count]);
      // count++;
      // }

      // task 3
      String[] newArr = { "Jhon", "Doe", "Foo", "Bar" };
      String foo = "Foo";
      int count = 0;

      while (count < newArr.length) {
         if (newArr[count] == foo) {
            System.out.println(count);
         }
         count++;
      }

      // Make the function for the above name arrayFinder
      // Takes array of string and string as paramenter
      // return index if 2nd argument values matches any elemnt fo array
      // else return -1
      // print the returned index value

      int index = ArrayFinder(newArr, "Jhon");
      System.out.println(index);
   }

   public static int size() {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'size'");
   }
}