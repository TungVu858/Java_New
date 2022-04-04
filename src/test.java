import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        String[] students = {"Hoàng", "Đạt", "Phong", "Thuận", "Hùng", "Linh", "Học", "Sơn", "Hoa", "Hường"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        String inp = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(inp)) {
                System.out.println(inp + " có trong danh sách: " + " vị trí : " +  (i + 1));
                check = true;
                break;
            }
        }
        if (!check){
            System.out.println(inp + " không có trong danh sách");
        }
    }
}
