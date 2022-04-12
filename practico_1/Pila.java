package practico_1;

public class Pila<T> extends MySimpleLinkedList<T>{

    private MySimpleLinkedList list;

    public Pila(){
        this.list = null;
    }

    public void push(T info){
        this.list.insertFront(info);
    }

    public T pop(){
        return (T) this.list.extractFront();
    }

    public T top(){
        return (T) this.list.get(0);
    }


    public void reverse(){
        T act = null;
        if (! this.list.isEmpty()){
            MySimpleLinkedList<T> inversa = new MySimpleLinkedList<T>();
            while ( ! this.list.isEmpty()){
                act = (T) this.list.extractFront();
                inversa.insertFront(act);
            }
        }
    }
}