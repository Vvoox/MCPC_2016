package com.example.java;

import java.util.Scanner;

public class Main {

    public static int T=0 ;
    public static void main(String[] args) {

        System.out.println("Hello , we need to help coach for teaching for handling the correct number of aliens ");
        System.out.println("Insert your input : ");

        Scanner cs=new Scanner(System.in);
        Scanner nm = new Scanner(System.in);
        Scanner tb = new Scanner(System.in);
        T = cs.nextInt();
        int[] result = new int[T];

        int N =0;
        for(int i=0 ; i<T ; i++){

            N=nm.nextInt();
            String[] matrix1 = new String[N];
            int[] matrix = new int[N];

            for(int j=0 ; j<N ; j++){

                matrix1[j]=tb.next();
                matrix[j]=Integer.parseInt(matrix1[j]);


            }
            coach(matrix ,N);

        }
    }

    public static void coach(int[] matrix ,int N){

        int coach[]=new int[N];
        double res =0 ;
        int result =0 ;
        for(int i=0 ; i<N ; i++){

            if(matrix[i]<= 30){
                coach[i]=1;
            }
            else{

                coach[i] = matrix[i]/30 +1 ;
            }
        }
        for(int i=0 ; i<N ; i++){

            result+=coach[i];
        }

        System.out.println(result);



    }
}
