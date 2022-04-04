import java.util.Scanner;

public class KiemTra_Nam_Nhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập năm :");
        boolean check = false;
        int a = sc.nextInt();
        if (a % 4 == 0) {
            if (a % 100 == 0) {
                if (a % 400 == 0) {
                    check = true;
                }
            } else {
                check =true;
            }
        }
        if (check){
            System.out.println(a + " là năm nhuận");
        }else {
            System.out.println(a + " không là năm nhuận");
        }
    }
}
