package types;

import java.util.Date;    //import class from different package

public class ReferenceTypes {
    public static void main (String[] args) {
        Date now = new Date(); // "new" operator is used to allocate memory for the variable.

            // "now" is an instance of the Date class - object. Objects/classes have members that could accessed using the (.) operator
        now.getTime();

        System.out.println(now);

//        ReferenceTypes store a reference to an object somewhere in the memory
    }
}
