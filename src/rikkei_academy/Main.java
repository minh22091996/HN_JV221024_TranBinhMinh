package rikkei_academy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
int[] arr = new int[100];
                int check = 0;
            do{
                System.out.println("MENU :");
                System.out.println("*1. Nhập số phần tử và giá trị cho các phần tử của mảng từ bàn phím ");
                System.out.println("*2. In ra giá trị các phần tử trong mảng ");
                System.out.println("*3. Tính tổng và in ra các phần tử có giá trị lẻ trong mảng");
                System.out.println("*4. In ra giá trị lớn nhất và nhỏ nhất trong mảng ");
                System.out.println("*5. Thống kê số lượng phần tử chia hết cho 2 và 3 trong mảng ");
                System.out.println("*6. In ra mảng đảo ngược");
                System.out.println("*7. In ra các phần tử và tổng số các phần tử là số nguyên tố trong mảng ");
                System.out.println("*8. Sắp xếp mảng tăng dần");
                System.out.println("*9. Thoát");
                int n = sc.nextInt();
                switch (n){
                    case 1:case1();
                        break;
                    case 2:case2();
                        break;
                    case 3:case3();
                        break;
                    case 4:case4();
                        break;
                    case 5:case5();
                        break;
                    case 6:case6();
                        break;
                    case 7:case7();
                        break;
                    case 8:case8();
                        break;
                    case 9:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Số bạn nhập không có trong lựa chọn . Vui lòng nhập lại :");
                }
            }while (check != 5);
    }
    public static void case1(){
        int size ;
        do{
            System.out.println("Nhập độ dài mảng :");
            size = sc.nextInt();
            if(size >100){
                System.out.println("Độ dài mảng không được vượt quá 100 phần tử !!!");
            }
        }while (size > 100);
        int[] n = new int[size];
        for (int i = 0; i < n.length; i++) {
            System.out.println("Nhập vào phần tử thứ " + (i+1) + " :");
            n[i] = sc.nextInt();
        }
    }
    public static void case2(){
        int size ;
        do{
            System.out.println("Nhập độ dài mảng :");
            size = sc.nextInt();
            if(size >100){
                System.out.println("Độ dài mảng không được vượt quá 100 phần tử !!!");
            }
        }while (size > 100);
        int[] n = new int[size];
        for (int i = 0; i < n.length; i++) {
            System.out.println("Nhập vào phần tử thứ " + (i+1) + " :");
            n[i] = sc.nextInt();
        }
        System.out.println("Mảng gồm các phần tử là : " + Arrays.toString(n));
    }

    public static void case3(){
        int size ;
        do{
            System.out.println("Nhập độ dài mảng :");
            size = sc.nextInt();
            if(size >100){
                System.out.println("Độ dài mảng không được vượt quá 100 phần tử !!!");
            }
        }while (size > 100);
        int[] n = new int[size];
        for (int i = 0; i < n.length; i++) {
            System.out.println("Nhập vào phần tử thứ " + (i+1) + " :");
            n[i] = sc.nextInt();
        }
        System.out.println("Mảng gồm các phần tử là : " + Arrays.toString(n));
        int sum = 0;
        System.out.println("Các phần tử có giá trị lẻ trong mảng là :");
        for (int i = 0; i < n.length; i++) {
            if(n[i] % 2 != 0){
                System.out.print(n[i] + "\t");
                sum+= n[i];
            }
        }
        System.out.println("");
        System.out.println("Tổng các phần tử có giá trị lẻ trong mảng là :" + sum);


    }

    public static void case4(){
        int size ;
        do{
            System.out.println("Nhập độ dài mảng :");
            size = sc.nextInt();
            if(size >100){
                System.out.println("Độ dài mảng không được vượt quá 100 phần tử !!!");
            }
        }while (size > 100);
        int[] n = new int[size];
        for (int i = 0; i < n.length; i++) {
            System.out.println("Nhập vào phần tử thứ " + (i+1) + " :");
            n[i] = sc.nextInt();
        }
        System.out.println("Mảng gồm các phần tử là : " + Arrays.toString(n));
        int max=n[0];
        int min = n[0];
        for (int i = 0; i < n.length; i++) {
            if(max < n[i]){
               max = n[i];
            }
        }
        System.out.println("Gía trị lớn nhất trong mảng là : " + max);

        for (int i = 0; i < n.length; i++) {
            if(n[i] < min){
                min = n[i];
            }
        }
        System.out.println("Gía trị nhỏ nhất trong mảng là : " + min);
    }

    public static void case5(){
        int size ;
        do{
            System.out.println("Nhập độ dài mảng :");
            size = sc.nextInt();
            if(size >100){
                System.out.println("Độ dài mảng không được vượt quá 100 phần tử !!!");
            }
        }while (size > 100);
        int[] n = new int[size];
        for (int i = 0; i < n.length; i++) {
            System.out.println("Nhập vào phần tử thứ " + (i+1) + " :");
            n[i] = sc.nextInt();
        }
        System.out.println("Mảng gồm các phần tử là : " + Arrays.toString(n));
        int count = 0;
        for (int i = 0; i < n.length; i++) {
            if(n[i] % 2 == 0 && n[i] % 3 == 0){
                count ++;
            }
        }
        System.out.println("Số lượng phần tử chia hết cho 2 và 3 là :" + count + " phần tử");
    }

    public static void case6(){
        int size ;
        do{
            System.out.println("Nhập độ dài mảng :");
            size = sc.nextInt();
            if(size >100){
                System.out.println("Độ dài mảng không được vượt quá 100 phần tử !!!");
            }
        }while (size > 100);
        int[] n = new int[size];
        for (int i = 0; i < n.length; i++) {
            System.out.println("Nhập vào phần tử thứ " + (i+1) + " :");
            n[i] = sc.nextInt();
        }
        System.out.println("Mảng gồm các phần tử là : " + Arrays.toString(n));
        /*Đảo ngược mảng trong Java bằng vòng lặp*/
        for (int i = 0, j = n.length - 1; i < j; i++, j--){
            /*Tạo biến temp và tiến hành hoán đổi phần tử*/
            int temp = n[i];
            n[i]  = n[j];
            n[j] = temp;
        }
        System.out.println("Mảng sau khi đảo ngược là :" + Arrays.toString(n));


    }

    public static void case7(){
        int size ;
        do{
            System.out.println("Nhập độ dài mảng :");
            size = sc.nextInt();
            if(size >100){
                System.out.println("Độ dài mảng không được vượt quá 100 phần tử !!!");
            }
        }while (size > 100);
        int[] n = new int[size];
        for (int i = 0; i < n.length; i++) {
            System.out.println("Nhập vào phần tử thứ " + (i+1) + " :");
            n[i] = sc.nextInt();
        }
        System.out.println("Mảng gồm các phần tử là : " + Arrays.toString(n));
        int sum = 0;
        boolean check = false;
        for (int i = 0; i < n.length; i++) {
            if(n[i] >1){
                check = true;
            }
        }
        System.out.println("Các số nguyên tố trong mảng là :");
        if(check == true ) {
            for (int i = 2; i < n.length; i++) {
                if(n[i] % i != 0){
                    System.out.print(n[i] + "\t");
                sum += n[i];
                }
            }
        }
        System.out.println("");
        System.out.println("Tổng của các số nguyên tố trong mảng là : " + sum);
    }
    public static void case8(){
        int size ;
        do{
            System.out.println("Nhập độ dài mảng :");
            size = sc.nextInt();
            if(size >100){
                System.out.println("Độ dài mảng không được vượt quá 100 phần tử !!!");
            }
        }while (size > 100);
        int[] n = new int[size];
        for (int i = 0; i < n.length; i++) {
            System.out.println("Nhập vào phần tử thứ " + (i+1) + " :");
            n[i] = sc.nextInt();
        }
        System.out.println("Mảng gồm các phần tử là : " + Arrays.toString(n));
        int temp;
        for (int i = 0; i < n.length-1; i++) {
            for (int j = i +1; j < n.length; j++) {
                if(n[i] > n[j]){
                    temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }
            }
        }
        System.out.println("Mảng sau khi sắp xếp tăng dần là :" + Arrays.toString(n));
    }


}
