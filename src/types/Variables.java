package types;

public class Variables {
    public static void main (String[] args) {
//        use variables to store data temporarily in memory
        int age = 30;
        System.out.println(age);
        // the value can be changed
        age = 35;
//        age = "hello";  //however, it can't carry a value of a different data type
        System.out.println(age);

//        copy value of one variable into another
        int myAge = 20;
        int herAge = myAge;

//        constant variables - values can't be changed later
        final float PI = 3.14F;   //use; 1. "final" keyword to declare constants 2.all caps to name constants
//        PI = 4.1; //java: cannot assign a value to final variable PI
        System.out.println(PI);



    }
}
