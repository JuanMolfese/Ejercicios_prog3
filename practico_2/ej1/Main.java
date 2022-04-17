package practico_2.ej1;

public class Main {

    public static void main(String[] args) {
        int[] a1;
        a1 = new int[10];

        for (int i =0; i < a1.length; i++){
            a1[i]= i+3;
        }

     if(array_ordenado(a1, 0)){
            System.out.println("Esta ordenado");
        }else System.out.println("No esta ordenado");


    }
    private static boolean array_ordenado(int[] a, int i){

        if(i < a.length-1) {
            if (a[i] < a[i + 1])
                return array_ordenado(a, i + 1);
            else return false;
        }
        return true;
        }
}


