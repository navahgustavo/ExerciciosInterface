package com.mycompany.exercicio1;

/**
 *
 * @author Gustavo H. Nava
 */
public class Exercicio1 {

    public static void main(String[] args) {
        
        Desenhavel forma = new Circulo();
        forma.desenhar();
        forma = new Retangulo();
        forma.desenhar();
        forma = new Triângulo();
        forma.desenhar();
        
    }
}
