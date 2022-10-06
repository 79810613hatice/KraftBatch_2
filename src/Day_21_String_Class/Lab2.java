package Day_21_String_Class;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        // System.out.println(firstThree("merhaba ahmet "));
        //System.out.println(repeatThree("ali"));
        // System.out.println(harfSayisi("Ankara", "a"));
        // System.out.println(kelimeSayisi("ankanran", "An"));
        // System.out.println(harfTemizle("ankaran", "a"));
       // System.out.println(controlSentence("merhaba dünya", "mer"));

    }

    public static String firstThree(String str) {
        if (str.length() < 3) {
            return str;
        }
        return str.substring(0, 3);
    }

    public static String boslukKaldir(String str) {
        return "";

    }

    public static String repeatThree(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < 3; j++) {
                result = result + str.charAt(i);
            }
        }
        return result;
    }

    public static int harfSayisi(String str, String target) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equalsIgnoreCase(target)) {
                count++;
            }
        }
        return count;
    }

    public static int kelimeSayisi(String str1, String target) {
        int count = 0;                               //ankaraankara
        for (int i = 0; i < str1.length() - (target.length() - 1); i++) {
            if (str1.substring(i, i + target.length()).equalsIgnoreCase(target)) {
                count++;
            }

        }
        return count;
    }

    public static String harfTemizle(String kelime, String harf) {

        return kelime.replace(harf, "");
    }

    public static boolean controlSentence(String kelime, String control) {
        if (kelime.substring(0, control.length()).equalsIgnoreCase(control) ||
        kelime.substring(1, 1 + control.length()).equalsIgnoreCase(control)) {
            return true;
        }
        return false;
    }


}
