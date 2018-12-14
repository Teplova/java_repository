package triangle;

/**
 * Created by 123 on 03.07.2018.
 */
public class GetTriangle {
/*/      Task 1: Write me a function that receives three integer inputs for
    the lengths of the sides of a triangle and returns one of four values to determine
    the triangle type (1=scalene, 2=isosceles, 3=equilateral, 4=error)./*/

    public static int SCALENE = 1;
    public static int ISOSCELES = 2;
    public static int EQUILATERAL = 3;
    public static int ERROR = 4;

    public int getTriangleType(int side1, int side2, int side3) {

        if ((side1 < (side2 + side3))
                && (side2 < (side1 + side3))
                && (side3 < (side1 + side2))) {

            if ((side1 != side2) && (side1 != side3)
                    && (side2 != side3)) {
                return SCALENE;
            } else if ((side1 == side2 && side1 != side3)
                    || (side1 == side3 && side1 != side2)
                    || (side2 == side3 && side2 != side1)) {
                return ISOSCELES;
            } else {
                return EQUILATERAL;
            }
        } else {
            return ERROR;
        }

    }

    public static void main(String[] args) {
        GetTriangle triangle  = new GetTriangle();

    }


}
