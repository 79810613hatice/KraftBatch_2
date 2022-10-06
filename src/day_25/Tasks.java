package day_25;

import java.util.Arrays;

public class Tasks {
    public static void main(String[] args) {

        int[] iArr = {1, 2, 3, 4, 5, 6, 7};
        int[] iArr2 = {1, 2, 3, 4, 5,};
        int[] sayilar = {1000, 3348374, 1, 5};
        int[] sayilar2 = {10, 33, 48, 37, 1, 5};
        String str = "merhaba java insanları bugün nasılsınız";
        String str2 = "kayısı,armut, üzüm, çilek, nar";
        String str3 = "elma, armut, üzüm, çilek, nar";
        String str4 = "merhaba java insanları bugün nasılsınız";


        // System.out.println(Arrays.toString(stringToArray(str)));
        //System.out.println(Arrays.toString(stringToArray2(str2)));
        //System.out.println(Arrays.toString(stringToArray4(str4)));
        //System.out.println(aritmetik(sayilar2));
        System.out.println(Arrays.toString(fillWithSmallestElement(sayilar2)));

        // System.out.println(bigOne(iArr));
        //System.out.println(Arrays.toString(swapFirstAndlast(iArr)));
        // System.out.println(Arrays.toString(reverseArry(iArr)));
        //System.out.println(sumOfOddIdx(iArr));


    }

    public static int bigOne(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int[] swapFirstAndlast(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        return arr;

    }

    public static int[] reverseArry(int[] Ary) {
        int[] ints = new int[Ary.length];
        for (int i = 0; i < Ary.length; i++) {
            ints[i] = Ary[(Ary.length - 1) - i];
        }
        return ints;
    }

    public static int sumOfOddIdx(int[] arr) {
        int sum = 0;
        for (int i = 1; i < arr.length; i += 2) {
            sum += arr[i];
        }
        return sum;

    }

    public static String[] stringToArray(String str) {
        return str.split(" ");

    }

    public static String[] stringToArray2(String str) {
        String[] split = str.split(", ");
        for (int i = 0; i < split.length; i++) {
            if (split[i].length() < 5) {
                split[i] = "çilek";
            }
        }
        return split;
    }

    public static String[] stringToArray3(String str) {
        String[] split = str.split(", ");
        String temp = split[0];
        split[0] = split[split.length - 1];
        split[split.length - 1] = temp;
        return split;
    }

    public static String[] stringToArray4(String str) {
        String[] arr = str.split(" ");
        return arr[1].split("");
    }

    public static int aritmetik(int[] arr) {
        Arrays.sort(arr);
        return (arr[0] + arr[arr.length - 1]) / 2;
    }

    public static int[] fillWithSmallestElement(int[] aryy) {
        Arrays.sort(aryy);
        Arrays.fill(aryy, aryy[0]);
        return aryy;
    }

    public static int[] fillWithSmallestElement2(int[] aryy) {
        Arrays.sort(aryy);
        Arrays.fill(aryy, 0, aryy.length-1,10);
        return aryy;

    }
}
