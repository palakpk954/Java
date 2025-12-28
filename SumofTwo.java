package Basic;

import java.util.Scanner;

public class SumofTwo {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        System.out.println("Enter the third number:");
        int c = sc.nextInt();
        System.out.println("Sum of three numbers is: ");
        System.out.println(a+b+c);
    }
}
