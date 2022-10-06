package Day_22_String_Class_Cont;

public class Lab_2_Cont {
    public static void main(String[] args) {

       // System.out.println(shortLongShort("mehmet", "ali"));
        //System.out.println(nokta("kil"));
       // System.out.println(twoLetterEnd("kafkas"));
        System.out.println(surname("hatice öztürk mermertaş"));
    }


    public static String shortLongShort(String str1, String str2) {
        String result = "";
        if (str1.length() <= str2.length()) {
            for (int i = 0; i < 2; i++) {
                result += str1 + str1;
                for (int j = 0; j < 30; j++) {
                    if (i > 0) {
                        return result;
                    }
                    result += str2;
                }

            }

        } else {
            for (int i = 0; i < 2; i++) {
                result += str2 + str2;
                for (int j = 0; j < 30; j++) {
                    if (i > 0) {
                        return result;
                    }
                    result+= str1;
                }
            }
        }
        return result;
    }

    public static String nokta(String str){
        if(str.length()>=5){
            return str.substring(0,5);
        }
        else{
            String result="";
            for (int i = 0; i <5-str.length() ; i++) {
                result+=".";
            }
            return str.concat(result);
        }

    }
    public static boolean twoLetterEnd(String str){
        String str1=str.toLowerCase();
        return str.substring(0,2).equals(str1.substring(str1.length()-2));
    }
    public static String surname(String str){
        String str1=str.trim();
        return str1.substring(str1.lastIndexOf(" ")+1);
    }








    /*public static String yinelenenHarfBul(String str){
       ? String str1=str.replace(" ", "");
        String result="";
        while (!str1.isEmpty()){
           if(str.)
            str=str.replace(str.substring(0,1), )
        }
        return result;
    }*/




}
