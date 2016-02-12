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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Midas
 */
@Entity
@Table(name = "consultation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Consultation.findAll", query = "SELECT c FROM Consultation c"),
    @NamedQuery(name = "Consultation.findById", query = "SELECT c FROM Consultation c WHERE c.id = :id"),
    @NamedQuery(name = "Consultation.findByDateexamen", query = "SELECT c FROM Consultation c WHERE c.dateexamen = :dateexamen"),
    @NamedQuery(name = "Consultation.findByDelaipostRT", query = "SELECT c FROM Consultation c WHERE c.delaipostRT = :delaipostRT"),
    @NamedQuery(name = "Consultation.findByLignedetraitement", query = "SELECT c FROM Consultation c WHERE c.lignedetraitement = :lignedetraitement"),
    @NamedQuery(name = "Consultation.findByChimiotherapie", query = "SELECT c FROM Consultation c WHERE c.chimiotherapie = :chimiotherapie"),
    @NamedQuery(name = "Consultation.findByCycle", query = "SELECT c FROM Consultation c WHERE c.cycle = :cycle"),
    @NamedQuery(name = "Consultation.findByPosologie", query = "SELECT c FROM Consultation c WHERE c.posologie = :posologie"),
    @NamedQuery(name = "Consultation.findByDosetotale", query = "SELECT c FROM Consultation c WHERE c.dosetotale = :dosetotale"),
    @NamedQuery(name = "Consultation.findByIk", query = "SELECT c FROM Consultation c WHERE c.ik = :ik"),
    @NamedQuery(name = "Consultation.findByExamennormal", query = "SELECT c FROM Consultation c WHERE c.examennormal = :examennormal"),
    @NamedQuery(name = "Consultation.findByEpilepsie", query = "SELECT c FROM Consultation c WHERE c.epilepsie = :epilepsie"),
    @NamedQuery(name = "Consultation.findByDeficitsensitivomoteur", query = "SELECT c FROM Consultation c WHERE c.deficitsensitivomoteur = :deficitsensitivomoteur"),
    @NamedQuery(name = "Consultation.findByTroublesphasiques", query = "SELECT c FROM Consultation c WHERE c.troublesphasiques = :troublesphasiques"),
    @NamedQuery(name = "Consultation.findByTroublesmnesiques", query = "SELECT c FROM Consultation c WHERE c.troublesmnesiques = :troublesmnesiques"),
    @NamedQuery(name = "Consultation.findByTroublesattentionnels", query = "SELECT c FROM Consultation c WHERE c.troublesattentionnels = :troublesattentionnels"),
    @NamedQuery(name = "Consultation.findByTroublesexecutifs", query = "SELECT c FROM Consultation c WHERE c.troublesexecutifs = :troublesexecutifs"),
    @NamedQuery(name = "Consultation.findByRigiditeaxiale", query = "SELECT c FROM Consultation c WHERE c.rigiditeaxiale = :rigiditeaxiale"),
    @NamedQuery(name = "Consultation.findByRalentissementmarche", query = "SELECT c FROM Consultation c WHERE c.ralentissementmarche = :ralentissementmarche"),
    @NamedQuery(name = "Consultation.findByBradykinesie", query = "SELECT c FROM Consultation c WHERE c.bradykinesie = :bradykinesie"),
    @NamedQuery(name = "Consultation.findByUrgenturie", query = "SELECT c FROM Consultation c WHERE c.urgenturie = :urgenturie"),
    @NamedQuery(name = "Consultation.findByRigiditemembres", query = "SELECT c FROM Consultation c WHERE c.rigiditemembres = :rigiditemembres"),
    @NamedQuery(name = "Consultation.findByApraxiemarche", query = "SELECT c FROM Consultation c WHERE c.apraxiemarche = :apraxiemarche"),
    @NamedQuery(name = "Consultation.findByApathie", query = "SELECT c FROM Consultation c WHERE c.apathie = :apathie"),
    @NamedQuery(name = "Consultation.findByHypophonie", query = "SELECT c FROM Consultation c WHERE c.hypophonie = :hypophonie"),
    @NamedQuery(name = "Consultation.findByTroubledelaposture", query = "SELECT c FROM Consultation c WHERE c.troubledelaposture = :troubledelaposture"),
    @NamedQuery(name = "Consultation.findByIncontinenceurinaire", query = "SELECT c FROM Consultation c WHERE c.incontinenceurinaire = :incontinenceurinaire"),
    @NamedQuery(name = "Consultation.findByHb", query = "SELECT c FROM Consultation c WHERE c.hb = :hb"),
    @NamedQuery(name = "Consultation.findByHbNadir", query = "SELECT c FROM Consultation c WHERE c.hbNadir = :hbNadir"),
    @NamedQuery(name = "Consultation.findByPnn", query = "SELECT c FROM Consultation c WHERE c.pnn = :pnn"),
    @NamedQuery(name = "Consultation.findByPNNNadir", query = "SELECT c FROM Consultation c WHERE c.pNNNadir = :pNNNadir"),
    @NamedQuery(name = "Consultation.findByLymphocite", query = "SELECT c FROM Consultation c WHERE c.lymphocite = :lymphocite"),
    @NamedQuery(name = "Consultation.findByLymphociteNadir", query = "SELECT c FROM Consultation c WHERE c.lymphociteNadir = :lymphociteNadir"),
    @NamedQuery(name = "Consultation.findByPlaquettes", query = "SELECT c FROM Consultation c WHERE c.plaquettes = :plaquettes"),
    @NamedQuery(name = "Consultation.findByPlaquettesNadir", query = "SELECT c FROM Consultation c WHERE c.plaquettesNadir = :plaquettesNadir"),
    @NamedQuery(name = "Consultation.findByBilanhepatique", query = "SELECT c FROM Consultation c WHERE c.bilanhepatique = :bilanhepatique"),
    @NamedQuery(name = "Consultation.findByAsatAlat", query = "SELECT c FROM Consultation c WHERE c.asatAlat = :asatAlat"),
    @NamedQuery(name = "Consultation.findByPhosphatealkaline", query = "SELECT c FROM Consultation c WHERE c.phosphatealkaline = :phosphatealkaline"),
    @NamedQuery(name = "Consultation.findByBilirubinemie", query = "SELECT c FROM Consultation c WHERE c.bilirubinemie = :bilirubinemie"),
    @NamedQuery(name = "Consultation.findByFonctionrenale", query = "SELECT c FROM Consultation c WHERE c.fonctionrenale = :fonctionrenale"),
    @NamedQuery(name = "Consultation.findByProteinurie", query = "SELECT c FROM Consultation c WHERE c.proteinurie = :proteinurie"),
    @NamedQuery(name = "Consultation.findByChimionausees", query = "SELECT c FROM Consultation c WHERE c.chimionausees = :chimionausees"),
    @NamedQuery(name = "Consultation.findByChimiofatigue", query = "SELECT c FROM Consultation c WHERE c.chimiofatigue = :chimiofatigue"),
    @NamedQuery(name = "Consultation.findByChimiocephalees", query = "SELECT c FROM Consultation c WHERE c.chimiocephalees = :chimiocephalees"),
    @NamedQuery(name = "Consultation.findByChimiodiarrhees", query = "SELECT c FROM Consultation c WHERE c.chimiodiarrhees = :chimiodiarrhees"),
    @NamedQuery(name = "Consultation.findByChimioconstipation", query = "SELECT c FROM Consultation c WHERE c.chimioconstipation = :chimioconstipation"),
    @NamedQuery(name = "Consultation.findByChimiofievre", query = "SELECT c FROM Consultation c WHERE c.chimiofievre = :chimiofievre"),
    @NamedQuery(name = "Consultation.findByChimioepistaxis", query = "SELECT c FROM Consultation c WHERE c.chimioepistaxis = :chimioepistaxis"),
    @NamedQuery(name = "Consultation.findByChimioallergies", query = "SELECT c FROM Consultation c WHERE c.chimioallergies = :chimioallergies"),
    @NamedQuery(name = "Consultation.findByChimiohemato", query = "SELECT c FROM Consultation c WHERE c.chimiohemato = :chimiohemato"),
    @NamedQuery(name = "Consultation.findByChimiodyspnees", query = "SELECT c FROM Consultation c WHERE c.chimiodyspnees = :chimiodyspnees"),
    @NamedQuery(name = "Consultation.findByChimiophlebites", query = "SELECT c FROM Consultation c WHERE c.chimiophlebites = :chimiophlebites"),
    @NamedQuery(name = "Consultation.findByChimioautres", query = "SELECT c FROM Consultation c WHERE c.chimioautres = :chimioautres"),
    @NamedQuery(name = "Consultation.findByAntiemetique", query = "SELECT c FROM Consultation c WHERE c.antiemetique = :antiemetique"),
    @NamedQuery(name = "Consultation.findByCorticotherapienom", query = "SELECT c FROM Consultation c WHERE c.corticotherapienom = :corticotherapienom"),
    @NamedQuery(name = "Consultation.findByCorticotherapieposologie", query = "SELECT c FROM Consultation c WHERE c.corticotherapieposologie = :corticotherapieposologie"),
    @NamedQuery(name = "Consultation.findByNombredecriseepileptiquepartielle", query = "SELECT c FROM Consultation c WHERE c.nombredecriseepileptiquepartielle = :nombredecriseepileptiquepartielle"),
    @NamedQuery(name = "Consultation.findByNombredecriseepileptiquegeneralisee", query = "SELECT c FROM Consultation c WHERE c.nombredecriseepileptiquegeneralisee = :nombredecriseepileptiquegeneralisee"),
    @NamedQuery(name = "Consultation.findByNombredantiepileptique", query = "SELECT c FROM Consultation c WHERE c.nombredantiepileptique = :nombredantiepileptique"),
    @NamedQuery(name = "Consultation.findByAntiepileptique1nom", query = "SELECT c FROM Consultation c WHERE c.antiepileptique1nom = :antiepileptique1nom"),
    @NamedQuery(name = "Consultation.findByAntiepileptique1posologie", query = "SELECT c FROM Consultation c WHERE c.antiepileptique1posologie = :antiepileptique1posologie"),
    @NamedQuery(name = "Consultation.findByAntiepileptique2nom", query = "SELECT c FROM Consultation c WHERE c.antiepileptique2nom = :antiepileptique2nom"),
    @NamedQuery(name = "Consultation.findByAntiepileptique2posologie", query = "SELECT c FROM Consultation c WHERE c.antiepileptique2posologie = :antiepileptique2posologie"),
    @NamedQuery(name = "Consultation.findByAntiepileptique3nom", query = "SELECT c FROM Consultation c WHERE c.antiepileptique3nom = :antiepileptique3nom"),
    @NamedQuery(name = "Consultation.findByAntiepileptique3posologie", query = "SELECT c FROM Consultation c WHERE c.antiepileptique3posologie = :antiepileptique3posologie"),
    @NamedQuery(name = "Consultation.findByAntiepileptique4nom", query = "SELECT c FROM Consultation c WHERE c.antiepileptique4nom = :antiepileptique4nom"),
    @NamedQuery(name = "Consultation.findByAntiepileptique4posologie", query = "SELECT c FROM Consultation c WHERE c.antiepileptique4posologie = :antiepileptique4posologie"),
    @NamedQuery(name = "Consultation.findByProphylaxieantiTVP", query = "SELECT c FROM Consultation c WHERE c.prophylaxieantiTVP = :prophylaxieantiTVP"),
    @NamedQuery(name = "Consultation.findByProphylaxiepneumocystiscarinii", query = "SELECT c FROM Consultation c WHERE c.prophylaxiepneumocystiscarinii = :prophylaxiepneumocystiscarinii"),
    @NamedQuery(name = "Consultation.findByEPOdarbopoetin", query = "SELECT c FROM Consultation c WHERE c.ePOdarbopoetin = :ePOdarbopoetin"),
    @NamedQuery(name = "Consultation.findByGCsf", query = "SELECT c FROM Consultation c WHERE c.gCsf = :gCsf")})
