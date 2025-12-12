package 브론즈3;

import java.util.Scanner;

public class Main1284 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int N = sc.nextInt();
            int sum = 1;

            String str = String.valueOf(N);
            if(str.equals("0")) {
                break;
            }

            for(int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);

                if(c == '0') {
                    sum += 4;
                }
                else if(c == '1') {
                    sum += 2;
                }
                else {
                    sum += 3;
                }

                sum += 1;
            }

            System.out.println(sum);
        }

        sc.close();
    }
}