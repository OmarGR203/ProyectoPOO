package com.guzman.clases.operaciones;

public class RecargaSaldo {

    float monto;
    int recarga;

    public RecargaSaldo() {
    }

    public RecargaSaldo(float monto, int recarga) {
        this.monto = monto;
        this.recarga = recarga;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public int getRecarga() {
        return recarga;
    }

    public void setRecarga(int recarga) {
        this.recarga = recarga;
    }
}
