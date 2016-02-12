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
@Table(name = "bilan_cognitif_suivi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BilanCognitifSuivi.findAll", query = "SELECT b FROM BilanCognitifSuivi b"),
    @NamedQuery(name = "BilanCognitifSuivi.findById", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.id = :id"),
    @NamedQuery(name = "BilanCognitifSuivi.findByDateexamen", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.dateexamen = :dateexamen"),
    @NamedQuery(name = "BilanCognitifSuivi.findByDelaipostRT", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.delaipostRT = :delaipostRT"),
    @NamedQuery(name = "BilanCognitifSuivi.findByEtatbilan", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.etatbilan = :etatbilan"),
    @NamedQuery(name = "BilanCognitifSuivi.findByFNARTtotal", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.fNARTtotal = :fNARTtotal"),
    @NamedQuery(name = "BilanCognitifSuivi.findByMMSEtotal", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.mMSEtotal = :mMSEtotal"),
    @NamedQuery(name = "BilanCognitifSuivi.findByMMSEdeclin", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.mMSEdeclin = :mMSEdeclin"),
    @NamedQuery(name = "BilanCognitifSuivi.findByMOCAtotal", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.mOCAtotal = :mOCAtotal"),
    @NamedQuery(name = "BilanCognitifSuivi.findByMOCAdeclin", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.mOCAdeclin = :mOCAdeclin"),
    @NamedQuery(name = "BilanCognitifSuivi.findByMattisbruttotal", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.mattisbruttotal = :mattisbruttotal"),
    @NamedQuery(name = "BilanCognitifSuivi.findByMattisPCtotal", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.mattisPCtotal = :mattisPCtotal"),
    @NamedQuery(name = "BilanCognitifSuivi.findByMattisdeclin", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.mattisdeclin = :mattisdeclin"),
    @NamedQuery(name = "BilanCognitifSuivi.findByRLRI16brutRL1", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.rLRI16brutRL1 = :rLRI16brutRL1"),
    @NamedQuery(name = "BilanCognitifSuivi.findByRlri16ZsRl1", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.rlri16ZsRl1 = :rlri16ZsRl1"),
    @NamedQuery(name = "BilanCognitifSuivi.findByRLRI16brutRL2", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.rLRI16brutRL2 = :rLRI16brutRL2"),
    @NamedQuery(name = "BilanCognitifSuivi.findByRlri16ZsRl2", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.rlri16ZsRl2 = :rlri16ZsRl2"),
    @NamedQuery(name = "BilanCognitifSuivi.findByRLRI16brutRL3", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.rLRI16brutRL3 = :rLRI16brutRL3"),
    @NamedQuery(name = "BilanCognitifSuivi.findByRlri16ZsRl3", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.rlri16ZsRl3 = :rlri16ZsRl3"),
    @NamedQuery(name = "BilanCognitifSuivi.findByRLRI16brutRD", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.rLRI16brutRD = :rLRI16brutRD"),
    @NamedQuery(name = "BilanCognitifSuivi.findByRlri16ZsRd", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.rlri16ZsRd = :rlri16ZsRd"),
    @NamedQuery(name = "BilanCognitifSuivi.findByRLRI16Indice", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.rLRI16Indice = :rLRI16Indice"),
    @NamedQuery(name = "BilanCognitifSuivi.findByRLRI16ZSmoy", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.rLRI16ZSmoy = :rLRI16ZSmoy"),
    @NamedQuery(name = "BilanCognitifSuivi.findByRLRI16declin", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.rLRI16declin = :rLRI16declin"),
    @NamedQuery(name = "BilanCognitifSuivi.findByREYbrutrappel", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.rEYbrutrappel = :rEYbrutrappel"),
    @NamedQuery(name = "BilanCognitifSuivi.findByREYPCrappel", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.rEYPCrappel = :rEYPCrappel"),
    @NamedQuery(name = "BilanCognitifSuivi.findByREYdeclinrappel", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.rEYdeclinrappel = :rEYdeclinrappel"),
    @NamedQuery(name = "BilanCognitifSuivi.findByREYbrutcopie", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.rEYbrutcopie = :rEYbrutcopie"),
    @NamedQuery(name = "BilanCognitifSuivi.findByREYPCcopie", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.rEYPCcopie = :rEYPCcopie"),
    @NamedQuery(name = "BilanCognitifSuivi.findByREYdeclincopie", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.rEYdeclincopie = :rEYdeclincopie"),
    @NamedQuery(name = "BilanCognitifSuivi.findByEmpandirect", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.empandirect = :empandirect"),
    @NamedQuery(name = "BilanCognitifSuivi.findByEmpaninverse", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.empaninverse = :empaninverse"),
    @NamedQuery(name = "BilanCognitifSuivi.findByMemoirechiffrebrut", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.memoirechiffrebrut = :memoirechiffrebrut"),
    @NamedQuery(name = "BilanCognitifSuivi.findByMemoirechiffreNS", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.memoirechiffreNS = :memoirechiffreNS"),
    @NamedQuery(name = "BilanCognitifSuivi.findByMemoirechiffredeclin", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.memoirechiffredeclin = :memoirechiffredeclin"),
    @NamedQuery(name = "BilanCognitifSuivi.findBySLCbrut", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.sLCbrut = :sLCbrut"),
    @NamedQuery(name = "BilanCognitifSuivi.findBySlcNs", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.slcNs = :slcNs"),
    @NamedQuery(name = "BilanCognitifSuivi.findBySLCdeclin", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.sLCdeclin = :sLCdeclin"),
    @NamedQuery(name = "BilanCognitifSuivi.findByFluencesPbrut", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.fluencesPbrut = :fluencesPbrut"),
    @NamedQuery(name = "BilanCognitifSuivi.findByFluencesPZS", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.fluencesPZS = :fluencesPZS"),
    @NamedQuery(name = "BilanCognitifSuivi.findByFluencesanimauxbrut", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.fluencesanimauxbrut = :fluencesanimauxbrut"),
    @NamedQuery(name = "BilanCognitifSuivi.findByFluencesanimauxZS", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.fluencesanimauxZS = :fluencesanimauxZS"),
    @NamedQuery(name = "BilanCognitifSuivi.findByFluencesdeclin", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.fluencesdeclin = :fluencesdeclin"),
    @NamedQuery(name = "BilanCognitifSuivi.findByTMTAbrut", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.tMTAbrut = :tMTAbrut"),
    @NamedQuery(name = "BilanCognitifSuivi.findByTmtAZs", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.tmtAZs = :tmtAZs"),
    @NamedQuery(name = "BilanCognitifSuivi.findByTMTBbrut", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.tMTBbrut = :tMTBbrut"),
    @NamedQuery(name = "BilanCognitifSuivi.findByTmtBZs", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.tmtBZs = :tmtBZs"),
    @NamedQuery(name = "BilanCognitifSuivi.findByTMTBAbrut", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.tMTBAbrut = :tMTBAbrut"),
    @NamedQuery(name = "BilanCognitifSuivi.findByTmtBAZs", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.tmtBAZs = :tmtBAZs"),
    @NamedQuery(name = "BilanCognitifSuivi.findByTMTdeclin", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.tMTdeclin = :tMTdeclin"),
    @NamedQuery(name = "BilanCognitifSuivi.findByStroopdenobrut", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.stroopdenobrut = :stroopdenobrut"),
    @NamedQuery(name = "BilanCognitifSuivi.findByStroopdenoZS", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.stroopdenoZS = :stroopdenoZS"),
    @NamedQuery(name = "BilanCognitifSuivi.findByStrooplecturebrut", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.strooplecturebrut = :strooplecturebrut"),
    @NamedQuery(name = "BilanCognitifSuivi.findByStrooplectureZS", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.strooplectureZS = :strooplectureZS"),
    @NamedQuery(name = "BilanCognitifSuivi.findByStroopinterbrut", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.stroopinterbrut = :stroopinterbrut"),
    @NamedQuery(name = "BilanCognitifSuivi.findByStroopinterZS", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.stroopinterZS = :stroopinterZS"),
    @NamedQuery(name = "BilanCognitifSuivi.findByStroopdeclin", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.stroopdeclin = :stroopdeclin"),
    @NamedQuery(name = "BilanCognitifSuivi.findByBNTbrut", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.bNTbrut = :bNTbrut"),
    @NamedQuery(name = "BilanCognitifSuivi.findByBntZs", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.bntZs = :bntZs"),
    @NamedQuery(name = "BilanCognitifSuivi.findByBNTdeclin", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.bNTdeclin = :bNTdeclin"),
    @NamedQuery(name = "BilanCognitifSuivi.findByTokenbrut", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.tokenbrut = :tokenbrut"),
    @NamedQuery(name = "BilanCognitifSuivi.findByTokenZS", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.tokenZS = :tokenZS"),
    @NamedQuery(name = "BilanCognitifSuivi.findByTokendeclin", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.tokendeclin = :tokendeclin"),
    @NamedQuery(name = "BilanCognitifSuivi.findByQLQC30global", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.qLQC30global = :qLQC30global"),
    @NamedQuery(name = "BilanCognitifSuivi.findByQLQC30physique", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.qLQC30physique = :qLQC30physique"),
    @NamedQuery(name = "BilanCognitifSuivi.findByQLQC30personnel", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.qLQC30personnel = :qLQC30personnel"),
    @NamedQuery(name = "BilanCognitifSuivi.findByQLQC30emotionnel", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.qLQC30emotionnel = :qLQC30emotionnel"),
    @NamedQuery(name = "BilanCognitifSuivi.findByQLQC30cognitif", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.qLQC30cognitif = :qLQC30cognitif"),
    @NamedQuery(name = "BilanCognitifSuivi.findByQLQC30social", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.qLQC30social = :qLQC30social"),
    @NamedQuery(name = "BilanCognitifSuivi.findByQLQC30fatigue", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.qLQC30fatigue = :qLQC30fatigue"),
    @NamedQuery(name = "BilanCognitifSuivi.findByQLQC30nausees", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.qLQC30nausees = :qLQC30nausees"),
    @NamedQuery(name = "BilanCognitifSuivi.findByQLQC30douleur", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.qLQC30douleur = :qLQC30douleur"),
    @NamedQuery(name = "BilanCognitifSuivi.findByQLQC30dyspnee", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.qLQC30dyspnee = :qLQC30dyspnee"),
    @NamedQuery(name = "BilanCognitifSuivi.findByQLQC30insomnies", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.qLQC30insomnies = :qLQC30insomnies"),
    @NamedQuery(name = "BilanCognitifSuivi.findByQLQC30appetit", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.qLQC30appetit = :qLQC30appetit"),
    @NamedQuery(name = "BilanCognitifSuivi.findByQLQC30constipation", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.qLQC30constipation = :qLQC30constipation"),
    @NamedQuery(name = "BilanCognitifSuivi.findByQLQC30diarhees", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.qLQC30diarhees = :qLQC30diarhees"),
    @NamedQuery(name = "BilanCognitifSuivi.findByQLQC30finances", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.qLQC30finances = :qLQC30finances"),
    @NamedQuery(name = "BilanCognitifSuivi.findByQLQBN20futur", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.qLQBN20futur = :qLQBN20futur"),
    @NamedQuery(name = "BilanCognitifSuivi.findByQLQBN20visuel", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.qLQBN20visuel = :qLQBN20visuel"),
    @NamedQuery(name = "BilanCognitifSuivi.findByQLQBN20moteur", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.qLQBN20moteur = :qLQBN20moteur"),
    @NamedQuery(name = "BilanCognitifSuivi.findByQLQBN20comm", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.qLQBN20comm = :qLQBN20comm"),
    @NamedQuery(name = "BilanCognitifSuivi.findByQLQBN20epilepsie", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.qLQBN20epilepsie = :qLQBN20epilepsie"),
    @NamedQuery(name = "BilanCognitifSuivi.findByQLQBN20somnolence", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.qLQBN20somnolence = :qLQBN20somnolence"),
    @NamedQuery(name = "BilanCognitifSuivi.findByQLQBN20demange", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.qLQBN20demange = :qLQBN20demange"),
    @NamedQuery(name = "BilanCognitifSuivi.findByQLQBN20cheveux", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.qLQBN20cheveux = :qLQBN20cheveux"),
    @NamedQuery(name = "BilanCognitifSuivi.findByQLQBN20faiblesse", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.qLQBN20faiblesse = :qLQBN20faiblesse"),
    @NamedQuery(name = "BilanCognitifSuivi.findByQLQBN20incontinence", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.qLQBN20incontinence = :qLQBN20incontinence"),
    @NamedQuery(name = "BilanCognitifSuivi.findByIsdc", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.isdc = :isdc"),
    @NamedQuery(name = "BilanCognitifSuivi.findByGoldberg", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.goldberg = :goldberg"),
    @NamedQuery(name = "BilanCognitifSuivi.findByFacit", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.facit = :facit"),
    @NamedQuery(name = "BilanCognitifSuivi.findByMacNair", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.macNair = :macNair"),
    @NamedQuery(name = "BilanCognitifSuivi.findByEiadl", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.eiadl = :eiadl"),
    @NamedQuery(name = "BilanCognitifSuivi.findByCes", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.ces = :ces"),
    @NamedQuery(name = "BilanCognitifSuivi.findByEvalglobaledeficit", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.evalglobaledeficit = :evalglobaledeficit"),
    @NamedQuery(name = "BilanCognitifSuivi.findByEvalglobaledeclin", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.evalglobaledeclin = :evalglobaledeclin"),
    @NamedQuery(name = "BilanCognitifSuivi.findByMemverbdeficit", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.memverbdeficit = :memverbdeficit"),
    @NamedQuery(name = "BilanCognitifSuivi.findByMemverbdeclin", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.memverbdeclin = :memverbdeclin"),
    @NamedQuery(name = "BilanCognitifSuivi.findByMemvisudeficit", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.memvisudeficit = :memvisudeficit"),
    @NamedQuery(name = "BilanCognitifSuivi.findByMemvisudeclin", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.memvisudeclin = :memvisudeclin"),
    @NamedQuery(name = "BilanCognitifSuivi.findByVTIdeficit", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.vTIdeficit = :vTIdeficit"),
    @NamedQuery(name = "BilanCognitifSuivi.findByVTIdeclin", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.vTIdeclin = :vTIdeclin"),
    @NamedQuery(name = "BilanCognitifSuivi.findByMCTMDTdeficit", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.mCTMDTdeficit = :mCTMDTdeficit"),
    @NamedQuery(name = "BilanCognitifSuivi.findByMCTMDTdeclin", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.mCTMDTdeclin = :mCTMDTdeclin"),
    @NamedQuery(name = "BilanCognitifSuivi.findByInhibdeficit", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.inhibdeficit = :inhibdeficit"),
    @NamedQuery(name = "BilanCognitifSuivi.findByInhibdeclin", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.inhibdeclin = :inhibdeclin"),
    @NamedQuery(name = "BilanCognitifSuivi.findByShiftingdeficit", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.shiftingdeficit = :shiftingdeficit"),
    @NamedQuery(name = "BilanCognitifSuivi.findByShiftingdeclin", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.shiftingdeclin = :shiftingdeclin"),
    @NamedQuery(name = "BilanCognitifSuivi.findByExpressiondeficit", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.expressiondeficit = :expressiondeficit"),
    @NamedQuery(name = "BilanCognitifSuivi.findByExpressiondeclin", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.expressiondeclin = :expressiondeclin"),
    @NamedQuery(name = "BilanCognitifSuivi.findByComprehensiondeficit", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.comprehensiondeficit = :comprehensiondeficit"),
    @NamedQuery(name = "BilanCognitifSuivi.findByComprehensiondeclin", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.comprehensiondeclin = :comprehensiondeclin"),
    @NamedQuery(name = "BilanCognitifSuivi.findByVisuoconstrudeficit", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.visuoconstrudeficit = :visuoconstrudeficit"),
    @NamedQuery(name = "BilanCognitifSuivi.findByVisuoconstrudeclin", query = "SELECT b FROM BilanCognitifSuivi b WHERE b.visuoconstrudeclin = :visuoconstrudeclin")})
public class BilanCognitifSuivi implements Serializable {
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
    @Basic(optional = false)
    @Size(min = 1, max = 12)
    @Column(name = "MMSE_declin")
    private String mMSEdeclin;
    @Column(name = "MOCA_total")
    private Float mOCAtotal;
    @Size(max = 12)
    @Column(name = "MOCA_declin")
    private String mOCAdeclin;
    @Column(name = "Mattis_brut_total")
    private Float mattisbruttotal;
    @Column(name = "Mattis_PC_total")
    private Float mattisPCtotal;
    @Size(max = 12)
    @Column(name = "Mattis_declin")
    private String mattisdeclin;
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
    @Size(max = 12)
    @Column(name = "RLRI16_declin")
    private String rLRI16declin;
    @Column(name = "REY_brut_rappel")
    private Float rEYbrutrappel;
    @Column(name = "REY_PC_rappel")
    private Float rEYPCrappel;
    @Column(name = "REY_declin_rappel")
    private String rEYdeclinrappel;
    @Column(name = "REY_brut_copie")
    private Float rEYbrutcopie;
    @Column(name = "REY_PC_copie")
    private Float rEYPCcopie;
    @Column(name = "REY_declin_copie")
    private String rEYdeclincopie;
    @Column(name = "Empan_direct")
    private Float empandirect;
    @Column(name = "Empan_inverse")
    private Float empaninverse;
    @Column(name = "Memoire_chiffre_brut")
    private Float memoirechiffrebrut;
    @Column(name = "Memoire_chiffre_NS")
    private Float memoirechiffreNS;
    @Size(max = 12)
    @Column(name = "Memoire_chiffre_declin")
    private String memoirechiffredeclin;
    @Column(name = "SLC_brut")
    private Float sLCbrut;
    @Column(name = "SLC_NS")
    private Float slcNs;
    @Size(max = 12)
    @Column(name = "SLC_declin")
    private String sLCdeclin;
    @Column(name = "Fluences_P_brut")
    private Float fluencesPbrut;
    @Column(name = "Fluences_P_ZS")
    private Float fluencesPZS;
    @Column(name = "Fluences_animaux_brut")
    private Float fluencesanimauxbrut;
    @Column(name = "Fluences_animaux_ZS")
    private Float fluencesanimauxZS;
    @Size(max = 12)
    @Column(name = "Fluences_declin")
    private String fluencesdeclin;
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
    @Size(max = 12)
    @Column(name = "TMT_declin")
    private String tMTdeclin;
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
    @Size(max = 12)
    @Column(name = "Stroop_declin")
    private String stroopdeclin;
    @Column(name = "BNT_brut")
    private Float bNTbrut;
    @Column(name = "BNT_ZS")
    private Float bntZs;
    @Size(max = 12)
    @Column(name = "BNT_declin")
    private String bNTdeclin;
    @Column(name = "Token_brut")
    private Float tokenbrut;
    @Column(name = "Token_ZS")
    private Float tokenZS;
    @Size(max = 12)
    @Column(name = "Token_declin")
    private String tokendeclin;
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
    @Size(max = 12)
    @Column(name = "Eval_globale_declin")
    private String evalglobaledeclin;
    @Column(name = "Mem_verb_deficit")
    private String memverbdeficit;
    @Size(max = 12)
    @Column(name = "Mem_verb_declin")
    private String memverbdeclin;
    @Column(name = "Mem_visu_deficit")
    private String memvisudeficit;
    @Size(max = 12)
    @Column(name = "Mem_visu_declin")
    private String memvisudeclin;
    @Column(name = "VTI_deficit")
    private String vTIdeficit;
    @Size(max = 12)
    @Column(name = "VTI_declin")
    private String vTIdeclin;
    @Column(name = "MCT_MDT_deficit")
    private String mCTMDTdeficit;
    @Size(max = 12)
    @Column(name = "MCT_MDT_declin")
    private String mCTMDTdeclin;
    @Column(name = "Inhib_deficit")
    private String inhibdeficit;
    @Size(max = 12)
    @Column(name = "Inhib_declin")
    private String inhibdeclin;
    @Column(name = "Shifting_deficit")
    private String shiftingdeficit;
    @Size(max = 12)
    @Column(name = "Shifting_declin")
    private String shiftingdeclin;
    @Column(name = "Expression_deficit")
    private String expressiondeficit;
    @Size(max = 12)
    @Column(name = "Expression_declin")
    private String expressiondeclin;
    @Column(name = "Comprehension_deficit")
    private String comprehensiondeficit;
    @Size(max = 12)
    @Column(name = "Comprehension_declin")
    private String comprehensiondeclin;
    @Column(name = "Visuo_constru_deficit")
    private String visuoconstrudeficit;
    @Size(max = 12)
    @Column(name = "Visuo_constru_declin")
    private String visuoconstrudeclin;
    @OneToOne(mappedBy = "bilancognitifsuiviid")
    private Visit visit;
    
    
    
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

    public BilanCognitifSuivi() {
    }

    public BilanCognitifSuivi(Long id) {
        this.id = id;
    }

    public BilanCognitifSuivi(Long id, Date dateexamen, Float delaipostRT, String etatbilan, String mMSEdeclin) {
        this.id = id;
        this.dateexamen = dateexamen;
        this.delaipostRT = delaipostRT;
        this.etatbilan = etatbilan;
        this.mMSEdeclin = mMSEdeclin;
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

    public String getMMSEdeclin() {
        return mMSEdeclin;
    }

    public void setMMSEdeclin(String mMSEdeclin) {
        this.mMSEdeclin = mMSEdeclin;
    }

    public Float getMOCAtotal() {
        return mOCAtotal;
    }

    public void setMOCAtotal(Float mOCAtotal) {
        this.mOCAtotal = mOCAtotal;
    }

    public String getMOCAdeclin() {
        return mOCAdeclin;
    }

    public void setMOCAdeclin(String mOCAdeclin) {
        this.mOCAdeclin = mOCAdeclin;
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

    public String getMattisdeclin() {
        return mattisdeclin;
    }

    public void setMattisdeclin(String mattisdeclin) {
        this.mattisdeclin = mattisdeclin;
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

    public String getRLRI16declin() {
        return rLRI16declin;
    }

    public void setRLRI16declin(String rLRI16declin) {
        this.rLRI16declin = rLRI16declin;
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

    public String getREYdeclinrappel() {
        return rEYdeclinrappel;
    }

    public void setREYdeclinrappel(String rEYdeclinrappel) {
        this.rEYdeclinrappel = rEYdeclinrappel;
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

    public String getREYdeclincopie() {
        return rEYdeclincopie;
    }

    public void setREYdeclincopie(String rEYdeclincopie) {
        this.rEYdeclincopie = rEYdeclincopie;
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

    public String getMemoirechiffredeclin() {
        return memoirechiffredeclin;
    }

    public void setMemoirechiffredeclin(String memoirechiffredeclin) {
        this.memoirechiffredeclin = memoirechiffredeclin;
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

    public String getSLCdeclin() {
        return sLCdeclin;
    }

    public void setSLCdeclin(String sLCdeclin) {
        this.sLCdeclin = sLCdeclin;
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

    public String getFluencesdeclin() {
        return fluencesdeclin;
    }

    public void setFluencesdeclin(String fluencesdeclin) {
        this.fluencesdeclin = fluencesdeclin;
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

    public String getTMTdeclin() {
        return tMTdeclin;
    }

    public void setTMTdeclin(String tMTdeclin) {
        this.tMTdeclin = tMTdeclin;
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

    public String getStroopdeclin() {
        return stroopdeclin;
    }

    public void setStroopdeclin(String stroopdeclin) {
        this.stroopdeclin = stroopdeclin;
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

    public String getBNTdeclin() {
        return bNTdeclin;
    }

    public void setBNTdeclin(String bNTdeclin) {
        this.bNTdeclin = bNTdeclin;
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

    public String getTokendeclin() {
        return tokendeclin;
    }

    public void setTokendeclin(String tokendeclin) {
        this.tokendeclin = tokendeclin;
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

    public String getEvalglobaledeclin() {
        return evalglobaledeclin;
    }

    public void setEvalglobaledeclin(String evalglobaledeclin) {
        this.evalglobaledeclin = evalglobaledeclin;
    }

    public String getMemverbdeficit() {
        return memverbdeficit;
    }

    public void setMemverbdeficit(String memverbdeficit) {
        this.memverbdeficit = memverbdeficit;
    }

    public String getMemverbdeclin() {
        return memverbdeclin;
    }

    public void setMemverbdeclin(String memverbdeclin) {
        this.memverbdeclin = memverbdeclin;
    }

    public String getMemvisudeficit() {
        return memvisudeficit;
    }

    public void setMemvisudeficit(String memvisudeficit) {
        this.memvisudeficit = memvisudeficit;
    }

    public String getMemvisudeclin() {
        return memvisudeclin;
    }

    public void setMemvisudeclin(String memvisudeclin) {
        this.memvisudeclin = memvisudeclin;
    }

    public String getVTIdeficit() {
        return vTIdeficit;
    }

    public void setVTIdeficit(String vTIdeficit) {
        this.vTIdeficit = vTIdeficit;
    }

    public String getVTIdeclin() {
        return vTIdeclin;
    }

    public void setVTIdeclin(String vTIdeclin) {
        this.vTIdeclin = vTIdeclin;
    }

    public String getMCTMDTdeficit() {
        return mCTMDTdeficit;
    }

    public void setMCTMDTdeficit(String mCTMDTdeficit) {
        this.mCTMDTdeficit = mCTMDTdeficit;
    }

    public String getMCTMDTdeclin() {
        return mCTMDTdeclin;
    }

    public void setMCTMDTdeclin(String mCTMDTdeclin) {
        this.mCTMDTdeclin = mCTMDTdeclin;
    }

    public String getInhibdeficit() {
        return inhibdeficit;
    }

    public void setInhibdeficit(String inhibdeficit) {
        this.inhibdeficit = inhibdeficit;
    }

    public String getInhibdeclin() {
        return inhibdeclin;
    }

    public void setInhibdeclin(String inhibdeclin) {
        this.inhibdeclin = inhibdeclin;
    }

    public String getShiftingdeficit() {
        return shiftingdeficit;
    }

    public void setShiftingdeficit(String shiftingdeficit) {
        this.shiftingdeficit = shiftingdeficit;
    }

    public String getShiftingdeclin() {
        return shiftingdeclin;
    }

    public void setShiftingdeclin(String shiftingdeclin) {
        this.shiftingdeclin = shiftingdeclin;
    }

    public String getExpressiondeficit() {
        return expressiondeficit;
    }

    public void setExpressiondeficit(String expressiondeficit) {
        this.expressiondeficit = expressiondeficit;
    }

    public String getExpressiondeclin() {
        return expressiondeclin;
    }

    public void setExpressiondeclin(String expressiondeclin) {
        this.expressiondeclin = expressiondeclin;
    }

    public String getComprehensiondeficit() {
        return comprehensiondeficit;
    }

    public void setComprehensiondeficit(String comprehensiondeficit) {
        this.comprehensiondeficit = comprehensiondeficit;
    }

    public String getComprehensiondeclin() {
        return comprehensiondeclin;
    }

    public void setComprehensiondeclin(String comprehensiondeclin) {
        this.comprehensiondeclin = comprehensiondeclin;
    }

    public String getVisuoconstrudeficit() {
        return visuoconstrudeficit;
    }

    public void setVisuoconstrudeficit(String visuoconstrudeficit) {
        this.visuoconstrudeficit = visuoconstrudeficit;
    }

    public String getVisuoconstrudeclin() {
        return visuoconstrudeclin;
    }

    public void setVisuoconstrudeclin(String visuoconstrudeclin) {
        this.visuoconstrudeclin = visuoconstrudeclin;
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
        if (!(object instanceof BilanCognitifSuivi)) {
            return false;
        }
        BilanCognitifSuivi other = (BilanCognitifSuivi) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gr.aueb.ecrf.BilanCognitifSuivi[ id=" + id + " ]";
    }
    
}
