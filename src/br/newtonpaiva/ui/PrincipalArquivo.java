package br.newtonpaiva.ui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import br.newtonpaiva.dominio.ManipuladorArquivo;

public class PrincipalArquivo {
    public static void main(String[] args) throws IOException {
        String path1 = "C:/Users/12118262/Documents/ArquivoNomes.txt";
        String path2 = "C:/Users/12118262/Documents/ArquivoSobrenomes.txt";
        String path3 = "C:/Users/12118262/Documents/ArquivoNomesCompletos.txt";

        String[] nomes = ManipuladorArquivo.lerArquivo(path1);
        System.out.println("\n");
        String[] sobrenomes = ManipuladorArquivo.lerArquivo(path2);

        BufferedWriter writer = new BufferedWriter(new FileWriter(path3));
        for (int i = 0; i < nomes.length; i++) {
            writer.write(nomes[i] + " " + sobrenomes[i] + "\n");
        }
        writer.close();
    }
}
