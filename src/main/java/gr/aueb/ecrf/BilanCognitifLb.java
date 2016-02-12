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
@Table(name = "bilan_cognitif_lb")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BilanCognitifLb.findAll", query = "SELECT b FROM BilanCognitifLb b"),
    @NamedQuery(name = "BilanCognitifLb.findById", query = "SELECT b FROM BilanCognitifLb b WHERE b.id = :id"),
    @NamedQuery(name = "BilanCognitifLb.findByDateexamen", query = "SELECT b FROM BilanCognitifLb b WHERE b.dateexamen = :dateexamen"),
    @NamedQuery(name = "BilanCognitifLb.findByDelaipostRT", query = "SELECT b FROM BilanCognitifLb b WHERE b.delaipostRT = :delaipostRT"),
    @NamedQuery(name = "BilanCognitifLb.findByEtatbilan", query = "SELECT b FROM BilanCognitifLb b WHERE b.etatbilan = :etatbilan"),
    @NamedQuery(name = "BilanCognitifLb.findByFNARTtotal", query = "SELECT b FROM BilanCognitifLb b WHERE b.fNARTtotal = :fNARTtotal"),
    @NamedQuery(name = "BilanCognitifLb.findByMMSEtotal", query = "SELECT b FROM BilanCognitifLb b WHERE b.mMSEtotal = :mMSEtotal"),
    @NamedQuery(name = "BilanCognitifLb.findByMOCAtotal", query = "SELECT b FROM BilanCognitifLb b WHERE b.mOCAtotal = :mOCAtotal"),
    @NamedQuery(name = "BilanCognitifLb.findByMattisbruttotal", query = "SELECT b FROM BilanCognitifLb b WHERE b.mattisbruttotal = :mattisbruttotal"),
    @NamedQuery(name = "BilanCognitifLb.findByMattisPCtotal", query = "SELECT b FROM BilanCognitifLb b WHERE b.mattisPCtotal = :mattisPCtotal"),
    @NamedQuery(name = "BilanCognitifLb.findByRLRI16brutRL1", query = "SELECT b FROM BilanCognitifLb b WHERE b.rLRI16brutRL1 = :rLRI16brutRL1"),
    @NamedQuery(name = "BilanCognitifLb.findByRlri16ZsRl1", query = "SELECT b FROM BilanCognitifLb b WHERE b.rlri16ZsRl1 = :rlri16ZsRl1"),
    @NamedQuery(name = "BilanCognitifLb.findByRLRI16brutRL2", query = "SELECT b FROM BilanCognitifLb b WHERE b.rLRI16brutRL2 = :rLRI16brutRL2"),
    @NamedQuery(name = "BilanCognitifLb.findByRlri16ZsRl2", query = "SELECT b FROM BilanCognitifLb b WHERE b.rlri16ZsRl2 = :rlri16ZsRl2"),
    @NamedQuery(name = "BilanCognitifLb.findByRLRI16brutRL3", query = "SELECT b FROM BilanCognitifLb b WHERE b.rLRI16brutRL3 = :rLRI16brutRL3"),
    @NamedQuery(name = "BilanCognitifLb.findByRlri16ZsRl3", query = "SELECT b FROM BilanCognitifLb b WHERE b.rlri16ZsRl3 = :rlri16ZsRl3"),
    @NamedQuery(name = "BilanCognitifLb.findByRLRI16brutRD", query = "SELECT b FROM BilanCognitifLb b WHERE b.rLRI16brutRD = :rLRI16brutRD"),
    @NamedQuery(name = "BilanCognitifLb.findByRlri16ZsRd", query = "SELECT b FROM BilanCognitifLb b WHERE b.rlri16ZsRd = :rlri16ZsRd"),
    @NamedQuery(name = "BilanCognitifLb.findByRLRI16Indice", query = "SELECT b FROM BilanCognitifLb b WHERE b.rLRI16Indice = :rLRI16Indice"),
    @NamedQuery(name = "BilanCognitifLb.findByRLRI16ZSmoy", query = "SELECT b FROM BilanCognitifLb b WHERE b.rLRI16ZSmoy = :rLRI16ZSmoy"),
    @NamedQuery(name = "BilanCognitifLb.findByREYbrutrappel", query = "SELECT b FROM BilanCognitifLb b WHERE b.rEYbrutrappel = :rEYbrutrappel"),
    @NamedQuery(name = "BilanCognitifLb.findByREYPCrappel", query = "SELECT b FROM BilanCognitifLb b WHERE b.rEYPCrappel = :rEYPCrappel"),
    @NamedQuery(name = "BilanCognitifLb.findByREYbrutcopie", query = "SELECT b FROM BilanCognitifLb b WHERE b.rEYbrutcopie = :rEYbrutcopie"),
    @NamedQuery(name = "BilanCognitifLb.findByREYPCcopie", query = "SELECT b FROM BilanCognitifLb b WHERE b.rEYPCcopie = :rEYPCcopie"),
    @NamedQuery(name = "BilanCognitifLb.findByEmpandirect", query = "SELECT b FROM BilanCognitifLb b WHERE b.empandirect = :empandirect"),
    @NamedQuery(name = "BilanCognitifLb.findByEmpaninverse", query = "SELECT b FROM BilanCognitifLb b WHERE b.empaninverse = :empaninverse"),
    @NamedQuery(name = "BilanCognitifLb.findByMemoirechiffrebrut", query = "SELECT b FROM BilanCognitifLb b WHERE b.memoirechiffrebrut = :memoirechiffrebrut"),
    @NamedQuery(name = "BilanCognitifLb.findByMemoirechiffreNS", query = "SELECT b FROM BilanCognitifLb b WHERE b.memoirechiffreNS = :memoirechiffreNS"),
    @NamedQuery(name = "BilanCognitifLb.findBySLCbrut", query = "SELECT b FROM BilanCognitifLb b WHERE b.sLCbrut = :sLCbrut"),
    @NamedQuery(name = "BilanCognitifLb.findBySlcNs", query = "SELECT b FROM BilanCognitifLb b WHERE b.slcNs = :slcNs"),
    @NamedQuery(name = "BilanCognitifLb.findByFluencesPbrut", query = "SELECT b FROM BilanCognitifLb b WHERE b.fluencesPbrut = :fluencesPbrut"),
    @NamedQuery(name = "BilanCognitifLb.findByFluencesPZS", query = "SELECT b FROM BilanCognitifLb b WHERE b.fluencesPZS = :fluencesPZS"),
    @NamedQuery(name = "BilanCognitifLb.findByFluencesanimauxbrut", query = "SELECT b FROM BilanCognitifLb b WHERE b.fluencesanimauxbrut = :fluencesanimauxbrut"),
    @NamedQuery(name = "BilanCognitifLb.findByFluencesanimauxZS", query = "SELECT b FROM BilanCognitifLb b WHERE b.fluencesanimauxZS = :fluencesanimauxZS"),
    @NamedQuery(name = "BilanCognitifLb.findByTMTAbrut", query = "SELECT b FROM BilanCognitifLb b WHERE b.tMTAbrut = :tMTAbrut"),
    @NamedQuery(name = "BilanCognitifLb.findByTmtAZs", query = "SELECT b FROM BilanCognitifLb b WHERE b.tmtAZs = :tmtAZs"),
    @NamedQuery(name = "BilanCognitifLb.findByTMTBbrut", query = "SELECT b FROM BilanCognitifLb b WHERE b.tMTBbrut = :tMTBbrut"),
    @NamedQuery(name = "BilanCognitifLb.findByTmtBZs", query = "SELECT b FROM BilanCognitifLb b WHERE b.tmtBZs = :tmtBZs"),
    @NamedQuery(name = "BilanCognitifLb.findByTMTBAbrut", query = "SELECT b FROM BilanCognitifLb b WHERE b.tMTBAbrut = :tMTBAbrut"),
    @NamedQuery(name = "BilanCognitifLb.findByTmtBAZs", query = "SELECT b FROM BilanCognitifLb b WHERE b.tmtBAZs = :tmtBAZs"),
    @NamedQuery(name = "BilanCognitifLb.findByStroopdenobrut", query = "SELECT b FROM BilanCognitifLb b WHERE b.stroopdenobrut = :stroopdenobrut"),
    @NamedQuery(name = "BilanCognitifLb.findByStroopdenoZS", query = "SELECT b FROM BilanCognitifLb b WHERE b.stroopdenoZS = :stroopdenoZS"),
    @NamedQuery(name = "BilanCognitifLb.findByStrooplecturebrut", query = "SELECT b FROM BilanCognitifLb b WHERE b.strooplecturebrut = :strooplecturebrut"),
    @NamedQuery(name = "BilanCognitifLb.findByStrooplectureZS", query = "SELECT b FROM BilanCognitifLb b WHERE b.strooplectureZS = :strooplectureZS"),
    @NamedQuery(name = "BilanCognitifLb.findByStroopinterbrut", query = "SELECT b FROM BilanCognitifLb b WHERE b.stroopinterbrut = :stroopinterbrut"),
    @NamedQuery(name = "BilanCognitifLb.findByStroopinterZS", query = "SELECT b FROM BilanCognitifLb b WHERE b.stroopinterZS = :stroopinterZS"),
    @NamedQuery(name = "BilanCognitifLb.findByBNTbrut", query = "SELECT b FROM BilanCognitifLb b WHERE b.bNTbrut = :bNTbrut"),
    @NamedQuery(name = "BilanCognitifLb.findByBntZs", query = "SELECT b FROM BilanCognitifLb b WHERE b.bntZs = :bntZs"),
    @NamedQuery(name = "BilanCognitifLb.findByTokenbrut", query = "SELECT b FROM BilanCognitifLb b WHERE b.tokenbrut = :tokenbrut"),
    @NamedQuery(name = "BilanCognitifLb.findByTokenZS", query = "SELECT b FROM BilanCognitifLb b WHERE b.tokenZS = :tokenZS"),
    @NamedQuery(name = "BilanCognitifLb.findByQLQC30global", query = "SELECT b FROM BilanCognitifLb b WHERE b.qLQC30global = :qLQC30global"),
    @NamedQuery(name = "BilanCognitifLb.findByQLQC30physique", query = "SELECT b FROM BilanCognitifLb b WHERE b.qLQC30physique = :qLQC30physique"),
    @NamedQuery(name = "BilanCognitifLb.findByQLQC30personnel", query = "SELECT b FROM BilanCognitifLb b WHERE b.qLQC30personnel = :qLQC30personnel"),
    @NamedQuery(name = "BilanCognitifLb.findByQLQC30emotionnel", query = "SELECT b FROM BilanCognitifLb b WHERE b.qLQC30emotionnel = :qLQC30emotionnel"),
    @NamedQuery(name = "BilanCognitifLb.findByQLQC30cognitif", query = "SELECT b FROM BilanCognitifLb b WHERE b.qLQC30cognitif = :qLQC30cognitif"),
    @NamedQuery(name = "BilanCognitifLb.findByQLQC30social", query = "SELECT b FROM BilanCognitifLb b WHERE b.qLQC30social = :qLQC30social"),
    @NamedQuery(name = "BilanCognitifLb.findByQLQC30fatigue", query = "SELECT b FROM BilanCognitifLb b WHERE b.qLQC30fatigue = :qLQC30fatigue"),
    @NamedQuery(name = "BilanCognitifLb.findByQLQC30nausees", query = "SELECT b FROM BilanCognitifLb b WHERE b.qLQC30nausees = :qLQC30nausees"),
    @NamedQuery(name = "BilanCognitifLb.findByQLQC30douleur", query = "SELECT b FROM BilanCognitifLb b WHERE b.qLQC30douleur = :qLQC30douleur"),
    @NamedQuery(name = "BilanCognitifLb.findByQLQC30dyspnee", query = "SELECT b FROM BilanCognitifLb b WHERE b.qLQC30dyspnee = :qLQC30dyspnee"),
    @NamedQuery(name = "BilanCognitifLb.findByQLQC30insomnies", query = "SELECT b FROM BilanCognitifLb b WHERE b.qLQC30insomnies = :qLQC30insomnies"),
    @NamedQuery(name = "BilanCognitifLb.findByQLQC30appetit", query = "SELECT b FROM BilanCognitifLb b WHERE b.qLQC30appetit = :qLQC30appetit"),
    @NamedQuery(name = "BilanCognitifLb.findByQLQC30constipation", query = "SELECT b FROM BilanCognitifLb b WHERE b.qLQC30constipation = :qLQC30constipation"),
    @NamedQuery(name = "BilanCognitifLb.findByQLQC30diarhees", query = "SELECT b FROM BilanCognitifLb b WHERE b.qLQC30diarhees = :qLQC30diarhees"),
    @NamedQuery(name = "BilanCognitifLb.findByQLQC30finances", query = "SELECT b FROM BilanCognitifLb b WHERE b.qLQC30finances = :qLQC30finances"),
    @NamedQuery(name = "BilanCognitifLb.findByQLQBN20futur", query = "SELECT b FROM BilanCognitifLb b WHERE b.qLQBN20futur = :qLQBN20futur"),
    @NamedQuery(name = "BilanCognitifLb.findByQLQBN20visuel", query = "SELECT b FROM BilanCognitifLb b WHERE b.qLQBN20visuel = :qLQBN20visuel"),
    @NamedQuery(name = "BilanCognitifLb.findByQLQBN20moteur", query = "SELECT b FROM BilanCognitifLb b WHERE b.qLQBN20moteur = :qLQBN20moteur"),
    @NamedQuery(name = "BilanCognitifLb.findByQLQBN20comm", query = "SELECT b FROM BilanCognitifLb b WHERE b.qLQBN20comm = :qLQBN20comm"),
    @NamedQuery(name = "BilanCognitifLb.findByQLQBN20epilepsie", query = "SELECT b FROM BilanCognitifLb b WHERE b.qLQBN20epilepsie = :qLQBN20epilepsie"),
    @NamedQuery(name = "BilanCognitifLb.findByQLQBN20somnolence", query = "SELECT b FROM BilanCognitifLb b WHERE b.qLQBN20somnolence = :qLQBN20somnolence"),
    @NamedQuery(name = "BilanCognitifLb.findByQLQBN20demange", query = "SELECT b FROM BilanCognitifLb b WHERE b.qLQBN20demange = :qLQBN20demange"),
    @NamedQuery(name = "BilanCognitifLb.findByQLQBN20cheveux", query = "SELECT b FROM BilanCognitifLb b WHERE b.qLQBN20cheveux = :qLQBN20cheveux"),
    @NamedQuery(name = "BilanCognitifLb.findByQLQBN20faiblesse", query = "SELECT b FROM BilanCognitifLb b WHERE b.qLQBN20faiblesse = :qLQBN20faiblesse"),
    @NamedQuery(name = "BilanCognitifLb.findByQLQBN20incontinence", query = "SELECT b FROM BilanCognitifLb b WHERE b.qLQBN20incontinence = :qLQBN20incontinence"),
    @NamedQuery(name = "BilanCognitifLb.findByIsdc", query = "SELECT b FROM BilanCognitifLb b WHERE b.isdc = :isdc"),
    @NamedQuery(name = "BilanCognitifLb.findByGoldberg", query = "SELECT b FROM BilanCognitifLb b WHERE b.goldberg = :goldberg"),
    @NamedQuery(name = "BilanCognitifLb.findByFacit", query = "SELECT b FROM BilanCognitifLb b WHERE b.facit = :facit"),
    @NamedQuery(name = "BilanCognitifLb.findByMacNair", query = "SELECT b FROM BilanCognitifLb b WHERE b.macNair = :macNair"),
    @NamedQuery(name = "BilanCognitifLb.findByEiadl", query = "SELECT b FROM BilanCognitifLb b WHERE b.eiadl = :eiadl"),
    @NamedQuery(name = "BilanCognitifLb.findByCes", query = "SELECT b FROM BilanCognitifLb b WHERE b.ces = :ces"),
    @NamedQuery(name = "BilanCognitifLb.findByEvalglobaledeficit", query = "SELECT b FROM BilanCognitifLb b WHERE b.evalglobaledeficit = :evalglobaledeficit"),
    @NamedQuery(name = "BilanCognitifLb.findByMemverbdeficit", query = "SELECT b FROM BilanCognitifLb b WHERE b.memverbdeficit = :memverbdeficit"),
    @NamedQuery(name = "BilanCognitifLb.findByMemvisudeficit", query = "SELECT b FROM BilanCognitifLb b WHERE b.memvisudeficit = :memvisudeficit"),
    @NamedQuery(name = "BilanCognitifLb.findByVTIdeficit", query = "SELECT b FROM BilanCognitifLb b WHERE b.vTIdeficit = :vTIdeficit"),
    @NamedQuery(name = "BilanCognitifLb.findByMCTMDTdeficit", query = "SELECT b FROM BilanCognitifLb b WHERE b.mCTMDTdeficit = :mCTMDTdeficit"),
    @NamedQuery(name = "BilanCognitifLb.findByInhibdeficit", query = "SELECT b FROM BilanCognitifLb b WHERE b.inhibdeficit = :inhibdeficit"),
    @NamedQuery(name = "BilanCognitifLb.findByShiftingdeficit", query = "SELECT b FROM BilanCognitifLb b WHERE b.shiftingdeficit = :shiftingdeficit"),
    @NamedQuery(name = "BilanCognitifLb.findByExpressiondeficit", query = "SELECT b FROM BilanCognitifLb b WHERE b.expressiondeficit = :expressiondeficit"),
    @NamedQuery(name = "BilanCognitifLb.findByComprehensiondeficit", query = "SELECT b FROM BilanCognitifLb b WHERE b.comprehensiondeficit = :comprehensiondeficit"),
    @NamedQuery(name = "BilanCognitifLb.findByVisuoconstrudeficit", query = "SELECT b FROM BilanCognitifLb b WHERE b.visuoconstrudeficit = :visuoconstrudeficit")})
