package practico_2.ej3;
//Implemente un algoritmo recursivo que convierta un número en notación decimal a su
//equivalente en notación binaria.

public class Main {
    public static void main(String[] args) {

        int num_ingresado = 8;
        String bin = "";
        System.out.println("El valor "+num_ingresado+" en notacion binaria es equivalente a "+ pasarBinario(num_ingresado,bin));
    }

    private static String pasarBinario(int num, String bin){
        if (num>0){
            if(num%2==0){
                bin+="0";
                return pasarBinario(num/2,bin);
            }
            else{
                bin+="1";
                return pasarBinario(num/2,bin);
            }
        }
        return bin;
    }
}
