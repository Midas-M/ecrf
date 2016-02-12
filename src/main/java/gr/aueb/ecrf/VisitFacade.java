/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.aueb.ecrf;

import java.util.List;
import static javafx.scene.input.KeyCode.T;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Midas
 */
@Stateless
public class VisitFacade extends AbstractFacade<Visit> {
    @PersistenceContext(unitName = "gr.aueb_ecrf_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
   @Override
   public List<Visit> findAll() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        
        cq.select(cq.from(Visit.class));
        return getEntityManager().createQuery(cq).getResultList();
    }
    
    public VisitFacade() {
        super(Visit.class);
    }
    
}
