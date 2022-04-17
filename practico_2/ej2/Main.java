package practico_2.ej2;
import practico_1.MySimpleLinkedList;
import practico_1.Node;

/*
Implemente un algoritmo recursivo para buscar un elemento en una lista simple.
Implemente, además, un algoritmo recursivo para buscar un elemento en un arreglo ordenado
ascendentemente [1 2 3 …].
1. ¿Qué complejidad O tienen estos algoritmos?
2. ¿En qué afecta la estructura a estos algoritmos?
3. ¿Cambia algo que la estructura esté ordenada?
 */

public class Main {

    public static void main(String[] args) {
        //Parte 1
        MySimpleLinkedList<Integer> list = new MySimpleLinkedList<>();
        Integer e = 4;

        list.insertFront(8);
        list.insertFront(5);
        list.insertFront(3);
        list.insertFront(2);
        list.insertFront(1);

        System.out.println("El elemento " + e + " esta en la posicion : " + buscar_elem(list.getFirst(), e, 0));

        //Parte 2
        int[] array;
        array = new int[10];
        Integer e2=12;

        for (int i =0; i < array.length; i++){
            array[i]= i+3;
        }
        System.out.println("El elemento " + e2 + " esta en la posicion : " + buscar_elem_array(array, e2, 0));

    }
    private static int buscar_elem(Node n, Integer e, Integer indice) {
        if (n == null) return -1;
        if (n.getInfo() == e) return indice;
        else return buscar_elem(n.getNext(), e, indice + 1);
    }

    private static int buscar_elem_array(int[] a, Integer e, Integer indice){
        if (indice == a.length) return -1;
        if (a[indice]==e) return indice;
        else return buscar_elem_array(a, e, indice+1);
    }

}