package ejemplos;

import java.util.Optional;

public class OptionalAPP {

    public void probar(String valor){
        Optional op = Optional.empty();
        op.get(); //retorna el tipo de dato
    }

    public void orElse(String valor){
        Optional<String> optional = Optional.ofNullable(valor);
        Object dato = optional.orElse("predeterminado"); // si viene null cambia el valor
        System.out.println(dato);
    }

    public void orElseThrow(String valor){
        Optional<String> optional = Optional.ofNullable(valor);
        Object dato = optional.orElseThrow(NumberFormatException::new); //Cambia el tipo de excepcion
        System.out.println(dato);
    }

    public void isPresent(String valor){
        Optional<String> optional = Optional.ofNullable(valor);
        boolean inicializado = optional.isPresent(); //valida si el objeto a sido inicializado
        System.out.println(inicializado);
    }

    public static void main(String args[]){
        OptionalAPP optionalAPP = new OptionalAPP();
        //optionalAPP.probar("pera");
        optionalAPP.isPresent(null);
    }
}
