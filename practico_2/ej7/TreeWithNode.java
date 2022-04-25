package practico_2.ej7;

import java.util.ArrayList;

import static java.lang.Math.max;

public class TreeWithNode {

    private TreeNode root;

    public TreeWithNode() {
        this.root = null;
    }

    public void add(Integer value) {
        if (this.root == null)
            this.root = new TreeNode(value);
        else
            this.add(this.root, value);
    }

    private void add(TreeNode actual, Integer value) {
        if (actual.getValue() > value) {
            if (actual.getLeft() == null) {
                TreeNode temp = new TreeNode(value);
                actual.setLeft(temp);
            } else {
                add(actual.getLeft(), value);
            }
        } else if (actual.getValue() < value) {
            if (actual.getRight() == null) {
                TreeNode temp = new TreeNode(value);
                actual.setRight(temp);
            } else {
                add(actual.getRight(), value);
            }
        }
    }

    public int getHeight() {
        if (this.root == null)
            return 0;
        else
            return this.getHeight(this.root);
    }

    private int getHeight(TreeNode actual) {
        if (actual.getLeft() == null && actual.getRight() == null) return 0;
        int der = 0;
        int izq = 0;
        if (actual.getLeft() != null) izq = getHeight(actual.getLeft()) + 1;
        if (actual.getRight() != null) der = getHeight(actual.getRight()) + 1;
        return max(izq, der);
    }

    public ArrayList<Integer> getLongBranch() {
        if (this.root == null)
            return new ArrayList<>();
        else
            return this.getLongBranch(this.root);
    }

    private ArrayList<Integer> getLongBranch(TreeNode actual) {

        if(actual.esHoja()){
             ArrayList<Integer> meAgrego = new ArrayList<>();
             meAgrego.add(actual.getValue());
             return meAgrego;
        }
        ArrayList<Integer> izq = new ArrayList<>();
        ArrayList<Integer> der = new ArrayList<>();

        if (actual.getLeft() != null) {
            izq.add(actual.getValue());
            izq.addAll(getLongBranch(actual.getLeft()));
        }
        if (actual.getRight() != null) {
            der.add(actual.getValue());
            der.addAll(getLongBranch(actual.getRight()));
        }

        if (izq.size() >= der.size()) return izq;
        else return der;
    }

    public boolean hasElement(int valor) {
        if (this.root == null)
            return false;
        else
            return this.hasElement(this.root, valor);
    }

    private boolean hasElement(TreeNode n, int valor) {
        if (n.getValue() == valor) return true;
        if (n.getValue() > valor && n.getLeft() != null) return hasElement(n.getLeft(), valor);
        if (n.getValue() < valor && n.getRight() != null) return hasElement(n.getRight(), valor);
        return false;
    }

    public Integer valorMaximo() {
        if (this.root == null)
            return null;
        else
            return this.valorMaximo(this.root);
    }

    private int valorMaximo(TreeNode n) {
        if (n.getRight() != null) return valorMaximo(n.getRight());
        return n.getValue();
    }

    public ArrayList<Integer> frontierList() {
        if (this.root == null)
            return new ArrayList<>();
        else
            return this.frontierList(this.root);
    }

    private ArrayList<Integer> frontierList(TreeNode n) {
        ArrayList<Integer> hojas = new ArrayList<>();
        if (n.esHoja()){
            hojas.add(n.getValue());
        }else {
            if (n.getLeft() != null) hojas.addAll(frontierList(n.getLeft()));
            if (n.getRight() != null) hojas.addAll(frontierList(n.getRight()));
        }
        return hojas;
    }

    public Integer getRootInfo() {
        if (this.root == null)
            return null;
        else
            return this.root.getValue();
    }

    public ArrayList<Integer> getElementByLevel(int level) {
        if (this.root == null)
            return new ArrayList<>();
        else
            return this.getElementByLevel(this.root, level, 0);
    }

    private ArrayList<Integer> getElementByLevel(TreeNode n, int level, int levelActual) {

        ArrayList<Integer>resultado = new ArrayList<>();

        if(level == levelActual)
            resultado.add(n.getValue());
        levelActual++;
        if(n.getLeft()!=null) resultado.addAll(getElementByLevel(n.getLeft(), level,levelActual));
        if(n.getRight()!=null) resultado.addAll(getElementByLevel(n.getRight(), level, levelActual));
        return resultado;
    }

    public boolean delete(Integer valor){
        if (this.root.getValue().equals(valor)){
            this.root.setValue(null);
            return true;
        }else{
            return delete(this.root, valor);
        }
    }
    private boolean delete(TreeNode n, Integer valor){
        if(n.getValue()>valor){
            if(n.getLeft()!=null){
                if(n.getLeft().getValue().equals(valor)){

                }else{
                    return delete(n.getLeft(),valor);
                }
            }
        }

    }

}