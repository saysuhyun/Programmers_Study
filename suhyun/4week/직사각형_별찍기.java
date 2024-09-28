import java.util.Scanner;

public class 직사각형_별찍기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 가로 길이
        int m = sc.nextInt(); // 세로 길이

        // m번 반복하여 각 줄에 n개의 '*' 출력
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println(); // 줄 바꿈
        }

        sc.close(); // Scanner 닫기
    }
}
