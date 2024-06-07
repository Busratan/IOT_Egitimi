package com.mext.Examples_Java;

import java.util.Scanner;

public class Examples_14 {
    //Kullanıcının girdiği metindeki tüm boşlukları kaldırın.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Metni gir");
        String metin = scanner.nextLine();
        System.out.println(metin.replace(" ", ""));
    }
}
