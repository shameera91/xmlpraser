package com.rest.xmlparser.processfile.modal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * Created By Shameera.A on 1/4/2020
 */

@XmlAccessorType(XmlAccessType.FIELD)
public class PmtInf {

    @XmlElement(name = "PmtInfId")
    private String pmtInfId;

    @XmlElement(name = "PmtMtd")
    private String pmtMtd;

    @XmlElement(name = "BtchBookg")
    private String btchBookg;

    @XmlElement(name = "NbOfTxs")
    private String nbOfTxs;

    @XmlElement(name = "CtrlSum")
    private String ctrlSum;

    @XmlElement(name = "PmtTpInf")
    private PmtTpInf pmtTpInf;

    @XmlElement(name = "ReqdExctnDt")
    private String reqdExctnDt;

    @XmlElement(name = "Dbtr")
    private Dbtr dbtr;

    @XmlElement(name = "DbtrAcct")
    private DbtrAcct dbtrAcct;

    @XmlElement(name = "DbtrAgt")
    private DbtrAgt dbtrAgt;

    @XmlElement(name = "ChrgBr")
    private String chrgBr;

    @XmlElement(name = "CdtTrfTxInf")
    private CdtTrfTxInf cdtTrfTxInf;

    public String getPmtInfId() {
        return pmtInfId;
    }

    public void setPmtInfId(String pmtInfId) {
        this.pmtInfId = pmtInfId;
    }

    public String getPmtMtd() {
        return pmtMtd;
    }

    public void setPmtMtd(String pmtMtd) {
        this.pmtMtd = pmtMtd;
    }

    public String getBtchBookg() {
        return btchBookg;
    }

    public void setBtchBookg(String btchBookg) {
        this.btchBookg = btchBookg;
    }

    public String getNbOfTxs() {
        return nbOfTxs;
    }

    public void setNbOfTxs(String nbOfTxs) {
        this.nbOfTxs = nbOfTxs;
    }

    public String getCtrlSum() {
        return ctrlSum;
    }

    public void setCtrlSum(String ctrlSum) {
        this.ctrlSum = ctrlSum;
    }

    public PmtTpInf getPmtTpInf() {
        return pmtTpInf;
    }

    public void setPmtTpInf(PmtTpInf pmtTpInf) {
        this.pmtTpInf = pmtTpInf;
    }

    public String getReqdExctnDt() {
        return reqdExctnDt;
    }

    public void setReqdExctnDt(String reqdExctnDt) {
        this.reqdExctnDt = reqdExctnDt;
    }

    public Dbtr getDbtr() {
        return dbtr;
    }

    public void setDbtr(Dbtr dbtr) {
        this.dbtr = dbtr;
    }

    public DbtrAcct getDbtrAcct() {
        return dbtrAcct;
    }

    public void setDbtrAcct(DbtrAcct dbtrAcct) {
        this.dbtrAcct = dbtrAcct;
    }

    public DbtrAgt getDbtrAgt() {
        return dbtrAgt;
    }

    public void setDbtrAgt(DbtrAgt dbtrAgt) {
        this.dbtrAgt = dbtrAgt;
    }

    public String getChrgBr() {
        return chrgBr;
    }

    public void setChrgBr(String chrgBr) {
        this.chrgBr = chrgBr;
    }

    public CdtTrfTxInf getCdtTrfTxInf() {
        return cdtTrfTxInf;
    }

    public void setCdtTrfTxInf(CdtTrfTxInf cdtTrfTxInf) {
        this.cdtTrfTxInf = cdtTrfTxInf;
    }
}
