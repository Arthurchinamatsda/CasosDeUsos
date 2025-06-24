package Service;

import Model.Funcionario;

public class Service {
    //metodos auxiliares
    Funcionario funcionario = new Funcionario();
    double salario = 10000.0;

    public double aumentoDoSalario(){
        double salarioInicial = correcaoDoSalario();
        double aumento = 1000.0;
        double salaroioComAumeto = salarioInicial + aumento;
        return salaroioComAumeto;
    }
    public double salarioPretendido(){
        funcionario.setSalario(12000.0);
        double salarioPretendiodo = funcionario.getSalario();
        return salarioPretendiodo;
    }
    public double correcaoDoSalario(){
        double salarioPretendiodoVariavel = salarioPretendido();
        if(salarioPretendiodoVariavel != salario){
            double salarioCorrigido = 10000.0;
            funcionario.setSalario(salarioCorrigido);
            double salarioFinal = funcionario.getSalario();
            return salarioFinal;
        }
        return 401.0;
    }
}
