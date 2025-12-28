package Basic;

import java.util.Scanner;

public class odd_even_comparision {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("The number is even.");
        }
        else
            System.out.println("The number is odd.");

    }
}
