package Day_19;

public class StringMethods {
    public static void main(String[] args){

        String str = "Perşembe";
        System.out.println(str.length());
        int i = str.length();
        System.out.println(i);

        String str3 = "Perşembe ve Cuma guNLERi";
        System.out.println(str3.toUpperCase());
        System.out.println(str3.toLowerCase());
        System.out.println("str.charAt(7) = " + str.charAt(7));
        System.out.println("str3.charAt(str3.length()-1)= " + str3.charAt(str3.length()-1));


        String str4= "fgdsgfdjhbvhdıfhfjdıfjdbdjkfhdsfhofıjfokjdk";
        System.out.println("str4.length() = " + str4.length());
        System.out.println("str4.charAt(str4.length()-1) = " + str4.charAt(str4.length() - 1));
        System.out.println("str4.charAt(42)= " + str4.charAt(42));


        String str5 = "Selam Arkadaşlar ";
        String str6 = "Nasılsınız";
        System.out.println("str5.concat(str6) = " + str5.concat(str6));
        String concat = str5.concat(str6);
        System.out.println("concat = " + concat);


        String str8 = "    Selam Arkadaş  lar         ";
        System.out.println(str8.contains("r"));

        System.out.println(str8);
        System.out.println(str8.trim());
        System.out.println(str8.replace(" Selam ", "Merhaba "));

        System.out.println(str8.indexOf("Ark"));



    }


}
