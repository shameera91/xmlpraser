package com.rest.xmlparser.processfile.modal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * Created By Shameera.A on 1/3/2020
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class GrpHdr {

    @XmlElement(name = "MsgId")
    private String msgId;

    @XmlElement(name = "CreDtTm")
    private String creDtTm;

    @XmlElement(name = "NbOfTxs")
    private String nbOfTxs;

    @XmlElement(name = "CtrlSum")
    private String ctrlSum;

    @XmlElement(name = "InitgPty")
    private InitgPty initgPty;

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public String getCreDtTm() {
        return creDtTm;
    }

    public void setCreDtTm(String creDtTm) {
        this.creDtTm = creDtTm;
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

    public InitgPty getInitgPty() {
        return initgPty;
    }

    public void setInitgPty(InitgPty initgPty) {
        this.initgPty = initgPty;
    }

    @Override
    public String toString() {
        return "GrpHdr{" +
                "msgId='" + msgId + '\'' +
                ", creDtTm='" + creDtTm + '\'' +
                ", nbOfTxs='" + nbOfTxs + '\'' +
                ", ctrlSum='" + ctrlSum + '\'' +
                ", initgPty=" + initgPty +
                '}';
    }
}
