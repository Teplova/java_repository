package libs;

/**
 * Created by 123 on 02.10.2018.
 * method add two arguments
 */
public class LibsClass {


    public static int sum(int slogaemoe1, int slogaemoe2) {
        int testResult = slogaemoe1 + slogaemoe2;
        System.out.println(testResult);
        return testResult;
    }

    public static int minus(int vichitaemoe1, int vichitaemoe2) {
        int resultMinus = vichitaemoe1 + vichitaemoe2;
        System.out.println(resultMinus);
        return resultMinus;
    }

    public static int multiply(int multipl1, int multipl2) {
        int resultmultiply = multipl1 + multipl2;
        System.out.println(resultmultiply);
        return resultmultiply;

    }

    public int sum(String slogaemoe1, int slogaemoe2) {
        try {
            int tempResult = Integer.parseInt(slogaemoe1) + slogaemoe2;
            System.out.println("Result = " + tempResult);
            return tempResult;
        } catch ( NumberFormatException e ) {
            System.out.println("Error Format" + e);
            return 789;

        } catch ( Exception e ) {
            System.out.println("Error " + e);
            return 788;
        }
    }

    //create method where to devide two arguments//
    public double div(double num1, double num2) {
        //     try {
        double tempDivResult = num1 / num2;
        System.out.println("Result = " + tempDivResult);

        return tempDivResult;
    }

    //create method  to devide  two int arguments//
    public int div(int num1, int num2) {
        try {
            double tempintDivResult = num1 / num2;
            System.out.println("Result = " + tempintDivResult);
            return (int) tempintDivResult;
        } catch ( NumberFormatException e ) {
            System.out.println("Error Format" + e);
            return 789;

        } catch ( Exception e ) {
            System.out.println("Error " + e);
            return 788;
        }
    }

    //int rez_4 = division (int, int);
    //double rez_4 = division (double, double);


    public void printArray(int[] array, int valueForComparing) {
        if (array.length > 0) {
            for (int index = 0; index < array.length; index++) {
                if (array[index] > valueForComparing) {
                    System.out.println("Element [" + index + "] " + array[index] + " greater " + valueForComparing);
                } else if (array[index] == valueForComparing) {
                    System.out.println("Element [" + index + "] " + array[index] + " is the same value as " + valueForComparing);
                } else if (array[index] < valueForComparing) {
                    System.out.println("Element [" + index + "] " + array[index] + " lower then " + valueForComparing);
                }else {
                    System.out.println(" 'this is never happen");
                }

            }
        } else {
            System.out.println("Error: empty array");
        }


    }

}



