package expressions;

public class arithmetic {
    public static void main (String[] args) {
        int result = 10 + 3;
        System.out.println(result);

        int subt = 10 - 3;
        System.out.println(subt);

        int mult = 10 + 3;
        System.out.println(mult);

        int div = 10 / 3;   //division of two whole numbers is a whole number
        System.out.println(div);
        double divi = (double) 10 / (double) 3;
        System.out.println(divi);
        System.out.println(" ");

//        increment and decrement operators
        int x = 1;
        int y = x++;   //used on the right side of an assignment operator. value of is first copied to y and then x is incremented by 1
        System.out.println(y);
        int z = ++x;      // x is incremented by 1 and then the value of x is copied to y
        System.out.println(x);

//        Order of operations  -- BODMAS
        int res = 10 + 3 * 2;
        System.out.println(res);
        res = (10 + 3 ) * 2;  //alter order priority using parenthesis
        System.out.println(res);

//        Type Casting and Conversion
//        Implicit Casting - automatic conversion to a bigger data type. Happens when there's no chance for data loss.
//        byte > short > int > long > float > double
        short a = 1;
        //an anonymous variable is allocated somewhere in memory - an int. value of a is copied into that space and add the 2 numbers
        int  b = x + 2;
        System.out.println(b);

        // floats
        // an integer is less precise than double(with decimal points).So
        double c = 1.1;
        double d = c + 2;  //int is automatically is cast into a double
        System.out.println(d);

//        Explicit Casting
        double e = 1.1;
        int f = (int)e + 2;  // we want to return an int - use explicit casting [convert (e) into int].
        System.out.println(f);

        // Explicit casting only happens b/n compatible types directly. Use wrapper classes
        String g = "1";
        String i = "1.1";
        Integer.parseInt(g); //wrapper class(reference type) for int - takes a string and returns an integer
//        Short.parseShort(g);
//        Float.parseFloat(g);

        int h = Integer.parseInt(g) + 2;
        double j = Double.parseDouble(i) + 2;  // store results in double

//        this is done because input is always received as String
    }
}
