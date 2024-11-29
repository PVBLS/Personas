package org.planzarote.personas.validation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Stream;

public class Pruebas {
    public static void main(String[] args) {
        List<String> lista = Stream.of("alfa","beta").toList();
        boolean isExist = lista.stream().anyMatch(element -> element.equals("beta"));
    }

    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public class Punto {
        private Integer x;
        private Integer y;
    }
}
