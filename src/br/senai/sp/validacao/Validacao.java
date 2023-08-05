package br.senai.sp.validacao;

import java.util.Scanner;

public class Validacao {

    public static void main(String[] args) {
        /**Import Scanner */
        Scanner teclado = new Scanner(System.in);

        System.out.println("Olá, Qual seu nome:  ");
        String nome = teclado.nextLine();
        System.out.println("Digite um numero: ");


        System.out.println("Bem Vindo(a) " + nome + " Qual é sua idade: ");
        System.out.println("Por favor não minta!!!");

        boolean valida = false;
        while (!valida) {
            System.out.println("informe um numero: ");
            if (teclado.hasNext()) {
                int idade = teclado.nextInt();
                valida = true;

                if (idade % 2 == 0) {
                    System.out.println("esse numero é par");
                } else {
                    System.out.println("impar!");
                }
            } else {
                System.out.println("digite um numero inteiro");
                teclado.nextLine();
            }
        }
    }

}
