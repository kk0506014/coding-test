package 브론즈2;

import java.util.Scanner;

public class Main1100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;

        for (int i = 0; i < 8; i++) {
            String line = sc.next();
            for (int j = 0; j < 8; j++) {
                switch (i % 2) {
                    case 0:
                        if (j % 2 == 0 && line.charAt(j) == 'F')
                            count++;
                        break;
                    case 1:
                        if (j % 2 == 1 && line.charAt(j) == 'F')
                            count++;
                        break;
                    default:
                        break;
                }
            }
        }

        System.out.println(count);

        sc.close();
    }
}