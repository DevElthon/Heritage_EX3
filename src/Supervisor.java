public class Supervisor implements Funcionario{
    int qtdSupervisionados;
    String nome;
    double salarioBase;

    public Supervisor(int qtdSupervisionados, double salarioBase, String nome){
        this.qtdSupervisionados = qtdSupervisionados;
        this.salarioBase = salarioBase;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public double calcularSalario() {
        return salarioBase * qtdSupervisionados;
    }
}
