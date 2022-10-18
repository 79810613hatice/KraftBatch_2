package day_51_ListAndSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListHomeWork_1 {

    public static void main(String[] args) {

//        String a="harun";
//        System.out.println(reversePalindrom(a));

//        ödev-2
//       interview questions List<String>
//       List içerisindeki palindrom kelimeleri list içerisinden silen metodu yazınız
//       ey, edip, adanada, pide, ye     ey edip pide ye

//        ödev-2
//        List içerisinde palindrom kelimeler varsa list içerisinden her iki kelimeyi silen metodu yazınız
//        ey edip adanada pide ye       boş

        List<String> list=new ArrayList<>(Arrays.asList("adanada", "ankarada", "efe", "metin"));
//        System.out.println(removePalindromList(list));
        System.out.println(removePalindromListIterable(list));

    }
    public static List<String> removePalindromList(List<String> list){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(reversePalindrom(list.get(i)))){
                list.remove(list.get(i));
            }
        }
        return list;
    }
    public static List<String> removePalindromListIterable(List<String> list){
        Iterator<String> iter= list.iterator();
        while (iter.hasNext()){
            String str=iter.next();
            if(str.equals(reversePalindrom(str))){
                iter.remove();
            }
        }
        return list;

    }
    public static String reversePalindrom(String str){
        String result="";
        for (int i = str.length()-1; i >=0 ; i--) {
            result+=str.charAt(i);
        }
        return result;
    }

}
