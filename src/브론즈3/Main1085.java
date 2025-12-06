package 브론즈3;

import java.util.Scanner;

public class Main1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int a = 0;
        int b = 0;

        if((x2 - x1) > x1) { a = x1; }
        else { a = (x2 - x1); }

        if((y2 - y1) > y1) { b = y1; }
        else { b = (y2 - y1); }

        if(a > b) { System.out.println(b); }
        else { System.out.println(a); }

        // Math.min를 사용한 리팩토링
        // Math.min(Math.min(x1, x2 - x1), Math.min(y1, y2 - y1))
    }
}