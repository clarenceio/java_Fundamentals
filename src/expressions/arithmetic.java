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
    }
}
