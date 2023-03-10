package edu.java.loop06;

public class Loopmain06 {

    public static void main(String[] args) {
        // while 반복문 > 변수 선언을 밖에서 하기 때문에 밖에 있는 변수를 사용할 때 사용가능
        int n = 1;
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println(
                "==============================================================================================================");

        n = 1;
        while (n <= 5) {// while (조건식) { 반복 시행될 명령어 }으로 진행
            System.out.println(n);
            n++;
        }
        System.out.println(
                "==============================================================================================================");

        // 10 ~ 1 까지 역순으로 출력
        n = 10;
        while (n >= 1) {
            System.out.print(n + "\t");
            n--;
        }

        System.out.println();
        System.out.println(
                "==============================================================================================================");

        n = 1;
        for (n = 10; n > 0; n--) {
            System.out.print(+n + " ");
        }
        System.out.println();
        System.out.println(
                "==============================================================================================================");
        n = 10;
        while (n > 0) {
            System.out.print(+n + " ");
            n--;
        }

        System.out.println();
        System.out.println(
                "==============================================================================================================");
        for (n = 10; (n >= 1); n--) {
            System.out.print(n + "\t");
        }

        System.out.println();
        System.out.println(
                "==============================================================================================================");
        // 10 이하의 양의 홀수들을 한 줄에 출력
        n = 1;
        while (n <= 10) {
            if (n % 2 == 1) {
                System.out.print(n + "\t");
            }

            n++;
        }

        System.out.println();
        System.out.println(
                "==============================================================================================================");
        n = 1;
        while (n < 10) {
            System.out.print(n + " ");
            n += 2;
        }

        System.out.println();
        System.out.println(
                "==============================================================================================================");
        for (n = 1; n < 10; n += 2) {
            System.out.print(n + " ");
        }

        System.out.println();
        System.out.println(
                "==============================================================================================================");

        for (int w33 = 1; w33 <= 10; w33++) {
            if (w33 % 2 == 1) {
                System.out.print(w33 + "\t");
            }
        }

    }

}
