package ASSIGNMENT_1.java_coding_uestion;

import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j;
        int num=1;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
