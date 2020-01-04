package com.rest.xmlparser.processfile.modal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created By Shameera.A on 1/3/2020
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "CstmrCdtTrfInitn")
public class CustomerCreditTransfer {

    @XmlElement(name = "GrpHdr")
    private GrpHdr grpHdr;

    @XmlElement(name = "PmtInf")
    private PmtInf pmtInf;

    public GrpHdr getGrpHdr() {
        return grpHdr;
    }

    public void setGrpHdr(GrpHdr grpHdr) {
        this.grpHdr = grpHdr;
    }

    public PmtInf getPmtInf() {
        return pmtInf;
    }

    public void setPmtInf(PmtInf pmtInf) {
        this.pmtInf = pmtInf;
    }

    @Override
    public String toString() {
        return "CustomerCreditTransfer{" +
                "grpHdr=" + grpHdr +
                ", pmtInf=" + pmtInf +
                '}';
    }
}