public class Consultation implements Serializable {
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
    @Column(name = "Ligne_de_traitement")
    private Float lignedetraitement;
    
   
    @Column(name = "Chimiotherapie")
    private String chimiotherapie;
    @Column(name = "Cycle")
    private Float cycle;
    @Column(name = "Posologie")
    private Float posologie;
    @Column(name = "Dose_totale")
    private Float dosetotale;
    @Column(name = "IK")
    private Float ik;
    @Column(name = "Examen_normal")
    private Boolean examennormal;
    @Column(name = "Epilepsie")
    private Boolean epilepsie;
    @Column(name = "Deficit_sensitivomoteur")
    private Boolean deficitsensitivomoteur;
    @Column(name = "Troubles_phasiques")
    private Boolean troublesphasiques;
    @Column(name = "Troubles_mnesiques")
    private Boolean troublesmnesiques;
    @Column(name = "Troubles_attentionnels")
    private Boolean troublesattentionnels;
    @Column(name = "Troubles_executifs")
    private Boolean troublesexecutifs;
    @Column(name = "Rigidite_axiale")
    private Boolean rigiditeaxiale;
    @Column(name = "Ralentissement_marche")
    private Boolean ralentissementmarche;
    @Column(name = "Bradykinesie")
    private Boolean bradykinesie;
    @Column(name = "Urgenturie")
    private Boolean urgenturie;
    @Column(name = "Rigidite_membres")
    private Boolean rigiditemembres;
    @Column(name = "Apraxie_marche")
    private Boolean apraxiemarche;
    @Column(name = "Apathie")
    private Boolean apathie;
    @Column(name = "Hypophonie")
    private Boolean hypophonie;
    @Column(name = "Trouble_de_la_posture")
    private Boolean troubledelaposture;
    @Column(name = "Incontinence_urinaire")
    private Boolean incontinenceurinaire;
    @Column(name = "Hb")
    private Float hb;
    @Column(name = "Hb_Nadir")
    private Float hbNadir;
    @Column(name = "PNN")
    private Float pnn;
    @Column(name = "PNN_Nadir")
    private Float pNNNadir;
    @Column(name = "Lymphocite")
    private Float lymphocite;
    @Column(name = "Lymphocite_Nadir")
    private Float lymphociteNadir;
    @Column(name = "Plaquettes")
    private Float plaquettes;
    @Column(name = "Plaquettes_Nadir")
    private Float plaquettesNadir;
    
