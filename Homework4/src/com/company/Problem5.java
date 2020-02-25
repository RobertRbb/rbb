package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Problem5 {

    public static <max> void main(String[] args) {
        Scanner skan1 = new Scanner(System.in);
        int x = skan1.nextInt();
        Scanner skan2 = new Scanner(System.in);
        int y = skan2.nextInt();

        int min, max;
        int sum=0;
        min = Math.min(x, y);
        max = Math.max(x, y);
        System.out.print("Numbers between " + " " + min + " and " + max + " " + " " + "devisible by 9 :  " +
                "");

        int i = min;
        while (i >= min && i < max) {
            i++;
            if (i % 9 == 0)
            {
                sum=sum+i;
                System.out.print(i + " ");
            }
        }

        System.out.println("Sum of these numbers is :" +" " +sum);

    }
}




