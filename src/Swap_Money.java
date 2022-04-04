import java.util.Scanner;

public class Swap_Money {
    public static void main(String[] args) {
        double vnd,usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào USD :");
        usd = sc.nextDouble();
        vnd = usd *23000;
        System.out.print(usd +" $" + " = " + vnd + " VND");
    }
}
