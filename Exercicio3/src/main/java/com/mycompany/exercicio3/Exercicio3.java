package com.mycompany.exercicio3;

import java.util.Scanner;

/**
 * @author Gustavo H. Nava
 * 
 * Crie uma interface chamada Armazenavel com dois métodos: salvar() e carregar().
 * Em seguida, implemente essa interface em uma classe chamada ArquivoCache que salva e carrega dados de um arquivo no sistema de arquivos.
 */
public class Exercicio3 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArquivoCache arquivo = new ArquivoCache();
        
        System.out.println("Escreva algo para salvar: ");
        String lerTexto = ler.nextLine();
        
        arquivo.salvar(lerTexto);
        System.out.println(arquivo.carregar());
    }
}
