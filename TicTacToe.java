package com.TicTac;
import java.util.Scanner;


class TicTac{

    ////assign a Char 1D array as a static
    static char[] arr = new char[10];

    //(can Calling from Main method) assign a empty space char by using 1D array
    void init() {
        for (int i = 0; i < 10; i++) {
            arr[i] = ' ';
        }
    }

    //display Tic Tac Toe 1D array Box
    //(can Calling from Main method)
    static void disp() {
        System.out.println("display Tic Tac Toe Box using 1D array");
        System.out.println(arr[0] + " | " + arr[1] + " | " + arr[2] );
        System.out.println("---------");
        System.out.println(arr[3] + " | " + arr[4] + " | " + arr[5] );
        System.out.println("---------");
        System.out.println(arr[6] + " | " + arr[7] + " | " + arr[8] );
    }

    //User can call this method by putting 'X' to specific index
    static void putX(int x){
        arr[x-1] = 'X';
    }

    //User can call this method by putting 'O' to specific index
    static void putO(int x){
        arr[x-1] = 'O';
    }

}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TicTac t = new TicTac();
        t.init();
        t.disp();

        System.out.print("Choose a letter X or O : ");
        char c = sc.next().charAt(0);
        switch (c) {
            case 'O':
                System.out.println("Give the Index of put O : ");
                t.putO(sc.nextInt());
                t.disp();
            case 'X':
                System.out.println("Give the Index of put X : ");
                t.putX(sc.nextInt());
                t.disp();
        }

    }
}
