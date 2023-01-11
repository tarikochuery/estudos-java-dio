package edu.tarik.primeirasemana;

import java.util.Scanner;

public class Ex01_NomeIdade {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    String nome;
    int idade;

    do {
      System.out.println("Insira o nome:");
      nome = scan.next();
      if (nome.equals("0"))
        break;
      System.out.println("Insira a idade");
      idade = scan.nextInt();
    } while (!nome.equals("0"));

  }
}
