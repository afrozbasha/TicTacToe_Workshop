package com.TicTac;

import java.util.Scanner;


class TicTac{
    Scanner sc = new Scanner(System.in);

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

    void paly(){
        System.out.print("Choose a letter X or O : ");
        char c = sc.next().charAt(0);
        if ((c != 'X') ||(c != 'O'))
            System.out.println("Enter Only Cgar 'O' or 'X' ");
        switch (c) {
            case 'O':
                System.out.println("Give the Index (1-9) of put O : ");
                putO(sc.nextInt());
                disp();
                break;
            case 'X':
                System.out.println("Give the Index (1-9) of put X : ");
                putX(sc.nextInt());
                disp();
                break;
            }

        }
    }



public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TicTac t = new TicTac();
        t.init();
        t.disp();
        //t.paly();


        while  ( (t.arr[0] == ' ') || (t.arr[1] == ' ') || (t.arr[2] == ' ') || (t.arr[3] == ' ') || (t.arr[4] == ' ') || (t.arr[5] == ' ') || (t.arr[6] == ' ') || (t.arr[7] == ' ') || (t.arr[8] == ' ')) {
            t.paly();
        }



        }

    }


