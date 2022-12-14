package day_50_CollectionCont;

import java.util.Arrays;
import java.util.Stack;

public class StackStudy {
    public static void main(String[] args) {
        //LIFO
        //push()-peek()-pop()...
        Stack<Integer> stc = new Stack<>();
        stc.addAll(Arrays.asList(2,4,6,7,8));
        System.out.println("stc = " + stc);

        //push()
        stc.push(1);
        System.out.println("stc = " + stc); //LİFO--> [2, 4, 6, 7, 8, 1]
        stc.push(11);
        System.out.println("stc = " + stc);   //[2, 4, 6, 7, 8, 1, 11]

        //pop()
        System.out.println("stc.pop() = " + stc.pop()); //pop metotu remove yapar değeri döndürür
        //remove yaptığı değeri döndürür
        System.out.println("stc = " + stc);   // [2, 4, 6, 7, 8, 1]

        //peek()
        System.out.println("stc.peek() = " + stc.peek()); //stc.peek() = 1

        System.out.println("stc = " + stc); //[2, 4, 6, 7, 8, 1]

        //search()
        System.out.println("stc.search(8) = " + stc.search(8)); //2.sırada
        System.out.println("stc.search(11) = " + stc.search(11)); //-1
        System.out.println("stc.search(6) = " + stc.search(6)); // 4 sırada
        System.out.println("stc.search(2) = " + stc.search(2)); // 6.sırada









    }
}
