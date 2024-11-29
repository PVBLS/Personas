package org.planzarote.personas.controller;

import org.planzarote.personas.model.DatosPersonas;

public class Principal {
    public static void main(String[] args) {
        DatosPersonas.getListaPersonas().stream().forEach(System.out::println);
    }
}
