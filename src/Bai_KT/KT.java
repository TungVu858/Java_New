package Bai_KT;

import java.util.Scanner;

public class KT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử của mảng : ");
            int num = sc.nextInt();
            arr[i] = num;
        }
//     Tính tổng phần tử trong mảng
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Tổng : " + sum);
//     Nhập vào a tìm vị trí a trong mảng :
        System.out.println("Nhập a : ");
        int a = sc.nextInt();
        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                check = true;
                System.out.println(a + " có trong mảng, vị trí là : " + i);
            }
        }
        if (check == false) {
            System.out.println(a + " không có trong mảng ");
        }
//     Nhập a ,xóa a khỏi mảng:
        for (int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length -1; i++) {
            if (arr[i] == a) {
                arr[i] = arr[i+1];
            }
        }

        int newarr[] = new int[n-1];
        for (int i =0;i<newarr.length;i++){
            arr[i] = newarr[i];
            System.out.println(newarr[i]);
        }
//     Nhập c , thêm c vào mảng:
        System.out.println("Nhập c :");
        int c = sc.nextInt();
        System.out.println("Nhập vị trí thêm c vào mảng : ");
        int d = sc.nextInt();
        int newarr1[] = new int[n+1];
        newarr1[d] = c;
        for (int i =0;i<arr.length;i++){
        }
        for (int i =0;i<newarr1.length;i++){
            arr[i] = newarr1[i];
            System.out.println(newarr1[i]);
        }
    }
}
