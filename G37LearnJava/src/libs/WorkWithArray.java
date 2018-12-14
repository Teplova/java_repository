package libs;

/**
 * Created by 123 on 10.10.2018.
 */
//Создать новый класс по работе с массивами WorkWithArray.
//        - В этом классе создать метод который будет создавать матрицу и
// заполнять ее заданым значением. После заполнения возвращать ее.
//        - Также в этом классе создать метод fillingOfDiagonal -
// метод должен в переданной матрице заполниь диагональ указаным значением.
//        WorkWithArray.fillD (arrayArray, 1);
//        - во всех данных матрицеетодах обработать все возможные Исключительные ситуации


//    1. Please method 'arrayList' you should split to 3 - createMatrix, fillLeftD, FillRightD.
//            2. You should create new matrix in MainClass by using your own method createMatrix
//            3. After this give matrix to method fillLeftD

public class WorkWithArray {
    int [][] arrayArray;

    public void createMatrix() {
        int[][] arrayArray = new int[4][4];
//        = {{1, 34, 77}, {2,  55, 77}, {3, 56, 77}};

        for (int i = 0; i < arrayArray.length; i++) {
            for (int j = 0; j < arrayArray[i].length; j++) {
                System.out.print(arrayArray[i][j] + " ");
            }
            System.out.println(" ");
        }

    }

    //    Home work #5
    public void FillRightD() {
        arrayArray  = new int[4][4];
//        = {{1, 34, 77}, {2, 55, 77}, {3, 56, 77}};

        for (int i = 0; i < arrayArray.length; i++) {

            String space = "";

            int lastInd = arrayArray[i].length - 1;
            int ind = lastInd - i;
            for (int j = 0; j < lastInd - i; j++) {

                space += "---";
            }

            System.out.println(space + arrayArray[i][ind]);
        }
    }

    public void fillLeftD() {
        arrayArray = new int[4][4];
//        = {{1, 34, 77}, {2, 55, 77}, {3, 56, 77}};

        String space = "";

        for (
                int i = 0;
                i < arrayArray.length; i++) {
            int firstInd = arrayArray[i][i];

            System.out.println(space + firstInd);

            space += "---";

        }
    }

}

