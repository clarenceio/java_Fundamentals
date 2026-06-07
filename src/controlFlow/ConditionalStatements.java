package controlFlow;

public class ConditionalStatements {
    public static void main (String[] args) {
//        If statements - make decisions based on certain conditions
        /*
        If temp is greater than 30
            It's a hot day
            Drink plenty of water
        Otherwise if it's between 20 and 30
            It's a nice day
        Otherwise
            It's cold
         */

        int temp = 12;
        if (temp > 30) {
            System.out.println("It's a hot day");
            System.out.println("Drink plenty of water");
        }
        else if (temp > 20) {
            System.out.println("It's a nice day");
        }                                                       //can do away with the {} if block has only one statement
        else {
            System.out.println("It's cold");
        }
    }

}
