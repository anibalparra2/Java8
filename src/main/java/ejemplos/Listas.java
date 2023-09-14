package ejemplos;

import java.util.ArrayList;
import java.util.List;

public class Listas {

    public List<String> lista;

    public void llenarLista(){
        lista = new ArrayList<>();
        lista.add("pera");
        lista.add("uva");
        lista.add("mango");
    }

    public void usarForEach(){
        //lista.forEach(x -> System.out.println(x));
        lista.forEach(System.out::println);
    }

    public void usarRemoveIf(){
        //lista.removeIf(x -> x.equals("uva"));
        lista.removeIf("uva"::equalsIgnoreCase);
    }

    public void usarSort(){
        //Collections.sort(lista);
        //lista.sort((x,y) -> x.compareTo(y));
        lista.sort(String::compareTo);
    }

    public static void main(String args[]){
        Listas pruebas = new Listas();
        pruebas.llenarLista();
        //pruebas.usarRemoveIf();
        pruebas.usarSort();
        pruebas.usarForEach();

    }
}
