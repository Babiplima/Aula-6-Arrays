package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Exercio1 {
    //Criando as variáveis

    public static void main(String[] args) {

        List<Integer> todosOsNumeros = new ArrayList<>();
        List<Integer> numerosPares = new ArrayList<>();
        List<Integer> numerosImpares = new ArrayList<>();

        //Adicionando os números na lista

        todosOsNumeros.add(70);
        todosOsNumeros.add(5);
        todosOsNumeros.add(8);
        todosOsNumeros.add(10);

        //Criando a condição para o programa apresentar o que for determinado

        for (Integer referencia : todosOsNumeros) {
            if (referencia % 2 == 0) {
                numerosPares.add(referencia);
            } else {
                numerosImpares.add(referencia);
            }
        }

        // Imprimindo os números e números pares e números impares

        System.out.println("Lista de números: ");
        System.out.println(todosOsNumeros);
        System.out.println("Números impares: ");
        System.out.println(numerosImpares);
        System.out.println("Números pares: ");
        System.out.println(numerosPares);
    }
}
