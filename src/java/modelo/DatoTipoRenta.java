/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Service;

/**
 *
 * @author FrancoSebastian
 */
@Service
public class DatoTipoRenta {
    @PersistenceContext
    private EntityManager em;

}
