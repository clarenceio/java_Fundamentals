package types;

public class PrimitiveTypes {
    public static void main (String[] args) {}
        int age = 30; // no need to use up 4 bytes of memory, so the appropriate type to use would be "byte"
        byte myAge = 30;

//        store number of views
        int viewsCount = 123_456_789;  // dealing with large numbers - use underscores to make it more readable

        // 3B is more than int could take. Even though "long" is used, Java compiler still recognizes the digits as integers. So add an l/L
        //as suffix to the number

        long viewCount = 3_123_456_789L;

//        decimal points
        double price = 10.99;
        float thePrice = 10.99F;   // rec as double ... same as above

//          characters
        char letter = 'A'; //use '' for single characters and "" for Strings

//      boolean
        boolean isEligible = false;

}
