package ASSIGNMENT_1.java_coding_uestion;

import java.util.Scanner;

public class ques24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int x = n-1; // 4
            System.out.print(i + " ");
            int t = i;
            for (int j = 1; j < i; j++) {
                t += x;
                System.out.print(t + " ");
                x--;
            }
            System.out.println();
        }
    }
}
