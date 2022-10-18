package day_54_CollectionCont;

import java.util.*;

public class SortedSetStudy {
    public static void main(String[] args) {
        SortedSet<Integer> intSortedSet=new TreeSet<>();
        //Ascending /artan sıralama sağlar
        //duplicate not allowed


//        Set<Integer> intSortedSet = new TreeSet<>();
//        NavigableSet<Integer> intSortedSet = new TreeSet<>();

        intSortedSet.add(2);
        intSortedSet.add(2);
        intSortedSet.add(10);
        intSortedSet.add(10);
        intSortedSet.add(10);
        System.out.println("intSortedSet = " + intSortedSet); //[2, 10]

        System.out.println("intSortedSet.first() = " + intSortedSet.first()); //intSortedSet.first() = 2
        System.out.println("intSortedSet.last() = " + intSortedSet.last()); //intSortedSet.last() = 10

        intSortedSet.addAll(Arrays.asList(25,35,45));
        System.out.println("intSortedSet = " + intSortedSet);  //[2, 10, 25, 35, 45]
//        System.out.println("intSortedSet.add(null) = " + intSortedSet.add(null)); null değer almaz

        //[2, 10, 25, 35, 45]
        //subSet
        System.out.println("intSortedSet.subSet(25,45) = " + intSortedSet.subSet(25, 45));//intSortedSet.subSet(25,45) = [25, 35]
        System.out.println("intSortedSet.subSet(25,46) = " + intSortedSet.subSet(25, 46));// [25, 35, 45]
        System.out.println("intSortedSet.subSet(26,46) = " + intSortedSet.subSet(26, 46));// [35, 45]
        System.out.println("intSortedSet.subSet(3,50) = " + intSortedSet.subSet(3, 50));// [10, 25, 35, 45]

        //headSet()
        System.out.println("intSortedSet.headSet(35) = " + intSortedSet.headSet(35)); //[2, 10, 25]
        System.out.println("intSortedSet.headSet(35) = " + intSortedSet.headSet(36)); //[2, 10, 25, 35]

        //tail.Set()
        System.out.println("intSortedSet.tailSet(35) = " + intSortedSet.tailSet(35));//[35, 45]
        System.out.println("intSortedSet.tailSet(35) = " + intSortedSet.tailSet(36));//[45]

        SortedSet<Integer> myTailSet = intSortedSet.tailSet(25);
        System.out.println("myTailSet = " + myTailSet);  //[25, 35, 45]
        //[25, 35, 45]
        System.out.println("myTailSet.remove(10) = " + myTailSet.remove(10));  //false
        System.out.println("myTailSet.remove(35) = " + myTailSet.remove(35));  //true
        System.out.println("myTailSet = " + myTailSet); //[25, 45]
        System.out.println("intSortedSet = " + intSortedSet); //[2, 10, 25, 45]




    }


}
