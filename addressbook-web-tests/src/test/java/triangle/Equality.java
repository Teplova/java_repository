package triangle;

/**
 * Created by 123 on 04.12.2018.
 */
public class Equality {

    public static void main (String[]args){
        String s1 = "firefox";
        String s2 = new String(s1);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}
