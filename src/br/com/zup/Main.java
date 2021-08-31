package br.com.zup;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    List<String> alunos = new ArrayList<>();
    //List<Integer> notas = new ArrayList<>();

    alunos.add("André");
    alunos.add("Bárbara");
    alunos.add("Paulo");
    alunos.remove("Paulo");
    System.out.println(alunos.get(1));
    System.out.printf("O aluno da posição 1 é %s",alunos.get(2));
    }
}
