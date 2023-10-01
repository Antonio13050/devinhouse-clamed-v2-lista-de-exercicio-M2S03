package exerc3;

public class Contador {
    public static int contarPalavras(String frase){
        String[] listaDePalavras = frase.split(" ");
        return listaDePalavras.length;
    }
}
//a) Crie uma classe 'Contador'.
//b) Crie um método estático (static) 'contarPalavras' que recebe uma frase (String) como argumento.
//c) Implemente o método imprimindo no console o número de palavras da frase recebida como parâmetro.
//d) Crie um método main em outra classe para testar a implementação.
//Dicas:
//- Usar método split() da String ou classe StringTokenizer.