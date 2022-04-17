package practico_1;
//EJ 3
public class Pila<T> {

    public MySimpleLinkedList<T> list;

    public Pila(){
        list = null;
    }

    public void push(T info){
        list.insertFront(info);
    }

    public T pop(){
        return list.extractFront();
    }

    public T top(){
        return list.get(0);
    }


    public void reverse(){
        T act = null;
        if (! list.isEmpty()){
            MySimpleLinkedList<T> inversa = new MySimpleLinkedList<T>();
            while ( ! list.isEmpty()){
                act = list.extractFront();
                inversa.insertFront(act);
            }
        }
    }
}