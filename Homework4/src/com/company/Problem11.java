package com.company;
import java.util.Scanner;
public class Problem11 {
    public static void main(String[] args) {
        Scanner skan = new Scanner(System.in);
        int n = skan.nextInt();
        for (int i = 2; i <= n; i++)
        if (n%i!=0)
            for (int j = 2; j <= i; j++)
                if (i % j != 0)
                    System.out.println("n is prime number");

                else
                    System.out.println("false");

        }
    }
