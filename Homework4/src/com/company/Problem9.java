package com.company;
import java.util.Scanner;
public class Problem9 {
    public static void main(String[] args) {


        long i = 1;
        long a = 1;
        Scanner skan = new Scanner(System.in);
        long n = skan.nextInt();
        while (i < n)
        {       i++;
        a = i * a;
        }
        {
            System.out.println(a);
        }
    }
}

