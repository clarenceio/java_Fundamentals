package types;

public class MathClass {
    public static void main (String[] args) {
//        round method
        int result = Math.round(1.1F); // round a floating point number to a whole number
        // takes a float and returns an in
        System.out.println(result);

        long res = Math.round(1.3);   // second option in round - takes a double and returns a long
        System.out.println(res);

//        ceil - returns the smallest integer that is greater than or equal to the given value. This method returns a double
        int newVal = (int)Math.ceil(2.3F); //explicit casting in action
        System.out.println(newVal);

//        floor method - returns the largest number that is smaller or equal to the given value
        int newValue = (int)Math.floor(2.3F); //explicit casting in action
        System.out.println(newValue); // returns 2

//        max and min
        int newMax = Math.max(45, 56);  // has implementation for int, long, float, double
        System.out.println(newMax);

        int newMin = Math.min(45, 56);  // has implementation for int, long, float, double
        System.out.println(newMin);

//        random method - generates a random variable b/n 0 and 1. returns a double
        double randomNum = Math.random();
        randomNum = Math.random() * 100;   // numbers b/n 0 and 100

            // get rid of the digits after the decimals
        randomNum = Math.round(Math.random() * 100);
        System.out.println(randomNum);
                //or
        int randomNumber = (int) Math.round(Math.random() * 100);  // change type to an int, however implicit casting cannot happen a there's a value represented in 8
        //bytes of memory to be stored in a variable with 4 bytes of memory, hence the use of explicit casting.
        // and the round method returns a long
        System.out.println(randomNumber);

        int zeroRes = (int) Math.random() * 100;
        System.out.println(zeroRes); // returns 0. casting the round method to an int losses the fraction = 0 * 100
        zeroRes = (int) (Math.random() * 100);
    }
}
