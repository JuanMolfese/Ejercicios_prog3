package practico_2.ej5;

import java.util.ArrayList;

//Ejercicio 5.
//Implemente un algoritmo de ordenamiento mergesort para un arreglo de tamaño N.
//Implemente un algoritmo de ordenamiento quicksort para un arreglo de tamaño N.
//1. ¿Cuál es su complejidad en el peor caso?
//2. ¿Cuál es su complejidad promedio?
public class Main {
    public static void main(String[] args) {

        int[] arreglo = new int[]{7, 8, 2, 90, 76, 1, 5};
        MergeSort m = new MergeSort();
            m.sort(arreglo);
            for (int i:arreglo) System.out.print(i +" ");

        System.out.println(" ");

        int[] arreglo2 = new int[]{7, 65, 2, 20, 76, 1, 355};
        Quicksort q = new Quicksort();
            q.quickSort(arreglo2);
            for (int j:arreglo2) System.out.print(j +" ");

    }
}
