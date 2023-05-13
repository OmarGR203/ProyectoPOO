package com.guzman.clases.infousuario;

public class Usuario extends Persona{

    int noCliente;
    String info;

    char tipo;

    public Usuario() {
    }

    public Usuario(int noCliente, String info, char tipo) {
        this.noCliente = noCliente;
        this.info = info;
        this.tipo = tipo;
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

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

}


