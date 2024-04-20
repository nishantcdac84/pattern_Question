package ASSIGNMENT_1;

import java.util.Scanner;

public class LCM {
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int calculateLCM(int a, int b) {
        // LCM = (a * b) / GCD(a, b)
        return (a * b) / calculateGCD(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();

        int lcm = calculateLCM(num1, num2);
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);
        
        scanner.close();
    }
}

