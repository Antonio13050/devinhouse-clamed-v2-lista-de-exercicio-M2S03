package exerc4;

import exerc3.Contador;

import java.util.SplittableRandom;

public class Contador2 {
    private String frase;

    public Contador2(String frase) {
        this.frase = frase;
    }

    public int contarPalavras(){
        String[] listaDePalavras = this.frase.split(" ");
        return listaDePalavras.length;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }
}
//a) Crie uma classe 'Contador2'.
//b) Crie um atributo privado 'frase' (String) nesta classe.
//c) Implemente um construtor que receba uma frase como parâmetro, e inicialize o atributo criado com esta frase.
//d) Implemente um método (não static desta vez) 'contarPalavras' que retorna a quantidade de palavras da frase indicada no atributo da classe.
//e) Crie um método main em outra classe para testar a implementação.
//Dicas:
//- Usar método split() da String ou classe StringTokenizer.