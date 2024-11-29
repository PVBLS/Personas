package org.planzarote.personas.servicio;

import org.planzarote.personas.model.Persona;

import java.util.List;

public interface PersonaService {
    List<Persona> devuelveTodasPersonas();
    Persona devuelvePersonaPorId(Long id);
    void crearPersona(Persona persona);
    void actualizaPersona(Persona persona);
    void eliminaPersona(Persona persona);
    void eliminaTodasPersonas(Persona persona);
}
