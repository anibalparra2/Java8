package ejemplos;

import java.util.function.Function;

//Funciones de alto orden
public class HighApp {

    private Function<String,String> convertirMayusculas = x -> x.toUpperCase();
    private Function<String,String> convertirMinusculas = x -> x.toLowerCase();

    public void imprimir(Function<String,String> funcion, String valor){
        System.out.println(funcion.apply(valor));
    }

    public static void main(String args[]){
        HighApp highApp = new HighApp();
        highApp.imprimir(highApp.convertirMayusculas, "hello");
        highApp.imprimir(highApp.convertirMinusculas, "BYE");
    }
}
