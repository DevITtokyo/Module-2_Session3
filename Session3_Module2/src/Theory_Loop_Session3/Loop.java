package Theory_Loop_Session3;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
//        in ra các số nguyên chẵn trong khoảng từ từ 1-10
        System.out.print("Các số nguyên chẵn trong khoảng từ 1 đến 10 là: ");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d\t", i);
            }
        }
        System.out.println();
//        in ra 10 số nguyên chia hết cho 2 bắt đầu từ 1
        int cnt = 0;
        System.out.print("10 số nguyên chia hết cho 2 bắt đầu từ 1 là: ");
        int a = 1;
        while (cnt <= 10) {
            if (a % 2 == 0) {
                System.out.printf("%d\t", a);
                cnt++;
            }
            a++;
        }
        System.out.println();


        //     in ra menu sau
//    1. phở bò kobe
//    2.Bánh mì trứng
//    3.Mỳ tôm không người lái
//    4.Thoát
//    Sự lựa chọn của bạn
//    menu lặp đi lặp lại nhiều lần => do..while
//    khi ng dùng chọn ->> duyệt día trị chọn => switch..case
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("**************MENU****************");
            System.out.println("1. phở bò kobe");
            System.out.println("2. Bánh mì trứng");
            System.out.println("3. Mỳ tôm không người lái");
            System.out.println("4. Thoát");
            System.out.println("Sự lựa chọn của bạn là : ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Bạn vừa chọn phở bò kobe");
                    break;
                case 2:
                    System.out.println("Bạn vừa chọn Bánh mì trứng");
                    break;
                case 3:
                    System.out.println("Bạn vừa chọn Mỳ tôm không người lái");
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng chọn giá trị từ 1-4");
            }
        }while (true);
    }
}
