package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Exercio1 {
    public static void main(String[] args) {
        List<Integer> todosOsNumeros = new ArrayList<>();
        List<Integer> numerosPares = new ArrayList<>();
        List<Integer> numerosImpares = new ArrayList<>();

        todosOsNumeros.add(70);
        todosOsNumeros.add(5);
        todosOsNumeros.add(8);
        todosOsNumeros.add(10);

        for (Integer referencia:todosOsNumeros){
            if (referencia % 2 ==0 ){
                numerosPares.add(referencia);
            }else{
                numerosImpares.add(referencia);
            }
        }
        System.out.println("Lista de números: ");
        System.out.println(todosOsNumeros);
        System.out.println("Números impares: ");
        System.out.println(numerosImpares);
        System.out.println("Números pares: ");
        System.out.println(numerosPares);
    }
}
