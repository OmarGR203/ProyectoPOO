import java.util.Scanner;

public class IniciarSesion {
    public static void inicioSesion() {
        System.out.println("Acceso a sistema");
        Scanner datos = new Scanner(System.in);
        int intento, contraseña = 2060, acceso = 0;
        do {
            System.out.println("Ingresa la contraseña");
            intento = datos.nextInt();
            if (intento == contraseña) {
                System.out.println("Contraseña correcta");
                System.out.println("Bienvenido");
                acceso = 3;
            } else {
                System.out.println("Contraseña incorrecta");
                acceso = acceso + 1;
                if (acceso == 3) {
                    System.out.println("¡Accseso restringido!");
                    System.out.println("Supero el limite de intentos");
                }
            }
        } while (acceso < 3 );
}

}
