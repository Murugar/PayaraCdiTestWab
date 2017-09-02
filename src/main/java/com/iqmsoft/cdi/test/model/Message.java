
package com.iqmsoft.cdi.test.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "message",
                namespace = "http://www.cdi.com/xml/schema")

@XmlAccessorType(XmlAccessType.FIELD)
public class Message
        implements Serializable {

    private static final long serialVersionUID = -5523133610795262752L;

    @XmlElement(required = true,
                name = "content")
    private String messsage;

    public Message() {
    }

    public String getMesssage() {
        return messsage;
    }

    public Message setMesssage(String messsage) {
        this.messsage = messsage;
        return this;
    }

}
