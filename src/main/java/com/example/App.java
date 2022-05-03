package com.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        
        int soma = a + b;
       
        System.out.println("SOMA = " + soma);

    }

    public static int soma(int a, int b) {
        
        int soma = a + b;
    
        return soma;
      }
}