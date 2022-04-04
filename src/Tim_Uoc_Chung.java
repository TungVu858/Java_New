import java.util.Scanner;

public class Tim_Uoc_Chung {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a :");
        a = sc.nextInt();
        System.out.println("Nhập b :");
        b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("Không có ước chung");
        } else {
            if (a > b) {
                a = a - b;
                System.out.println("Ước chung lớn nhất là : " + a);
            } else {
                b = b - a;
                System.out.println("Ước chung lớn nhất là : " + b);
            }

        }

    }
}
