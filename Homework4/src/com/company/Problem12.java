package com.company;
import java.util.Scanner;
public class Problem12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        boolean black=true;

        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                 if(black) {
                     black=false;
                     System.out.print("white ");
                 }
                 else {
                     black=true;
                     System.out.print("black ");
                 }

            }

            System.out.println();
        }

    }
}
