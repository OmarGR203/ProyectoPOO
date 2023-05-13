import com.guzman.clases.operaciones.Activacion;
import com.guzman.clases.operaciones.RecargaSaldo;

import javax.swing.plaf.PanelUI;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    private static Activacion activacion = new Activacion();
    private static RecargaSaldo recagaSaldo = new RecargaSaldo();

    private static IniciarSesion iniciarSesion = new IniciarSesion();



    public static void main(String[] args) {
     iniciarSesion.toString();


    }



    public static void activarSIM() {

        if (recagaSaldo.getMonto() == 50) {
            activacion.setActivado(true);
            System.out.println("SIM ACTIVADA");

      //el tipo de recarga que debe de ser



        } else {
            activacion.setActivado(false);
            System.out.println("LA SIM NO SE HA ACTIVADO. ");
        }
    }
}