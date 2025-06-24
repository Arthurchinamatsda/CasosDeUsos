package Service;

import Model.Aluno;

import java.util.Scanner;

public class Service {
    Aluno aluno = new Aluno();
    public void aluno1(){
        Scanner scanNome = new Scanner(System.in);
        System.out.println("Escreva o nome do aluno");
        String nomeAluno = scanNome.nextLine();
        aluno.setNome(nomeAluno);
        String nome = aluno.getNome();



        Scanner scanIdade = new Scanner(System.in);
        System.out.println("Escreva a idade do aluno");
        int idadeAluno = scanIdade.nextInt();
        aluno.setIdade(idadeAluno);
        int idade = aluno.getIdade();


        Scanner scanMatricula = new Scanner(System.in);
        System.out.println("Escreva a matricula do aluno");
        String matriculaAluno = scanMatricula.nextLine();
        aluno.setMatricula(matriculaAluno);
        String matricula = aluno.getMatricula();
        System.out.println("Nome do aluno: " + nome);
        if (idade < 0)System.out.println("A idade do aluno: " + nome + " está invalido");
        else System.out.println("Idade do aluno: " + idade);
        System.out.println("Matricula do aluno: " + matricula);


        System.out.println("qual seu nome, idade e qual a sua matricula?");
        System.out.println("Eu sou o aluno " + nome + " tenho " + idade + " de anos e minha matricula é " + matricula);

    }
}
