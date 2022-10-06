package day_35;

import java.util.Scanner;

public class GameActivityTest {
    public static void main(String[] args) {
//        kullanıcıdan kaç hedefle karşılaştığı ve kaçını vurduğunu sorun verdiği cevaba göre rank ini tespit edin

        Scanner sc = new Scanner(System.in);
        System.out.println("kaç hedefle karşılaştın");
        int düşman = sc.nextInt();
        System.out.println("kaç hedefle karşılaştın");
        int isabet = sc.nextInt();
        Challenge challenge = new Challenge(düşman, isabet);
        System.out.println(challenge.getScore());
        System.out.println(challenge.getRank());
    }
}
