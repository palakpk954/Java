package Basic;

import java.util.Scanner;

public class PRT {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principle Amount:");
        double p = sc.nextDouble();
        System.out.println("Enter the Principle Rate:");
        double r = sc.nextDouble();
        System.out.println("Enter the Time:");
        double t = sc.nextDouble();

        double si= p*r*t/100;
        System.out.println("The simple interest is: "+si);



    }
}