    @Column(name = "Bilan_hepatique")
    private String bilanhepatique;
    @Column(name = "ASAT_ALAT")
    private Float asatAlat;
    @Column(name = "Phosphate_alkaline")
    private Float phosphatealkaline;
    @Column(name = "Bilirubinemie")
    private Float bilirubinemie;
    
    @Column(name = "Fonction_renale")
    private String fonctionrenale;
    
    @Column(name = "Proteinurie")
    private String proteinurie;
    
    @Column(name = "Chimio_nausees")
    private String chimionausees;
    
    @Column(name = "Chimio_fatigue")
    private String chimiofatigue;
    
    @Column(name = "Chimio_cephalees")
    private String chimiocephalees;
    
    @Column(name = "Chimio_diarrhees")
    private String chimiodiarrhees;
    
    @Column(name = "Chimio_constipation")
    private String chimioconstipation;
    
    @Column(name = "Chimio_fievre")
    private String chimiofievre;
    
    @Column(name = "Chimio_epistaxis")
    private String chimioepistaxis;
    
    @Column(name = "Chimio_allergies")
    private String chimioallergies;
    
    @Column(name = "Chimio_hemato")
    private String chimiohemato;
    
    @Column(name = "Chimio_dyspnees")
    private String chimiodyspnees;
    
