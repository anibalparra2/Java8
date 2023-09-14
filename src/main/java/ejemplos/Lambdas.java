package ejemplos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lambdas {

    static void ordenar(){
        List<String> frutas = new ArrayList<>();
        frutas.add("pera");
        frutas.add("manzana");
        frutas.add("limon");
        Collections.sort(frutas,(p1, p2) -> p1.compareTo(p2));
        frutas.forEach(fruta -> System.out.println(fruta));
    }

    static void sumar(){
        Sumadora sumadora = (x,y) -> x + y;
        System.out.println(sumadora.sumar(2,3));
    }

    public static void main(String args[]){
        sumar();
    }

}
