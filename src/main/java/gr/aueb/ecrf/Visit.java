/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.aueb.ecrf;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Midas
 */
@Entity
@Table(name = "visit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Visit.findAll", query = "SELECT v FROM Visit v"),
    @NamedQuery(name = "Visit.findById", query = "SELECT v FROM Visit v WHERE v.id = :id"),
    @NamedQuery(name = "Visit.findByDate", query = "SELECT v FROM Visit v WHERE v.date = :date")})
public class Visit implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nom_visite")
    private String nom_visite;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "visite")
    private Collection<BilanCognitifLb> bilanCognitifLbCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "visite")
    private Collection<Irm> irmCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "visite")
    private Collection<Consultation> consultationCollection;
    @JoinColumn(name = "Code_patient", referencedColumnName = "Code_patient")
    @ManyToOne(optional = false)
    private Patient codepatient;
    @JoinColumn(name = "Irm_id", referencedColumnName = "id")
    @OneToOne
    private Irm irmid;
    @JoinColumn(name = "Csct_id", referencedColumnName = "id")
    @OneToOne
    private Csct csctid;
    @JoinColumn(name = "Bilan_cognitif_lb_id", referencedColumnName = "id")
    @OneToOne
    private BilanCognitifLb bilancognitiflbid;
    @JoinColumn(name = "Consultation_id", referencedColumnName = "id")
    @OneToOne
    private Consultation consultationid;
    @JoinColumn(name = "Bilan_cognitif_suivi_id", referencedColumnName = "id")
    @OneToOne
    private BilanCognitifSuivi bilancognitifsuiviid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "visite")
    private Collection<BilanCognitifSuivi> bilanCognitifSuiviCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "visite")
    private Collection<Csct> csctCollection;
    @Transient
    private String dateString;
    public Visit() {
    }

    public Visit(Long id) {
        this.id = id;
    }

    public Visit(Long id, Date date) {
        this.id = id;
        this.date = date;
    }

    
    
     public String getDateString() {
        int d=this.date.getDate();
        int m=this.date.getMonth()+1;
        int y=this.date.getYear()+1900;
        dateString=d+"/"+m+"/"+y;
        return dateString;
    }

    public void setDateString(String dateString) {
        this.dateString = dateString;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @XmlTransient
    public Collection<BilanCognitifLb> getBilanCognitifLbCollection() {
        return bilanCognitifLbCollection;
    }

    public void setBilanCognitifLbCollection(Collection<BilanCognitifLb> bilanCognitifLbCollection) {
        this.bilanCognitifLbCollection = bilanCognitifLbCollection;
    }

    @XmlTransient
    public Collection<Irm> getIrmCollection() {
        return irmCollection;
    }

    public void setIrmCollection(Collection<Irm> irmCollection) {
        this.irmCollection = irmCollection;
    }

    @XmlTransient
    public Collection<Consultation> getConsultationCollection() {
        return consultationCollection;
    }

    public void setConsultationCollection(Collection<Consultation> consultationCollection) {
        this.consultationCollection = consultationCollection;
    }

    public Patient getCodepatient() {
        return codepatient;
    }

    public void setCodepatient(Patient codepatient) {
        this.codepatient = codepatient;
    }

    public Irm getIrmid() {
        return irmid;
    }

    public void setIrmid(Irm irmid) {
        this.irmid = irmid;
    }

    public Csct getCsctid() {
        return csctid;
    }

    public void setCsctid(Csct csctid) {
        this.csctid = csctid;
    }

    public BilanCognitifLb getBilancognitiflbid() {
        return bilancognitiflbid;
    }

    public void setBilancognitiflbid(BilanCognitifLb bilancognitiflbid) {
        this.bilancognitiflbid = bilancognitiflbid;
    }

    public Consultation getConsultationid() {
        return consultationid;
    }

    public void setConsultationid(Consultation consultationid) {
        this.consultationid = consultationid;
    }

    public BilanCognitifSuivi getBilancognitifsuiviid() {
        return bilancognitifsuiviid;
    }

    public void setBilancognitifsuiviid(BilanCognitifSuivi bilancognitifsuiviid) {
        this.bilancognitifsuiviid = bilancognitifsuiviid;
    }

    @XmlTransient
    public Collection<BilanCognitifSuivi> getBilanCognitifSuiviCollection() {
        return bilanCognitifSuiviCollection;
    }

    public void setBilanCognitifSuiviCollection(Collection<BilanCognitifSuivi> bilanCognitifSuiviCollection) {
        this.bilanCognitifSuiviCollection = bilanCognitifSuiviCollection;
    }

    @XmlTransient
    public Collection<Csct> getCsctCollection() {
        return csctCollection;
    }

    public void setCsctCollection(Collection<Csct> csctCollection) {
        this.csctCollection = csctCollection;
    }

    public String getNom_visite() {
        return nom_visite;
    }

    public void setNom_visite(String nom_visite) {
        this.nom_visite = nom_visite;
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
        if (!(object instanceof Visit)) {
            return false;
        }
        Visit other = (Visit) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gr.aueb.ecrf.Visit[ id=" + id + " ]";
    }
    
}
