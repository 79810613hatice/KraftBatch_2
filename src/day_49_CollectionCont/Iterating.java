package day_49_CollectionCont;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Iterating {
    public static void main(String[] args) {
        Collection<Integer> cll = new ArrayList<>(Arrays.asList(3,5,7,10,20));
        System.out.println("cll = " + cll);

//        for(Integer each : cll){
//            System.out.println(each);
//            if(each>5){
//                cll.remove(each);
//            }
//        } we can not use remove or update item

        Iterator<Integer> myIter = cll.iterator();
/*
        //next
        System.out.println("next() = " + myIter.next());
//        System.out.println("next() = " + myIter.next());

        //remove()
        myIter.remove(); //[3, 7, 10, 20]  1. indexteki 3 ü attı
        myIter.remove();// hata verir. remove() den önce next() yapılmalı
        System.out.println("myIter.next() = " + myIter.next()); // next--> = 5
        myIter.remove();
        System.out.println("cll = " + cll);

 */
 //[3, 5, 7, 10, 20]
        System.out.println("myIter.hasNext() = " + myIter.hasNext());
//        System.out.println("myIter.next() = " + myIter.next());
//        System.out.println("myIter.next() = " + myIter.next());

        while (myIter.hasNext()){
            Integer next = myIter.next();
            System.out.println(next);  //[3, 5, 7, 10, 20]
            if(next>5){      //if(next%==2) ---->  cll = [3, 5, 7] olur
                myIter.remove();
            }
        }
        System.out.println("myIter = "+cll);
        System.out.println("cll = " + cll);   // cll = [3, 5]
        System.out.println("myIter.hasNext() = " + myIter.hasNext());  //false
        Iterator<Integer> iterator = cll.iterator();
        System.out.println("iterator.hasNext() = " + iterator.hasNext());
        System.out.println("iterator.next() = " + iterator.next());
        iterator.remove();
        System.out.println("cll = " + cll);


    }
}
