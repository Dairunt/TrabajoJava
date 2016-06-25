/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import entidades.Solicitud;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Service;

/**
 *
 * @author FrancoSebastian
 */
@Service
public class DaoSolicitud {

    @PersistenceContext
    private EntityManager em;

    public List<Solicitud> findAllSolicitud() throws SecurityException {
        String sql = "Select a from Solicitud a";
        Query q = em.createQuery(sql);
        return q.getResultList();
    }
}
