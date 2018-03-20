import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.annotation.Target;

/**
 * Created by 123 on 02.03.2018.
 */
public class SquareTest {


    @Test
    public void testArea(){
        Square s = new Square(6 );
        Assert.assertEquals (s.area(), 36.0);

    }
}
