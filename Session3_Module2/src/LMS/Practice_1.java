package LMS;

import java.util.Scanner;

public class Practice_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        if (number<2) {
            System.out.printf("%d is not prime \n ", number);
        } else {
            int i =2;
            boolean check = true;
            while (i<number){
                if (number%i==0){
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.printf("%d is prime \n ",number);
            }else {
                System.out.printf("%d is not prime \n ",number);
            }
        }
        System.out.println();
    }
}
