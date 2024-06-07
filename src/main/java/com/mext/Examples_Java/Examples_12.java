package com.mext.Examples_Java;

import java.util.Scanner;

public class Examples_12 {
    //Kullanıcının girdiği iki metni birleştirip ekrana yazdırın.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" İlk metni gir");
        String ilkMetin = scanner.nextLine();
        System.out.println("İkinci metni gir");
        String ikincimetin = scanner.nextLine();

        System.out.println("metinleri birleştir: " +ilkMetin.concat(", " +ikincimetin));
    }
}
