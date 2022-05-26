package co.com.sofka.predojo;

import co.com.sofka.predojo.model.Correo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Dojo Programacion fuincional y Reactiva
 *
 * @author Sara Oquendo, Juan Pablo Toro, Alvaro Mena, Luis Felipe Rivas Mina, Juan Esteban Velasquez Posada
 * @version 1.0.0
 * @since 1.0.0
 */

@SpringBootApplication
public class PredojoApplication implements CommandLineRunner {
    private static final Logger log = LoggerFactory.getLogger(PredojoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(PredojoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        /**
         * Lista de 30 Correos
         *
         */

        List<String> correos = new ArrayList<>();
        correos.add("juan@gmail.com");
        correos.add("juanes@hotmail.com");
        correos.add("sara@gmail.com");
        correos.add("alvaro@gmail.com");
        correos.add("luis@hotmaal.com");
        correos.add("luis@hotmail.com");
        correos.add("alvaro@gmail.com");
        correos.add("luis@hotmail.com");
        correos.add("alvo@gmasl.com");
        correos.add("ls@hotmaisa.com");
        correos.add("fifilpo@gmail.com");
        correos.add("fifilpo@gmail.com");
        correos.add("qifilpo@outlook.com");
        correos.add("pifilpo@gmail.com");
        correos.add("oifilpo@gmail.com");
        correos.add("nnifilpo@outlook.com");
        correos.add("nifilpo@gmail.cm");
        correos.add("mifilpo@outlook.com");
        correos.add("lifilpo@gmail.com");
        correos.add("kifilpooutlook.com");
        correos.add("jifilpo@gmail.com");
        correos.add("iifilpo@gmail.com");
        correos.add("hifilpo@gmail.com");
        correos.add("gifilpohotmail.com");
        correos.add("alvo@gmasl.m");
        correos.add("jifilpo@outlook.com");
        correos.add("iifilpo@hotmail.com");
        correos.add("juangmail.com");
        correos.add("amdhotmail.com");
        correos.add("intel@gmasl.m");

        Flux<Correo> flujoCorreos = Flux.fromIterable(correos)
                .distinct()
                .filter(correo -> {
                    return (correo.contains("gmail") || correo.contains("hotmail") || correo.contains("outlook"));
                })
                .map(correo -> {
                    boolean resultado = (correo.contains("@gmail.com") || correo.contains("@hotmail.com") || correo.contains("@outlook.com")) ? true : false;
                    Correo correoValidado = new Correo(correo, resultado);
                    return correoValidado;
                });

        Mono<Long> numeroTotalCorreos = Flux.fromIterable(correos).count();

        Mono<Long> totalCorreosCorrectos = flujoCorreos
                            .filter(correo -> {
                                return (correo.isEnviado());
                            })
                            .count();

        flujoCorreos.subscribe(c -> log.info(c.toString()));
        numeroTotalCorreos.subscribe(c -> log.info("Numero total de correos: "+c.toString()));
        totalCorreosCorrectos.subscribe(c -> log.info("Total correos correctos: " + c.toString()));
    }
}
