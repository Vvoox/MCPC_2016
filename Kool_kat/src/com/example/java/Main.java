package com.example.java;

import java.util.Scanner;

public class Main {

    public static int T=0 ;
    public static void main(String[] args) {
    System.out.println("Hello , we need to knw the minimum of the string length ");
    System.out.println("Insert your input : ");
    Scanner cs = new Scanner(System.in);
    Scanner nm = new Scanner(System.in);
    Scanner table = new Scanner(System.in);

    T=cs.nextInt();
    String tb[] = new String[2];
    int tb1[]= new int[2];
    //int N=0 , M =0;
    for(int i=0 ; i<T ; i++){

        int N=0 , M=0;

        for(int j=0 ; j<2 ; j++){

            tb[j]=nm.next();
            tb1[j]=Integer.parseInt(tb[j]);

        }

        N=tb1[0];
        M = tb1[1];
        String[] words=new String[N];
        String[] needs = new String[M];

        for(int j=0 ; j<N ;j++ ){

            words[j]= table.next();

        }
        for(int j=0 ; j<M;j++){

            needs[j]=words[j];
        }

        for(int j=0 ; j<tb1[1] ;j++){

            System.out.println(needs[j]);
        }

        kool(needs,M);
        //mat(needs);
    }

    }
    public static void kool(String[] tab ,int len){

        int maxl = 0;
        int leng[] = new int[len];

        for(int i=0 ; i<len ; i++){

            leng[i]=tab[i].length();
           // System.out.println(leng[i]);

        }
        for(int i =0 ; i<len ; i++){

            if(maxl<=leng[i]){
                maxl=leng[i];
            }
        }
        String[] matrix[] = new String[len][maxl];
        //System.out.println(maxl);

        for(int i=0 ; i < len ; i++) {

           // for (int j = 0; j < maxl; j++) {
            if(i+1==len){break;}

            String[] sp1= tab[i].split("",0);
            String[] sp2=tab[i+1].split("",0);
            int lng1 = sp1.length , lng2= sp2.length;
            int index[]=new int[lng2];
            int l=0;

            int cnt=0;

            for(int j=0 ; j<lng1 ; j++){

                for(int h=0 ; h<lng2 ; h++){

                    if(sp1[j].equals(sp2[h])){

                            index[h] = 2;
                    }
                    if(!sp1[j].equals(sp2[h])){

                        if(index[h]!=2){

                            index[h]=1;
                        }
                    }
                }
            }

            for(int j=0 ; j<lng2 ; j++){

                System.out.print(index[j]+" ");
            }
            System.out.println();
            


        }

    }
    public static String[] mat(String tab){

        String tabl[] = new String[tab.length()];
        String word1 = " ";

        for(String a : tabl){
                tabl=tab.split("",0);
            }

        for(int i=0 ; i<tabl.length ; i++){

            System.out.print(tabl[i]+" ");
        }
        return tabl;

    }
}
