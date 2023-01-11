package edu.tarik.primeirasemana;

import java.util.Scanner;

public class Ex03_MaiorEMedia {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Insira um valor:");
    double value = scan.nextDouble();
    double sum = 0, average, greater = value;
    int count = 0;

    while (count != 4) {
      System.out.println("Insira um valor:");
      value = scan.nextDouble();
      if (value > greater)
        greater = value;
      sum += value;
      count++;
    }
    average = sum / 5;
    System.out.println("A média é " + average);
    System.out.println("O maior valor é " + greater);
  }
}
