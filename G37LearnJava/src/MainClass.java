

import com.sun.xml.internal.messaging.saaj.util.TeeInputStream;
import currrency.Dollar;
import currrency.Euro;
import libs.WorkWithList;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by 123 on 02.10.2018.
 */
public class MainClass {
    public static void main(String ar[]) {
//        Logger logger = Logger.getLogger("MainClass.class");
//        logger.info(" Info text");
//        logger.debug(" Debug text");
//        logger.error(" Error text");
//        System.out.println("Hello");
//        String stringVar = " Test ", stringVar2 = "you";
//        System.out.println(stringVar2.length() + stringVar);

//        int rezultSum = sum(13, 15);
//        sum(12, rezultSum);
//
//        LibsClass res1 = new LibsClass();
//        res1.sum("55a5", 55);
//        System.out.println("--End--");
//
////      int[] array = {2, 4, 26, 7, 28, 10, 9, 20, 33};
//
//        int[] array2 = new int[9];
//        array2[0] = 2;
//        array2[1] = 4;
//        array2[2] = 26;
//        array2[3] = 7;
//        array2[4] = 28;
//        array2[5] = 10;
//        array2[6] = 9;
//        array2[7] = 20;
//        array2[8] = 33;
//        for (int i = 0; i < array2.length; i++) {
//            array2[i] = i;
//            System.out.println(array2[i] + ", ");
//        }
//
//
//        LibsClass divRes = new LibsClass();
//        divRes.div(45, 2);
//
//        LibsClass divDouble = new LibsClass();
//        divDouble.div(3, 5);
//
//        LibsClass libsClass = new LibsClass();
//        int[] array3 = new int[9];
//        array3[0] = 2;
//        array3[1] = 4;
//        array3[2] = 26;
//        array3[3] = 7;
//        array3[4] = 28;
//        array3[5] = 10;
//        array3[6] = 9;
//        array3[7] = 20;
//        array3[8] = 33;
//        libsClass.printArray(array3, 11);
//
//
//        int[][] arrayArray = {{1, 34, 77}, {2, 55, 77}, {3, 56, 77}};
//
//        for (int i = 0; i < arrayArray.length; i++) {
//            for (int j = 0; j < arrayArray[i].length; j++) {
//                System.out.print(arrayArray[i][j] + " ");
//            }
//            System.out.println("");
//        }
//

//        List ourList;
//        ourList = new ArrayList();
//        ourList.add("test");
//        ourList.add(8);
//        System.out.println(ourList);
//
//        System.out.println(ourList.get(1));
//
//        ArrayList<String> ourlist1 = new ArrayList<>();
//        ourlist1.add("test1");
//        System.out.println(ourlist1);
//
//        List<List<String>> ourListList = new ArrayList<>();
//        ourListList.add(new ArrayList<>());
//
//        ourListList.get(0).add("Test 01");
//        ourListList.get(0).add("Test 02");
//        ourListList.get(0).add("Test 03");
//        ourListList.get(0).add("Test 04");
//        ourListList.add(new ArrayList<>());
//        ourListList.get(1).add("Test 21");
//        ourListList.get(1).add("Test 22");
//        ourListList.get(1).add("Test 23");
//        ourListList.get(1).add("Test 24");
//        ourListList.add(new ArrayList<>(ourlist1));
//        ourListList.get(2).add("Test 31");
////        System.out.println(ourListList.get(0));
////        System.out.println(ourListList.get(1));
//        for (List<String> line : ourListList) {
//            System.out.println(line);
//
//            Map<String, String> ourMap = new HashMap<>();
//            ourMap.put("Password", "pass");
//            ourMap.put("Login", "log");
//            ourMap.put("key", "key");
//            System.out.println(ourMap);
//            System.out.println(ourMap.get("Password"));
//
//
//            List<Map<String, String>> ourListMap = new ArrayList<>();
//            ourListMap.add(ourMap);
//            System.out.println(ourListMap);
//            ourListMap.add(new HashMap<>(ourMap));
//            System.out.println(ourListMap);
//            ourListMap.add(new HashMap<>());
//            ourListMap.get(2).put("key1", "value1");
//            System.out.println(ourListMap);
//            for (Map map : ourListMap) {
//                System.out.println(map.size());
//                String test1 = new String("test");
//                String test2 = new String("test");
//              //difference between   "==" and  "equal"
//                if (test2 == (test1)) {
//
//                    System.out.println("var1");
//
//                } else {
//                    System.out.println("var2");
//                }
//            }


//        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//
//        for (int i = 0; i < a.length; i++) {
//
//            String space = "";
//
//            int lastInd = a[i].length - 1;
//            int ind = lastInd - i;
//            for (int j = 0; j < lastInd - i; j++) {
//
//                space += "---";
//            }
//
//            System.out.println(space + a[i][ind]);
//        }
//                WorkWithArray creatArray = new WorkWithArray();
//                creatArray.createMatrix();
//                creatArray.fillLeftD();
//                creatArray.FillRightD();

//        System.out.println(creatArray);


//        Dollar dollar= new Dollar(10);
//        System.out.println(dollar.getKursNBU());
//        dollar.setKursNBU(15);
//        System.out.println(dollar.getKursNBU());
//        dollar.convertGrnToCurrency(1000);
//        dollar.convertCurrancyrToGrn(1000);
//        dollar.setKursNBU(28);
//        dollar.convertCurrancyrToGrn(1000);
//        dollar.convertGrnToCurrency(1000);
//
//        Euro euro = new Euro(32);
//        euro.convertCurrancyrToGrn(1000);

        List<List<String>> ourList = new ArrayList<>();
        WorkWithList workWithList = new WorkWithList();
        workWithList.addNewList(ourList);
        workWithList.addValueToListList(0,"test0",ourList);
        workWithList.printListList(ourList);












//
//
//

        }

    }





