package edu.tarik.primeirasemana;

import java.util.Scanner;

public class Ex02_Nota {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int value;

    do {
      System.out.println("Insira uma nota entre 0 e 10: ");
      value = scan.nextInt();
    } while (value > 10 || value < 0);
  }
}
