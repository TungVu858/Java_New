import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều cao :");
        float height = sc.nextFloat();
        System.out.println("Nhập cân nặng :");
        float weight = sc.nextFloat();
        float bmi = weight / (height * height);
        System.out.printf("%-20s%s","bmi","Mức\n");
        if (bmi < 18.5) {
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        } else if (18.5 <= bmi && bmi < 25.0) {
            System.out.printf("%-20.2f%s", bmi, "Normal");
        } else if (25.0 <= bmi && bmi < 30.0) {
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        } else {
            System.out.printf("%-20.2f%s", bmi, " thuộc Obese");
        }
    }
}
