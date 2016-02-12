/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.aueb.ecrf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author Midas
 */
@Entity
@Table(name = "patient")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Patient.findAll", query = "SELECT p FROM Patient p"),
    @NamedQuery(name = "Patient.findByCodepatient", query = "SELECT p FROM Patient p WHERE p.codepatient = :codepatient"),
    @NamedQuery(name = "Patient.findByCentre", query = "SELECT p FROM Patient p WHERE p.centre = :centre"),
    @NamedQuery(name = "Patient.findByDatedeNaissance", query = "SELECT p FROM Patient p WHERE p.datedeNaissance = :datedeNaissance"),
    @NamedQuery(name = "Patient.findByAgeInclusion", query = "SELECT p FROM Patient p WHERE p.ageInclusion = :ageInclusion"),
    @NamedQuery(name = "Patient.findBySexe", query = "SELECT p FROM Patient p WHERE p.sexe = :sexe"),
    @NamedQuery(name = "Patient.findByNiveaudetude", query = "SELECT p FROM Patient p WHERE p.niveaudetude = :niveaudetude"),
    @NamedQuery(name = "Patient.findByLateralite", query = "SELECT p FROM Patient p WHERE p.lateralite = :lateralite"),
    @NamedQuery(name = "Patient.findByGrade", query = "SELECT p FROM Patient p WHERE p.grade = :grade"),
    @NamedQuery(name = "Patient.findByTaille", query = "SELECT p FROM Patient p WHERE p.taille = :taille"),
    @NamedQuery(name = "Patient.findByChirurgie", query = "SELECT p FROM Patient p WHERE p.chirurgie = :chirurgie"),
    @NamedQuery(name = "Patient.findByDiabete", query = "SELECT p FROM Patient p WHERE p.diabete = :diabete"),
    @NamedQuery(name = "Patient.findByHta", query = "SELECT p FROM Patient p WHERE p.hta = :hta"),
    @NamedQuery(name = "Patient.findByTabac", query = "SELECT p FROM Patient p WHERE p.tabac = :tabac"),
    @NamedQuery(name = "Patient.findByDatedarretdutabac", query = "SELECT p FROM Patient p WHERE p.datedarretdutabac = :datedarretdutabac"),
    @NamedQuery(name = "Patient.findByDyslipidemie", query = "SELECT p FROM Patient p WHERE p.dyslipidemie = :dyslipidemie"),
    @NamedQuery(name = "Patient.findByAlcool", query = "SELECT p FROM Patient p WHERE p.alcool = :alcool")})
