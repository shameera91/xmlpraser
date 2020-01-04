package com.rest.xmlparser.processfile.modal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * Created By Shameera.A on 1/4/2020
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RmtInf {

    @XmlElement(name = "Ustrd")
    private String ustrd;

    public String getUstrd() {
        return ustrd;
    }

    public void setUstrd(String ustrd) {
        this.ustrd = ustrd;
    }
}
