package org.planzarote.personas.servicio;

import org.planzarote.personas.exception.PersonaNoEncontradaException;
import org.planzarote.personas.model.DatosPersonas;
import org.planzarote.personas.model.Persona;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService{

    @Override
    public List<Persona> devuelveTodasPersonas() {
        return DatosPersonas.getListaPersonas();
    }

    @Override
    public Persona devuelvePersonaPorId(Long id) {
        Persona persona = DatosPersonas.getPersonaPorId(id);
        if (persona==null) {
            throw new PersonaNoEncontradaException("La persona con id +" + id + " no existe");
        }
        return persona;
    }

    @Override
    public void crearPersona(Persona persona) {

    }

    @Override
    public void actualizaPersona(Persona persona) {

    }

    @Override
    public void eliminaPersona(Persona persona) {

    }

    @Override
    public void eliminaTodasPersonas(Persona persona) {

    }
}
