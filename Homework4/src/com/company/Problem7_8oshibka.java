package com.company;
import java.util.Scanner;
public class Problem7_8oshibka {
    public static void main(String[] args) {


        int i = 0, a=1 , b=1 ,summa=0 , summb=0 ,summ=0;

        Scanner skan1 = new Scanner(System.in);
        int n = skan1.nextInt();
        while (i < n) {
            i++;
            if (i % 2 == 0) {
                b =- i;
                summb=summb+b;
                 System.out.print(b +"+" );//////////////????????????????????????????????????? inch anel estex
                }
            if (i  % 2 == 1) {
                a = i;
                 System.out.print( a  );
                summa=summa+a;
            }

summ=summa+summb;
        }
        System.out.print("=" + summ);
    }

}



