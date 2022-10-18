package day_51_ListAndSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExampleInterview {

    public static void main(String[] args) {

        Integer[] arr={0,2,0,4,5};
        List<Integer> list=new ArrayList<>(Arrays.asList(arr));
        System.out.println(moveAllZeroAddEnd(list));
        // interview question
        // list içerisindeki tüm sıfırları listin sonuna yazan metodu yazınız
        // giriş: 0,2,3,5,0,4,5   çıkış: 2,3,5,4,5,0,0

    }
    public static List<Integer> moveAllZeroAddEnd(List<Integer> list){
        int orginalSize=list.size();
        list.removeAll(Arrays.asList(0));
        int newSize=list.size();

        for (int i = 0; i < (orginalSize-newSize); i++) {
            list.add(0);
        }
        return list;
    }

    // interview question
    // list içerisinde Mehmet olan tüm isimleri silin (it)





}
