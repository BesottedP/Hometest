package com.company;

public class Main {
    public static void main(String[] args) {

        Ten();
        Five();
        Space();
        Ten();
        Five();
        Ten();
        Space();
        Three();
        Ten();
        Five();

    }

    public static void Ten() {
        System.out.println();
        System.out.println("*****");
        System.out.println("*****");

    }
    public static void Five() {
        System.out.println(" * * ");
        System.out.println("  *  ");
        System.out.print(" * * ");
    }
    public static void Three() {
        System.out.println("  *  ");
        System.out.println("  *  ");
        System.out.print("  *  ");
    }
    public static void Space(){
        System.out.println(" ");
    }
}
