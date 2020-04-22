package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("write your number: ");
        int num = in.nextInt();
        final int X = 14;
        final int Y = 1;
        final int Z = 11;
        switch(num){
            case X:
                System.out.println("Данное значение имеется в константах");
            break;
            case Y:
                System.out.println("Данное значение имеется в константах");
                break;
            case Z:
                System.out.println("Данное значение имеется в константах");
                break;
                default:
                    System.out.println("Такой константы нет!");
                    break;

            }
        }
    }

