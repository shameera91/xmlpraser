package com.rest.xmlparser.processfile.modal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * Created By Shameera.A on 1/4/2020
 */

@XmlAccessorType(XmlAccessType.FIELD)
public class CdtTrfTxInf {

    @XmlElement(name = "PmtId")
    private PmtId pmtId;

    @XmlElement(name = "Amt")
    private Amt amt;

    @XmlElement(name = "Cdtr")
    private Cdtr cdtr;

    @XmlElement(name = "CdtrAcct")
    private CdtrAcct cdtrAcct;

    @XmlElement(name = "RmtInf")
    private RmtInf rmtInf;

    public PmtId getPmtId() {
        return pmtId;
    }

    public void setPmtId(PmtId pmtId) {
        this.pmtId = pmtId;
    }

    public Amt getAmt() {
        return amt;
    }

    public void setAmt(Amt amt) {
        this.amt = amt;
    }

    public Cdtr getCdtr() {
        return cdtr;
    }

    public void setCdtr(Cdtr cdtr) {
        this.cdtr = cdtr;
    }

    public CdtrAcct getCdtrAcct() {
        return cdtrAcct;
    }

    public void setCdtrAcct(CdtrAcct cdtrAcct) {
        this.cdtrAcct = cdtrAcct;
    }

    public RmtInf getRmtInf() {
        return rmtInf;
    }

    public void setRmtInf(RmtInf rmtInf) {
        this.rmtInf = rmtInf;
    }
}
