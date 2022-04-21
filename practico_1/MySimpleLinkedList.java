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

    public void insertBack(T info) {
        Node<T> tmp = new Node<T>(info);
        Node<T> last = this.first;
        boolean insert = false;

        if (last == null) this.first = tmp;
        else{
                while (!insert && last != null) {
                    if(last.getNext() == null) {
                        last.setNext(tmp);
                        insert = true;
                    }
                last = last.getNext();
                }
            }
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
    public Node<T> getFirst(){return first;};

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

    public int index_Of (T e){

        Node<T> cur = first;

        if(cur != null){
            int indice = 0;
            while (cur.getNext() != null && cur.getInfo() != e){
                cur = cur.getNext();
                indice ++;
            }
            if(cur.getInfo()==e) return indice;
        }
        return -1;
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
