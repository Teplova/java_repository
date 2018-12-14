package libs;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 123 on 31.10.2018.
 * <p>
 * Создать класс WorkWithList с методами:
 * 1.  addNewList  - этот метод должен принять от нас ourList (который должен являться списком списков стринговых),
 * вставить в него пустой список стринговый. После чего вернуть измененный ourList.
 * <p>
 * 2.  addValueToListList – метод должен принять от нас: номер списка, стринговое значение и наш список списков ourList.
 * Вставить в ourList в список под указанным номером указанное значение. После чего вернуть ourList с вставленным значением.
 * <p>
 * 3.  printListList – метод, который должен прининять наш список списков ourList и вывести в консоль каждый список
 * списка в отдельной строке.
 * <p>
 * Учитывая указанный в задании код с основной программы и вывод в консоль, к которому он приводит то методы addNewList и addValueToListList должны возвращать списки методу printListList, который будет выводить эти списки в консоль.
 */
public class WorkWithList {


    public static void main(String ar[]) {

        List<List<String>> ourList1 = new ArrayList<>();
        WorkWithList workWithList = new WorkWithList();
        workWithList.addNewList(ourList1);
        workWithList.addValueToListList(0,"test0",ourList1);
        workWithList.addValueToListList(0,"test1",ourList1);
        workWithList.printListList(ourList1);
    }
/*
 addNewList  - этот метод должен принять от нас ourList (который должен являться списком списков стринговых),
 вставить в него пустой список стринговый. После чего вернуть измененный ourList.
 */
    public List<List<String>> addNewList(List<List<String>> ourList) {
        List<String> newList = new ArrayList<>();
        ourList.add(newList);
        System.out.println(newList);
        return ourList;
    }

/*  addValueToListList – метод должен принять от нас: номер списка, стринговое значение и наш список списков ourList.
 Вставить в ourList в список под указанным номером указанное значение. После чего вернуть ourList с вставленным значением.
 */

    public List<List<String>> addValueToListList(int i, String s, List<List<String>> ourList) {


        List<String> strList = ourList.get(i);

        if (strList == null) {
            System.out.println("List is null");
        } else {
            strList.add(s);
            System.out.println(strList);
        }
        return ourList;
    }

    /*
     printListList – метод, который должен прининять наш список списков ourList и вывести в консоль каждый список
 списка в отдельной строке
     */
    public void printListList(List<List<String>> ourList) {

        for (List<String> list : ourList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
        System.out.println();

    }


}