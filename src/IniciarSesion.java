import com.guzman.clases.infousuario.Usuario;

import javax.swing.*;
import java.util.Scanner;

public class IniciarSesion {

    public static void iniciarSesion (){
        Scanner scanner = new Scanner(System.in);
        String us="oguzma20@gmial.com", pass="123C56";
        String usuario, password;
        System.out.println("INGRESE SU USUARIO");
        usuario = scanner.nextLine();
        System.out.println("INGRESE SU CONTRASEÑA");
        password = scanner.nextLine();

        int intentos=0;
        if (us.equals(usuario) && pass.equals(password)){
            System.out.println("BIENVENIDO A SU PORTAL DE ACTIVACIONES");
        }
        while (pass.equals(password)==false && intentos<3)
            System.out.println("Hay un error en sus datos, intente nuevamente");
        System.out.println("INGRESE SU USUARIO");
        usuario = scanner.nextLine();
        System.out.println("INGRESE SU CONTRASEÑA");
        password = scanner.nextLine();
        intentos++;

        if(intentos==3){
            System.out.println("HA REBASADO EL NÚMERO DE INTENTOS PERMITIDOS");
        }

    }

}
