package com.company;

import java.util.Scanner;

public class Problem6 {

    public static void main(String[] args) {


        double i = 1;
        double m = 0;
        Scanner skan1 = new Scanner(System.in);
        double n = skan1.nextInt();
        while (i<=n)
        {
            m = m + 1 / i;
            i++;
        }
            System.out.println(m);


    }
}