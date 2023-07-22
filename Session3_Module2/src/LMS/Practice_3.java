package LMS;

import java.util.Scanner;

public class Practice_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhất");
        int a = scanner.nextInt();
        System.out.println("Nhập vào số thứ hai");
        int b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a==0 && b==0) {
            System.out.println("Hai số không có ước chung lớn nhất");
        } else if(a==0) {
            System.out.println("Uớc chung lớn nhất của 2 số là : " + b);
        } else if (b==0) {
            System.out.println("Uớc chung lớn nhất của 2 số là : " + a);
        } else {
            while (a!=b){
                if (a>b){
                    a-=b;
                } else {
                    b-=a;
                }
                break;
        }
        }
        System.out.println("Ước chung lớn nhất là : " + a);
    }
}
