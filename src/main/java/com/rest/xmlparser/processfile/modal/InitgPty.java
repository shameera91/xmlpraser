package com.rest.xmlparser.processfile.modal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * Created By Shameera.A on 1/3/2020
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class InitgPty {

    @XmlElement(name = "Nm")
    private String nm;

    public String getNm() {
        return nm;
    }

    public void setNm(String nm) {
        this.nm = nm;
    }

    @Override
    public String toString() {
        return "InitgPty{" +
                "nm='" + nm + '\'' +
                '}';
    }
}
