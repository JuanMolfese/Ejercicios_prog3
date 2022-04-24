package practico_2.ej5;

public class Quicksort {

    public void quickSort(int[] arr){
        quickSort(arr,0,arr.length-1);
    }
    private void quickSort(int[] arr,int low,int high){
        int i,j,temp,t;
        if(low>high){
            return;
        }
        i=low;
        j=high;
        // temp es la referencia
        temp = arr[low];

        while (i<j) {
            // Desde la derecha primero, luego disminuya hacia la izquierda
            while (temp<=arr[j]&&i<j) {
                j--;
            }
            // Desde la izquierda, aumentar a la derecha
            while (temp>=arr[i]&&i<j) {
                i++;
            }
            // Intercambiar si se cumplen las condiciones
            if (i<j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }

        }
        // Finalmente, intercambie la referencia a los números iguales a i y j
        arr[low] = arr[i];
        arr[i] = temp;
        // Llama recursivamente a la media matriz izquierda
        quickSort(arr, low, j-1);
        // Llama recursivamente a la media matriz derecha
        quickSort(arr, j+1, high);
    }

}
