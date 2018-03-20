

/**
 * Created by 123 on 01.03.2018.
 */
public class Point {
    public static void main (String args[]){

        Coordinat a = new Coordinat(3.0,3.0, 2.0, 2.0 );



        System.out.println("Расстояние между двумя точками = "+ a.dis() );

        Square s = new Square(5);

        System.out.println("Площадь квадрата со стороной " +s.l +"= "+s.area());
    }
   //public static double distance(Coordinat a, Coordinat b){

     //   return (Math.sqrt((Math.pow((b.x - a.x),2))+(Math.pow((b.y-a.y),2))));

    //}





}

