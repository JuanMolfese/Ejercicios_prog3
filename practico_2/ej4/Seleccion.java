package practico_2.ej4;

public class Seleccion {

    public Seleccion(int[]arreglo){

    }

    public void ordenar(int arreglo[]) {
        int i, j, menor, pos, tmp;
        for (i = 0; i < arreglo.length - 1; i++) {      // tomamos como menor el primero
            menor = arreglo[i];                       // de los elementos que quedan por ordenar
            pos = i;                            // y guardamos su posición
            for (j = i + 1; j < arreglo.length; j++){ // buscamos en el resto
                if (arreglo[j] < menor) {           // del array algún elemento
                    menor = arreglo[j];             // menor que el actual
                    pos = j;
                }
            }
            if (pos != i){                      // si hay alguno menor se intercambia
                tmp = arreglo[i];
                arreglo[i] = arreglo[pos];
                arreglo[pos] = tmp;
            }
        }
        for (int r = 0; r < arreglo.length; r++) {
            System.out.print(arreglo[r] + "  ");
        }
        System.out.println("");
    }
    // El tiempo de ejecución del algoritmo de ordenación por selección es del orden O(n2)
}
