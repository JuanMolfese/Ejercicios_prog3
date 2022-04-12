package practico_1;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        MySimpleLinkedList<Integer> lista = new MySimpleLinkedList<Integer>();

        lista.insertFront(3);
        lista.insertFront(2);
        lista.insertFront(1);
        lista.insertFront(10);

        Iterator<Integer> it1 = lista.iterator();

        while(it1.hasNext()) {
            int valor = it1.next();
            System.out.print(valor +" - ");
        }

    }

}