package practico_2.ej3;
//Implemente un algoritmo recursivo que convierta un número en notación decimal a su
//equivalente en notación binaria.

public class Main {
    public static void main(String[] args) {

        int num_ingresado = 30;
        System.out.println("El valor "+num_ingresado+" en notacion binaria es equivalente a "+ pasarBinario(num_ingresado));
    }

    private static int pasarBinario(int num){
        if (num<2) return num;
        else return (num%2 + pasarBinario((num/2))*10);
    }
}
