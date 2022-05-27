package co.com.sofka.predojo.model;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PuntoDos {
    /*
    public static void main(String[] args) {
        List<String> malasPalabras = new ArrayList<>();
        malasPalabras.add("pirobo");
        malasPalabras.add("maricon");
        malasPalabras.add("putazo");
        malasPalabras.add("bobo");
        malasPalabras.add("marica");
        malasPalabras.add("hijueputa");
        malasPalabras.add("baboso");
        malasPalabras.add("chimba");
        malasPalabras.add("monda");
        malasPalabras.add("atembado");
        malasPalabras.add("estupido");

        Scanner scanner= new Scanner(System.in);
        System.out.println("por favor ingresa un mensaje");
        String mensaje=scanner.nextLine();

        Mono<String> mensajEducado=Mono.just(mensaje)
                /*.map(mensajem -> {
                    List<String> mensajeSplit= List.of(mensajem.split(" "));
                    Flux<String> mensajeCorregido= Flux.fromIterable(mensajeSplit)
                            .map(palabra ->{
                                Flux<String> groserias = Flux.fromIterable(malasPalabras)
                                        .reduce((acumulador,groseria) -> {
                                            //(palabra.contains(groseria))? acumulador="xxxx": acumulador=acumulador + "";
                                            return acumulador;
                                        });
                            })
                });


    }
    */
}
