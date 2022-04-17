package practico_1;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        MySimpleLinkedList<Integer> lista1 = new MySimpleLinkedList<Integer>();
        MySimpleLinkedList<Integer> lista2 = new MySimpleLinkedList<Integer>();

        lista1.insertFront(10);
        lista1.insertFront(9);
        lista1.insertFront(5);
        lista1.insertFront(3);

        lista2.insertFront(15);
        lista2.insertFront(8);
        lista2.insertFront(2);
        lista2.insertFront(1);

        Iterator<Integer> it1 = lista1.iterator();
        Iterator<Integer> it2 = lista2.iterator();


        while (it1.hasNext()) {
            int valor = it1.next();
            System.out.print(valor);
            if (it1.hasNext()) System.out.print(" - ");
            else System.out.println();

        }
        while (it2.hasNext()) {
            int valor = it2.next();
            System.out.print(valor);
            if (it2.hasNext()) System.out.print(" - ");
            else System.out.println();
        }

        MySimpleLinkedList<Integer> list3 = listOrderListsOrdered(lista1, lista2);
        Iterator<Integer> it3 = list3.iterator();
        System.out.print("Valores comunes de las listas: ");
        if(!it3.hasNext()) System.out.println("No hay coincidencias");
        else {
            while (it3.hasNext()) {
                int valor = it3.next();
                System.out.print(valor);
                if (it3.hasNext()) System.out.print(" - ");
                else System.out.println();
            }
        }
    }
    private static MySimpleLinkedList<Integer> listOrderListsOrdered(MySimpleLinkedList<Integer> list1, MySimpleLinkedList<Integer> list2) {

        MyIterator<Integer> it1 = new MyIterator<>(list1.getFirst()) ;
        MyIterator<Integer> it2 = new MyIterator<>(list2.getFirst()) ;
        MySimpleLinkedList<Integer> list = new MySimpleLinkedList<>();

        while (it1.hasNext() && it2.hasNext()) {
            if(it1.getInfo().equals(it2.getInfo())) {
                list.insertFront(it1.getInfo());
                it1.next();
                it2.next();
            }
            else if (it1.getInfo() > it2.getInfo()) {
                it2.next();
            }
            else it1.next();
        }
        return list;
    }

}