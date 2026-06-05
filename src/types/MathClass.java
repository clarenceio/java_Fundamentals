package types;

public class MathClass {
    public static void main (String[] args) {
//        round method
        int result = Math.round(1.1F); // round a floating point number to a whole number
        // takes a float and returns an in
        System.out.println(result);

        long res = Math.round(1.3);   // second option in round - takes a double and returns a long
        System.out.println(res);

//    ceil - returns the smallest integer that is greater than or equal to the given value. This method returns a double
        int newVal = (int)Math.ceil(2.3F); //explicit casting in action
        System.out.println(newVal);

    }
}
