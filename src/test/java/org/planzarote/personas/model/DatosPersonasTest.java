package org.planzarote.personas.model;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.planzarote.personas.model.DatosPersonas;
import org.planzarote.personas.model.Persona;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

//@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class DatosPersonasTest {

    @Test
    public void testGetPersonaPorId_encontrado() {
        // Arrange
        long idEmpleado = 1L;
        Persona personaPrueba=new Persona(idEmpleado, "pepe", LocalDate.of(2000, 1, 2), 72.36F);
        Persona personaRecuperada = DatosPersonas.getPersonaPorId(1L);

        //Assert
        assertNotNull(personaRecuperada);
        assertEquals(personaPrueba.getId(), personaRecuperada.getId());
        assertEquals(personaPrueba.getNombre(), personaRecuperada.getNombre());
        assertEquals(personaPrueba.getFechaNacimiento(), personaRecuperada.getFechaNacimiento());
    }
    /*
        @Test
        public void testGetPersonaPorId_noEncontrado() {
            // Arrange
            long idEmpleado = 5L;
            Persona personaPrueba=new Persona(4L, "lolo", LocalDate.of(1999, 5, 2), 72.36F);

            Persona personaRecuperada = DatosPersonas.getPersonaPorId(idEmpleado);

            assertNull(personaRecuperada);

        }

        @Test
        public void testAddPersona_existente() {
            Persona personaprueba=new Persona(1L, "pepe", LocalDate.of(2000, 1, 2), 72.36F);
            assertFalse(DatosPersonas.addPersona(personaprueba));

        }

        @Test
        public void testAddPersona_noExistente() {
            Persona personaPrueba=new Persona(4L, "lolo", LocalDate.of(1999, 5, 2), 72.36F);
            assertTrue(DatosPersonas.addPersona(personaPrueba));

        }

        @Test
        public void testEliminarPersona_existente() {
            long idEmpleado = 1L;

            assertTrue(DatosPersonas.removePersonaPorId(idEmpleado));

            assertNull(DatosPersonas.getPersonaPorId(idEmpleado));
        }

        @Test
        public void testEliminarPersona_noExistente() {
            long idEmpleado = 5L;

            assertFalse(DatosPersonas.removePersonaPorId(idEmpleado));
        }

    //    @Test
    //    public void testActualizarPersona_existente() {
    //        Persona personaActualizada = new Persona(1L, "Pepe Actualizado", LocalDate.of(2000, 1, 2), 80.0F);
    //        System.out.println(DatosPersonas.getPersonaPorId(personaActualizada.getId()));
    //        assertTrue(DatosPersonas.actualizarPersona(personaActualizada));
    //        System.out.println(personaActualizada);
    //        System.out.println(DatosPersonas.getPersonaPorId(personaActualizada.getId()));
    //        System.out.println(DatosPersonas.getListaPersonas());
    //        Persona personaRecuperada = DatosPersonas.getPersonaPorId(1L);
    //        assertNotNull(personaRecuperada);
    //        assertEquals("Pepe Actualizado", personaRecuperada.getNombre());
    //        assertEquals(80.0F, personaRecuperada.getPeso());
    //    }

    @Test
    public void testGetListaPersonas_tamanoCorrecto() {
        List<Persona> listaPersonas = DatosPersonas.getListaPersonas();

        assertNotNull(listaPersonas);

        assertEquals(3, listaPersonas.size());
    }
     */
}