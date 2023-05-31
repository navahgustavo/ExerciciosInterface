package com.mycompany.exercicio3;

import java.io.*;
/**
 *
 * @author Gustavo H. Nava
 */
public class ArquivoCache implements Armazenavel{

    File arquivoTxt = new File("arquivoTeste.txt");
    
    @Override
    public void salvar(String texto) {
        if (!arquivoTxt.exists()) {
            try {    
                arquivoTxt.createNewFile();
            } catch (IOException ex) {
                System.out.println("Erro ao criar o arquivo");
            }
        }
        
        try {
            FileOutputStream salvarArquivo = new FileOutputStream(arquivoTxt, true);
            OutputStreamWriter salvarArquivoUtf8 = new OutputStreamWriter(salvarArquivo,"UTF-8");
            BufferedWriter bufferSalva = new BufferedWriter(salvarArquivoUtf8);
            
            bufferSalva.newLine();
            bufferSalva.write(texto);
            
            bufferSalva.close();
            salvarArquivo.close();
            System.out.println("Arquivo salvo.");
        } catch (IOException ex) {
            System.out.println("Erro ao salvar.");
        }
    }

    @Override
    public String carregar() {
        StringBuilder escreverArquivo = new StringBuilder();
        
        try {
            FileInputStream carregarArquivo = new FileInputStream(arquivoTxt);
            InputStreamReader carregaArquivoUtf8 = new InputStreamReader(carregarArquivo,"UTF-8");
            BufferedReader bufferCarrega = new BufferedReader(carregaArquivoUtf8);
            String linha;
        
            while ((linha = bufferCarrega.readLine()) != null) {
                escreverArquivo.append(linha);
                escreverArquivo.append("\n");
            }
            
            bufferCarrega.close();
            carregarArquivo.close();
        } catch (IOException ex) {
            System.out.println("Erro ao carregar.");;
        }
        
        return escreverArquivo.toString();
    }
}
