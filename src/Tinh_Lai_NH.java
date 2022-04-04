import java.util.Scanner;

public class Tinh_Lai_NH {
    public static void main(String[] args) {
        double tien,laisuat;
        int thang;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền của bạn : ");
        tien = sc.nextDouble();
        System.out.println("Nhập tháng cho vay : ");
        thang = sc.nextInt();
        System.out.println("Nhập lãi suất : ");
        laisuat = sc.nextDouble();
        double tong = 0;
        for (int i =0;i<thang;i++){
            tong +=tien*thang*(laisuat/100)/12;
        }
        System.out.println(tong);
    }
}
