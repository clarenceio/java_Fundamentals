package types;

import java.awt.*;

public class PrimitiveVsReference {
    public static void main(String[] args) {
//        Primitive types
        byte x = 1;

//        these two variables are at different memory location hence, they are completely independent of each other;

        byte y = x;

        x = 2;

        System.out.println(y);   // changing the value of X doesn't affect the value of y = 1

//        Reference Types
        Point point1 = new Point(1,1);

/*         Memory is allocated to store the point object (Point1) eg. addr:100
             a separate part of the memory is allocated and the label (point1) would be attached to it.
             that memory location would store the address of the point object - 100

*/
        Point point2 = point1;  // the address or the reference to the point object in memory is being assigned

        // this creates dependence, therefore, change in value of point1 would take effect on point2

        point1.x = 2;
        System.out.println(point2);

    }
}
