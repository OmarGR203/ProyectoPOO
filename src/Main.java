import com.guzman.clases.operaciones.Preactivacion;
import com.guzman.clases.operaciones.RecargaSaldo;

import java.util.Scanner;

public class Main {


    // Persona persona = new Persona(){
    //  String persona.
    //}

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int eleccion;
        System.out.println("Bienvenido al sistema de activacion y recargas");
        System.out.println("1.Activa tu línea, 2.Recarga Saldo, 3.Preactivar");

        eleccion=obj.nextInt();
        switch (eleccion) {
            case 1 -> {
                System.out.println("Preactiva tu línea");
                Preactivacion.preactivacion();
            }
            case 2 ->{
                System.out.println("Recarga saldo");
                RecargaSaldo.Recarga();
            }
            case 3 ->{
                System.out.println("");
            }

        }

       // IniciarSesion.inicioSesion();
       // Preactivacion.preactivacion();

    }


}


  /*  public static void activarSIM() {

        if (recagaSaldo.getMonto() == 50) {
            activacion.setActivado(true);
            System.out.println("SIM ACTIVADA");

      //el tipo de recarga que debe de ser



        } else {
            activacion.setActivado(false);
            System.out.println("LA SIM NO SE HA ACTIVADO. ");
        }
    }
}*/