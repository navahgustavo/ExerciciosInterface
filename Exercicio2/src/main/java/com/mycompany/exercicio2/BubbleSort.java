package com.mycompany.exercicio2;

/**
 *
 * @author Gustavo H. Nava
 */
public class BubbleSort implements Ordenavel{

    @Override
    public void ordenar(int[] array) {
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < (array.length - 1); j++) {
                if (array[j] > array[j+1]) {
                    int guardaValor = array[j];
                    array[j] = array[j+1];
                    array[j+1] = guardaValor;
                }
            }
        }
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }
}
