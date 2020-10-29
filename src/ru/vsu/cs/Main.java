package ru.vsu.cs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int height = readHeight();
        printShapeOfTriangle(height);
    }

    public static void printShapeOfTriangle(int height) {
        for (int i = 0; i < height; i++) {
            if (i != height - 1) {
                printBodyOfShapeWithoutBottom(i, height);
            } else {
                printShapeBottom(i);
            }
            System.out.println("\\");
        }
    }

    public static int readHeight() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter height of shape: ");
        return scn.nextInt();
    }

    public static void printBodyOfShapeWithoutBottom(int i, int height) {
        for (int j = height - i - 1; j > 0; j--) {
            System.out.print(" ");
        }
        System.out.print("/");
        for (int j = 0; j < i * 2; j++) {
            System.out.print(" ");
        }
    }

    public static void printShapeBottom(int i) {
        System.out.print("/");
        for (int j = 0; j < i * 2; j++) {
            System.out.print("_");
        }
    }
}




