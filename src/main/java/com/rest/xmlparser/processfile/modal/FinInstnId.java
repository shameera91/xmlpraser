package com.rest.xmlparser.processfile.modal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * Created By Shameera.A on 1/4/2020
 */

@XmlAccessorType(XmlAccessType.FIELD)
public class FinInstnId {

    @XmlElement(name = "BIC")
    private String bic;

    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }
}
