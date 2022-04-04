import java.util.Scanner;

public class Chuyen_So_Thanh_Chu {
    public static void main(String[] args) {
        String[] strnum = {"Không","Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín"};
        System.out.println("Nhập số : ");
        Scanner sc = new Scanner(System.in);
        String str = null;
        int a = sc.nextInt();
        if (a < 10) {
            for (int i = a; i <= strnum.length; i++) {
                str = strnum[i];
                break;
            }
            System.out.println(str);
        }
        else if (10<=a && a<100){
            if (a%10==0) {
                for (int i = a % 10; i <= strnum.length; i++) {
                    str = strnum[i] + "mươi";
                }
                System.out.println(str);
            }
        }
    }
}
