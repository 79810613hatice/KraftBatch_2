package day_30;

import java.util.ArrayList;
import java.util.Random;

public class ArrayList_6 {
    public static void main(String[] args) {


        ArrayList<Integer> mylist = getList(20);
        System.out.println("mylist = " + mylist);
        System.out.println("random(20) = " + random(20));

        ArrayList<String> strinhNUms = new ArrayList<>();
 //       "10","100","101","1000"

        strinhNUms.add("10");
        strinhNUms.add("100");
        strinhNUms.add("101");
        strinhNUms.add("1000");

        System.out.println("toIntList(strinhNUms) = " + toIntList(strinhNUms));
        int i = toIntList(strinhNUms).get(0)+toIntList(strinhNUms).get(1);
        System.out.println(i= i);

        ArrayList<String> fruitInBasket = new ArrayList<>();
  //      fruitInBasket.add("elma");
        fruitInBasket.add("armut");
        fruitInBasket.add("kayısı");
        fruitInBasket.add("üzüm");
  //      fruitInBasket.add("erik");


        ArrayList<String> fruitInPlate = new ArrayList<>();
        fruitInPlate.add("armut");
        fruitInPlate.add("kayısı");
        fruitInPlate.add("üzüm");

 //       fruitInBasket.removeAll(fruitInPlate);

        System.out.println("fruitInBasket = " + fruitInBasket);


//        System.out.println("fruitInPlate(fruitInBasket) = " + fruitInPlate.equals(fruitInBasket));
//        System.out.println(fruitInPlate == fruitInBasket);

        ArrayList<Integer> listOfNums = new ArrayList<>();
        listOfNums.add(5);
        listOfNums.add(10);
        listOfNums.add(15);
        listOfNums.add(20);
        listOfNums.add(25);
        listOfNums.add(100);
        listOfNums.add(100);
        listOfNums.add(200);

        printListNumbers(listOfNums);
    }
    public static void printListNumbers(ArrayList<Integer> nums){
        for (Integer I : nums){
            System.out.println(I+" ");
        }
    }
    public static int sum(ArrayList<Integer> nums){
        int sum =0;
        for(Integer I : nums){
            sum+=I;
        }
        return sum;
    }
    public static ArrayList<Integer> getList(int i){
        ArrayList<Integer>list = new ArrayList<>();
        for (int j = 0; j <=i; j++) {
            list.add(j);
        }
        return list;
    }
    public static ArrayList<Integer> random(int param){
        Random rm = new Random();
        ArrayList<Integer> rmlist = new ArrayList<>();
        for (int i = 0; i < param ; i++) {
            rmlist.add(rm.nextInt(param)+1);

        }
        return rmlist;
    }

    public static ArrayList<Integer> toIntList(ArrayList<String> strList){
        ArrayList<Integer> intList = new ArrayList<>();
        for (String s : strList){
            intList.add(Integer.valueOf(s));
        }
        return intList;
    }


}
