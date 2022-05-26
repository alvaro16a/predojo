package co.com.sofka.predojo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Se realiza la derivada y la integracion de la funcion X²
 *
 */

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Derivada: ");
        integrar().forEach(System.out::println);
        System.out.println("Integral  ");
        derivada().collect(Collectors.toList()).forEach(System.out::println);


    }

    public static Stream<Double> derivada(){
        List<Double> values =List.of(1D,2D,3D,4D,5D,6D,7D);
        double dif=0.1D;
        return values
                .stream()
                .map(value->(Math.pow(value+dif,2D)-Math.pow(value,2D))/dif);


    }

    public static Stream<Double> integrar(){
        List<Double> functionValues=List.of(1D,2D,3D,4D,5D,6D,7D,8D);
        double dif=1D;
        return functionValues
                .stream()
                .map(value->Math.pow(value,2))
                .map(value->value*dif)
                .reduce((v1,v2)->v1+v2).stream();

    }

}
