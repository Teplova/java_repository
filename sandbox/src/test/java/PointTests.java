import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by 123 on 05.03.2018.
 */
public class PointTests {

    @Test
    public void testArea() {
        Coordinat p = new Coordinat(3.0, 2.0, 4.0, 2.0);

        Assert.assertEquals(p.dis(), 1.0);

    }


}
