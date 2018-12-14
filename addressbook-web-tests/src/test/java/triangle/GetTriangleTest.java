package triangle;
import junit.framework.TestCase;
import org.junit.Test;
import static triangle.GetTriangle.*;

/**
 * Created by 123 on 03.07.2018.
 */
public class GetTriangleTest extends TestCase {
    @Test
    public void testGetTriangleType() {
        GetTriangle triangle = new GetTriangle();

        //scalene
        assertEquals(SCALENE, triangle.getTriangleType(3, 5, 7));

        //isosceles
        assertEquals(ISOSCELES, triangle.getTriangleType(7, 4, 7));

        //equilateral
        assertEquals(EQUILATERAL, triangle.getTriangleType(7, 7, 7));

        //error
        assertEquals(ERROR, triangle.getTriangleType(11, 1, 5));

    }


}
