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
@Table(name = "dosimetrie")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dosimetrie.findAll", query = "SELECT d FROM Dosimetrie d"),
    @NamedQuery(name = "Dosimetrie.findById", query = "SELECT d FROM Dosimetrie d WHERE d.id = :id"),
    @NamedQuery(name = "Dosimetrie.findByDatedebutRT", query = "SELECT d FROM Dosimetrie d WHERE d.datedebutRT = :datedebutRT"),
    @NamedQuery(name = "Dosimetrie.findByDatefinRT", query = "SELECT d FROM Dosimetrie d WHERE d.datefinRT = :datefinRT"),
    @NamedQuery(name = "Dosimetrie.findByDosetotale", query = "SELECT d FROM Dosimetrie d WHERE d.dosetotale = :dosetotale"),
    @NamedQuery(name = "Dosimetrie.findByNbrfraction", query = "SELECT d FROM Dosimetrie d WHERE d.nbrfraction = :nbrfraction"),
    @NamedQuery(name = "Dosimetrie.findByEnergiephotonMV", query = "SELECT d FROM Dosimetrie d WHERE d.energiephotonMV = :energiephotonMV"),
    @NamedQuery(name = "Dosimetrie.findByTypetechnique", query = "SELECT d FROM Dosimetrie d WHERE d.typetechnique = :typetechnique"),
    @NamedQuery(name = "Dosimetrie.findByInteruptempo", query = "SELECT d FROM Dosimetrie d WHERE d.interuptempo = :interuptempo"),
    @NamedQuery(name = "Dosimetrie.findByJourdarretcumul", query = "SELECT d FROM Dosimetrie d WHERE d.jourdarretcumul = :jourdarretcumul"),
    @NamedQuery(name = "Dosimetrie.findByNbrperiodearret3j", query = "SELECT d FROM Dosimetrie d WHERE d.nbrperiodearret3j = :nbrperiodearret3j"),
    @NamedQuery(name = "Dosimetrie.findByArret3jcausepatient", query = "SELECT d FROM Dosimetrie d WHERE d.arret3jcausepatient = :arret3jcausepatient"),
    @NamedQuery(name = "Dosimetrie.findByArret3jcausemaladieinter", query = "SELECT d FROM Dosimetrie d WHERE d.arret3jcausemaladieinter = :arret3jcausemaladieinter"),
    @NamedQuery(name = "Dosimetrie.findByArret3jcauseferies", query = "SELECT d FROM Dosimetrie d WHERE d.arret3jcauseferies = :arret3jcauseferies"),
    @NamedQuery(name = "Dosimetrie.findByArret3jcausemaintenance", query = "SELECT d FROM Dosimetrie d WHERE d.arret3jcausemaintenance = :arret3jcausemaintenance"),
    @NamedQuery(name = "Dosimetrie.findByArret3jcausepanne", query = "SELECT d FROM Dosimetrie d WHERE d.arret3jcausepanne = :arret3jcausepanne"),
    @NamedQuery(name = "Dosimetrie.findByArret3jcausetoxicite", query = "SELECT d FROM Dosimetrie d WHERE d.arret3jcausetoxicite = :arret3jcausetoxicite"),
    @NamedQuery(name = "Dosimetrie.findByArret3jcauseautre", query = "SELECT d FROM Dosimetrie d WHERE d.arret3jcauseautre = :arret3jcauseautre"),
    @NamedQuery(name = "Dosimetrie.findByInteruptionprematuree", query = "SELECT d FROM Dosimetrie d WHERE d.interuptionprematuree = :interuptionprematuree"),
    @NamedQuery(name = "Dosimetrie.findByGTVtumeurmacro", query = "SELECT d FROM Dosimetrie d WHERE d.gTVtumeurmacro = :gTVtumeurmacro"),
    @NamedQuery(name = "Dosimetrie.findByCTVvolumeanatomoclinique", query = "SELECT d FROM Dosimetrie d WHERE d.cTVvolumeanatomoclinique = :cTVvolumeanatomoclinique"),
    @NamedQuery(name = "Dosimetrie.findByPTVvolumecibleplanif", query = "SELECT d FROM Dosimetrie d WHERE d.pTVvolumecibleplanif = :pTVvolumecibleplanif"),
    @NamedQuery(name = "Dosimetrie.findByVolumeoedeme", query = "SELECT d FROM Dosimetrie d WHERE d.volumeoedeme = :volumeoedeme"),
    @NamedQuery(name = "Dosimetrie.findByPTV95dose", query = "SELECT d FROM Dosimetrie d WHERE d.pTV95dose = :pTV95dose"),
    @NamedQuery(name = "Dosimetrie.findByPTV90dose", query = "SELECT d FROM Dosimetrie d WHERE d.pTV90dose = :pTV90dose"),
    @NamedQuery(name = "Dosimetrie.findByPTV107dose", query = "SELECT d FROM Dosimetrie d WHERE d.pTV107dose = :pTV107dose"),
    @NamedQuery(name = "Dosimetrie.findByVolumeisodose95", query = "SELECT d FROM Dosimetrie d WHERE d.volumeisodose95 = :volumeisodose95"),
    @NamedQuery(name = "Dosimetrie.findByRcmiD98Ptv", query = "SELECT d FROM Dosimetrie d WHERE d.rcmiD98Ptv = :rcmiD98Ptv"),
    @NamedQuery(name = "Dosimetrie.findByRcmiD2Ptv", query = "SELECT d FROM Dosimetrie d WHERE d.rcmiD2Ptv = :rcmiD2Ptv"),
    @NamedQuery(name = "Dosimetrie.findByRcmiD50Ptv", query = "SELECT d FROM Dosimetrie d WHERE d.rcmiD50Ptv = :rcmiD50Ptv"),
    @NamedQuery(name = "Dosimetrie.findByDeliHippocampes", query = "SELECT d FROM Dosimetrie d WHERE d.deliHippocampes = :deliHippocampes"),
    @NamedQuery(name = "Dosimetrie.findByDelihippocampes5mm", query = "SELECT d FROM Dosimetrie d WHERE d.delihippocampes5mm = :delihippocampes5mm"),
    @NamedQuery(name = "Dosimetrie.findByDelicorpscalleux", query = "SELECT d FROM Dosimetrie d WHERE d.delicorpscalleux = :delicorpscalleux"),
    @NamedQuery(name = "Dosimetrie.findByDelilobetemporaux", query = "SELECT d FROM Dosimetrie d WHERE d.delilobetemporaux = :delilobetemporaux"),
    @NamedQuery(name = "Dosimetrie.findByDelilobefrontaux", query = "SELECT d FROM Dosimetrie d WHERE d.delilobefrontaux = :delilobefrontaux"),
    @NamedQuery(name = "Dosimetrie.findByDelicervelet", query = "SELECT d FROM Dosimetrie d WHERE d.delicervelet = :delicervelet"),
    @NamedQuery(name = "Dosimetrie.findByDeliperiventriculaire", query = "SELECT d FROM Dosimetrie d WHERE d.deliperiventriculaire = :deliperiventriculaire"),
    @NamedQuery(name = "Dosimetrie.findByDeliencephalesain", query = "SELECT d FROM Dosimetrie d WHERE d.deliencephalesain = :deliencephalesain"),
    @NamedQuery(name = "Dosimetrie.findByDelisustentoriel", query = "SELECT d FROM Dosimetrie d WHERE d.delisustentoriel = :delisustentoriel"),
    @NamedQuery(name = "Dosimetrie.findByDelifosseposterieure", query = "SELECT d FROM Dosimetrie d WHERE d.delifosseposterieure = :delifosseposterieure")})
