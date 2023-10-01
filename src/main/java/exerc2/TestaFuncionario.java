package exerc2;

public class TestaFuncionario {
    public static void main(String[] args) {
        var funcionario1 = new Funcionario("Funcionario 1");
        var funcionario2 = new Funcionario("Funcionario 2", 1000.00F);

        System.out.println(funcionario1);
        System.out.println(funcionario2);

        funcionario1.aumentar(1000F);
        funcionario2.aumentar(1000F, 200F);

        System.out.println(funcionario1);
        System.out.println(funcionario2);

    }
}
