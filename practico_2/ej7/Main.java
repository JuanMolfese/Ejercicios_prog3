package practico_2.ej7;
//Implemente la estructura de Árbol Binario para búsquedas.
//Métodos:
//● Integer getRoot(), boolean hasElem(Integer), boolean isEmpty(), void insert(Integer),
//boolean delete(Integer), int getHeight(), void printPosOrder(), void printPreOrder(), void
//printInOrder(), List getLongestBranch(), List getFrontera(), Integer getMaxElem(), List
//getElemAtLevel(int)
//1. ¿Cuál es la complejidad de cada uno de estos métodos?
public class Main {
    public static void main(String[] args) {

        TreeWithNode MiArbol = new TreeWithNode();
        MiArbol.add(15);
        MiArbol.add(20);
        MiArbol.add(8);
        MiArbol.add(10);
        MiArbol.add(7);

        //valor a buscar en el arbol:
        int valor=1;
        //Nivel que quiero mostrar del arbol:
        int nivel=2;

        System.out.println("La altura del arbol es de "+MiArbol.getHeight());
        System.out.println("El valor "+valor+" esta en el arbol ?? :  "+MiArbol.hasElement(valor));
        System.out.println("El valor maximo contenido en el arbol es "+MiArbol.valorMaximo());
        System.out.println("La rama mas larga es "+MiArbol.getLongBranch());  //NO FUNCIONA
        System.out.println("La lista de hojas del arbol es: "+MiArbol.frontierList());
        System.out.println("El valor de la raiz del arbol es "+MiArbol.getRootInfo());
        System.out.println("Los elementos del nivel "+nivel+" es "+MiArbol.getElementByLevel(nivel));
    }
}
