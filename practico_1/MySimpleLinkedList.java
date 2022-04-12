package practico_1;

import java.util.Iterator;
public class MySimpleLinkedList<T> implements Iterable<T> {

    private Node<T> first;
    private int size;

    public MySimpleLinkedList() {
        this.first = null;
    }

    public void insertFront(T info) {
        Node<T> tmp = new Node<T>(info,null);
        tmp.setNext(this.first);
        this.first = tmp;
        this.size++;
    }

    public T extractFront() {
        if(this.first != null){
            Node<T> tmp = this.first;
            first = first.getNext();
            this.size --;
            return tmp.getInfo();
        }
        return null;
    }

    public boolean isEmpty() {
        return (this.size == 0);
    }

    public T get(int index) {
        if(index>= 0 && index < size){
            Integer cont = 0;
            Node<T> actual = this.first;
            while (actual != null && cont < index){
                actual = actual.getNext();
                cont ++;
            }
            return actual.getInfo();
        }
        return null;
    }

    public int size() {
        return this.size;
    }



    @Override
    public String toString() {
        Node<T> tmp = first;
        String s = "";
        while (tmp != null){
            s += tmp.getInfo();
            if (tmp.getNext() != null){
                s += ", ";
            }
            tmp = tmp.getNext();
        }
        return s;

    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator<T>(this.first);
    }

}
