package com.example.java;

import java.util.Scanner;

public class Main {

    public static int T=0;
    public static void main(String[] args) {
    System.out.println("Hello , lets help noticed how is checked-out or checked-in");
    System.out.println("Insert your input : ");
    Scanner cs = new Scanner(System.in);
    Scanner nm = new Scanner(System.in);
    Scanner tb = new Scanner(System.in);
    T=cs.nextInt();
    int N =0;
    for(int i =0 ; i<T ; i++){

        N=nm.nextInt();
        String tab1[] = new String[2*N -1];

        for(int j=0 ; j<2*N-1 ; j++){

            tab1[j]=tb.nextLine();
        }
        for(int l=0 ; l<2*N -1 ;l++){

            System.out.println(tab1[l]);
        }
        System.out.println();
        future(tab1,N);

    }
    }

    public static void future(String[] tab, int N){

        String[] result1 = new String[2*N -1];
        String[] result2 = new String[2*N-1];
        int l=0;
        int index = 0;

        for(int i=0 ; i < 2*N -1 ; i++) {

                if (i + 1 == 2 * N - 1) {
                    break;
                }

                for (int j = 0; j < 2 * N - 1; j++) {

                    if(!tab[i].equals(tab[j])){

                        index=1;
                    }
                    else index=0;

                }

            if(index==1){

                result1[i]=tab[i];
            }

        }

        for(int i=0 ; i<2*N -1 ; i++ ){

            System.out.println(result1[i]);
        }


    }
}
