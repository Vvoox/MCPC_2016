package com.example.java;

import java.util.Scanner;

public class Main {
    public static int T=0 , N=0 ;
    public static void main(String[] args) {
    System.out.println("Hello , we need to help to get a tours for visiting all cities if we could : ");
    System.out.println("insert your input ");
    Scanner cs = new Scanner(System.in);
    Scanner nm = new Scanner(System.in);
    Scanner tb = new Scanner(System.in);
     T = cs.nextInt();
     for(int i=0 ; i<T ; i++) {

         N = cs.nextInt();
         String future1[] = new String[N];
         int future[] = new int[N];

         for (int j = 0; j < N; j++) {

             future1[j] = tb.next();
             future[j] = Integer.parseInt(future1[j]);
         }
         Future(future);
     }
    }

    public static void Future(int[] future){

        int max=0;

        for(int i=0 ; i<N ;i++){

            for(int j=i+1 ; j <N ;j++){

                if(future[i]<=future[j]){

                    if(max<future[j]){

                        max=future[j];
                    }
                }
                else {

                    if(max<future[i]){

                        max=future[i];
                    }
                }
            }
        }
        //System.out.println(max);
        condition(future,max);
    }
    public static void condition(int[] future , int max){

        int index =0 ;
        String direction =" ";
        String res =" ";
        for(int i=0 ; i<N ; i++){

            if(future[i]==max){

                index=i;

                int value=max;
                int value1=max;

                if(index==0){

                    for(int j =1 ; j<N ; j++){

                        if(value>future[j]){

                            value=future[j];

                            if(j==N-1){

                                index+=1;
                                res="R";
                                System.out.println(index+" "+res);
                            }
                        }

                    }
                    for(int j = N-1; j>0 ; j--){

                        if(value1>future[j]){

                            value1=future[j];

                            if(j==1){
                                index+=1;
                                res="L";

                                System.out.println(index+" "+res);
                            }
                        }

                    }
                    if (res == " ") {

                        System.out.println("NO");
                    }
                }
                if(index==N-1){

                    for(int j =N-2 ; j>0 ; j--){

                        if(value>future[j]){

                            value=future[j];

                            if(j==1){
                                index+=1;
                                res="L";

                                System.out.println(index+" "+res);
                            }
                        }
                        else break;

                    }
                    for(int j =0; j<N ; j++){

                        if(value>future[j]){

                            value=future[j];

                            if(j==N-1){
                                index+=1;
                                res="L";

                                System.out.println(index+" "+res);
                            }
                        }
                        else break;

                    }
                    if (res == " ") {

                        System.out.println("NO");
                    }
                }
                if(0<index && index<N){

                    for(int j =index+1 ; j<N ; j++){

                        if(value>future[j]){

                            value=future[j];

                            if(j==N-1){

                                for(int l=0 ; l<index ; l++){

                                    if(value>future[l]){

                                        value=future[l];
                                        if(l==index-1){
                                            index+=1;
                                            res="R";
                                            System.out.println(index+" "+res);
                                        }
                                    }
                                }
                            }
                        }
                        else break;



                    }
                    for(int j =index-1 ; j>0 ; j--) {

                        if (value1 > future[j]) {

                            value1 = future[j];

                            if (j == 1) {

                                for (int l = N - 1; l > index; l--) {

                                    if (value1 > future[l]) {

                                        value1 = future[l];

                                        if (l == index + 1) {
                                            index+=1;
                                            res="L";
                                            System.out.println(index+" "+res);
                                        }
                                    }



                                }
                            }
                        }
                        else break;

                    }
                    if (res == " ") {

                        System.out.println("NO");
                    }
                }


                /*for(int j=i; j< N ; j++){
                    if(j+1==N){break;}

                    if(value> future[j+1]){

                        value= future[j+1];
                        if(value==future[N-1]){
                            for(int l=0;l< i ; l++){

                                if(value> future[l]){
                                    value=future[l];

                                }
                                //System.out.println(value);

                                if(l==i-1){

                                    System.out.println(index+" R");
                                }
                            }
                        }
                    }
                    //System.out.println(value);
                    /*if(value==future[N-1]){
                        for(int l=0;l< i ; l++){

                            if(value> future[l]){
                                value=future[l];

                            }
                            //System.out.println(value);

                            if(l==i-1){

                                System.out.println(index+" R");
                            }
                        }
                    }*/

               /* }
                for(int j=i; j> 0 ; j--) {
                    if (j - 1 == 0) {
                        break;
                    }

                    if (value > future[j - 1]) {

                        value = future[j - 1];
                        if (value == future[0]) {
                            for (int l = N-1; l > i; l++) {

                                if (value > future[l]) {
                                    value = future[l];

                                }
                                //System.out.println(value);

                                if (l == i + 1) {

                                    System.out.println(index + " L");
                                }
                            }
                        }
                    }
                }*/

            }
        }


    }

}
