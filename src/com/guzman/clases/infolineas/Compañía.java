package com.guzman.clases.infolineas;

public class Compañía {
    String nombreCompania;
    int plan;

    public Compañía() {
    }

    public Compañía(String nombreCompania, int plan) {
        this.nombreCompania = nombreCompania;
        this.plan = plan;
    }

    public String getNombreCompania() {
        return nombreCompania;
    }

    public void setNombreCompania(String nombreCompania) {
        this.nombreCompania = nombreCompania;
    }

    public int getPlan() {
        return plan;
    }

    public void setPlan(int plan) {
        this.plan = plan;
    }
}
