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

        future(tab1,N);

    }
    }

    public static void future(String[] tab, int N){

        int l=0;

        int lg = 2*N -1;


        int max=0;
        int index[] = new int[lg];

        for(int i=0 ; i<lg ;i++){

            for(int j=0 ; j<lg ; j++){


                if(i!=j){


                    if(tab[i].equals(tab[j])){

                        index[i]=1;
                        break;

                    }
                    if(!tab[i].equals(tab[j])) index[i]=2;
                }
            }
        }

        for(int i=0 ; i<lg ; i++){

            if(index[i]==2){

                max+=1;
            }
        }
        String[] result1 = new String[max];

        for(int i=0 ; i<lg ; i++){

            if(index[i]==2){

                result1[l]=tab[i];
                l++;
            }
        }
        for(int i=0 ; i<max ; i++){

            System.out.println(result1[i]);
        }


    }
}
