package Service;

import Model.Aluno;
import Model.Funcionario;

public class Service {
    Aluno aluno = new Aluno();
    Funcionario funcionario = new Funcionario();
    public String Aluno(){
        aluno.setNome("João");
        aluno.setIdade(16);
        aluno.setMatricula("12412412");
        String matricula = aluno.getMatricula();
        int idade = aluno.getIdade();
        if (idade<0)return "erro";
        String nome = aluno.getNome();
        System.out.println("===RELATORIO ALUNO===");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Matricula: " + matricula);
        return " ";
    }
    public String Funcionario(){
        funcionario.setNome("Sonia");
        funcionario.setIdade(51);
        funcionario.setSalario(2000.0);
        double salario = funcionario.getSalario();
        if (salario != salario) return "invalido";
        int idade = funcionario.getIdade();
        if (idade<0)return "erro";
        String nome = funcionario.getNome();
        System.out.println("===RELATORIO FUNCIONARIO");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salario: " + salario);
        return " ";
    }
    public void apresentar() {
        String oi = "oi";
        String tchau = "tchau";
        System.out.println(oi);
        System.out.println(oi);
        System.out.println(tchau);
        System.out.println(tchau);
    }
}
