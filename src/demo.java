import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
//        System.out.println("Tùng");
//    Bài 1:
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào a : ");
        a = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println(a + " là số chẵn ");
        } else {
            System.out.println(a + " là số lẻ ");
        }
//    Bài 2:
        int b;
        System.out.println("Nhập điểm : ");
        b = scanner.nextInt();
        if (b < 5 && b > 0) {
            System.out.println("Học lực yếu");
        } else if (5 <= b && b < 8) {
            System.out.println("Học lực trung bình");
        } else {
            System.out.println("Học lực giỏi");
        }
//    Bài 3:
        int c;
        System.out.println("Nhập c : ");
        c = scanner.nextInt();
        for (int i = 1; i <= c; i++) {
            System.out.println("Các số từ 1 đến " + c + " là : " + i);
        }
//     Bài 4:
        for (int i = 1; i <= a; i++) {
            if (i % 2 == 0) {
                System.out.println("Các số chẵn từ 1 đến " + a + " là : " + i);
            }
        }
//     Bài 5:
        int sum = 0;
        if (a > b) {
            for (int i = b; i <= a; i++) {
                sum += i;
            }
            System.out.println("Tổng từ " + b + " đến " + a + " là : " + sum);
        } else {
            for (int i = a; i <= b; i++) {
                sum += i;
            }
            System.out.println("Tổng từ " + a + " đến " + b + " là : " + sum);
        }
    }
}
