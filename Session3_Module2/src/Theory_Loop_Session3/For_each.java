package Theory_Loop_Session3;

public class For_each {
    public static void main(String[] args) {
        int [] arrInt = {3,5,7,9};
        System.out.print("Các phần tử trong mảng là");
        for (int element:arrInt) {
            System.out.printf("%d\t",element);
        }
        System.out.printf("\n");
    }
}
