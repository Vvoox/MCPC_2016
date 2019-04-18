package com.example.java;

import java.util.Scanner;

public class Main {

    public static int T=0 , N=0 ,result=0;

    public static void main(String[] args) {
    System.out.println("Insert your input : ");
    Scanner cs = new Scanner(System.in);
    Scanner nm = new Scanner(System.in);
    Scanner dis = new Scanner(System.in);
     T = cs.nextInt();
     N = nm.nextInt();
    String distance1[] = new String[N];
    int distance[] = new int[N];
    for(int i=0 ; i<N ;i++){

        distance1[i]=dis.next();
        distance[i]=Integer.parseInt(distance1[i]); } // input in one line , use string before int;

    sum(distance);
    System.out.println(result);

    }
    public static void sum(int[] distance){ // this function calculate the sum of all number and give the max , and after i use it to identify the size of table fibo;

       int max=0;

        for(int i=0 ; i<N ; i++){

            for(int j=i+1 ; j<N ; j++){

                if(distance[i]+distance[j]>max){

                        max=distance[j]+distance[i];
                }
            }
        }
        fibo(max,distance);
    }
    public static void fibo(int max , int[] distance){

        int[] lfibo=new int[max];
        lfibo[0]=1;
        lfibo[1]=1;
        for(int i =0 ; i<max ; i++){

            if(i+2==max){ break;}

            lfibo[i+2] = lfibo[i+1] + lfibo[i]; // here i use the max and create another arrays fib that contient just the number we need to combine with , we don't need to use the whole size;
            if(lfibo[i+2]>=max){break;}


        }
        int value=0;
        for(int i=0 ; i<max ; i++){

            if(lfibo[i]!=0){

                value+=1;
            }
        }
        int fibo[] = new int[value];
        for(int i=0 ; i<value ; i++){

            fibo[i]=lfibo[i];
        }
        for(int i=0 ; i<N ; i++){

            for(int j=i+1 ; j<N; j++){

                for(int f=0 ; f<fibo.length ; f++){ // here and finally augment the result if we have sum of 2 number = some number in second fibo list

                    if(distance[i]+distance[j]==fibo[f]){
                        result+=1;
                    }
                }
            }
        }

    }

}
