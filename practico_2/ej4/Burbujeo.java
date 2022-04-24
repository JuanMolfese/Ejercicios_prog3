package practico_2.ej4;
//metodo burbujeo adaptativo. controla que en la primer pasada ya este ordenado.

public class Burbujeo {
    public void ordenar(int[] arreglo) {
        boolean intercambiado = true;
        int j = 0;
        int tmp;
        while (intercambiado) {
            intercambiado = false;
            j++;
            for (int i = 0; i < arreglo.length - j; i++) {
                if (arreglo[i] > arreglo[i + 1]) {
                    tmp = arreglo[i];
                    arreglo[i] = arreglo[i + 1];
                    arreglo[i + 1] = tmp;
                    intercambiado = true;
                }
            }
        }
    }
}
