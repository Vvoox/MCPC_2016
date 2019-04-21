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


        int l=0;

        int lg = 2*N -1;
        String[] result1 = new String[lg];
        String[] result2 = new String[lg];
        int max=0;
        int index[] = new int[lg];

        for(int i=0 ; i < lg ; i++) {

                if (i + 1 == lg) {
                    break;
                }

                for (int j = i+1 ; j < lg; j++) {

                    if(!tab[i].equals(tab[j])){

                        index[i]+=1;
                    }
                    if( tab[i].equals(tab[j]))
                        index[i]=0;

                }
                System.out.println();
                for(int j=0 ; j<lg ; j++) {

                    if (max < index[i]) {

                        max = index[i];

                    }
                }



        }

        for(int i=0 ; i<lg ; i++){

            if(index[i]==max){
                result1[i]=tab[i];

            }
        }

        //String[] final =new
       // for(int i=0 ; i<lg ; i++ ){

            //result1[i].split("null");

            //if(!result1.equals("null"))
            //System.out.println(result1[i]);
        //}


    }
}
