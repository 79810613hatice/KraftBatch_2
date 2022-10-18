package day_48_Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("ahmet");
        arrayList.add("mehmet");
        arrayList.add("Ayşe");
        arrayList.add("ahmet");

        System.out.println(arrayList.get(0));
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(3));
 //       System.out.println(arrayList.remove(3));
        System.out.println(arrayList.size());
//        arrayList.clear();
//        System.out.println(arrayList.size());
        arrayList.add(0,"hatice");
        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.remove(0));
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.size());

        ArrayList<String> arrayList2=new ArrayList<>();
        arrayList2.add("ahmet");
        arrayList2.add("mehmet");
        arrayList.removeAll(arrayList2);
        System.out.println(arrayList.size());
        System.out.println(arrayList.indexOf("ayşe"));

    }
}
