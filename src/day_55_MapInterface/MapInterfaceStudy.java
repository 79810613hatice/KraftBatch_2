package day_55_MapInterface;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceStudy {
    public static void main(String[] args) {
        Map<String, Integer> ageMap = new HashMap<>();

        //Map<K,V>
        //put()
        ageMap.put("Mehmet", 25);
        ageMap.put("Ahmet", 24);
        ageMap.put("Ayşe", 22);

        //size()
        System.out.println("ageMap.size() = " + ageMap.size());  //ageMap.size() = 3

        //get()
        System.out.println("ageMap.get(Mehmet) = " + ageMap.get("Mehmet")); //ageMap.get(Mehmet) = 25
        int integer = ageMap.get("Mehmet"); //unboxed
        int ageOfMehmet = ageMap.get("Mehmet"); //unboxed

        //containsKey()
        System.out.println("ageMap.containsKey(Mehmet) = " + ageMap.containsKey("Mehmet"));  //true

        //remove()
        System.out.println("ageMap.remove(Mehmet) = " + ageMap.remove("Mehmet"));
        System.out.println(ageMap);  //{Ahmet=24, Ayşe=22}

        //putAll()
        Map<String, Integer> ageMap2 = new HashMap<>();
        ageMap2.put("Metin", null);
        ageMap2.put("Osman", 37);
        ageMap2.put("Hakan", 24);
        ageMap2.put("Ahmet", 22);
        System.out.println("ageMap2 = " + ageMap2);

        ageMap.putAll(ageMap2);
        System.out.println(ageMap); //{Ahmet=22, Ayşe=22, Osman=37, Hakan=24, Metin=null}

        //clear()
        ageMap2.clear();
        System.out.println("ageMap2 = " + ageMap2);  //ageMap2 = {}
        System.out.println("ageMap = " + ageMap);  //ageMap = {Ahmet=22, Ayşe=22, Osman=37, Hakan=24, Metin=null}

        //putIfAbsent()
        // {Ahmet=22, Ayşe=22, Osman=37, Hakan=24, Metin=null}
        System.out.println("ageMap.putIfAbsent(Osman, 38) = " + ageMap.putIfAbsent("Osman", 38));  // 37
        System.out.println("ageMap.putIfAbsent(Osman, 37) = " + ageMap.putIfAbsent("Osman", 37));  // 37
        System.out.println("ageMap.putIfAbsent(Metin, 23) = " + ageMap.putIfAbsent("Metin", 23)); //(Metin, 23) = null

        // getOrDefault()
        System.out.println("ageMap.getOrDefault(Ayşe, 22) = " + ageMap.getOrDefault("Ayşe", 22)); //(Ayşe, 22) = 22
        System.out.println("ageMap = " + ageMap);
        if(ageMap.getOrDefault("Ayşe", 22)==22){
            System.out.println("Ayşe's age " + ageMap.getOrDefault("Ayşe", 22));
        }

        //replace()
        System.out.println("ageMap.replace(Ayşe, 24) = " + ageMap.replace("Ayşe", 24)); //Ayşe=24
        System.out.println("ageMap = " + ageMap); // ageMap = {Ahmet=22, Ayşe=24, Osman=37, Hakan=24, Metin=23}
        System.out.println("ageMap.replace(Ayşe, 24,25) = " + ageMap.replace("Ayşe", 23, 25));
        System.out.println("ageMap.replace(Ayşe, 24,25) = " + ageMap.replace("Ayşe", 24, 25));

        System.out.println("ageMap = " + ageMap);  //{Ahmet=22, Ayşe=25, Osman=37, Hakan=24, Metin=23}




    }
}