    @Column(name = "Chimio_phlebites")
    private String chimiophlebites;
    
    @Column(name = "Chimio_autres")
    private String chimioautres;
    
    @Column(name = "Antiemetique")
    private String antiemetique;
    
    @Column(name = "Corticotherapie_nom")
    private String corticotherapienom;
    @Column(name = "Corticotherapie_posologie")
    private Float corticotherapieposologie;
    @Column(name = "Nombre_de_crise_epileptique_partielle")
    private Float nombredecriseepileptiquepartielle;
    @Column(name = "Nombre_de_crise_epileptique_generalisee")
    private Float nombredecriseepileptiquegeneralisee;
    @Column(name = "Nombre_d_antiepileptique")
    private Float nombredantiepileptique;
    
    @Column(name = "Antiepileptique_1_nom")
    private String antiepileptique1nom;
    @Column(name = "Antiepileptique_1_posologie")
    private Float antiepileptique1posologie;
    
    @Column(name = "Antiepileptique_2_nom")
    private String antiepileptique2nom;
    @Column(name = "Antiepileptique_2_posologie")
    private Float antiepileptique2posologie;
    
    @Column(name = "Antiepileptique_3_nom")
    private String antiepileptique3nom;
    @Column(name = "Antiepileptique_3_posologie")
    private Float antiepileptique3posologie;
    
