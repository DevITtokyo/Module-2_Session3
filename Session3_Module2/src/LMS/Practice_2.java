package LMS;

import java.util.Scanner;

public class Practice_2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập vào số tiền gửi");
        double deposits = scanner.nextDouble();
        System.out.println("Nhập vào tỉ lệ lãi suất theo tháng");
        double rate = scanner.nextDouble();
        System.out.println("Nhập vào số tháng gửi tiền");
        int month = scanner.nextInt();
        double totalInterest =0;
        for (int i =0; i<month; i++){
            totalInterest = deposits * (rate/100) / 12 * month;
        }
        System.out.printf("Số tiền lãi là : %f \n ", totalInterest);
    }
}
