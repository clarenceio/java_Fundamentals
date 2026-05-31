package types;

import java.util.Arrays;

public class Array {
    public static void main (String[] args) {
    /*    int [] numbers = new int[5];   // use new - arrays are reference types. [5] - nnumber of elements in the arrays (size or length of the array)
        // accessing individual elements using index
        numbers[0] = 1;
        numbers[1] = 3;
//        numbers[10] = 4;   // exception is raised as index is out of scope for length of 5.
           //implementing a method multiple times - method overloading - float method on toString


//        System.out.println(numbers);  //returns a string calculated based on the address of object in memory. each object is in a different memory space
        System.out.println(Arrays.toString(numbers));  //use the Array class with the toString method, to see the actual elements of the array
*/
        // new method for initializing arrays with known elements

        int [] numbers = {2, 3, 5, 1, 4};
        System.out.println(numbers.length);  //fixed length
        System.out.println(Arrays.toString(numbers));
    }
}