    @Column(name = "Antiepileptique_4_nom")
    private String antiepileptique4nom;
    @Column(name = "Antiepileptique_4_posologie")
    private Float antiepileptique4posologie;
    @Column(name = "Prophylaxie_anti_TVP")
    private Boolean prophylaxieantiTVP;
    @Column(name = "Prophylaxie_pneumocystis_carinii")
    private Boolean prophylaxiepneumocystiscarinii;
    @Column(name = "EPO_darbopoetin")
    private Boolean ePOdarbopoetin;
    @Column(name = "G_CSF")
    private Boolean gCsf;
    @JoinColumn(name = "Code_patient", referencedColumnName = "Code_patient")
    @ManyToOne(optional = false)
    private Patient codepatient;
    @JoinColumn(name = "Visite", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Visit visite;
    @OneToOne(mappedBy = "consultationid")
    private Visit visit;

    public Consultation() {
    }

    public Consultation(Long id) {
        this.id = id;
    }

    public Consultation(Long id, Date dateexamen, Float delaipostRT) {
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

    public Float getLignedetraitement() {
        return lignedetraitement;
    }

    public void setLignedetraitement(Float lignedetraitement) {
        this.lignedetraitement = lignedetraitement;
    }

    public String getChimiotherapie() {
        return chimiotherapie;
    }

    public void setChimiotherapie(String chimiotherapie) {
        this.chimiotherapie = chimiotherapie;
    }

    public Float getCycle() {
        return cycle;
    }

    public void setCycle(Float cycle) {
        this.cycle = cycle;
    }

    public Float getPosologie() {
        return posologie;
    }

    public void setPosologie(Float posologie) {
        this.posologie = posologie;
    }

    public Float getDosetotale() {
        return dosetotale;
    }

    public void setDosetotale(Float dosetotale) {
        this.dosetotale = dosetotale;
    }

    public Float getIk() {
        return ik;
    }

    public void setIk(Float ik) {
        this.ik = ik;
    }

    public Boolean getExamennormal() {
        return examennormal;
    }

    public void setExamennormal(Boolean examennormal) {
        this.examennormal = examennormal;
    }

    public Boolean getEpilepsie() {
        return epilepsie;
    }

    public void setEpilepsie(Boolean epilepsie) {
        this.epilepsie = epilepsie;
    }

    public Boolean getDeficitsensitivomoteur() {
        return deficitsensitivomoteur;
    }

    public void setDeficitsensitivomoteur(Boolean deficitsensitivomoteur) {
        this.deficitsensitivomoteur = deficitsensitivomoteur;
    }

    public Boolean getTroublesphasiques() {
        return troublesphasiques;
    }

    public void setTroublesphasiques(Boolean troublesphasiques) {
        this.troublesphasiques = troublesphasiques;
    }

    public Boolean getTroublesmnesiques() {
        return troublesmnesiques;
    }

    public void setTroublesmnesiques(Boolean troublesmnesiques) {
        this.troublesmnesiques = troublesmnesiques;
    }

    public Boolean getTroublesattentionnels() {
        return troublesattentionnels;
    }

    public void setTroublesattentionnels(Boolean troublesattentionnels) {
        this.troublesattentionnels = troublesattentionnels;
    }

    public Boolean getTroublesexecutifs() {
        return troublesexecutifs;
    }

    public void setTroublesexecutifs(Boolean troublesexecutifs) {
        this.troublesexecutifs = troublesexecutifs;
    }

    public Boolean getRigiditeaxiale() {
        return rigiditeaxiale;
    }

    public void setRigiditeaxiale(Boolean rigiditeaxiale) {
        this.rigiditeaxiale = rigiditeaxiale;
    }

    public Boolean getRalentissementmarche() {
        return ralentissementmarche;
    }

    public void setRalentissementmarche(Boolean ralentissementmarche) {
        this.ralentissementmarche = ralentissementmarche;
    }

    public Boolean getBradykinesie() {
        return bradykinesie;
    }

    public void setBradykinesie(Boolean bradykinesie) {
        this.bradykinesie = bradykinesie;
    }

    public Boolean getUrgenturie() {
        return urgenturie;
    }

    public void setUrgenturie(Boolean urgenturie) {
        this.urgenturie = urgenturie;
    }

    public Boolean getRigiditemembres() {
        return rigiditemembres;
    }

    public void setRigiditemembres(Boolean rigiditemembres) {
        this.rigiditemembres = rigiditemembres;
    }

    public Boolean getApraxiemarche() {
        return apraxiemarche;
    }

    public void setApraxiemarche(Boolean apraxiemarche) {
        this.apraxiemarche = apraxiemarche;
    }

    public Boolean getApathie() {
        return apathie;
    }

    public void setApathie(Boolean apathie) {
        this.apathie = apathie;
    }

    public Boolean getHypophonie() {
        return hypophonie;
    }

    public void setHypophonie(Boolean hypophonie) {
        this.hypophonie = hypophonie;
    }

    public Boolean getTroubledelaposture() {
        return troubledelaposture;
    }

    public void setTroubledelaposture(Boolean troubledelaposture) {
        this.troubledelaposture = troubledelaposture;
    }

    public Boolean getIncontinenceurinaire() {
        return incontinenceurinaire;
    }

    public void setIncontinenceurinaire(Boolean incontinenceurinaire) {
        this.incontinenceurinaire = incontinenceurinaire;
    }

    public Float getHb() {
        return hb;
    }

    public void setHb(Float hb) {
        this.hb = hb;
    }

    public Float getHbNadir() {
        return hbNadir;
    }

    public void setHbNadir(Float hbNadir) {
        this.hbNadir = hbNadir;
    }

    public Float getPnn() {
        return pnn;
    }

    public void setPnn(Float pnn) {
        this.pnn = pnn;
    }

    public Float getPNNNadir() {
        return pNNNadir;
    }

    public void setPNNNadir(Float pNNNadir) {
        this.pNNNadir = pNNNadir;
    }

    public Float getLymphocite() {
        return lymphocite;
    }

    public void setLymphocite(Float lymphocite) {
        this.lymphocite = lymphocite;
    }

    public Float getLymphociteNadir() {
        return lymphociteNadir;
    }

    public void setLymphociteNadir(Float lymphociteNadir) {
        this.lymphociteNadir = lymphociteNadir;
    }

    public Float getPlaquettes() {
        return plaquettes;
    }

    public void setPlaquettes(Float plaquettes) {
        this.plaquettes = plaquettes;
    }

    public Float getPlaquettesNadir() {
        return plaquettesNadir;
    }

    public void setPlaquettesNadir(Float plaquettesNadir) {
        this.plaquettesNadir = plaquettesNadir;
    }

    public String getBilanhepatique() {
        return bilanhepatique;
    }

    public void setBilanhepatique(String bilanhepatique) {
        this.bilanhepatique = bilanhepatique;
    }

    public Float getAsatAlat() {
        return asatAlat;
    }

    public void setAsatAlat(Float asatAlat) {
        this.asatAlat = asatAlat;
    }

    public Float getPhosphatealkaline() {
        return phosphatealkaline;
    }

    public void setPhosphatealkaline(Float phosphatealkaline) {
        this.phosphatealkaline = phosphatealkaline;
    }

    public Float getBilirubinemie() {
        return bilirubinemie;
    }

    public void setBilirubinemie(Float bilirubinemie) {
        this.bilirubinemie = bilirubinemie;
    }

    public String getFonctionrenale() {
        return fonctionrenale;
    }

    public void setFonctionrenale(String fonctionrenale) {
        this.fonctionrenale = fonctionrenale;
    }

    public String getProteinurie() {
        return proteinurie;
    }

    public void setProteinurie(String proteinurie) {
        this.proteinurie = proteinurie;
    }

    public String getChimionausees() {
        return chimionausees;
    }

    public void setChimionausees(String chimionausees) {
        this.chimionausees = chimionausees;
    }

    public String getChimiofatigue() {
        return chimiofatigue;
    }

    public void setChimiofatigue(String chimiofatigue) {
        this.chimiofatigue = chimiofatigue;
    }

    public String getChimiocephalees() {
        return chimiocephalees;
    }

    public void setChimiocephalees(String chimiocephalees) {
        this.chimiocephalees = chimiocephalees;
    }

    public String getChimiodiarrhees() {
        return chimiodiarrhees;
    }

    public void setChimiodiarrhees(String chimiodiarrhees) {
        this.chimiodiarrhees = chimiodiarrhees;
    }

    public String getChimioconstipation() {
        return chimioconstipation;
    }

    public void setChimioconstipation(String chimioconstipation) {
        this.chimioconstipation = chimioconstipation;
    }

    public String getChimiofievre() {
        return chimiofievre;
    }

    public void setChimiofievre(String chimiofievre) {
        this.chimiofievre = chimiofievre;
    }

    public String getChimioepistaxis() {
        return chimioepistaxis;
    }

    public void setChimioepistaxis(String chimioepistaxis) {
        this.chimioepistaxis = chimioepistaxis;
    }

    public String getChimioallergies() {
        return chimioallergies;
    }

    public void setChimioallergies(String chimioallergies) {
        this.chimioallergies = chimioallergies;
    }

    public String getChimiohemato() {
        return chimiohemato;
    }

    public void setChimiohemato(String chimiohemato) {
        this.chimiohemato = chimiohemato;
    }

    public String getChimiodyspnees() {
        return chimiodyspnees;
    }

    public void setChimiodyspnees(String chimiodyspnees) {
        this.chimiodyspnees = chimiodyspnees;
    }

    public String getChimiophlebites() {
        return chimiophlebites;
    }

    public void setChimiophlebites(String chimiophlebites) {
        this.chimiophlebites = chimiophlebites;
    }

    public String getChimioautres() {
        return chimioautres;
    }

    public void setChimioautres(String chimioautres) {
        this.chimioautres = chimioautres;
    }

    public String getAntiemetique() {
        return antiemetique;
    }

    public void setAntiemetique(String antiemetique) {
        this.antiemetique = antiemetique;
    }

    public String getCorticotherapienom() {
        return corticotherapienom;
    }

    public void setCorticotherapienom(String corticotherapienom) {
        this.corticotherapienom = corticotherapienom;
    }

    public Float getCorticotherapieposologie() {
        return corticotherapieposologie;
    }

    public void setCorticotherapieposologie(Float corticotherapieposologie) {
        this.corticotherapieposologie = corticotherapieposologie;
    }

    public Float getNombredecriseepileptiquepartielle() {
        return nombredecriseepileptiquepartielle;
    }

    public void setNombredecriseepileptiquepartielle(Float nombredecriseepileptiquepartielle) {
        this.nombredecriseepileptiquepartielle = nombredecriseepileptiquepartielle;
    }

    public Float getNombredecriseepileptiquegeneralisee() {
        return nombredecriseepileptiquegeneralisee;
    }

    public void setNombredecriseepileptiquegeneralisee(Float nombredecriseepileptiquegeneralisee) {
        this.nombredecriseepileptiquegeneralisee = nombredecriseepileptiquegeneralisee;
    }

    public Float getNombredantiepileptique() {
        return nombredantiepileptique;
    }

    public void setNombredantiepileptique(Float nombredantiepileptique) {
        this.nombredantiepileptique = nombredantiepileptique;
    }

    public String getAntiepileptique1nom() {
        return antiepileptique1nom;
    }

    public void setAntiepileptique1nom(String antiepileptique1nom) {
        this.antiepileptique1nom = antiepileptique1nom;
    }

    public Float getAntiepileptique1posologie() {
        return antiepileptique1posologie;
    }

    public void setAntiepileptique1posologie(Float antiepileptique1posologie) {
        this.antiepileptique1posologie = antiepileptique1posologie;
    }

    public String getAntiepileptique2nom() {
        return antiepileptique2nom;
    }

    public void setAntiepileptique2nom(String antiepileptique2nom) {
        this.antiepileptique2nom = antiepileptique2nom;
    }

    public Float getAntiepileptique2posologie() {
        return antiepileptique2posologie;
    }

    public void setAntiepileptique2posologie(Float antiepileptique2posologie) {
        this.antiepileptique2posologie = antiepileptique2posologie;
    }

    public String getAntiepileptique3nom() {
        return antiepileptique3nom;
    }

    public void setAntiepileptique3nom(String antiepileptique3nom) {
        this.antiepileptique3nom = antiepileptique3nom;
    }

    public Float getAntiepileptique3posologie() {
        return antiepileptique3posologie;
    }

    public void setAntiepileptique3posologie(Float antiepileptique3posologie) {
        this.antiepileptique3posologie = antiepileptique3posologie;
    }

    public String getAntiepileptique4nom() {
        return antiepileptique4nom;
    }

    public void setAntiepileptique4nom(String antiepileptique4nom) {
        this.antiepileptique4nom = antiepileptique4nom;
    }

    public Float getAntiepileptique4posologie() {
        return antiepileptique4posologie;
    }

    public void setAntiepileptique4posologie(Float antiepileptique4posologie) {
        this.antiepileptique4posologie = antiepileptique4posologie;
    }

    public Boolean getProphylaxieantiTVP() {
        return prophylaxieantiTVP;
    }

    public void setProphylaxieantiTVP(Boolean prophylaxieantiTVP) {
        this.prophylaxieantiTVP = prophylaxieantiTVP;
    }

    public Boolean getProphylaxiepneumocystiscarinii() {
        return prophylaxiepneumocystiscarinii;
    }

    public void setProphylaxiepneumocystiscarinii(Boolean prophylaxiepneumocystiscarinii) {
        this.prophylaxiepneumocystiscarinii = prophylaxiepneumocystiscarinii;
    }

    public Boolean getEPOdarbopoetin() {
        return ePOdarbopoetin;
    }

    public void setEPOdarbopoetin(Boolean ePOdarbopoetin) {
        this.ePOdarbopoetin = ePOdarbopoetin;
    }

    public Boolean getGCsf() {
        return gCsf;
    }

    public void setGCsf(Boolean gCsf) {
        this.gCsf = gCsf;
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
        if (!(object instanceof Consultation)) {
            return false;
        }
        Consultation other = (Consultation) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gr.aueb.ecrf.Consultation[ id=" + id + " ]";
    }
    
}
