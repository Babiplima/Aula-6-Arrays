package br.com.zup;

import java.util.Scanner;

public class Aula6_Exercicio1 {

    public static void main(String[] args) {

        //Escreva um programa que escreva na tela, de 1 até 100, de 1 em 1, 2 vezes.
        // A primeira vez com "for" e a segunda com "while".

        //Variável Contador
        int contador = 0;

        //Criando a estrutura de repetição com while

        while (contador <= 100) {
            System.out.println(contador);
            contador++;

        }
        //Criando a estrutura de repetição com for

        for (int cont = 0; cont <= 100; cont++)
        {
            System.out.println(cont);
        }
    }
}

