package cr.taller.ejercicio2.equipo7;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController
public class PersonaService {

    @Autowired
    private PersonaDAO personaDAO;

    @GetMapping(path = "obtener")
    public String obtener() {
        try {
            String resultado = personaDAO.findPersonaByEmail("mail").getEmail();
            if (StringUtils.isNotEmpty(resultado)) {
                return resultado;
            } else {
                resultado = String.valueOf(personaDAO.findPersonaById(1L));
            }
            return resultado;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "Hubo un error";
    }

}
