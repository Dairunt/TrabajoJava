/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import entidades.Usuarios;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author FrancoSebastian
 */
@Service
public class DaoUsuario {

    @PersistenceContext
    private EntityManager em;

    @Transactional(rollbackFor = {ServicioException.class})
    //@Transactional
    //Crear Entity
    public void create(Usuarios dto) throws ServicioException {
        em.persist(dto);
    }

    //consulta simple Entity

    public Usuarios readByRut(String rut) throws SecurityException {
        return em.find(Usuarios.class, rut);
    }

    public Usuarios findByRutAndPassword(String rut, String password) throws SecurityException {
        String sql = "Select a from Persona a Where a.rut = :rut and a.password = :password ";
        Query q = em.createQuery(sql);
        q.setParameter("rut", rut);
        q.setParameter("password", password);
        try {
            return (Usuarios) q.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

    //otra forma de query JPQL (Consulta simple)

    public Usuarios readByRutJPQL(String rut) throws SecurityException {
        String sql = "Select a from Persona a Where a.rut = :rut";
        Query q = em.createQuery(sql);
        q.setParameter("rut", rut);
        try {
            return (Usuarios) q.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

    //query JPQL (Consulta multiple)

    public List<Usuarios> readAllJPQL() throws SecurityException {
        String sql = "Select a from persona a";
        Query q = em.createQuery(sql);
        return q.getResultList();
    }

    ////////////////////////////////////////////////////////
    //otra forma de query JPQL (Consulta simple)

    public boolean readByRutJPQLCreate(String rut) throws SecurityException {
        String sql = "Select a from persona a Where a.rut = :rut";

        Query q = em.createQuery(sql);
        q.setParameter("rut", rut);

        if (q.getResultList().size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    //query JPQL (insertar)

    public int createJPQL(Usuarios dto) throws SecurityException {
        if (readByRutJPQLCreate(dto.getRut())) {
            return 0;
        } else {
            em.persist(dto);
            return 1;
        }
    }
}
