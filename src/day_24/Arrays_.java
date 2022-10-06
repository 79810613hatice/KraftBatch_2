package day_24;
import java.util.*;
public class Arrays_ {
    public static void main(String[] args) {

       int[] iArr={1,2,3,4,5,6,7};
       int[] iArr2={1,2,3,4,5};
        //System.out.println(checkLength(iArr));
        //System.out.println(find5(iArr));
       // System.out.println(compareFirstElements(iArr, iArr2));
       // System.out.println(sumArryElements(iArr2));
            //System.out.println(Arrays.toString(newArrWithFirstElements(iArr,iArr2)));
        System.out.println(Arrays.toString(concatArry(iArr,iArr2)));

    }
    public static boolean checkLength(int[] iArr){
        return iArr.length>5;
    }
    public static boolean find5(int[] arry){
        int param = 5;
        for (int i = 0; i < arry.length; i++) {
            if(arry[i] == param){
                return true;
            }
        }
    return false;
    }
    public static boolean compareFirstElements(int [] iarr1, int [] iarr2){
        return iarr1[0]==iarr2[0];
    }
    public static int[] newArrWithFirstElements(int [] ary1, int[] ary2){
        int[] newArr=new int[2];
        newArr[0]=ary1[0];
        newArr[1]=ary2[0];
        return newArr;
    }
    public static int sumArryElements(int[] sArr ){
        int sum=0;
        for (int i = 0; i < sArr.length ; i++) {
           sum+=sArr[i];
        }
        return sum;
    }
    public static int[] concatArry(int[] sarry, int[] sarry2){
        int[] newArry=new int[sarry.length+sarry2.length];
        for (int i = 0; i < newArry.length; i++) {
            if(i<sarry.length){
                newArry[i]=sarry[i];
            }else{
                newArry[i]=sarry2[i-sarry.length];
            }
        }
        return newArry;
    }


}