public class BilanCognitifLb implements Serializable {

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
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "Etat_bilan")
    private String etatbilan;
    @Column(name = "fNART_total")
    private Float fNARTtotal;
    @Column(name = "MMSE_total")
    private Float mMSEtotal;
    @Column(name = "MOCA_total")
    private Float mOCAtotal;
    @Column(name = "Mattis_brut_total")
    private Float mattisbruttotal;
    @Column(name = "Mattis_PC_total")
    private Float mattisPCtotal;
    @Column(name = "RLRI16_brut_RL1")
    private Float rLRI16brutRL1;
    @Column(name = "RLRI16_ZS_RL1")
    private Float rlri16ZsRl1;
    @Column(name = "RLRI16_brut_RL2")
    private Float rLRI16brutRL2;
    @Column(name = "RLRI16_ZS_RL2")
    private Float rlri16ZsRl2;
    @Column(name = "RLRI16_brut_RL3")
    private Float rLRI16brutRL3;
    @Column(name = "RLRI16_ZS_RL3")
    private Float rlri16ZsRl3;
    @Column(name = "RLRI16_brut_RD")
    private Float rLRI16brutRD;
    @Column(name = "RLRI16_ZS_RD")
    private Float rlri16ZsRd;
    @Column(name = "RLRI16_Indice")
    private Float rLRI16Indice;
    @Column(name = "RLRI16_ZS_moy")
    private Float rLRI16ZSmoy;
    @Column(name = "REY_brut_rappel")
    private Float rEYbrutrappel;
    @Column(name = "REY_PC_rappel")
    private Float rEYPCrappel;
    @Column(name = "REY_brut_copie")
    private Float rEYbrutcopie;
    @Column(name = "REY_PC_copie")
    private Float rEYPCcopie;
    @Column(name = "Empan_direct")
    private Float empandirect;
    @Column(name = "Empan_inverse")
    private Float empaninverse;
    @Column(name = "Memoire_chiffre_brut")
    private Float memoirechiffrebrut;
    @Column(name = "Memoire_chiffre_NS")
    private Float memoirechiffreNS;
    @Column(name = "SLC_brut")
    private Float sLCbrut;
    @Column(name = "SLC_NS")
    private Float slcNs;
    @Column(name = "Fluences_P_brut")
    private Float fluencesPbrut;
    @Column(name = "Fluences_P_ZS")
    private Float fluencesPZS;
    @Column(name = "Fluences_animaux_brut")
    private Float fluencesanimauxbrut;
    @Column(name = "Fluences_animaux_ZS")
    private Float fluencesanimauxZS;
    @Column(name = "TMT_A_brut")
    private Float tMTAbrut;
    @Column(name = "TMT_A_ZS")
    private Float tmtAZs;
    @Column(name = "TMT_B_brut")
    private Float tMTBbrut;
    @Column(name = "TMT_B_ZS")
    private Float tmtBZs;
    @Column(name = "TMT_B_A_brut")
    private Float tMTBAbrut;
    @Column(name = "TMT_B_A_ZS")
    private Float tmtBAZs;
    @Column(name = "Stroop_deno_brut")
    private Float stroopdenobrut;
    @Column(name = "Stroop_deno_ZS")
    private Float stroopdenoZS;
    @Column(name = "Stroop_lecture_brut")
    private Float strooplecturebrut;
    @Column(name = "Stroop_lecture_ZS")
    private Float strooplectureZS;
    @Column(name = "Stroop_inter_brut")
    private Float stroopinterbrut;
    @Column(name = "Stroop_inter_ZS")
    private Float stroopinterZS;
    @Column(name = "BNT_brut")
    private Float bNTbrut;
    @Column(name = "BNT_ZS")
    private Float bntZs;
    @Column(name = "Token_brut")
    private Float tokenbrut;
    @Column(name = "Token_ZS")
    private Float tokenZS;
    @Column(name = "QLQC30_global")
    private Float qLQC30global;
    @Column(name = "QLQC30_physique")
    private Float qLQC30physique;
    @Column(name = "QLQC30_personnel")
    private Float qLQC30personnel;
    @Column(name = "QLQC30_emotionnel")
    private Float qLQC30emotionnel;
    @Column(name = "QLQC30_cognitif")
    private Float qLQC30cognitif;
    @Column(name = "QLQC30_social")
    private Float qLQC30social;
    @Column(name = "QLQC30_fatigue")
    private Float qLQC30fatigue;
    @Column(name = "QLQC30_nausees")
    private Float qLQC30nausees;
    @Column(name = "QLQC30_douleur")
    private Float qLQC30douleur;
    @Column(name = "QLQC30_dyspnee")
    private Float qLQC30dyspnee;
    @Column(name = "QLQC30_insomnies")
    private Float qLQC30insomnies;
    @Column(name = "QLQC30_appetit")
    private Float qLQC30appetit;
    @Column(name = "QLQC30_constipation")
    private Float qLQC30constipation;
    @Column(name = "QLQC30_diarhees")
    private Float qLQC30diarhees;
    @Column(name = "QLQC30_finances")
    private Float qLQC30finances;
    @Column(name = "QLQBN20_futur")
    private Float qLQBN20futur;
    @Column(name = "QLQBN20_visuel")
    private Float qLQBN20visuel;
    @Column(name = "QLQBN20_moteur")
    private Float qLQBN20moteur;
    @Column(name = "QLQBN20_comm")
    private Float qLQBN20comm;
    @Column(name = "QLQBN20_epilepsie")
    private Float qLQBN20epilepsie;
    @Column(name = "QLQBN20_somnolence")
    private Float qLQBN20somnolence;
    @Column(name = "QLQBN20_demange")
    private Float qLQBN20demange;
    @Column(name = "QLQBN20_cheveux")
    private Float qLQBN20cheveux;
    @Column(name = "QLQBN20_faiblesse")
    private Float qLQBN20faiblesse;
    @Column(name = "QLQBN20_incontinence")
    private Float qLQBN20incontinence;
    @Column(name = "ISDC")
    private Float isdc;
    @Column(name = "Goldberg")
    private Float goldberg;
    @Column(name = "FACIT")
    private Float facit;
    @Column(name = "MacNair")
    private Float macNair;
    @Column(name = "EIADL")
    private Float eiadl;
    @Column(name = "CES")
    private Float ces;
    @Column(name = "Eval_globale_deficit")
    private String evalglobaledeficit;
    @Column(name = "Mem_verb_deficit")
    private String memverbdeficit;
    @Column(name = "Mem_visu_deficit")
    private String memvisudeficit;
    @Column(name = "VTI_deficit")
    private String vTIdeficit;
    @Column(name = "MCT_MDT_deficit")
    private String mCTMDTdeficit;
    @Column(name = "Inhib_deficit")
    private String inhibdeficit;
    @Column(name = "Shifting_deficit")
    private String shiftingdeficit;
    @Column(name = "Expression_deficit")
    private String expressiondeficit;
    @Column(name = "Comprehension_deficit")
    private String comprehensiondeficit;
    @Column(name = "Visuo_constru_deficit")
    private String visuoconstrudeficit;

    @Column(name = "TMT_A_erreurs_brut")
    private Float TMT_A_erreurs_brut;
    @Column(name = "TMT_A_erreurs_ZS")
    private Float TMT_A_erreurs_ZS;
    @Column(name = "TMT_B_erreurs_brut")
    private String TMT_B_erreurs_brut;
    @Column(name = "TMT_B_erreurs_ZS")
    private String TMT_B_erreurs_ZS;
    @Column(name = "TMT_B_A_erreurs_brut")
    private String TMT_B_A_erreurs_brut;
    @Column(name = "TMT_B_A_erreurs_ZS")
    private String TMT_B_A_erreurs_ZS;
    @Column(name = "Stroop_deno_erreurs")
    private String Stroop_deno_erreurs;
    @Column(name = "Stroop_déno_erreurs_ZS")
    private String Stroop_déno_erreurs_ZS;
    @Column(name = "Stroop_lecture_erreurs")
    private String Stroop_lecture_erreurs;
    @Column(name = "Stroop_lecture_erreurs_ZS")
    private String Stroop_lecture_erreurs_ZS;
    @Column(name = "Stroop_inter_erreurs")
    private String Stroop_inter_erreurs;
    @Column(name = "Stroop_inter_erreurs_ZS")
    private String Stroop_inter_erreurs_ZS;

    public Float getTMT_A_erreurs_brut() {
        return TMT_A_erreurs_brut;
    }

    public void setTMT_A_erreurs_brut(Float TMT_A_erreurs_brut) {
        this.TMT_A_erreurs_brut = TMT_A_erreurs_brut;
    }

    public Float getTMT_A_erreurs_ZS() {
        return TMT_A_erreurs_ZS;
    }

    public void setTMT_A_erreurs_ZS(Float TMT_A_erreurs_ZS) {
        this.TMT_A_erreurs_ZS = TMT_A_erreurs_ZS;
    }

    public String getTMT_B_erreurs_brut() {
        return TMT_B_erreurs_brut;
    }

    public void setTMT_B_erreurs_brut(String TMT_B_erreurs_brut) {
        this.TMT_B_erreurs_brut = TMT_B_erreurs_brut;
    }

    public String getTMT_B_erreurs_ZS() {
        return TMT_B_erreurs_ZS;
    }

    public void setTMT_B_erreurs_ZS(String TMT_B_erreurs_ZS) {
        this.TMT_B_erreurs_ZS = TMT_B_erreurs_ZS;
    }

    public String getTMT_B_A_erreurs_brut() {
        return TMT_B_A_erreurs_brut;
    }

    public void setTMT_B_A_erreurs_brut(String TMT_B_A_erreurs_brut) {
        this.TMT_B_A_erreurs_brut = TMT_B_A_erreurs_brut;
    }

    public String getTMT_B_A_erreurs_ZS() {
        return TMT_B_A_erreurs_ZS;
    }

    public void setTMT_B_A_erreurs_ZS(String TMT_B_A_erreurs_ZS) {
        this.TMT_B_A_erreurs_ZS = TMT_B_A_erreurs_ZS;
    }

    public String getStroop_deno_erreurs() {
        return Stroop_deno_erreurs;
    }

    public void setStroop_deno_erreurs(String Stroop_deno_erreurs) {
        this.Stroop_deno_erreurs = Stroop_deno_erreurs;
    }

    public String getStroop_déno_erreurs_ZS() {
        return Stroop_déno_erreurs_ZS;
    }

    public void setStroop_déno_erreurs_ZS(String Stroop_déno_erreurs_ZS) {
        this.Stroop_déno_erreurs_ZS = Stroop_déno_erreurs_ZS;
    }

    public String getStroop_lecture_erreurs() {
        return Stroop_lecture_erreurs;
    }

    public void setStroop_lecture_erreurs(String Stroop_lecture_erreurs) {
        this.Stroop_lecture_erreurs = Stroop_lecture_erreurs;
    }

    public String getStroop_lecture_erreurs_ZS() {
        return Stroop_lecture_erreurs_ZS;
    }

    public void setStroop_lecture_erreurs_ZS(String Stroop_lecture_erreurs_ZS) {
        this.Stroop_lecture_erreurs_ZS = Stroop_lecture_erreurs_ZS;
    }

    public String getStroop_inter_erreurs() {
        return Stroop_inter_erreurs;
    }

    public void setStroop_inter_erreurs(String Stroop_inter_erreurs) {
        this.Stroop_inter_erreurs = Stroop_inter_erreurs;
    }

    public String getStroop_inter_erreurs_ZS() {
        return Stroop_inter_erreurs_ZS;
    }

    public void setStroop_inter_erreurs_ZS(String Stroop_inter_erreurs_ZS) {
        this.Stroop_inter_erreurs_ZS = Stroop_inter_erreurs_ZS;
    }

    @JoinColumn(name = "Code_patient", referencedColumnName = "Code_patient")
    @ManyToOne(optional = false)
    private Patient codepatient;
    @JoinColumn(name = "Visite", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Visit visite;
    @OneToOne(mappedBy = "bilancognitiflbid")
    private Visit visit;

    public BilanCognitifLb() {
    }

    public BilanCognitifLb(Long id) {
        this.id = id;
    }

    public BilanCognitifLb(Long id, Date dateexamen, Float delaipostRT, String etatbilan) {
        this.id = id;
        this.dateexamen = dateexamen;
        this.delaipostRT = delaipostRT;
        this.etatbilan = etatbilan;
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

    public String getEtatbilan() {
        return etatbilan;
    }

    public void setEtatbilan(String etatbilan) {
        this.etatbilan = etatbilan;
    }

    public Float getFNARTtotal() {
        return fNARTtotal;
    }

    public void setFNARTtotal(Float fNARTtotal) {
        this.fNARTtotal = fNARTtotal;
    }

    public Float getMMSEtotal() {
        return mMSEtotal;
    }

    public void setMMSEtotal(Float mMSEtotal) {
        this.mMSEtotal = mMSEtotal;
    }

    public Float getMOCAtotal() {
        return mOCAtotal;
    }

    public void setMOCAtotal(Float mOCAtotal) {
        this.mOCAtotal = mOCAtotal;
    }

    public Float getMattisbruttotal() {
        return mattisbruttotal;
    }

    public void setMattisbruttotal(Float mattisbruttotal) {
        this.mattisbruttotal = mattisbruttotal;
    }

    public Float getMattisPCtotal() {
        return mattisPCtotal;
    }

    public void setMattisPCtotal(Float mattisPCtotal) {
        this.mattisPCtotal = mattisPCtotal;
    }

    public Float getRLRI16brutRL1() {
        return rLRI16brutRL1;
    }

    public void setRLRI16brutRL1(Float rLRI16brutRL1) {
        this.rLRI16brutRL1 = rLRI16brutRL1;
    }

    public Float getRlri16ZsRl1() {
        return rlri16ZsRl1;
    }

    public void setRlri16ZsRl1(Float rlri16ZsRl1) {
        this.rlri16ZsRl1 = rlri16ZsRl1;
    }

    public Float getRLRI16brutRL2() {
        return rLRI16brutRL2;
    }

    public void setRLRI16brutRL2(Float rLRI16brutRL2) {
        this.rLRI16brutRL2 = rLRI16brutRL2;
    }

    public Float getRlri16ZsRl2() {
        return rlri16ZsRl2;
    }

    public void setRlri16ZsRl2(Float rlri16ZsRl2) {
        this.rlri16ZsRl2 = rlri16ZsRl2;
    }

    public Float getRLRI16brutRL3() {
        return rLRI16brutRL3;
    }

    public void setRLRI16brutRL3(Float rLRI16brutRL3) {
        this.rLRI16brutRL3 = rLRI16brutRL3;
    }

    public Float getRlri16ZsRl3() {
        return rlri16ZsRl3;
    }

    public void setRlri16ZsRl3(Float rlri16ZsRl3) {
        this.rlri16ZsRl3 = rlri16ZsRl3;
    }

    public Float getRLRI16brutRD() {
        return rLRI16brutRD;
    }

    public void setRLRI16brutRD(Float rLRI16brutRD) {
        this.rLRI16brutRD = rLRI16brutRD;
    }

    public Float getRlri16ZsRd() {
        return rlri16ZsRd;
    }

    public void setRlri16ZsRd(Float rlri16ZsRd) {
        this.rlri16ZsRd = rlri16ZsRd;
    }

    public Float getRLRI16Indice() {
        return rLRI16Indice;
    }

    public void setRLRI16Indice(Float rLRI16Indice) {
        this.rLRI16Indice = rLRI16Indice;
    }

    public Float getRLRI16ZSmoy() {
        return rLRI16ZSmoy;
    }

    public void setRLRI16ZSmoy(Float rLRI16ZSmoy) {
        this.rLRI16ZSmoy = rLRI16ZSmoy;
    }

    public Float getREYbrutrappel() {
        return rEYbrutrappel;
    }

    public void setREYbrutrappel(Float rEYbrutrappel) {
        this.rEYbrutrappel = rEYbrutrappel;
    }

    public Float getREYPCrappel() {
        return rEYPCrappel;
    }

    public void setREYPCrappel(Float rEYPCrappel) {
        this.rEYPCrappel = rEYPCrappel;
    }

    public Float getREYbrutcopie() {
        return rEYbrutcopie;
    }

    public void setREYbrutcopie(Float rEYbrutcopie) {
        this.rEYbrutcopie = rEYbrutcopie;
    }

    public Float getREYPCcopie() {
        return rEYPCcopie;
    }

    public void setREYPCcopie(Float rEYPCcopie) {
        this.rEYPCcopie = rEYPCcopie;
    }

    public Float getEmpandirect() {
        return empandirect;
    }

    public void setEmpandirect(Float empandirect) {
        this.empandirect = empandirect;
    }

    public Float getEmpaninverse() {
        return empaninverse;
    }

    public void setEmpaninverse(Float empaninverse) {
        this.empaninverse = empaninverse;
    }

    public Float getMemoirechiffrebrut() {
        return memoirechiffrebrut;
    }

    public void setMemoirechiffrebrut(Float memoirechiffrebrut) {
        this.memoirechiffrebrut = memoirechiffrebrut;
    }

    public Float getMemoirechiffreNS() {
        return memoirechiffreNS;
    }

    public void setMemoirechiffreNS(Float memoirechiffreNS) {
        this.memoirechiffreNS = memoirechiffreNS;
    }

    public Float getSLCbrut() {
        return sLCbrut;
    }

    public void setSLCbrut(Float sLCbrut) {
        this.sLCbrut = sLCbrut;
    }

    public Float getSlcNs() {
        return slcNs;
    }

    public void setSlcNs(Float slcNs) {
        this.slcNs = slcNs;
    }

    public Float getFluencesPbrut() {
        return fluencesPbrut;
    }

    public void setFluencesPbrut(Float fluencesPbrut) {
        this.fluencesPbrut = fluencesPbrut;
    }

    public Float getFluencesPZS() {
        return fluencesPZS;
    }

    public void setFluencesPZS(Float fluencesPZS) {
        this.fluencesPZS = fluencesPZS;
    }

    public Float getFluencesanimauxbrut() {
        return fluencesanimauxbrut;
    }

    public void setFluencesanimauxbrut(Float fluencesanimauxbrut) {
        this.fluencesanimauxbrut = fluencesanimauxbrut;
    }

    public Float getFluencesanimauxZS() {
        return fluencesanimauxZS;
    }

    public void setFluencesanimauxZS(Float fluencesanimauxZS) {
        this.fluencesanimauxZS = fluencesanimauxZS;
    }

    public Float getTMTAbrut() {
        return tMTAbrut;
    }

    public void setTMTAbrut(Float tMTAbrut) {
        this.tMTAbrut = tMTAbrut;
    }

    public Float getTmtAZs() {
        return tmtAZs;
    }

    public void setTmtAZs(Float tmtAZs) {
        this.tmtAZs = tmtAZs;
    }

    public Float getTMTBbrut() {
        return tMTBbrut;
    }

    public void setTMTBbrut(Float tMTBbrut) {
        this.tMTBbrut = tMTBbrut;
    }

    public Float getTmtBZs() {
        return tmtBZs;
    }

    public void setTmtBZs(Float tmtBZs) {
        this.tmtBZs = tmtBZs;
    }

    public Float getTMTBAbrut() {
        return tMTBAbrut;
    }

    public void setTMTBAbrut(Float tMTBAbrut) {
        this.tMTBAbrut = tMTBAbrut;
    }

    public Float getTmtBAZs() {
        return tmtBAZs;
    }

    public void setTmtBAZs(Float tmtBAZs) {
        this.tmtBAZs = tmtBAZs;
    }

    public Float getStroopdenobrut() {
        return stroopdenobrut;
    }

    public void setStroopdenobrut(Float stroopdenobrut) {
        this.stroopdenobrut = stroopdenobrut;
    }

    public Float getStroopdenoZS() {
        return stroopdenoZS;
    }

    public void setStroopdenoZS(Float stroopdenoZS) {
        this.stroopdenoZS = stroopdenoZS;
    }

    public Float getStrooplecturebrut() {
        return strooplecturebrut;
    }

    public void setStrooplecturebrut(Float strooplecturebrut) {
        this.strooplecturebrut = strooplecturebrut;
    }

    public Float getStrooplectureZS() {
        return strooplectureZS;
    }

    public void setStrooplectureZS(Float strooplectureZS) {
        this.strooplectureZS = strooplectureZS;
    }

    public Float getStroopinterbrut() {
        return stroopinterbrut;
    }

    public void setStroopinterbrut(Float stroopinterbrut) {
        this.stroopinterbrut = stroopinterbrut;
    }

    public Float getStroopinterZS() {
        return stroopinterZS;
    }

    public void setStroopinterZS(Float stroopinterZS) {
        this.stroopinterZS = stroopinterZS;
    }

    public Float getBNTbrut() {
        return bNTbrut;
    }

    public void setBNTbrut(Float bNTbrut) {
        this.bNTbrut = bNTbrut;
    }

    public Float getBntZs() {
        return bntZs;
    }

    public void setBntZs(Float bntZs) {
        this.bntZs = bntZs;
    }

    public Float getTokenbrut() {
        return tokenbrut;
    }

    public void setTokenbrut(Float tokenbrut) {
        this.tokenbrut = tokenbrut;
    }

    public Float getTokenZS() {
        return tokenZS;
    }

    public void setTokenZS(Float tokenZS) {
        this.tokenZS = tokenZS;
    }

    public Float getQLQC30global() {
        return qLQC30global;
    }

    public void setQLQC30global(Float qLQC30global) {
        this.qLQC30global = qLQC30global;
    }

    public Float getQLQC30physique() {
        return qLQC30physique;
    }

    public void setQLQC30physique(Float qLQC30physique) {
        this.qLQC30physique = qLQC30physique;
    }

    public Float getQLQC30personnel() {
        return qLQC30personnel;
    }

    public void setQLQC30personnel(Float qLQC30personnel) {
        this.qLQC30personnel = qLQC30personnel;
    }

    public Float getQLQC30emotionnel() {
        return qLQC30emotionnel;
    }

    public void setQLQC30emotionnel(Float qLQC30emotionnel) {
        this.qLQC30emotionnel = qLQC30emotionnel;
    }

    public Float getQLQC30cognitif() {
        return qLQC30cognitif;
    }

    public void setQLQC30cognitif(Float qLQC30cognitif) {
        this.qLQC30cognitif = qLQC30cognitif;
    }

    public Float getQLQC30social() {
        return qLQC30social;
    }

    public void setQLQC30social(Float qLQC30social) {
        this.qLQC30social = qLQC30social;
    }

    public Float getQLQC30fatigue() {
        return qLQC30fatigue;
    }

    public void setQLQC30fatigue(Float qLQC30fatigue) {
        this.qLQC30fatigue = qLQC30fatigue;
    }

    public Float getQLQC30nausees() {
        return qLQC30nausees;
    }

    public void setQLQC30nausees(Float qLQC30nausees) {
        this.qLQC30nausees = qLQC30nausees;
    }

    public Float getQLQC30douleur() {
        return qLQC30douleur;
    }

    public void setQLQC30douleur(Float qLQC30douleur) {
        this.qLQC30douleur = qLQC30douleur;
    }

    public Float getQLQC30dyspnee() {
        return qLQC30dyspnee;
    }

    public void setQLQC30dyspnee(Float qLQC30dyspnee) {
        this.qLQC30dyspnee = qLQC30dyspnee;
    }

    public Float getQLQC30insomnies() {
        return qLQC30insomnies;
    }

    public void setQLQC30insomnies(Float qLQC30insomnies) {
        this.qLQC30insomnies = qLQC30insomnies;
    }

    public Float getQLQC30appetit() {
        return qLQC30appetit;
    }

    public void setQLQC30appetit(Float qLQC30appetit) {
        this.qLQC30appetit = qLQC30appetit;
    }

    public Float getQLQC30constipation() {
        return qLQC30constipation;
    }

    public void setQLQC30constipation(Float qLQC30constipation) {
        this.qLQC30constipation = qLQC30constipation;
    }

    public Float getQLQC30diarhees() {
        return qLQC30diarhees;
    }

    public void setQLQC30diarhees(Float qLQC30diarhees) {
        this.qLQC30diarhees = qLQC30diarhees;
    }

    public Float getQLQC30finances() {
        return qLQC30finances;
    }

    public void setQLQC30finances(Float qLQC30finances) {
        this.qLQC30finances = qLQC30finances;
    }

    public Float getQLQBN20futur() {
        return qLQBN20futur;
    }

    public void setQLQBN20futur(Float qLQBN20futur) {
        this.qLQBN20futur = qLQBN20futur;
    }

    public Float getQLQBN20visuel() {
        return qLQBN20visuel;
    }

    public void setQLQBN20visuel(Float qLQBN20visuel) {
        this.qLQBN20visuel = qLQBN20visuel;
    }

    public Float getQLQBN20moteur() {
        return qLQBN20moteur;
    }

    public void setQLQBN20moteur(Float qLQBN20moteur) {
        this.qLQBN20moteur = qLQBN20moteur;
    }

    public Float getQLQBN20comm() {
        return qLQBN20comm;
    }

    public void setQLQBN20comm(Float qLQBN20comm) {
        this.qLQBN20comm = qLQBN20comm;
    }

    public Float getQLQBN20epilepsie() {
        return qLQBN20epilepsie;
    }

    public void setQLQBN20epilepsie(Float qLQBN20epilepsie) {
        this.qLQBN20epilepsie = qLQBN20epilepsie;
    }

    public Float getQLQBN20somnolence() {
        return qLQBN20somnolence;
    }

    public void setQLQBN20somnolence(Float qLQBN20somnolence) {
        this.qLQBN20somnolence = qLQBN20somnolence;
    }

    public Float getQLQBN20demange() {
        return qLQBN20demange;
    }

    public void setQLQBN20demange(Float qLQBN20demange) {
        this.qLQBN20demange = qLQBN20demange;
    }

    public Float getQLQBN20cheveux() {
        return qLQBN20cheveux;
    }

    public void setQLQBN20cheveux(Float qLQBN20cheveux) {
        this.qLQBN20cheveux = qLQBN20cheveux;
    }

    public Float getQLQBN20faiblesse() {
        return qLQBN20faiblesse;
    }

    public void setQLQBN20faiblesse(Float qLQBN20faiblesse) {
        this.qLQBN20faiblesse = qLQBN20faiblesse;
    }

    public Float getQLQBN20incontinence() {
        return qLQBN20incontinence;
    }

    public void setQLQBN20incontinence(Float qLQBN20incontinence) {
        this.qLQBN20incontinence = qLQBN20incontinence;
    }

    public Float getIsdc() {
        return isdc;
    }

    public void setIsdc(Float isdc) {
        this.isdc = isdc;
    }

    public Float getGoldberg() {
        return goldberg;
    }

    public void setGoldberg(Float goldberg) {
        this.goldberg = goldberg;
    }

    public Float getFacit() {
        return facit;
    }

    public void setFacit(Float facit) {
        this.facit = facit;
    }

    public Float getMacNair() {
        return macNair;
    }

    public void setMacNair(Float macNair) {
        this.macNair = macNair;
    }

    public Float getEiadl() {
        return eiadl;
    }

    public void setEiadl(Float eiadl) {
        this.eiadl = eiadl;
    }

    public Float getCes() {
        return ces;
    }

    public void setCes(Float ces) {
        this.ces = ces;
    }

    public String getEvalglobaledeficit() {
        return evalglobaledeficit;
    }

    public void setEvalglobaledeficit(String evalglobaledeficit) {
        this.evalglobaledeficit = evalglobaledeficit;
    }

    public String getMemverbdeficit() {
        return memverbdeficit;
    }

    public void setMemverbdeficit(String memverbdeficit) {
        this.memverbdeficit = memverbdeficit;
    }

    public String getMemvisudeficit() {
        return memvisudeficit;
    }

    public void setMemvisudeficit(String memvisudeficit) {
        this.memvisudeficit = memvisudeficit;
    }

    public String getVTIdeficit() {
        return vTIdeficit;
    }

    public void setVTIdeficit(String vTIdeficit) {
        this.vTIdeficit = vTIdeficit;
    }

    public String getMCTMDTdeficit() {
        return mCTMDTdeficit;
    }

    public void setMCTMDTdeficit(String mCTMDTdeficit) {
        this.mCTMDTdeficit = mCTMDTdeficit;
    }

    public String getInhibdeficit() {
        return inhibdeficit;
    }

    public void setInhibdeficit(String inhibdeficit) {
        this.inhibdeficit = inhibdeficit;
    }

    public String getShiftingdeficit() {
        return shiftingdeficit;
    }

    public void setShiftingdeficit(String shiftingdeficit) {
        this.shiftingdeficit = shiftingdeficit;
    }

    public String getExpressiondeficit() {
        return expressiondeficit;
    }

    public void setExpressiondeficit(String expressiondeficit) {
        this.expressiondeficit = expressiondeficit;
    }

    public String getComprehensiondeficit() {
        return comprehensiondeficit;
    }

    public void setComprehensiondeficit(String comprehensiondeficit) {
        this.comprehensiondeficit = comprehensiondeficit;
    }

    public String getVisuoconstrudeficit() {
        return visuoconstrudeficit;
    }

    public void setVisuoconstrudeficit(String visuoconstrudeficit) {
        this.visuoconstrudeficit = visuoconstrudeficit;
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
        if (!(object instanceof BilanCognitifLb)) {
            return false;
        }
        BilanCognitifLb other = (BilanCognitifLb) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gr.aueb.ecrf.BilanCognitifLb[ id=" + id + " ]";
    }

}
