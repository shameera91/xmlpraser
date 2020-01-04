package com.rest.xmlparser.processfile.modal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * Created By Shameera.A on 1/4/2020
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class CdtrAcct {

    @XmlElement(name = "Id")
    private Id id;

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }
}
