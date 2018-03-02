/**
 * Created by 123 on 01.03.2018.
 */
public class Point {
    public static void main (String args[]){

        Coordinat point1 = new Coordinat();
        point1.x = 3.0;
        point1.y =4.0;
        Coordinat point2 = new Coordinat();
        point2.x = 8.0;
        point2.y =8.0;
        System.out.printf("Расстояние между двумя точками = "+ distance(point1, point2));



    }

    public static double distance(Coordinat point1, Coordinat point2){
        return (Math.sqrt((point2.x-point1.x)+(point2.y - point1.y)));

    }



}

