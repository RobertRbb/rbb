package com.company;

import java.util.Scanner;

public class Problem4 {

    public static void main(String[] args) {
        Scanner skan1 = new Scanner(System.in);
        int x = skan1.nextInt();
        Scanner skan2 = new Scanner(System.in);
        int y = skan2.nextInt();
        int a=1;
        int i=0;
        while (i <= 10) {
           a = a*x;
            i++;
           y=i;
            System.out.println( x +"^" + (y) +"=" +  a );
        }

    }
}
