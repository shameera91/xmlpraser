package com.rest.xmlparser.processfile.modal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * Created By Shameera.A on 1/4/2020
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Amt {

    @XmlElement(name = "InstdAmt")
    private String instdAmt;

    public String getInstdAmt() {
        return instdAmt;
    }

    public void setInstdAmt(String instdAmt) {
        this.instdAmt = instdAmt;
    }
}