public class Patient implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codepatient")
    private Collection<BilanCognitifLb> bilanCognitifLbCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codepatient")
    private Collection<Irm> irmCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codepatient")
    private Collection<Consultation> consultationCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codepatient")
    private Collection<Visit> visitCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codepatient")
    private Collection<BilanCognitifSuivi> bilanCognitifSuiviCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codepatient")
    private Collection<Csct> csctCollection;
    @Transient
    private List<String> multilocalisation=new ArrayList<String>();
    @Transient
    private String dateString;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "Code_patient")
    private String codepatient;
    @Basic(optional = true)
    @Column(name = "First_Name")
    private String firstName;
    @Basic(optional = true)
    @Column(name = "Last_Name")
    private String lastName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 18)
    @Column(name = "Centre")
    private String centre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Date_de_Naissance")
    @Temporal(TemporalType.DATE)
    private Date datedeNaissance;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Age_Inclusion")
    private int ageInclusion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "Sexe")
    private String sexe;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "Niveau_d_etude")
    private String niveaudetude;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Lateralite")
    private String lateralite;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "Grade")
    private String grade;
    @Column(name = "Taille")
    private Float taille;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "Localisation")
    private String localisation;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 18)
    @Column(name = "Chirurgie")
    private String chirurgie;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Diabete")
    private Boolean diabete;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Hta")
    private Boolean hta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Tabac")
    private Float tabac;
    @Column(name = "Date_d_arret_du_tabac")
    @Temporal(TemporalType.DATE)
    private Date datedarretdutabac;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Dyslipidemie")
    private Boolean dyslipidemie;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Alcool")
    private Float alcool;

    public Patient() {
    }

    public Patient(String codepatient) {
        this.codepatient = codepatient;
    }

    public Patient(String codepatient, String firstName, String lastName, String centre, Date datedeNaissance, int ageInclusion, String sexe, String niveaudetude, String lateralite, String grade, String localisation, String chirurgie, Boolean diabete, Boolean hta, Float tabac, Boolean dyslipidemie, Float alcool) {
        this.codepatient = codepatient;
        this.firstName = firstName;
        this.lastName = lastName;
        this.centre = centre;
        this.datedeNaissance = datedeNaissance;
        this.ageInclusion = ageInclusion;
        this.sexe = sexe;
        this.niveaudetude = niveaudetude;
        this.lateralite = lateralite;
        this.grade = grade;
        this.localisation = localisation;
        this.chirurgie = chirurgie;
        this.diabete = diabete;
        this.hta = hta;
        this.tabac = tabac;
        this.dyslipidemie = dyslipidemie;
        this.alcool = alcool;
    }

    public String getDateString() {
        int d=this.datedeNaissance.getDate();
        int m=this.datedeNaissance.getMonth()+1;
        int y=this.datedeNaissance.getYear()+1900;
        dateString=d+"/"+m+"/"+y;
        return dateString;
    }

    public void setDateString(String dateString) {
        this.dateString = dateString;
    }

    
    
    public List<String> getMultilocalisation() {
        multilocalisation=new ArrayList<String>();
        if(localisation!=null){
            multilocalisation=Arrays.asList(localisation.split(", "));
            multilocalisation.set(0, multilocalisation.get(0).replaceAll("[^A-Z]", ""));
            multilocalisation.set(multilocalisation.size()-1, multilocalisation.get(multilocalisation.size()-1).replaceAll("[^A-Z]", ""));
        }
        return multilocalisation;
    }

    public void setMultilocalisation(List<String> multilocalisation) {
        this.multilocalisation = multilocalisation;
        this.localisation=StringUtils.join(multilocalisation);
    }

    public String getCodepatient() {
        return codepatient;
    }

    public void setCodepatient(String codepatient) {
        this.codepatient = codepatient;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCentre() {
        return centre;
    }

    public void setCentre(String centre) {
        this.centre = centre;
    }

    public Date getDatedeNaissance() {
        return datedeNaissance;
    }

    public void setDatedeNaissance(Date datedeNaissance) {
        this.datedeNaissance = datedeNaissance;
    }

    public int getAgeInclusion() {
        return ageInclusion;
    }

    public void setAgeInclusion(int ageInclusion) {
        this.ageInclusion = ageInclusion;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getNiveaudetude() {
        return niveaudetude;
    }

    public void setNiveaudetude(String niveaudetude) {
        this.niveaudetude = niveaudetude;
    }

    public String getLateralite() {
        return lateralite;
    }

    public void setLateralite(String lateralite) {
        this.lateralite = lateralite;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Float getTaille() {
        return taille;
    }

    public void setTaille(Float taille) {
        this.taille = taille;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public String getChirurgie() {
        return chirurgie;
    }

    public void setChirurgie(String chirurgie) {
        this.chirurgie = chirurgie;
    }

    public Boolean getDiabete() {
        return diabete;
    }

    public void setDiabete(Boolean diabete) {
        this.diabete = diabete;
    }

    public Boolean getHta() {
        return hta;
    }

    public void setHta(Boolean hta) {
        this.hta = hta;
    }

    public Float getTabac() {
        return tabac;
    }

    public void setTabac(Float tabac) {
        this.tabac = tabac;
    }

    public Date getDatedarretdutabac() {
        return datedarretdutabac;
    }

    public void setDatedarretdutabac(Date datedarretdutabac) {
        this.datedarretdutabac = datedarretdutabac;
    }

    public Boolean getDyslipidemie() {
        return dyslipidemie;
    }

    public void setDyslipidemie(Boolean dyslipidemie) {
        this.dyslipidemie = dyslipidemie;
    }

    public Float getAlcool() {
        return alcool;
    }

    public void setAlcool(Float alcool) {
        this.alcool = alcool;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codepatient != null ? codepatient.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Patient)) {
            return false;
        }
        Patient other = (Patient) object;
        if ((this.codepatient == null && other.codepatient != null) || (this.codepatient != null && !this.codepatient.equals(other.codepatient))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gr.aueb.ecrf.Patient[ codepatient=" + codepatient + " ]";
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

    @XmlTransient
    public Collection<Visit> getVisitCollection() {
        return visitCollection;
    }

    public void setVisitCollection(Collection<Visit> visitCollection) {
        this.visitCollection = visitCollection;
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
    
}
