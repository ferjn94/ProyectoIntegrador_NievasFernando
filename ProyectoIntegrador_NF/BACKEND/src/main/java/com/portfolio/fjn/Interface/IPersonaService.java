
package com.portfolio.fjn.Interface;

import com.portfolio.fjn.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer una persona
    public List<Persona> getPersona();
    //Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    //Eliminar un objeto por id
    public void deletePersona(Long id);
    //buscar persona por id
    public Persona findPersona(Long id);
    
    
}
