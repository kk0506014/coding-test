package 브론즈3;

import java.util.Scanner;
import java.math.BigInteger;

public class Main1247 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;

        while(count < 3) {
            int N = sc.nextInt();
            BigInteger sum = BigInteger.ZERO;

            for (int i = 0; i < N; i++) {
                String str = sc.next();
                BigInteger num = new BigInteger(str);
                sum = sum.add(num);
            }

            int sign = sum.signum();

            if (sign == 0) {
                System.out.println(0);
            }
            else if (sign > 0) {
                System.out.println("+");
            }
            else {
                System.out.println("-");
            }

            count++;
        }

        sc.close();
    }
}