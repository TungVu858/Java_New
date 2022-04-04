import java.util.Scanner;

public class GiaiPTBac1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a : ");
        float a = scanner.nextFloat();
        System.out.println("Nhập b : ");
        float b = scanner.nextFloat();
        System.out.println("Nhập c : ");
        float c = scanner.nextFloat();
        if (a!=0){
            System.out.println("Phương trình có nghiệm : " + (c-b)/a);
        } else {
            if (b==c){
                System.out.println("Phương trình có vô số nghiệm");
            }
            else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
}
