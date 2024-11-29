package org.planzarote.personas.model;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Stream;

public class DatosPersonas {
    private static List<Persona> listaPersonas =
            Stream.of(new Persona(1L, "pepe", LocalDate.of(2000, 1, 2), 72.36F),
                    new Persona(2L, "charo", LocalDate.of(2000, 3, 13), 63.28F),
                    new Persona(3L, "pedro", LocalDate.of(2000, 10, 20), 70.43F)).toList();


    public static List<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public static Persona getPersonaPorId(Long Id) {
        return listaPersonas.stream().filter(persona -> persona.getId()==Id).findFirst().orElse(null);
    }

    public static void removeTodasPeronas(){
        listaPersonas.clear();
    }

    public static boolean addPersona(Persona persona){
        if(!listaPersonas.stream().anyMatch(persona1 -> persona1.getId().equals(persona.getId()))){
            listaPersonas.add(persona);
            return true;
        }
        return false;
    }

    public static boolean removePersonaPorId(Long id){
        if(!listaPersonas.stream().anyMatch(persona1 -> persona1.getId().equals(id))){
            listaPersonas.removeIf(persona2 -> persona2.getId().equals(id));
            return true;
        }
        return false;
    }
}
