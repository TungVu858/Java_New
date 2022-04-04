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
                case 1:
                    for (int i=0;i<3;i++){
                            System.out.println("# # # # # # #");
                        }
                    break;
                case 2:
                    for (int i =1;i<=5;i++){
                        for (int j =1;j<=i;j++){
                            System.out.printf("# ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    for (int i =1;i<=5;i++){
                        for (int j =1;j<=i;j++){
                            System.out.printf("# ");
                        }
                        System.out.print("\n");
                    }
                    for (int i =5;i>=1;i--){
                        for (int j = 1;j<=i;j++){
                            System.out.printf("# ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 4:
                    System.exit(0);
                    }
            }
        }
    }

