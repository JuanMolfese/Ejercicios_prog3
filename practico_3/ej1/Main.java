package practico_3.ej1;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        GrafoDirigido estructura = new GrafoDirigido<>();
        estructura.agregarVertice(1);
        estructura.agregarVertice(2);
        estructura.agregarVertice(5);
        estructura.agregarVertice(10);
        estructura.agregarArco(1,5,100);
        estructura.agregarArco(1,2,50);
        estructura.agregarArco(2,10,150);
        estructura.agregarArco(5,2,300);

        Iterator<Arco> it = estructura.obtenerArcos(1);
        System.out.println("Los adyacentes del vertice 1 son :");
        while (it.hasNext())
            System.out.print(it.next().getVerticeDestino()+" ");
        System.out.print("\n");

        int verticeBuscado = 11;
        System.out.println("El vertice con id "+verticeBuscado+" esta en el grafo ? : "+estructura.contieneVertice(verticeBuscado));

        System.out.println("Cantidad de arcos presentes en el grafo: " + estructura.cantidadArcos());
    }
}
