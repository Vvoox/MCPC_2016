package com.example.java;

import java.util.Scanner;

public class Main {

    public static int T=0 ;
    public static void main(String[] args) {
    System.out.println("insert your input : ");
    Scanner cs = new Scanner(System.in);
    Scanner num = new Scanner(System.in);
    Scanner pos = new Scanner(System.in);
    Scanner tb = new Scanner(System.in);
    T = cs.nextInt();
    int N=0 , K=0 ;
    String tab2[] = new String[2];
    for(int i=0 ; i<T ; i++){
        for(int j=0 ; j<2 ;j++){
            tab2[j]=num.next();
        }

        N=Integer.parseInt(tab2[0]);
        K=Integer.parseInt(tab2[1]);

        String tab1[] =new String[N];
        int tab[] = new int[N];

        for(int j=0 ; j<N ; j++){

            tab1[j]=tb.next();
            tab[j]=Integer.parseInt(tab1[j]);
        }
        for(int j=0 ; j<N ; j++){

            System.out.print(tab[j]+" ");
        }
        System.out.println();
        flatland(tab,N ,K);

    }
    }
    public static void flatland(int tab[] ,int N , int K ){
        double max=0;
        for(int i=0 ; i<N ; i++){

            if(i+1==N)
                break;

            if(tab[i+1]-tab[i]>max){

                max=tab[i+1]-tab[i];
            }
        }

        System.out.println(max/2);




    }
}
