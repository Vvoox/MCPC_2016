package com.example.java;

import java.util.Scanner;

public class Main {

    public static int T=0,N=0;

    public static void main(String[] args) {
    System.out.println("Hello we need to help to know if the strings is Anti-sym or not : ");
    System.out.println("Insert your input :");
    Scanner cs = new Scanner(System.in);
    Scanner nm = new Scanner(System.in);
    Scanner stg = new Scanner(System.in);
    T = cs.nextInt();

    String number = " ";
    for(int i = 0  ; i <T ; i++){

        N=nm.nextInt();
        number = stg.nextLine();
        int table1[]=new int[N];
        String table[] = number.split("",0);
        for(String a : table){

            System.out.print(a+" ");


        }
        for(int j=0 ; j<N ; j++ ){

            table1[j]=Integer.parseInt(table[j]);
        }
        System.out.println();
        reverse(table1);

    }
    }
    public static void reverse(int[] tab){

        int reverse[] = new int[N];
        int j=N-1;
        for(int i=0 ; i<N ; i++){

            reverse[i]=tab[j];
            j--;

        }
        for(int i=0 ; i<N ; i++){

            System.out.print(reverse[i]+" ");
        }
        System.out.println();
        flip(reverse);

    }
    public static void flip(int tab[]){

        int flip[]=new int[N];
        int l=0;
        for(int i=0 ; i<N ; i++){

            if(tab[i]==1){

                flip[l]=0;
                l++;
            }
            if(tab[i]==0){

                flip[l]=1;
                l++;
            }
        }



        for(int j=0 ; j<N ; j++){

            System.out.print(flip[j]+" ");
        }
        System.out.println();

    }
}
