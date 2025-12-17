package 브론즈2;

import java.util.Scanner;

public class Main1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strArray = new String[3];
        int[] numArray = new int[3];

        for (int i = 0; i < 3; i++) {
            strArray[i] = sc.nextLine();
            switch (strArray[i]) {
                case "black":
                    numArray[i] = 0;
                    break;
                case "brown":
                    numArray[i] = 1;
                    break;
                case "red":
                    numArray[i] = 2;
                    break;
                case "orange":
                    numArray[i] = 3;
                    break;
                case "yellow":
                    numArray[i] = 4;
                    break;
                case "green":
                    numArray[i] = 5;
                    break;
                case "blue":
                    numArray[i] = 6;
                    break;
                case "violet":
                    numArray[i] = 7;
                    break;
                case "grey":
                    numArray[i] = 8;
                    break;
                case "white":
                    numArray[i] = 9;
                    break;
                default:
                    break;
            }
        }

        long result = (long) (((long) numArray[0] * 10 + numArray[1]) * (Math.pow(10, numArray[2])));

        System.out.println(result);

        sc.close();
    }
}