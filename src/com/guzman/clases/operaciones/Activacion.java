package com.guzman.clases.operaciones;

import com.guzman.clases.infolineas.TarjetaSim;

import java.util.Scanner;

public class Activacion extends TarjetaSim{

    boolean activado;

    public Activacion() {
    }

    public Activacion(boolean activado) {
        this.activado = activado;
    }

    public boolean isActivado() {
        return activado;
    }

    public void setActivado(boolean activado) {
        this.activado = activado;
    }

    public static void activarSim(){
        TarjetaSim tarjetaSim = new TarjetaSim();
    }

    public static void preactivacion (){
        Scanner scanner =new Scanner(System.in);
        int lada, numero, dn;
        System.out.println("Ingrese la lada");
        lada = scanner.nextInt();
        numero = (int)(Math.random()*8+1);
        dn = lada + numero;



    }

}
