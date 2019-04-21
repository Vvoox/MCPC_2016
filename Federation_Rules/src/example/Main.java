package example;

import java.util.Scanner;

public class Main {

    public static int T = 0;

    public static void main(String[] args) {

        System.out.println("Hello , we need to help airport to give tourist visa :");
        System.out.println("Insert your input");
        Scanner cs = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        T = cs.nextInt();
        String rule[][] = new String[T][3];
        String outp[] = new String[T];
        for (int i = 0; i < T; i++) {

            for (int j = 0; j < 3; j++) {

                rule[i][j] = num.next();
            }


        }
        mat(rule, outp);
        for (int i = 0; i < T; i++) {

            System.out.println(outp[i]);
        }

    }

    public static void mat(String[] matrix[], String[] outp) {

        int[][] comp = new int[T][2];
        for (int i = 0; i < T; i++) {

            for (int j = 0; j < 2; j++) {

                comp[i][j] = Integer.parseInt(matrix[i][j]);
            }
        }

        for (int i = 0; i < T; i++) {

                if (comp[i][0] < comp[i][1]) {
                    if(matrix[i][2].equals("<")){

                        outp[i]="Yes";
                    }
                    else outp[i]="No";


                }
                if (comp[i][0] > comp[i][1] ) {

                    if(matrix[i][2].equals(">")){

                        outp[i] = "Yes";
                    }
                    else outp[i]="No";


                }



        }
    }
}
