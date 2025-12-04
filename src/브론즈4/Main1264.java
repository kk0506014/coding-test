package 브론즈4;

import java.util.Scanner;

public class Main1264 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            String str = sc.nextLine();
            int count = 0;

            if(str.equals("#")) {
                break;
            }

            for(int i=0; i<str.length(); i++) {
                // 밑의 if문에 대문자까지 추가하면 너무 길어질 것 같아서,
                // 문자 자체를 소문자로 변환한 뒤 비교.
                char ch = Character.toLowerCase(str.charAt(i));

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    count++;
                }
            }

            System.out.println(count);
        }

        sc.close();
    }
}