package com.guzman.clases.infousuario;

public class Usuario {

    int noCliente;
    String info;

    public Usuario() {
    }

    public Usuario(int noCliente, String info) {
        this.noCliente = noCliente;
        this.info = info;
    }

    public int getNoCliente() {
        return noCliente;
    }

    public void setNoCliente(int noCliente) {
        this.noCliente = noCliente;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
