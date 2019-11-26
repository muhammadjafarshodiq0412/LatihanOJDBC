/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.regex.Pattern;

/**
 *
 * @author ASUS
 */
public class NewClass {
    
    public static void main(String[] args) {
//        int n = 0;
//        
//        if (n >= 1 && n <= 9) {
//            for (int i = 1; i <= n; i++) {
//
//                for (int j = 1; j <= n; j++) {
//                    if (j == n) {
//                        System.out.print("Hop!");
//                    } else {
//                        System.out.print(j);
//                    }
//                    System.out.print(" ");
//                }
//            }
//        } else if (n >= 10 && n <= 20) {
//            System.out.println("Apa ?");
//        } else {
//            System.out.println("Inputan tidak boleh lebih dari angka 20");
//        }

String text= "Belajar Java di okedroid.com";
String Regex = ".*okedroid.*";
boolean isCocok= Pattern.matches(Regex, text);

        System.out.println("Apakah ada kata adroid : "+isCocok);
    }
}
