package Theory_Loop_Session3;

import java.util.Scanner;

public class Application_exercises {
    public static void main(String[] args) {
        //        Nhập vào 1 số nguyên từ bàn phím
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào 1 số nguyên từ bàn phím");
            int number = Integer.parseInt(scanner.nextLine());
            System.out.println("***********MENU************");
            System.out.println("1. Kiểm tra chẵn lẻ");
            System.out.println("2. Kiểm tra chia hết cho 3 và 5");
            System.out.println("3. Kiểm tra số nguyên tố");
            System.out.println("4.  Kiểm tra số hoàn hảo");
            System.out.println("5.  Thoát");
            System.out.print("Sự lựa chọn của bạn là: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    if (number % 2 == 0) {
                        System.out.printf("%d là số chắn\n", number);
                    } else {
                        System.out.printf("%d là số lẻ\n", number);
                    }
                    break;
                case 2:
                    if (number % 3 == 0 && number % 5 == 0) {
                        System.out.printf("%d là số chia hết cho 3 và 5\n", number);
                    } else if ((number % 3) == 0 && number % 5 != 0) {
                        System.out.printf("%d là số chia hết cho 3 nhưng không chia hết cho  5\n", number);
                    } else if (number % 3 != 0 && (number % 5) == 0) {
                        System.out.printf("%d là số chia hết cho 5 nhưng không chia hết cho  3\n", number);
                    }
                    break;
                case 3:
                    boolean checkPrime = true;
                    if (number >=2) {
                        for (int i = 2; i < Math.sqrt((number)); i++) {
                            if (number % i == 0) {
                                checkPrime = false;
                            } else {
                                checkPrime = false;
                            }
                        }
                        if (checkPrime) {
                            System.out.printf("%d là số nguyên tố\n", number);
                        } else {
                            System.out.printf("%â không là số nguyên tố\n", number);
                        }
                        break;
                    }
                    break;
                case 4:
                    int sum = 0;
                    for (int i = 1; i < number; i++) {
                        if ((number % i) == 0) {
                            sum += i;
                        }
                        if (sum == number) {
                            System.out.printf("%d là số hoàn hảo\n", number);
                        } else {
                            System.out.printf("%d không là số hoàn hảo\n", number);
                        }
                        break;
                    }
                    break;

                case 5:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Vui lòng chọn giá trị từ 1-4");
            }
        } while (true);
    }
}
