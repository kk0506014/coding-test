package 브론즈3;

import java.util.Scanner;

public class Main1267 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int ySum = 0, mSum = 0;

        for(int i = 0; i < N; i++) {
            int num = sc.nextInt();
            ySum += ((num / 30) + 1) * 10;
            mSum += ((num / 60) + 1) * 15;
        }

        if(ySum < mSum)
            System.out.println("Y " + ySum);
        else if(ySum > mSum)
            System.out.println("M " + mSum);
        else
            System.out.println("Y M " + ySum);

        sc.close();
    }
}