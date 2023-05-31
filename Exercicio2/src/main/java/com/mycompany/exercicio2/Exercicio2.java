package com.mycompany.exercicio2;

/**
 *
 * @author Gustavo H. Nava
 */
public class Exercicio2 {

    public static void main(String[] args) {
        
        int[] array = {10, 20, 66, 98, 54, 33, 25, 21, 1, 9, 75};
        Ordenavel ordenaArray = new BubbleSort();
        ordenaArray.ordenar(array);
    }
}
