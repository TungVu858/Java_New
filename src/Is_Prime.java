import java.util.Scanner;

public class Is_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số ");
        int a = sc.nextInt();
        if (a < 2) {
            System.out.println(a + " không là số nguyên tố");
        } else {
            boolean check = true;
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check == true) {
                System.out.println(a + " là số nguyên tố ");
            } else {
                System.out.println(a + " không là số nguyên tố");
            }
        }
    }
}
