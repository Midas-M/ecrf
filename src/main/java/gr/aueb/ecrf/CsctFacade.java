/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.aueb.ecrf;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Midas
 */
@Stateless
public class CsctFacade extends AbstractFacade<Csct> {
    @PersistenceContext(unitName = "gr.aueb_ecrf_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CsctFacade() {
        super(Csct.class);
    }
    
}
