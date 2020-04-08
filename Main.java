package com.codewithme;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        final short VND=23000;
        double USA;

        System.out.println("nhap so tien USA ban muon doi:");
        USA=scanner.nextLong();

        double exchange=VND*USA;
        System.out.println("so tien cua ban la: "+exchange+" VND");


    }
}
