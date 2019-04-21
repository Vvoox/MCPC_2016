package com.example.java;

import java.net.Inet4Address;
import java.util.Scanner;

public class Main {

    public static int T=0 , N=0 , D=0 ;
    public static void main(String[] args) {
        System.out.println("Hello , lets help to announcing the new capital : ");
        System.out.println("Insert your input : ");
        Scanner cs = new Scanner(System.in);
        Scanner nm = new Scanner(System.in);
        Scanner d = new Scanner(System.in);
        Scanner tb = new Scanner(System.in);
        T = cs.nextInt();
        String tb1[] = new String[2];
        for (int i = 0; i < T; i++) {

            for (int j = 0; j < 2; j++) {
                tb1[j] = nm.next();
            }

            N = Integer.parseInt(tb1[0]);
            D = Integer.parseInt(tb1[1]);
            String tab1[][] = new String[N][2];
            int tab[][] = new int[N][2];
            for (int j = 0; j < N; j++) {
                for (int l = 0; l < 2; l++) {

                    tab1[j][l] = tb.next();
                    tab[j][l] = Integer.parseInt(tab1[j][l]);
                }
            }
            for (int j = 0; j < N; j++) {
                for (int l = 0; l < 2; l++) {

                    System.out.print(tab1[j][l] + " ");
                }
                System.out.println();
            }
            capital(tab,N ,D);


        }

    }
    public static void capital(int tab[][], int N ,int D){

        int[] cap = new int[N];
        for(int i=0 ; i<N ; i++){

            if(i+1==N) break;

            for(int j=i+1 ; j<N ; j++){

                cap[i]=manhatten(tab[i][0],tab[i][1],tab[j][0],tab[j][1]);
            }
        }
        for(int i=0 ; i<N ; i++){

            if(cap[i]<=D){

                System.out.println(i);
            }
        }

    }

    public static int manhatten(int X1 , int X2 , int Y1 , int Y2){

        int res1=0 , res2 =0 ;
        if(X1>=Y1){
             res1 = X1-Y1;
        }
        if(Y1>X1){
             res1 = Y1-X1;
        }
        if(X2>=Y2){
            res2 = X2-Y2;
        }
        if(Y2>X2){

            res2 = Y2-X2;
        }

        int man = res1 + res2;

        return man;



    }
}