public class Dosimetrie implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @JoinColumn(name = "Code_patient", referencedColumnName = "Code_patient")
    @ManyToOne(optional = false)
    private Patient codepatient;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Date_debut_RT")
    @Temporal(TemporalType.DATE)
    private Date datedebutRT;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Date_fin_RT")
    @Temporal(TemporalType.DATE)
    private Date datefinRT;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Dose_totale")
    private Float dosetotale;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Nbr_fraction")
    private Float nbrfraction;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Energie_photon_MV")
    private Float energiephotonMV;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 13)
    @Column(name = "Type_technique")
    private String typetechnique;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Interup_tempo")
    private Boolean interuptempo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Jour_d_arret_cumul")
    private Float jourdarretcumul;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Nbr_periode_arret_3j")
    private Float nbrperiodearret3j;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Arret_3j_cause_patient")
    private Float arret3jcausepatient;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Arret_3j_cause_maladie_inter")
    private Float arret3jcausemaladieinter;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Arret_3j_cause_feries")
    private Float arret3jcauseferies;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Arret_3j_cause_maintenance")
    private Float arret3jcausemaintenance;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Arret_3j_cause_panne")
    private Float arret3jcausepanne;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Arret_3j_cause_toxicite")
    private Float arret3jcausetoxicite;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Arret_3j_cause_autre")
    private Float arret3jcauseautre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 14)
    @Column(name = "Interuption_prematuree")
    private String interuptionprematuree;
    @Basic(optional = false)
    @NotNull
    @Column(name = "GTV_tumeur_macro")
    private Float gTVtumeurmacro;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CTV_volume_anatomo_clinique")
    private Float cTVvolumeanatomoclinique;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PTV_volume_cible_planif")
    private Float pTVvolumecibleplanif;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Volume_oedeme")
    private Float volumeoedeme;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PTV_95_dose")
    private Float pTV95dose;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PTV_90_dose")
    private Float pTV90dose;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PTV_107_dose")
    private Float pTV107dose;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Volume_isodose_95")
    private Float volumeisodose95;
    @Column(name = "RCMI_D98_PTV")
    private Float rcmiD98Ptv;
    @Column(name = "RCMI_D2_PTV")
    private Float rcmiD2Ptv;
    @Column(name = "RCMI_D50_PTV")
    private Float rcmiD50Ptv;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Deli_Hippocampes")
    private Boolean deliHippocampes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Deli_hippocampes_5mm")
    private Boolean delihippocampes5mm;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Deli_corps_calleux")
    private Boolean delicorpscalleux;

  
    @Basic(optional = false)
    @NotNull
    @Column(name = "Deli_lobe_temporaux")
    private Boolean delilobetemporaux;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Deli_lobe_frontaux")
    private Boolean delilobefrontaux;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Deli_cervelet")
    private Boolean delicervelet;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Deli_periventriculaire")
    private Boolean deliperiventriculaire;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Deli_encephale_sain")
    private Boolean deliencephalesain;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Deli_sus_tentoriel")
    private Boolean delisustentoriel;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Deli_fosse_posterieure")
    private Boolean delifosseposterieure;

    public Dosimetrie() {
    }

    public Dosimetrie(Long id) {
        this.id = id;
    }

    public Dosimetrie(Long id, Date datedebutRT, Date datefinRT, Float dosetotale, Float nbrfraction, Float energiephotonMV, String typetechnique, Boolean interuptempo, Float jourdarretcumul, Float nbrperiodearret3j, Float arret3jcausepatient, Float arret3jcausemaladieinter, Float arret3jcauseferies, Float arret3jcausemaintenance, Float arret3jcausepanne, Float arret3jcausetoxicite, Float arret3jcauseautre, String interuptionprematuree, Float gTVtumeurmacro, Float cTVvolumeanatomoclinique, Float pTVvolumecibleplanif, Float volumeoedeme, Float pTV95dose, Float pTV90dose, Float pTV107dose, Float volumeisodose95, Boolean deliHippocampes, Boolean delihippocampes5mm, Boolean delicorpscalleux, Boolean delilobetemporaux, Boolean delilobefrontaux, Boolean delicervelet, Boolean deliperiventriculaire, Boolean deliencephalesain, Boolean delisustentoriel, Boolean delifosseposterieure) {
        this.id = id;
        this.datedebutRT = datedebutRT;
        this.datefinRT = datefinRT;
        this.dosetotale = dosetotale;
        this.nbrfraction = nbrfraction;
        this.energiephotonMV = energiephotonMV;
        this.typetechnique = typetechnique;
        this.interuptempo = interuptempo;
        this.jourdarretcumul = jourdarretcumul;
        this.nbrperiodearret3j = nbrperiodearret3j;
        this.arret3jcausepatient = arret3jcausepatient;
        this.arret3jcausemaladieinter = arret3jcausemaladieinter;
        this.arret3jcauseferies = arret3jcauseferies;
        this.arret3jcausemaintenance = arret3jcausemaintenance;
        this.arret3jcausepanne = arret3jcausepanne;
        this.arret3jcausetoxicite = arret3jcausetoxicite;
        this.arret3jcauseautre = arret3jcauseautre;
        this.interuptionprematuree = interuptionprematuree;
        this.gTVtumeurmacro = gTVtumeurmacro;
        this.cTVvolumeanatomoclinique = cTVvolumeanatomoclinique;
        this.pTVvolumecibleplanif = pTVvolumecibleplanif;
        this.volumeoedeme = volumeoedeme;
        this.pTV95dose = pTV95dose;
        this.pTV90dose = pTV90dose;
        this.pTV107dose = pTV107dose;
        this.volumeisodose95 = volumeisodose95;
        this.deliHippocampes = deliHippocampes;
        this.delihippocampes5mm = delihippocampes5mm;
        this.delicorpscalleux = delicorpscalleux;
        this.delilobetemporaux = delilobetemporaux;
        this.delilobefrontaux = delilobefrontaux;
        this.delicervelet = delicervelet;
        this.deliperiventriculaire = deliperiventriculaire;
        this.deliencephalesain = deliencephalesain;
        this.delisustentoriel = delisustentoriel;
        this.delifosseposterieure = delifosseposterieure;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDatedebutRT() {
        return datedebutRT;
    }

    public void setDatedebutRT(Date datedebutRT) {
        this.datedebutRT = datedebutRT;
    }

    public Date getDatefinRT() {
        return datefinRT;
    }

    public void setDatefinRT(Date datefinRT) {
        this.datefinRT = datefinRT;
    }

    public Float getDosetotale() {
        return dosetotale;
    }

    public void setDosetotale(Float dosetotale) {
        this.dosetotale = dosetotale;
    }

    public Float getNbrfraction() {
        return nbrfraction;
    }

    public void setNbrfraction(Float nbrfraction) {
        this.nbrfraction = nbrfraction;
    }

    public Float getEnergiephotonMV() {
        return energiephotonMV;
    }

    public void setEnergiephotonMV(Float energiephotonMV) {
        this.energiephotonMV = energiephotonMV;
    }

    public String getTypetechnique() {
        return typetechnique;
    }

    public void setTypetechnique(String typetechnique) {
        this.typetechnique = typetechnique;
    }

    public Boolean getInteruptempo() {
        return interuptempo;
    }

    public void setInteruptempo(Boolean interuptempo) {
        this.interuptempo = interuptempo;
    }

    public Float getJourdarretcumul() {
        return jourdarretcumul;
    }

    public void setJourdarretcumul(Float jourdarretcumul) {
        this.jourdarretcumul = jourdarretcumul;
    }

    public Float getNbrperiodearret3j() {
        return nbrperiodearret3j;
    }

    public void setNbrperiodearret3j(Float nbrperiodearret3j) {
        this.nbrperiodearret3j = nbrperiodearret3j;
    }

    public Float getArret3jcausepatient() {
        return arret3jcausepatient;
    }
    public Patient getCodepatient() {
        return codepatient;
    }

    public void setCodepatient(Patient codepatient) {
        this.codepatient = codepatient;
    }
    public void setArret3jcausepatient(Float arret3jcausepatient) {
        this.arret3jcausepatient = arret3jcausepatient;
    }

    public Float getArret3jcausemaladieinter() {
        return arret3jcausemaladieinter;
    }

    public void setArret3jcausemaladieinter(Float arret3jcausemaladieinter) {
        this.arret3jcausemaladieinter = arret3jcausemaladieinter;
    }

    public Float getArret3jcauseferies() {
        return arret3jcauseferies;
    }

    public void setArret3jcauseferies(Float arret3jcauseferies) {
        this.arret3jcauseferies = arret3jcauseferies;
    }

    public Float getArret3jcausemaintenance() {
        return arret3jcausemaintenance;
    }

    public void setArret3jcausemaintenance(Float arret3jcausemaintenance) {
        this.arret3jcausemaintenance = arret3jcausemaintenance;
    }

    public Float getArret3jcausepanne() {
        return arret3jcausepanne;
    }

    public void setArret3jcausepanne(Float arret3jcausepanne) {
        this.arret3jcausepanne = arret3jcausepanne;
    }

    public Float getArret3jcausetoxicite() {
        return arret3jcausetoxicite;
    }

    public void setArret3jcausetoxicite(Float arret3jcausetoxicite) {
        this.arret3jcausetoxicite = arret3jcausetoxicite;
    }

    public Float getArret3jcauseautre() {
        return arret3jcauseautre;
    }

    public void setArret3jcauseautre(Float arret3jcauseautre) {
        this.arret3jcauseautre = arret3jcauseautre;
    }

    public String getInteruptionprematuree() {
        return interuptionprematuree;
    }

    public void setInteruptionprematuree(String interuptionprematuree) {
        this.interuptionprematuree = interuptionprematuree;
    }

    public Float getGTVtumeurmacro() {
        return gTVtumeurmacro;
    }

    public void setGTVtumeurmacro(Float gTVtumeurmacro) {
        this.gTVtumeurmacro = gTVtumeurmacro;
    }

    public Float getCTVvolumeanatomoclinique() {
        return cTVvolumeanatomoclinique;
    }

    public void setCTVvolumeanatomoclinique(Float cTVvolumeanatomoclinique) {
        this.cTVvolumeanatomoclinique = cTVvolumeanatomoclinique;
    }

    public Float getPTVvolumecibleplanif() {
        return pTVvolumecibleplanif;
    }

    public void setPTVvolumecibleplanif(Float pTVvolumecibleplanif) {
        this.pTVvolumecibleplanif = pTVvolumecibleplanif;
    }

    public Float getVolumeoedeme() {
        return volumeoedeme;
    }

    public void setVolumeoedeme(Float volumeoedeme) {
        this.volumeoedeme = volumeoedeme;
    }

    public Float getPTV95dose() {
        return pTV95dose;
    }

    public void setPTV95dose(Float pTV95dose) {
        this.pTV95dose = pTV95dose;
    }

    public Float getPTV90dose() {
        return pTV90dose;
    }

    public void setPTV90dose(Float pTV90dose) {
        this.pTV90dose = pTV90dose;
    }

    public Float getPTV107dose() {
        return pTV107dose;
    }

    public void setPTV107dose(Float pTV107dose) {
        this.pTV107dose = pTV107dose;
    }

    public Float getVolumeisodose95() {
        return volumeisodose95;
    }

    public void setVolumeisodose95(Float volumeisodose95) {
        this.volumeisodose95 = volumeisodose95;
    }

    public Float getRcmiD98Ptv() {
        return rcmiD98Ptv;
    }

    public void setRcmiD98Ptv(Float rcmiD98Ptv) {
        this.rcmiD98Ptv = rcmiD98Ptv;
    }

    public Float getRcmiD2Ptv() {
        return rcmiD2Ptv;
    }

    public void setRcmiD2Ptv(Float rcmiD2Ptv) {
        this.rcmiD2Ptv = rcmiD2Ptv;
    }

    public Float getRcmiD50Ptv() {
        return rcmiD50Ptv;
    }

    public void setRcmiD50Ptv(Float rcmiD50Ptv) {
        this.rcmiD50Ptv = rcmiD50Ptv;
    }

    public Boolean getDeliHippocampes() {
        return deliHippocampes;
    }

    public void setDeliHippocampes(Boolean deliHippocampes) {
        this.deliHippocampes = deliHippocampes;
    }

    public Boolean getDelihippocampes5mm() {
        return delihippocampes5mm;
    }

    public void setDelihippocampes5mm(Boolean delihippocampes5mm) {
        this.delihippocampes5mm = delihippocampes5mm;
    }

    public Boolean getDelicorpscalleux() {
        return delicorpscalleux;
    }

    public void setDelicorpscalleux(Boolean delicorpscalleux) {
        this.delicorpscalleux = delicorpscalleux;
    }

    public Boolean getDelilobetemporaux() {
        return delilobetemporaux;
    }

    public void setDelilobetemporaux(Boolean delilobetemporaux) {
        this.delilobetemporaux = delilobetemporaux;
    }

    public Boolean getDelilobefrontaux() {
        return delilobefrontaux;
    }

    public void setDelilobefrontaux(Boolean delilobefrontaux) {
        this.delilobefrontaux = delilobefrontaux;
    }

    public Boolean getDelicervelet() {
        return delicervelet;
    }

    public void setDelicervelet(Boolean delicervelet) {
        this.delicervelet = delicervelet;
    }

    public Boolean getDeliperiventriculaire() {
        return deliperiventriculaire;
    }

    public void setDeliperiventriculaire(Boolean deliperiventriculaire) {
        this.deliperiventriculaire = deliperiventriculaire;
    }

    public Boolean getDeliencephalesain() {
        return deliencephalesain;
    }

    public void setDeliencephalesain(Boolean deliencephalesain) {
        this.deliencephalesain = deliencephalesain;
    }

    public Boolean getDelisustentoriel() {
        return delisustentoriel;
    }

    public void setDelisustentoriel(Boolean delisustentoriel) {
        this.delisustentoriel = delisustentoriel;
    }

    public Boolean getDelifosseposterieure() {
        return delifosseposterieure;
    }

    public void setDelifosseposterieure(Boolean delifosseposterieure) {
        this.delifosseposterieure = delifosseposterieure;
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
        if (!(object instanceof Dosimetrie)) {
            return false;
        }
        Dosimetrie other = (Dosimetrie) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gr.aueb.ecrf.Dosimetrie[ id=" + id + " ]";
    }
    
}
