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
@Table(name = "irm")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Irm.findAll", query = "SELECT i FROM Irm i"),
    @NamedQuery(name = "Irm.findById", query = "SELECT i FROM Irm i WHERE i.id = :id"),
    @NamedQuery(name = "Irm.findByDateexamen", query = "SELECT i FROM Irm i WHERE i.dateexamen = :dateexamen"),
    @NamedQuery(name = "Irm.findByDelaipostRT", query = "SELECT i FROM Irm i WHERE i.delaipostRT = :delaipostRT"),
    @NamedQuery(name = "Irm.findByFgSb", query = "SELECT i FROM Irm i WHERE i.fgSb = :fgSb"),
    @NamedQuery(name = "Irm.findByFdSb", query = "SELECT i FROM Irm i WHERE i.fdSb = :fdSb"),
    @NamedQuery(name = "Irm.findByFgAc", query = "SELECT i FROM Irm i WHERE i.fgAc = :fgAc"),
    @NamedQuery(name = "Irm.findByFdAc", query = "SELECT i FROM Irm i WHERE i.fdAc = :fdAc"),
    @NamedQuery(name = "Irm.findByTgSb", query = "SELECT i FROM Irm i WHERE i.tgSb = :tgSb"),
    @NamedQuery(name = "Irm.findByTdSb", query = "SELECT i FROM Irm i WHERE i.tdSb = :tdSb"),
    @NamedQuery(name = "Irm.findByTgAc", query = "SELECT i FROM Irm i WHERE i.tgAc = :tgAc"),
    @NamedQuery(name = "Irm.findByTdAc", query = "SELECT i FROM Irm i WHERE i.tdAc = :tdAc"),
    @NamedQuery(name = "Irm.findByPogSb", query = "SELECT i FROM Irm i WHERE i.pogSb = :pogSb"),
    @NamedQuery(name = "Irm.findByPodSb", query = "SELECT i FROM Irm i WHERE i.podSb = :podSb"),
    @NamedQuery(name = "Irm.findByPogAc", query = "SELECT i FROM Irm i WHERE i.pogAc = :pogAc"),
    @NamedQuery(name = "Irm.findByPodAc", query = "SELECT i FROM Irm i WHERE i.podAc = :podAc"),
    @NamedQuery(name = "Irm.findByCgSb", query = "SELECT i FROM Irm i WHERE i.cgSb = :cgSb"),
    @NamedQuery(name = "Irm.findByCdSb", query = "SELECT i FROM Irm i WHERE i.cdSb = :cdSb"),
    @NamedQuery(name = "Irm.findByCgAc", query = "SELECT i FROM Irm i WHERE i.cgAc = :cgAc"),
    @NamedQuery(name = "Irm.findByCdAc", query = "SELECT i FROM Irm i WHERE i.cdAc = :cdAc"),
    @NamedQuery(name = "Irm.findByGgbgSb", query = "SELECT i FROM Irm i WHERE i.ggbgSb = :ggbgSb"),
    @NamedQuery(name = "Irm.findByGgbdSb", query = "SELECT i FROM Irm i WHERE i.ggbdSb = :ggbdSb"),
    @NamedQuery(name = "Irm.findByGgbgAc", query = "SELECT i FROM Irm i WHERE i.ggbgAc = :ggbgAc"),
    @NamedQuery(name = "Irm.findByGgbdAc", query = "SELECT i FROM Irm i WHERE i.ggbdAc = :ggbdAc")})
