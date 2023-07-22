package LMS;

import java.util.Scanner;

public class Practice_4 {
    public static void main(String[] args) {
//        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("********** Menu **********");
        System.out.println("1. Vẽ tam giác");
        System.out.println("2. Vẽ hình vuông");
        System.out.println("3. Vẽ hình chữ nhật");
        System.out.println("4. Thoát");
        System.out.println("Sự lựa chọn của bạn là : ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Vẽ tam giác");
                System.out.println("*");
                System.out.println("**");
                System.out.println("***");
                System.out.println("****");
                System.out.println("*****");
                System.out.println("******");
                System.out.println("*******");
                break;
            case 2:
                System.out.println("Vẽ hình vuông");
                System.out.println("**********");
                System.out.println("**********");
                System.out.println("**********");
                System.out.println("**********");
                break;
            case 3:
                System.out.println("Vẽ hình chữ nhật");
                System.out.println("************************");
                System.out.println("************************");
                System.out.println("************************");
                System.out.println("************************");
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("Không lựa chọn");
        }
    }
}
