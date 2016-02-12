/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.aueb.ecrf;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Midas
 */
@Entity
@Table(name = "csct")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Csct.findAll", query = "SELECT c FROM Csct c"),
    @NamedQuery(name = "Csct.findById", query = "SELECT c FROM Csct c WHERE c.id = :id"),
    @NamedQuery(name = "Csct.findByDateexamen", query = "SELECT c FROM Csct c WHERE c.dateexamen = :dateexamen"),
    @NamedQuery(name = "Csct.findByDelaipostRT", query = "SELECT c FROM Csct c WHERE c.delaipostRT = :delaipostRT"),
    @NamedQuery(name = "Csct.findByEtatduCSCT", query = "SELECT c FROM Csct c WHERE c.etatduCSCT = :etatduCSCT"),
    @NamedQuery(name = "Csct.findByNberreurs", query = "SELECT c FROM Csct c WHERE c.nberreurs = :nberreurs"),
    @NamedQuery(name = "Csct.findByNbreponsecorrectes", query = "SELECT c FROM Csct c WHERE c.nbreponsecorrectes = :nbreponsecorrectes"),
    @NamedQuery(name = "Csct.findByZs", query = "SELECT c FROM Csct c WHERE c.zs = :zs")})
public class Csct implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Date_examen")
    @Temporal(TemporalType.DATE)
    private Date dateexamen;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Delai_post_RT")
    private Float delaipostRT;
    @Basic(optional = true)
    @Column(name = "Etat_du_CSCT")
    private Boolean etatduCSCT;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Nb_erreurs")
    private Float nberreurs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Nb_reponse_correctes")
    private Float nbreponsecorrectes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ZS")
    private Float zs;
    @OneToOne(mappedBy = "csctid")
    private Visit visit;
    @JoinColumn(name = "Code_patient", referencedColumnName = "Code_patient")
    @ManyToOne(optional = false)
    private Patient codepatient;
    @JoinColumn(name = "Visite", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Visit visite;

    public Csct() {
       /*
        this.id = new Long(0);
        this.dateexamen = new Date();
        this.delaipostRT = 0;
        this.etatduCSCT = false;
        this.nberreurs = 0;
        this.nbreponsecorrectes = 0;
        this.zs = 0*/
    }

    public Csct(Long id) {
        this.id = id;
    }

    public Csct(Long id, Date dateexamen, Float delaipostRT, Boolean etatduCSCT, Float nberreurs, Float nbreponsecorrectes, Float zs) {
        this.id = id;
        this.dateexamen = dateexamen;
        this.delaipostRT = delaipostRT;
        this.etatduCSCT = etatduCSCT;
        this.nberreurs = nberreurs;
        this.nbreponsecorrectes = nbreponsecorrectes;
        this.zs = zs;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateexamen() {
        return dateexamen;
    }

    public void setDateexamen(Date dateexamen) {
        this.dateexamen = dateexamen;
    }

    public Float getDelaipostRT() {
        return delaipostRT;
    }

    public void setDelaipostRT(Float delaipostRT) {
        this.delaipostRT = delaipostRT;
    }

    public Boolean getEtatduCSCT() {
        return etatduCSCT;
    }

    public void setEtatduCSCT(Boolean etatduCSCT) {
        this.etatduCSCT = etatduCSCT;
    }

    public Float getNberreurs() {
        return nberreurs;
    }

    public void setNberreurs(Float nberreurs) {
        this.nberreurs = nberreurs;
    }

    public Float getNbreponsecorrectes() {
        return nbreponsecorrectes;
    }

    public void setNbreponsecorrectes(Float nbreponsecorrectes) {
        this.nbreponsecorrectes = nbreponsecorrectes;
    }

    public Float getZs() {
        return zs;
    }

    public void setZs(Float zs) {
        this.zs = zs;
    }

    public Visit getVisit() {
        return visit;
    }

    public void setVisit(Visit visit) {
        this.visit = visit;
    }

    public Patient getCodepatient() {
        return codepatient;
    }

    public void setCodepatient(Patient codepatient) {
        this.codepatient = codepatient;
    }

    public Visit getVisite() {
        return visite;
    }

    public void setVisite(Visit visite) {
        this.visite = visite;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Csct)) {
            return false;
        }
        Csct other = (Csct) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gr.aueb.ecrf.Csct[ id=" + id + " ]";
    }
    
}
