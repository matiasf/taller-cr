package cr.taller.ejercicio2.equipo7;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.sql.SQLException;
import java.util.List;

@Repository
@Transactional
public class PersonaDAO {

    private final static String SQL_FIND_PERSONA_BY_ID = "select u from Persona u where u.id = ";
    private final static String SQL_FIND_PERSONA_BY_EMAIL = "select u from Persona u where u.email = ";

    @PersistenceContext
    private EntityManager entityManager;

    public Persona findPersonaById(long id) throws SQLException {
        Query s = entityManager.createQuery(SQL_FIND_PERSONA_BY_ID + id);
        List r = s.getResultList();

        if (r != null) {
            return (Persona) r.get(0);
        }
        return null;
    }

    public Persona findPersonaByEmail(String email) throws SQLException {
        Query s = entityManager.createQuery(SQL_FIND_PERSONA_BY_EMAIL + "'" + email + "'");
        List r = s.getResultList();

        if (r.iterator().next() != null) {
            return (Persona) r.get(0);
        }
        return null;
    }

}
