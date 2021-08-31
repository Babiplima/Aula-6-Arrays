package br.com.zup;

import java.util.Scanner;

public class Aula6_Exercicio2 {

    public static void main(String[] args) {

        //Enunciando: Faça um programa que leia números inteiros e imprima sua média.

        //Estanciando o método scanner

        Scanner leitor = new Scanner(System.in);

        //Criando variáveis

        int qtnNumeros = 0;
        double soma = 0;
        double media = 0;
        int contador = 1;

        //Pedindo ao usuário que diga quantos números ele deseja a tirar a média

        System.out.println("Por favor, digite a quantidade de números: ");
        qtnNumeros = leitor.nextInt();

        //Criando a estrutura de repetição para somar a quantidade de números inputadas pelo usuário e
        // após ter a média

        while (contador <= qtnNumeros) {
            System.out.println("Digite o número " + contador + " : ");
            int valorDadoPeloUsuario = leitor.nextInt();
            soma = soma + valorDadoPeloUsuario;
            contador++;
            media = soma / valorDadoPeloUsuario;
        }

        //Imprimindo a média

        System.out.println("A média de todos os números é: " + media);
    }
}
