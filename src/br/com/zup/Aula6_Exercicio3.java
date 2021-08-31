package br.com.zup;

import java.util.Scanner;

public class Aula6_Exercicio3 {

    public static void main(String[] args) {

        //Faça um programa que leia n números inteiros positivos e calcule a soma desses números.

        //Estanciando o método scanner

        Scanner leitor = new Scanner(System.in);

        //Criando variáveis

        int qtnNumeros = 0;
        double soma = 0;
        int contador = 1;
        double numeroNegativo = 0;


        System.out.println("Por favor, digite a quantidade de números: ");
        qtnNumeros = leitor.nextInt();

        //Criando a estrutura de repetição para somar a quantidade de números inputadas pelo usuário


        while (contador <= qtnNumeros) {
            System.out.println("Digite o número " + contador + " : ");
            int valorDadoPeloUsuario = leitor.nextInt();
            if (valorDadoPeloUsuario > 0) {

            } else {
                System.out.println("Valor inválido");

            }

            soma = soma + valorDadoPeloUsuario;
            contador++;
        }

        //Imprimindo a soma

        System.out.println("A soma de todos os números é: " + Math.round(soma));
    }
}
