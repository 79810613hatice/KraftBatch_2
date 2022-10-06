package Day_20;

public class StringMethodsCount {
    public static void main(String[] args) {

        // System.out.println(findFirstCharInSecound("talip", "tıraş"));
        //System.out.println(countY("javayı seviypor muyum"));
        //System.out.println(childrenMessage("çocukları seviyorum"));
        //lastThree("Alparslan");
       // System.out.println(ortadaki3("salih"));
        System.out.println(simulateNames("hatice", "mermertaş"));
    }

    public static int findFirstCharInSecound(String str, String str2) {
        return str2.indexOf(str.charAt(0));
    }

    public static int countY(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'y' || str.charAt(i) == 'Y') {
                count++;
            }
        }
        return count;

    }

    public static String childrenMessage(String str) {
        String str1 = "";

        if (str.contains("sev")) {
            System.out.println("sen harika bir insansın");
        } else {
            System.out.println("kötü bir insansın");
        }
        return str1;

    }

    public static void lastThree(String str) {
        String holder = " ";
        for (int i = 0; i < 3; i++) {
            holder += str.substring(str.length() - 3);
        }
        System.out.println(holder);
    }

    public static String ortadaki3(String str) {
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 2);

    }

    public static String simulateNames(String str1, String str2) {
        if (str1.length() > str2.length()) {
            return str1.substring(0, str2.length()).concat(str2);
        } else if (str2.length() > str1.length()) {
            return str1.concat(str2.substring(0, str1.length()));
        }else {
            return str1.concat(str2);
        }

    }



}
