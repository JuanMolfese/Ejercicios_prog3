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
            this.add(this.root,value);
    }

    private void add(TreeNode actual, Integer value) {
        if (actual.getValue() > value) {
            if (actual.getLeft() == null) {
                TreeNode temp = new TreeNode(value);
                actual.setLeft(temp);
            } else {
                add(actual.getLeft(),value);
            }
        } else if (actual.getValue() < value) {
            if (actual.getRight() == null) {
                TreeNode temp = new TreeNode(value);
                actual.setRight(temp);
            } else {
                add(actual.getRight(),value);
            }
        }
    }

    public int getAltura(){
        if (this.root == null)
            return 0;
        else
            return this.getAltura(this.root);
    }

    private int getAltura(TreeNode actual){
        if(actual.getLeft()==null && actual.getRight()==null) return 0;
        int der=0;
        int izq=0;
        if(actual.getLeft()!=null) izq = getAltura(actual.getLeft())+1;
        if(actual.getRight()!=null) der = getAltura(actual.getRight())+1;
        return max(izq, der);
    }

    public ArrayList<Integer> getLongBranch(){
        if (this.root == null)
            return new ArrayList<>();
        else
            return this.getLongBranch(this.root);
    }

    private ArrayList<Integer> getLongBranch(TreeNode actual){
        if(actual.getLeft()==null && actual.getRight()==null) return new ArrayList<>(actual.getValue());

        ArrayList<Integer> izq = new ArrayList<>();
        ArrayList<Integer> der = new ArrayList<>();
        if(actual.getLeft()!=null) izq.addAll(getLongBranch(actual.getLeft()));
        if(actual.getRight()!=null) der.addAll(getLongBranch(actual.getRight()));
        if(izq.size()>=der.size()) return izq;
        else return der;
    }

}
