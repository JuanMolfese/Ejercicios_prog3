package practico_2.ej4;

public class Seleccion {
    // El tiempo de ejecución del algoritmo de ordenación por selección es del orden O(n2)

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

    /*
        FORMA RECURSIVA NO FUNCIONA BIEN PARA ESTE CASO:new int[]{35,10,3,8,4,6,7,5,9,1,20,29}   ANALIZAR
        public void ordenar(int[] arreglo, int pos) {
        if (pos < arreglo.length) {
            int posMin = buscarPosMinima(arreglo, pos);
            int aux = arreglo[pos];
            arreglo[pos] = arreglo[posMin];
            arreglo[posMin] = aux;
            ordenar(arreglo, pos + 1);
        }
    }

    private int buscarPosMinima(int arr[], int posI){
        int posMin=posI;
        int min = arr[posI];

        for (int i=posI++;i<arr.length;i++){
            if(arr[i] < min){
                posMin=i;
            }
        }
        return posMin;

    }
     */


}}

