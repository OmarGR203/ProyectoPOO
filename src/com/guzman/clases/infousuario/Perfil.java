package com.guzman.clases.infousuario;

public class Perfil {
   int id;
   String nombrePerfil, descripcionPerfil;


    public Perfil() {
    }

    public Perfil(int id, String nombrePerfil, String descripcionPerfil) {
        this.id = id;
        this.nombrePerfil = nombrePerfil;
        this.descripcionPerfil = descripcionPerfil;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrePerfil() {
        return nombrePerfil;
    }

    public void setNombrePerfil(String nombrePerfil) {
        this.nombrePerfil = nombrePerfil;
    }

    public String getDescripcionPerfil() {
        return descripcionPerfil;
    }

    public void setDescripcionPerfil(String descripcionPerfil) {
        this.descripcionPerfil = descripcionPerfil;
    }
}
