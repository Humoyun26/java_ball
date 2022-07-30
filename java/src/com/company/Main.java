package com.company;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner =new Scanner(in);
        System.out.println("Balni kiriting:   ");
        int ball= scanner.nextInt();
        if(ball<50){
            System.out.println("yiqildi");
        } else if(ball>=50 && ball<60) {
            System.out.println("D daraja");
        } else if(ball>=60 && ball<70) {
            System.out.println("C daraja");
        } else if(ball>=70 && ball<80) {
            System.out.println("B daraja");
        } else if(ball>=80 && ball<90) {
            System.out.println("A daraja");
        } else if(ball>=90 && ball<100) {
            System.out.println("A+ daraja");
        } else {
            System.out.println("O'tdingiz!!!!!!!!!!!");
        }
    }





















    }

