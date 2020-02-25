package com.company;
import java.util.Scanner;
public class Problem10 {
    public static void main(String[] args) {
        int a = 0, b = 1, c = 0;
        int i = 2;

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if(n == 1){
            System.out.println(a);
            return;
        }

        if(n == 2){
            System.out.println(b);
            return;
        }

        while (i < n)
        {
            i++;

            c = a + b;
            a = b;
            b = c;
        }

        System.out.println(c);
    }
}


