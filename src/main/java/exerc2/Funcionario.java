package exerc2;

import com.sun.jdi.FloatValue;

public class Funcionario {
    private String nome;
    private float salario;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public Funcionario(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public float aumentar(float valor){
        return this.salario += valor;
    }

    public float aumentar(float valor, float comissao){
        return this.salario += (valor + comissao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}