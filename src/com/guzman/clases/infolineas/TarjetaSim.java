package com.guzman.clases.infolineas;

public class TarjetaSim {
    String iccid, sobre;

    public TarjetaSim() {
    }

    public TarjetaSim(String iccid, String sobre) {
        this.iccid = iccid;
        this.sobre = sobre;
    }

    public String getIccid() {
        return iccid;
    }

    public void setIccid(String iccid) {
        this.iccid = iccid;
    }

    public String getSobre() {
        return sobre;
    }

    public void setSobre(String sobre) {
        this.sobre = sobre;
    }
}
