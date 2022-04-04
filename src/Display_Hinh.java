import java.util.Scanner;

public class Display_Hinh {
    public static void main(String[] args) {
        int select = -1;
        Scanner sc = new Scanner(System.in);
        while (select!=0) {
            System.out.println("Menu");
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3.Print isosceles triangle");
            System.out.println("4.Exit");
            select = sc.nextInt();
            switch (select){

            }
        }
    }
}