public class Irm implements Serializable {
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
    @Column(name = "FG_SB")
    private Float fgSb;
    @Column(name = "FD_SB")
    private Float fdSb;
    @Column(name = "FG_AC")
    private Float fgAc;
    @Column(name = "FD_AC")
    private Float fdAc;
    @Column(name = "TG_SB")
    private Float tgSb;
    @Column(name = "TD_SB")
    private Float tdSb;
    @Column(name = "TG_AC")
    private Float tgAc;
    @Column(name = "TD_AC")
    private Float tdAc;
    @Column(name = "POG_SB")
    private Float pogSb;
    @Column(name = "POD_SB")
    private Float podSb;
    @Column(name = "POG_AC")
    private Float pogAc;
    @Column(name = "POD_AC")
    private Float podAc;
    @Column(name = "CG_SB")
    private Float cgSb;
    @Column(name = "CD_SB")
    private Float cdSb;
    @Column(name = "CG_AC")
    private Float cgAc;
    @Column(name = "CD_AC")
    private Float cdAc;
    @Column(name = "GGBG_SB")
    private Float ggbgSb;
    @Column(name = "GGBD_SB")
    private Float ggbdSb;
    @Column(name = "GGBG_AC")
    private Float ggbgAc;
    @Column(name = "GGBD_AC")
    private Float ggbdAc;
    @JoinColumn(name = "Code_patient", referencedColumnName = "Code_patient")
    @ManyToOne(optional = false)
    private Patient codepatient;
    @JoinColumn(name = "Visite", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Visit visite;
    @OneToOne(mappedBy = "irmid")
    private Visit visit;

    public Irm() {
    }

    public Irm(Long id) {
        this.id = id;
    }

    public Irm(Long id, Date dateexamen, Float delaipostRT) {
        this.id = id;
        this.dateexamen = dateexamen;
        this.delaipostRT = delaipostRT;
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

    public Float getFgSb() {
        return fgSb;
    }

    public void setFgSb(Float fgSb) {
        this.fgSb = fgSb;
    }

    public Float getFdSb() {
        return fdSb;
    }

    public void setFdSb(Float fdSb) {
        this.fdSb = fdSb;
    }

    public Float getFgAc() {
        return fgAc;
    }

    public void setFgAc(Float fgAc) {
        this.fgAc = fgAc;
    }

    public Float getFdAc() {
        return fdAc;
    }

    public void setFdAc(Float fdAc) {
        this.fdAc = fdAc;
    }

    public Float getTgSb() {
        return tgSb;
    }

    public void setTgSb(Float tgSb) {
        this.tgSb = tgSb;
    }

    public Float getTdSb() {
        return tdSb;
    }

    public void setTdSb(Float tdSb) {
        this.tdSb = tdSb;
    }

    public Float getTgAc() {
        return tgAc;
    }

    public void setTgAc(Float tgAc) {
        this.tgAc = tgAc;
    }

    public Float getTdAc() {
        return tdAc;
    }

    public void setTdAc(Float tdAc) {
        this.tdAc = tdAc;
    }

    public Float getPogSb() {
        return pogSb;
    }

    public void setPogSb(Float pogSb) {
        this.pogSb = pogSb;
    }

    public Float getPodSb() {
        return podSb;
    }

    public void setPodSb(Float podSb) {
        this.podSb = podSb;
    }

    public Float getPogAc() {
        return pogAc;
    }

    public void setPogAc(Float pogAc) {
        this.pogAc = pogAc;
    }

    public Float getPodAc() {
        return podAc;
    }

    public void setPodAc(Float podAc) {
        this.podAc = podAc;
    }

    public Float getCgSb() {
        return cgSb;
    }

    public void setCgSb(Float cgSb) {
        this.cgSb = cgSb;
    }

    public Float getCdSb() {
        return cdSb;
    }

    public void setCdSb(Float cdSb) {
        this.cdSb = cdSb;
    }

    public Float getCgAc() {
        return cgAc;
    }

    public void setCgAc(Float cgAc) {
        this.cgAc = cgAc;
    }

    public Float getCdAc() {
        return cdAc;
    }

    public void setCdAc(Float cdAc) {
        this.cdAc = cdAc;
    }

    public Float getGgbgSb() {
        return ggbgSb;
    }

    public void setGgbgSb(Float ggbgSb) {
        this.ggbgSb = ggbgSb;
    }

    public Float getGgbdSb() {
        return ggbdSb;
    }

    public void setGgbdSb(Float ggbdSb) {
        this.ggbdSb = ggbdSb;
    }

    public Float getGgbgAc() {
        return ggbgAc;
    }

    public void setGgbgAc(Float ggbgAc) {
        this.ggbgAc = ggbgAc;
    }

    public Float getGgbdAc() {
        return ggbdAc;
    }

    public void setGgbdAc(Float ggbdAc) {
        this.ggbdAc = ggbdAc;
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

    public Visit getVisit() {
        return visit;
    }

    public void setVisit(Visit visit) {
        this.visit = visit;
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
        if (!(object instanceof Irm)) {
            return false;
        }
        Irm other = (Irm) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gr.aueb.ecrf.Irm[ id=" + id + " ]";
    }
    
}
