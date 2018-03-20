/**
 * Created by 123 on 01.03.2018.
 */
public class Coordinat {
    double x1, x2, y1, y2;
    double dis;




    public  Coordinat (double x1, double y1, double x2, double y2 ) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }


    public double dis () {

        return (Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2))));

    }
}