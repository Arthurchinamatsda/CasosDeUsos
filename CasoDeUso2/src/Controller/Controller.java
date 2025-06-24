package Controller;

import Model.Funcionario;
import Service.Service;

public class Controller {
    Funcionario funcionario = new Funcionario();
    Service service = new Service();
    public void contratacaoDoFuncionario(){
        //vai tudo ja definidinho... preguça de tratar exeções...
        funcionario.setNome("Carlos");
        String nome = funcionario.getNome();
        funcionario.setIdade(20);
        int idade = funcionario.getIdade();
        double salarioPretendiodoVariavel = service.salarioPretendido();
        System.out.println("Olá meu nome é " + nome + ", tenho " + idade + " anos e pretendo ter o salario de " + salarioPretendiodoVariavel);
        double salarioCorrigido = service.correcaoDoSalario();
        if(salarioPretendiodoVariavel > salarioCorrigido)System.out.println("O salario pretendido é: " + salarioPretendiodoVariavel + ", mas esse salario esta muito alto.");
        System.out.println("O seu salario vai ser: " + salarioCorrigido);
        System.out.println("Parabens pelo seu serviço, estamos munto feliz com o seu desempenho na empresa. Como gratidão vamos te dar um aumento de R$:1000,00");
        double salaroioComAumeto = service.aumentoDoSalario();
        System.out.println("Seu salario agora vai ser: " + salaroioComAumeto);


        //fala do funcionario
        System.out.println("Muito obrigado pelo aumento");
    }
}
