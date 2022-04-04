import java.util.Scanner;

public class DienTich {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a, b;
        System.out.println("nhập a : ");
        a = scanner.nextFloat();
        System.out.println("nhập b : ");
        b = scanner.nextFloat();
        System.out.println("diện tích : " + a * b);
    }
}
