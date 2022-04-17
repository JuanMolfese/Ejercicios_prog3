package practico_1;

import java.util.Iterator;

//ej 5
public class MyIterator<T> implements Iterator<T> {

    private Node<T> cursor;

    public MyIterator(Node<T> firstDeLaLista) {
        cursor = firstDeLaLista;
    }

    public T getInfo(){
        return cursor.getInfo();
    }

    @Override
    public boolean hasNext() {
        return cursor != null;
    }

    @Override
    public T next() {
        T info = cursor.getInfo();
        cursor = cursor.getNext();
        return info;
    }

}