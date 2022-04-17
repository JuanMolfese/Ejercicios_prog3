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

        MySimpleLinkedList<Integer> list = new MySimpleLinkedList<>();
        Integer e = 4;

        list.insertFront(8);
        list.insertFront(5);
        list.insertFront(3);
        list.insertFront(2);
        list.insertFront(1);

        System.out.println("El elemento " + e + " esta en la posicion : " + buscar_elem(list.getFirst(), e, 0));
    }
    private static int buscar_elem(Node n, Integer e, Integer indice) {
        if (n == null) return -1;
        if (n.getInfo() == e) return indice;
        else return buscar_elem(n.getNext(), e, indice + 1);
    }
}