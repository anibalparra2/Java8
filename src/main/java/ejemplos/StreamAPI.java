package ejemplos;

import java.util.ArrayList;
import java.util.List;

public class StreamAPI {

    private List<String> lista;
    private List<String> numeros;

    public StreamAPI(){
        lista = new ArrayList<>();
        lista.add("Maria");
        lista.add("Juan");
        lista.add("Pedro");
        lista.add("Luis");
        numeros = new ArrayList<>();
        numeros.add("1");
        numeros.add("2");
        numeros.add("3");
    }

    public void filtrar(){

        lista.stream().filter(x -> x.startsWith("M")).forEach(System.out::println);
    }

    public void ordenar(){
        //lista.stream().sorted().forEach(System.out::println);
        lista.stream().sorted((x,y) -> y.compareTo(x)).forEach(System.out::println);
    }

    public void transformar(){
        //map sirve para transformar los elementos

        //lista.stream().map(String::toUpperCase).forEach(x -> System.out.println(x));
        numeros.stream().map(x -> Integer.parseInt(x) + 1).forEach(System.out::println);
    }

    public void limitar(){
        lista.stream().limit(2).forEach(System.out::println);
    }

    public void contar(){
        System.out.println(lista.stream().count());
    }

    public static void main(String args[]){
        StreamAPI app = new StreamAPI();
        //app.filtrar();
        //app.ordenar();
        //app.transformar();
        //app.limitar();
        app.contar();
    }
}
