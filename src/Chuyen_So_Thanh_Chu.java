import java.util.Scanner;

public class Chuyen_So_Thanh_Chu {
    public static void main(String[] args) {
        String[] strnum = {"Không", "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín"};
        System.out.println("Nhập số : ");
        Scanner sc = new Scanner(System.in);
        String str = null;
        int a = sc.nextInt();
            if (a < 10) {
                System.out.println(strnum[a]);
            } else if (10 <= a && a < 20) {
                if (a == 10) {
                    System.out.println("Mười");
                } else {
                    System.out.println("Mười " + strnum[a % 10]);
                }
            } else if (20 <= a && a < 100) {
                if (a % 10 == 0) {
                    System.out.println(strnum[a / 10] + " Mươi");
                } else {
                    System.out.println(strnum[a / 10] + " Mươi " + strnum[a % 10]);
                }
            } else {
                System.out.println(str);
            }
        }
}
