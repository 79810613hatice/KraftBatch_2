package Day_28_Array_Lab_Cont_2;

public class Array_Example_3 {
    public static void main(String[] args) {

        // Örnek: "Dün akşam eve giderken onları görmüştüm." Cülesindeki "ü" harfinin önünde ve arkasında olan
        // harflerden bir string oluşturan metod yazınzı.
        String str="Dün akşam eve giderken onları görmüştüm";
        System.out.println(yeniKelimeUret(str));
    }
    public static String yeniKelimeUret(String str){
        String result = "";
        if(str.substring(0,1).equals("ü")) result+=str.substring(1,2);
        for(int i=1; i<str.length(); i++){
            if(str.substring(i,i+1).equals("ü")){
                result+=str.substring(i-1, i);
                result+=str.substring(i+1,i+2);
            }
        }
    if (str.substring(str.length()-1).equals("ü")) result +=str.substring((str.length()-2),str.length()-1);

    return result;
    }





}
