package practico_2.ej4;
//Implemente un algoritmo de ordenamiento por selección en un arreglo.
//Implemente un algoritmo de ordenamiento por burbujeo en un arreglo.
// 1. ¿Qué complejidad O tienen estos algoritmos?

public class Main {
    public static void main(String[] args) {

        int[] arreglo = new int[]{ 2,10,3,8,4,6,7,5,9,1,20,17 };
        int[] arreglo2 = new int[]{ 1,3,4,5,6,7,8,9,10 };
        Burbujeo b = new Burbujeo(arreglo);
        Burbujeo b_2 = new Burbujeo(arreglo2);
        b.ordenar(arreglo);
        b_2.ordenar(arreglo2);
    }
}
