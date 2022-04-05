package Bai_Tap_Lap;

import java.util.Scanner;

public class In_20_SNT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố : ");
        int a = sc.nextInt();
        System.out.println(a + " số nguyên tố đầu tiên là : ");
        System.out.println(2);
        int check = 1;
        int n = 3;
            for (int i = 2; i <= a;) {
                for (int j = 2; j < n; j++) {
                    if (n % j == 0) {
                        check = 0;
                        break;
                    }
                }
                if (check != 0) {
                    System.out.println(n);
                    i++;
                }
                check = 1;
                n++;
            }
        }
}
