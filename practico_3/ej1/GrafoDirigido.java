package practico_3.ej1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class GrafoDirigido<T> implements Grafo<T> {

    private HashMap<Integer, ArrayList<Arco>> grafo;

    public GrafoDirigido(){
         grafo = new HashMap<>();
    }

    @Override
    public void agregarVertice(int verticeId) {
        if(! grafo.containsKey(verticeId)) {
            grafo.put(verticeId, new ArrayList<Arco>());
        }
    }

    @Override
    public void borrarVertice(int verticeId) {
        for(int i : grafo.keySet()){
            for(int j=0 ; j< grafo.get(i).size(); j++){
                if(grafo.get(i).get(j).getVerticeDestino() == verticeId)
                    grafo.get(i).remove(j);
            }
        }
        grafo.remove(verticeId);
    }

    @Override
    public void agregarArco(int verticeId1, int verticeId2, T etiqueta) {
        if(grafo.containsKey(verticeId1) && grafo.containsKey(verticeId2))
            grafo.get(verticeId1).add(new Arco<>(verticeId1,verticeId2, etiqueta));
    }

    @Override
    public void borrarArco(int verticeId1, int verticeId2) {
        if(grafo.containsKey(verticeId1)){
            for(int i =0; i < grafo.get(verticeId1).size(); i++){
                if(grafo.get(verticeId1).get(i).getVerticeDestino() == verticeId2)
                    grafo.get(verticeId1).remove(i);
            }
        }
        else System.out.println("El vertice origen no se encuentra presente en el grafo");
    }

    @Override
    public boolean contieneVertice(int verticeId) {
        if(! grafo.isEmpty())
            return grafo.containsKey(verticeId);
        else return false;
    }

    @Override
    public boolean existeArco(int verticeId1, int verticeId2) {
        if ((!grafo.isEmpty()) && (grafo.containsKey(verticeId1))) {
            for (int i = 0; i < grafo.get(verticeId1).size(); i++) {
                if (grafo.get(verticeId1).get(i).getVerticeDestino() == verticeId2)
                    return true;
            }
            return false;
        } else return false;
    }

    @Override
    public Arco<T> obtenerArco(int verticeId1, int verticeId2) {
        // WHAAAAAAAAAAAAAAAAAAT ????
        return null;
    }

    @Override
    public int cantidadVertices() {
        return grafo.size();
    }

    @Override
    public int cantidadArcos() {
        int contador = 0;
        for (int i : grafo.keySet()) {
            contador = grafo.get(i).size();
            }
        return contador;
    }

    @Override
    public Iterator<Integer> obtenerVertices() {

        return null;
    }

    @Override
    public Iterator<Integer> obtenerAdyacentes(int verticeId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Iterator<Arco<T>> obtenerArcos() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Iterator<Arco<T>> obtenerArcos(int verticeId) {
        // TODO Auto-generated method stub
        return null;
    }

}