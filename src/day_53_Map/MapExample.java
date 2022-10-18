package day_53_Map;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
//        List<Integer> list=new ArrayList<>();
//    list.add(5);
//    list.add(8);


        Map<Integer, String> map=new LinkedHashMap<>();
        map.put(850,"Gonca");
        map.put(650,"Yavuz");
        map.put(750,"Pelin");
        map.put(450,"Arda");
        map.put(350,"Beyza");


//        System.out.println(map.get(850));
//        System.out.println(map.size());
//        System.out.println(map.toString());
//         map.remove(850);
//        System.out.println(map.containsKey(880));
//        System.out.println(map.containsValue("Pelin"));

//        map.put(850,"Gonca");
//        map.put(650,"Yavuz");
//        map.put(750,"Pelin");
//        map.put(450,"Arda");
//        map.put(350,"Beyza");
//        map.replace(850,"Ayşe");
//        System.out.println(map);
//        System.out.println(map.keySet());
//        System.out.println(map.values());



        Map<Integer, String> fenA=new LinkedHashMap<>();
        fenA.put(850,"Ayşe");
        fenA.put(650,"Yavuz");
        fenA.put(750,"Pelin");
        fenA.put(450,"Arda");
        fenA.put(350,"Beyza");


        Map<Integer, String> fenB=new LinkedHashMap<>();
        fenB.put(880,"Enes");
        fenB.put(670,"Beytullah");
        fenB.put(740,"Bahar");
        fenB.put(420,"Umut");
        fenB.put(310,"Zeynep");

        for(Integer num: map.keySet()){
            System.out.println(map.get(num));
        }
        List<Map<Integer, String>> okul=new ArrayList<>();
        okul.add(fenA);
        okul.add(fenB);
//        System.out.println(list.size());
//        System.out.println(list);
//        System.out.println(list.toString());

        System.out.println(fenB.get(310));
        System.out.println(okul.get(1).get(310));

//        for(Map<Integer, String> sinif:okul){
//            for(Integer key:sinif.keySet()){
//                System.out.println(sinif.get(key));
//            }
//        }

        for (int i = 0; i < okul.size(); i++) {
            for (Integer key: okul.get(i).keySet()) {
                System.out.println(okul.get(i).get(key));
            }


        }






    }

}
