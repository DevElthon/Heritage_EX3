public class Estagiario extends Estudante implements Funcionario{
    String curso, nome;
    int horasTrabalhoSemana;

    public Estagiario(int horasTrabalhoSemana, String curso, String nome){
        this.horasTrabalhoSemana = horasTrabalhoSemana;
        this.curso = curso;
        this.nome = nome;
    }

    @Override
    int horasDedicacao() {
        return horasTrabalhoSemana;
    }

    @Override
    public double calcularSalario() {
        return this.horasTrabalhoSemana *  10;
    }

    public String getCurso() {
        return curso;
    }

    public String getNome() {
        return nome;
    }
}
