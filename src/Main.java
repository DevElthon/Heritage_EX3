import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        List<Funcionario> funcionarios = new ArrayList<>();
        Estagiario kleber = new Estagiario(40, "Computacao", "Kleber");
        Estagiario Maria = new Estagiario(40, "ADS", "Maria");
        Supervisor Jorge = new Supervisor(4, 4357, "Jorge");

        funcionarios.add(kleber);
        funcionarios.add(Maria);
        funcionarios.add(Jorge);

        //loop
        for(Funcionario funcionario : funcionarios){
            //verifica se é estagiário
            if(funcionario instanceof Estagiario){
                Estagiario estagiario = (Estagiario) funcionario;
                System.out.printf("Nome: %s | Salario: %.2f\n", estagiario.getNome(), estagiario.calcularSalario());
            }
            //verifica se é supervisor
            if(funcionario instanceof Supervisor){
                Supervisor supervisor = (Supervisor) funcionario;
                System.out.printf("Nome: %s | Salario: %.2f\n", supervisor.getNome(), supervisor.calcularSalario());
            }
        }
    }
}