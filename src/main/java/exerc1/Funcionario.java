package exerc1;

import java.text.DecimalFormat;

public class Funcionario {

    private String nome;
    private Long cpf;
    private double salario;

    private DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

    public Funcionario() {
    }

    public Funcionario(String nome, Long cpf, Double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String promover(float percentual){
        this.salario *= (1 + (percentual/100));
        return "Novo salário: R$ " + decimalFormat.format(this.salario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                ", salario=" + decimalFormat.format(this.salario) +
                '}';
    }
}