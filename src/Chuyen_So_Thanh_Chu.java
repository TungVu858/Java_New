import java.util.Scanner;

public class Chuyen_So_Thanh_Chu {
    public static void main(String[] args) {
        String [] strnum = {"Không","Một","Hai","Ba","Bốn","Năm","Sáu","Bảy","Tám","Chín"};
        Integer [] num = {1,2,3,4,5,6,7,8,9};
        System.out.println("Nhập số : ");
        Scanner sc = new Scanner(System.in);
        boolean check = false;
        int a = sc.nextInt();
       for (int i =0;i<strnum.length;i++){
           if (num[i] == a){
               strnum.equals(a);
           }
       }
    }
}
