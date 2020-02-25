package com.company;

import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {
        Scanner skan=new Scanner(System.in);
        int num= skan.nextInt();
        int i = 0;
        while (i < 10) {
            i++;

        System.out.println( num + "*" + i + "=" +  num*i );
        }

    }

}
