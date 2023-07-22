package LMS;

import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên tố cần in ");
        int number = scanner.nextInt();
        System.out.printf("%d số nguyên tố đầu tiên là : \n",number);
        int count = 0;
        int n = 2;
        while (true){
//            Kiểm tra n có phải số nguyên tố hay k
            boolean isPrime = true;
            for (int i =2; i<Math.sqrt(n); i++){
                if (n%i==0){
                    isPrime =false;
                    break;
                }
            }
            if (isPrime){
//                n là số nguyên tố
                System.out.printf("%d\t",n);
                count++;
            }
            if (number==count){
                break;
            }
            n++;
        }

    }
}
