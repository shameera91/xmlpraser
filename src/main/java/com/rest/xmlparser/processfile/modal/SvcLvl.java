package com.rest.xmlparser.processfile.modal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * Created By Shameera.A on 1/4/2020
 */

@XmlAccessorType(XmlAccessType.FIELD)
public class SvcLvl {

    @XmlElement(name = "Cd")
    private String cd;

    public String getCd() {
        return cd;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }
}
