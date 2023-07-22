package LMS;

import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("*********** Menu ***********");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.print("Your choice is : ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Enter width");
                    int width = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter height");
                    int height = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            System.out.printf("*\t");
                        }
                        System.out.printf("\n");
                    }
                    break;
                case 2:
                    boolean isExist = true;
                    do {
                        System.out.println("*******Print the square triangle*****");
                        System.out.println("1. top-left");
                        System.out.println("2. top-right");
                        System.out.println("3. bottom-left");
                        System.out.println("4. bottom-right");
                        System.out.println("5. Exit");
                        System.out.print("Your choice is : ");
                        int squareChoice = Integer.parseInt(scanner.nextLine());
                        switch (squareChoice){
                            case 1:
                                System.out.println("Enter height of top-left");
                                int heightTopLeft = Integer.parseInt(scanner.nextLine());
                                for (int i = heightTopLeft; i >= 1; i--) {
                                    //In theo dòng
                                    for (int j = 1; j <= i; j++) {
                                        System.out.printf("*\t");
                                    }
                                    System.out.printf("\n");
                                }
                                break;
                            case 2:
                                System.out.println("Enter height of top-right");
                                int heightTopRight = Integer.parseInt(scanner.nextLine());
                                for (int i = heightTopRight; i >= 1; i--) {
                                    //In theo dòng
                                    //In khoảng trắng
                                    for (int j = 1; j <= heightTopRight - i; j++) {
                                        System.out.printf(" \t");
                                    }
//                                  //In *
                                    for (int k = 1; k <= i; k++) {
                                        System.out.printf("*\t");
                                    }
                                    System.out.printf("\n");
                                }
                                break;
                            case 3:
                                System.out.println("Enter height of bottom-left");
                                int heightBottomLeft = Integer.parseInt(scanner.nextLine());
                                for (int i = 1; i <= heightBottomLeft; i++) {
                                    //In theo dòng
                                    for (int j = 1; j <= i; j++) {
                                        System.out.printf("*\t");
                                    }
                                    System.out.printf("\n");
                                }
                                break;
                            case 4:
                                System.out.println("Enter height of bottom-right");
                                int heightBottomRight = Integer.parseInt(scanner.nextLine());
                                for (int i = 1; i <= heightBottomRight; i++) {
                                    //In theo dòng
                                    //In khoảng trắng
                                    for (int j = 1; j <= heightBottomRight - i; j++) {
                                        System.out.printf(" \t");
                                    }
                                    //In *
                                    for (int k = 1; k <= i; k++) {
                                        System.out.printf("*\t");
                                    }
                                    System.out.printf("\n");
                                }
                                break;
                            case 5:
                                isExist = false;
                                break;
                            default:
                                System.err.println("Please enter number 1-5");
                        }
                    }while (isExist);
                    break;
                case 3:
                    System.out.println("Enter the height of Triangle:");
                    int heightIsosceles = Integer.parseInt(scanner.nextLine());
                    int k = 0;
                    for (int i = 1; i < heightIsosceles; i++,k=0) {
                        //In khoảng trắng
                        for (int j = 1; j <= heightIsosceles - i; j++) {
                            System.out.printf(" \t");
                        }
                        //In *
                        while (k != 2 * i - 1) {
                            System.out.printf("*\t");
                            k++;
                        }
                        //Xuống dòng
                        System.out.printf("\n");
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.err.println("Please enter number 1-4");
            }
        }while (true);
    }
}
