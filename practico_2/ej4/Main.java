package practico_2.ej4;
//Implemente un algoritmo de ordenamiento por selección en un arreglo.
//Implemente un algoritmo de ordenamiento por burbujeo en un arreglo.
// 1. ¿Qué complejidad O tienen estos algoritmos?

public class Main {
    public static void main(String[] args) {

        Burbujeo b = new Burbujeo();
        Burbujeo b_2 = new Burbujeo();
        Seleccion s = new Seleccion();
        Seleccion s_2 = new Seleccion();
        int[] arreglo1 = new int[]{ 2,10,3,8,4,6,7,5,9,1,20,17 };
        int[] arreglo2 = new int[]{ 1,3,4,5,6,7,8,9,10 };
        int[] arreglo3 = new int[]{2,10,3,8,4,6,7,5,9,1,20,18};
        int[] arreglo4 = new int[]{35,10,3,8,4,6,7,5,9,1,20,29};

        b.ordenar(arreglo1);
        b_2.ordenar(arreglo2);
        s.ordenar(arreglo3);
        s_2.ordenar(arreglo4);

        System.out.println("Ordenado por burbujeo: Arreglo 1");
        for (int i:arreglo1){
            System.out.print(" "+i);
        }
        System.out.println("");
        System.out.println("Ordenado por burbujeo: Arreglo 2");
        for (int i:arreglo2){
            System.out.print(" "+i);
        }
        System.out.println("");
        System.out.println("Ordenado por seleccion: Arreglo 3");
        for (int i:arreglo3){
            System.out.print(" "+i);
        }
        System.out.println("");
        System.out.println("Ordenado por seleccion: Arreglo 4");
        for (int i:arreglo4){
            System.out.print(" "+i);
        }




    }
}
