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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Midas
 */
@Entity
@Table(name = "sortie_de_etude")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SortieDeEtude.findAll", query = "SELECT s FROM SortieDeEtude s"),
    @NamedQuery(name = "SortieDeEtude.findById", query = "SELECT s FROM SortieDeEtude s WHERE s.id = :id"),
    @NamedQuery(name = "SortieDeEtude.findByRaison", query = "SELECT s FROM SortieDeEtude s WHERE s.raison = :raison"),
    @NamedQuery(name = "SortieDeEtude.findByLieealatumeur", query = "SELECT s FROM SortieDeEtude s WHERE s.lieealatumeur = :lieealatumeur"),
    @NamedQuery(name = "SortieDeEtude.findByDateSortie", query = "SELECT s FROM SortieDeEtude s WHERE s.dateSortie = :dateSortie")})
public class SortieDeEtude implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "raison")
    private String raison;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "PrecisionSortie")
    private String PrecisionSortie;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Liee_a_la_tumeur")
    private Boolean lieealatumeur;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_sortie")
    @Temporal(TemporalType.DATE)
    private Date dateSortie;
    @JoinColumn(name = "Code_patient", referencedColumnName = "Code_patient")
    @OneToOne(optional = false)
    private Patient codepatient;

    public SortieDeEtude() {
    }

    public SortieDeEtude(Long id) {
        this.id = id;
    }

    public SortieDeEtude(Long id, String raison, String PrecisionSortie, Boolean lieealatumeur, Date dateSortie) {
        this.id = id;
        this.raison = raison;
        this.PrecisionSortie = PrecisionSortie;
        this.lieealatumeur = lieealatumeur;
        this.dateSortie = dateSortie;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRaison() {
        return raison;
    }

    public void setRaison(String raison) {
        this.raison = raison;
    }

    public String getPrecisionSortie() {
        return PrecisionSortie;
    }

    public void setPrecisionSortie(String PrecisionSortie) {
        this.PrecisionSortie = PrecisionSortie;
    }

    public Boolean getLieealatumeur() {
        return lieealatumeur;
    }

    public void setLieealatumeur(Boolean lieealatumeur) {
        this.lieealatumeur = lieealatumeur;
    }

    public Date getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(Date dateSortie) {
        this.dateSortie = dateSortie;
    }

    public Patient getCodepatient() {
        return codepatient;
    }

    public void setCodepatient(Patient codepatient) {
        this.codepatient = codepatient;
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
        if (!(object instanceof SortieDeEtude)) {
            return false;
        }
        SortieDeEtude other = (SortieDeEtude) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gr.aueb.ecrf.SortieDeEtude[ id=" + id + " ]";
    }
    
}
