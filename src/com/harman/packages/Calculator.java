package com.harman.packages;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        addition addobj = new addition();
        subraction subobj = new subraction();
        multiply multiplyobj = new multiply();
        divide divobj = new divide();
        Integer x,y,addresult,subresult,multiplyresult,divresult;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the no 1:");
        x=input.nextInt();
        System.out.println("Enter the no 2:");
        y=input.nextInt();
        addresult= addobj.Add2number(x,y);
        subresult= subobj.Sub2number(x,y);
        multiplyresult= multiplyobj.Multiply2number(x,y);
        divresult= divobj.Divide2number(x,y);
        System.out.println(addresult);
        System.out.println(subresult);
        System.out.println(multiplyresult);
        System.out.println(divresult);




    }
}