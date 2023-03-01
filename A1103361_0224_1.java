import java.util.Scanner;

public class A1103361_0224_1{

    public static void name(String[] argv) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入一個整數:");
        int number = scanner.nextInt();
        if(number % 2 == 0) {
            System.out.println("這是偶數");
        }
        else {
            System.out.println("這是奇數");
        }
    }
}