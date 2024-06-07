package com.mext.Examples_Java;

import java.util.Scanner;

public class Examples_13 {
    //Kullanıcının girdiği metinde belirli bir kelimenin yerine başka bir kelime koyun.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Değiştirilecek sözcük gir:");
        String eskiSözcük = scanner.nextLine();
        System.out.println("yeni sözcük gir: ");
        String değişSözcük = scanner.nextLine();
        String yeniCümle = eskiSözcük.replace(eskiSözcük, değişSözcük);
        System.out.println("yeni cümle:"+yeniCümle);
    }
}
