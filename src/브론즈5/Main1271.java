package 브론즈5;

import java.util.Scanner;
import java.math.BigInteger;

public class Main1271 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        String m = sc.next();

        BigInteger n1 = new BigInteger(n);
        BigInteger m1 = new BigInteger(m);

        System.out.println(n1.divide(m1));
        System.out.println(n1.remainder(m1));
    }
}