package com.firstone;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Principle : ");
        Scanner scanner=new Scanner(System.in);
        int principle=scanner.nextInt();

        System.out.print("Annual interest : ");
        Scanner annual=new Scanner(System.in);
        double annual_amount=annual.nextDouble();
        double after_dividing_by12=annual_amount/1200;

        System.out.print("Priods (Years) : ");
        Scanner periods=new Scanner(System.in);
        int no_of_months=periods.nextInt();
        long after_multiplication=no_of_months*12;

        double power=Math.pow(after_dividing_by12+1,after_multiplication);//formula solving

        double multiplication=principle*after_dividing_by12*power;//formula solving

        double minus_one=power-1;//formula solving

        double Mortgage=multiplication/minus_one;//formula solving

        NumberFormat currency=NumberFormat.getCurrencyInstance();//for getting in currency format
        String result=currency.format(Mortgage);
        System.out.print("Mortgage : ");
        System.out.print( result);

    }
}
