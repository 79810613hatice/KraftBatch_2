package day_19;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {

         // Scanner scan = new Scanner(System.in);
        // String s = scan.nextLine();
        //  System.out.println("counterOfChar(s) = " + counturOfChar(s));
       // System.out.println("nameSurname(s) = " + nameSurname(s));
       // System.out.println("nameSurname = " +nameSurname());
        //System.out.println("ad soyad = " + adsoyad());
       // withoutFirst("alparslan", "öztürak");
      //  System.out.println( nickNameGen("talip", "tıraş"));
        //charInTheColum();
        //System.out.println(lastIndex());

    }

    public static int counturOfChar(String str) {
        return str.length();
    }
    public static int nameSurname(){
       Scanner scan=new Scanner(System.in);
       String s1=scan.nextLine();
       String s2=scan.nextLine();
        return s1.length() + s2.length();
    }
    public static String adsoyad(){
        Scanner scan=new Scanner(System.in);
        String s1=scan.nextLine();
        String s2=scan.nextLine();
        return s1.toUpperCase().concat(s2.toUpperCase());
    }

   // public static String word(){
        Scanner scan=new Scanner(System.in);
        String s1=scan.nextLine();
        String s2=scan.nextLine();

      //  return s1.charAt(s1.);
  //  }

    public static void  withoutFirst(String str, String str2){
        String empty = "";
        char birincininİlkHarfi = str.charAt(0);
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i)!=birincininİlkHarfi){
                empty+=str2.charAt(i);
            }
        }
        System.out.println(empty);
    }
    public static String nickNameGen(String name, String surname){
       String nickName = name.substring(0,3).concat(surname.substring(surname.length()-3));
        return name;
    }

    public static char lastIndex(){
        Scanner scan=new Scanner(System.in);
        String s1=scan.nextLine();
        return s1.charAt(s1.length () - 1);
    }
    public static void charInTheColum(){
        Scanner scan=new Scanner(System.in);
        String s1=scan.nextLine();
        for (int i = 0; i < s1.length(); i++) {
            System.out.println(s1.charAt(i));
        }
    }
    public static String ucHarf(String str){
        Scanner scan=new Scanner(System.in);
        System.out.println("kelime girin : ");
        String holder="";
        String str1 = scan.nextLine();
        for (int i = 0; i <3; i++) {

        }
        return holder;





    }


}



