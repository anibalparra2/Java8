package ejemplos;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapApp {

    private Map<Integer, String> map;

    public void poblar() {
        map = new HashMap<>();
        map.put(1, "Mito");
        map.put(2, "Code");
        map.put(3, "Suscribete");
    }

    public void imprimir_v7() {
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println("Llave: " + e.getKey() + " Valor: " + e.getValue());
        }
    }

    //recorrer e imprimir
    public void imprimir_v8(){
        //map.forEach((k,v) -> System.out.println("Llave: "+k+" Valor: "+v));
        map.entrySet().stream().forEach(System.out::println);
    }

    public void insertarSiAusente(){
        map.putIfAbsent(2,"Juan");
    }

    //imprimir elemento con key 3
    public void operarSiPresente(){
        map.computeIfPresent(3,(k,v) -> k + v);
        System.out.println(map.get(3));
    }

    //si no tiene el elemento crea un valor por defecto
    public void obtenerOrPredeterminado(){
        String valor = map.getOrDefault(5,"valor por defecto");
        System.out.println(valor);
    }

    public void recolectar(){
        Map<Integer,String> map2 = map.entrySet().stream().filter(e -> e.getValue().contains("o"))
                .collect(Collectors.toMap(p-> p.getKey(), p-> p.getValue()));
        map2.forEach((k,v) -> System.out.println("Llave: " + k + " Valor: " + v));
    }

    public static void main(String args[]){
        MapApp mapApp = new MapApp();
        mapApp.poblar();
        //mapApp.imprimir_v7();
        //mapApp.insertarSiAusente();
        //mapApp.imprimir_v8();
        //mapApp.operarSiPresente();
        //mapApp.obtenerOrPredeterminado();
        mapApp.recolectar();

    }

}
