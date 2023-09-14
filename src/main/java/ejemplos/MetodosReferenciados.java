package ejemplos;

import java.util.Arrays;

public class MetodosReferenciados {

    static void referenciarMetodoStatic(){
        System.out.println("Metodo Referido Static");
    }

    // compara el uso de lambdas vs metodos referenciados
    static void operar(){
        //Operacion ope = () -> referenciarMetodoStatic(); //utilizando una expresion lambda
        Operacion ope = MetodosReferenciados::referenciarMetodoStatic; //utilizando metodos referenciados
        ope.saludar();
    }

    static void referenciarMetodoInstanciaObjetoArbitrario(){
        String[] nombres = {"Pedro","Maria","Juan"};
        Arrays.sort(nombres, (a, b) -> a.compareToIgnoreCase(b));
        System.out.println(Arrays.toString(nombres));
    }

    public static void main(String args[]){
        referenciarMetodoInstanciaObjetoArbitrario();
    }
}
