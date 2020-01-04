package com.rest.xmlparser.processfile.modal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * Created By Shameera.A on 1/4/2020
 */

@XmlAccessorType(XmlAccessType.FIELD)
public class PmtTpInf {

    @XmlElement(name = "SvcLvl")
    private SvcLvl svcLvl;

    public SvcLvl getSvcLvl() {
        return svcLvl;
    }

    public void setSvcLvl(SvcLvl svcLvl) {
        this.svcLvl = svcLvl;
    }
}
