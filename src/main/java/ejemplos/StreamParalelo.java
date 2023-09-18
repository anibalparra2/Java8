package ejemplos;

import java.util.ArrayList;
import java.util.List;

/**
 * los streams paralelos sirven para realizar procesos en multiples hilos.
 * no es recomendable usarlos en servidores EE.
 */
public class StreamParalelo {

    private List<Integer> numeros;

    public void llenar(){
        numeros = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            numeros.add(i);
        }
    }

    public void probarStream(){
        numeros.stream().forEach(System.out::println);
    }

    public void probarParalelo() {
        numeros.parallelStream().forEach(System.out::println);
    }
    public static void main(String args[]){
        StreamParalelo app = new StreamParalelo();
        app.llenar();
        //app.probarStream();
        app.probarParalelo();
    }

}