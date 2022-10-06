package day_29;

public class WrapperClass_task_2 {
    public static void main(String[] args) {

        String str = "164654'&+^/%+&+&/+M)(/(/(&e(()=()r%&/&%h/((/a%+^^^^^^^^^^b&%&/%a&/54j656^^^^â%&+v^'a469";

        String empty = "";
        for (int i = 0; i < str.length() ; i++) {
            if(Character.isLetter(str.charAt(i)) || str.charAt(i)==' '){
                empty+=str.charAt(i);
            }
        }
        System.out.println("empty = " + empty);
    }
}
