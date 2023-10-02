package exerc5;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) throws IOException {

        String caminho = "C:\\DEVinHouse\\Modulo-2\\Semana-3\\devinhouse-clamed-v2-lista-de-exercicio-M2S03\\src\\main\\java\\exerc5\\megasena.txt";

        ArrayList<Concurso> concursos = new ArrayList<>();

        Path path = FileSystems.getDefault().getPath(caminho);
        List<String> linhas = Files.readAllLines(path);

        for (String linha : linhas) {
            String[] pedacoLinha = linha.split(",");
            Integer numeroSorteio = Integer.valueOf(pedacoLinha[0]);
            String dataStr = pedacoLinha[1];
            DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate data = LocalDate.parse(dataStr, formatador);
            int[] numeros = new int[6];

            for(int i=0; i<=5; i++) {
                String n = pedacoLinha[i+2];
                numeros[i] = Integer.parseInt(n);
            }

            Concurso concurso = new Concurso(numeroSorteio, data, numeros);
            concursos.add(concurso);


        }
        concursos.forEach(c -> System.out.println(c));

    }
}
