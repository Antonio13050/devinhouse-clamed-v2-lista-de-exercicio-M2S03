package exerc1;

public class TestaFuncionario {
    public static void main(String[] args) {

        var funcionario = new Funcionario();
        System.out.println(funcionario);

        funcionario.setCpf(123465L);
        funcionario.setNome("Teste");
        funcionario.setSalario(1000.00);

        System.out.println(funcionario);
        System.out.println(funcionario.promover(20));

        System.out.println(funcionario);
    }
}
