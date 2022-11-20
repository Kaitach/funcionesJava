package com.mycompany.funciones1;

/**
 *
 * @author Franco
 */
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Funciones1 {

    static String Cursando[] = new String[8];
    
    static String Notas[] = new String[8];
    static String Usuarios[] = new String[8];

    public static void main(String[] args) {
         Usuarios[0] = "Pedro";
        Usuarios[1] = "Sofia";
        Usuarios[2] = "Martin";
        Usuarios[3] = "Marcelo";
        Usuarios[4] = "Patricio";
        Usuarios[5] = "Matias";
        Usuarios[6] = "Anacleta ";
        JOptionPane.showMessageDialog(null, "Bienvenidos a la escuela de manejo");
        menu();

    }

    static void ingreso() {
    
        Usuarios[7] = JOptionPane.showInputDialog("Cual es tu nombre?");

        JOptionPane.showMessageDialog(null, "Hola " + Usuarios[7]);
        Cursando[7] = "Cursando";
        Notas[7] = "Sin rendir";
        menu();

    }

    static void cursando() {
        Cursando[0] = "Listo";
        Cursando[1] = "Cursando";
        Cursando[2] = "Listo";
        Cursando[3] = "Listo";
        Cursando[4] = "Listo";
        Cursando[5] = "Listo";
        Cursando[6] = "Cursando";
        JOptionPane.showMessageDialog(null, "Estos son los usuarios del curso: " + Arrays.asList(Usuarios));
        menu();
    }

    static void notas() {
      
        Notas[0] = "Aprobado";
        Notas[1] = "Sin rendir";
        Notas[2] = "Aprobado";
        Notas[3] = "Aprobado";
        Notas[4] = "Reprobado";
        Notas[5] = "Aprobado";
        Notas[6] = "Sin rendir";

        for (int i = 0; i < 8; i++) {
                   if (Usuarios[i] == null) {
            menu();
        }
            JOptionPane.showMessageDialog(null, "El estado de los examenes de los usuarios es:  " + Usuarios[i] + " " + Notas[i]);
            
       

        }
        menu();
    }

    static void menu() {
        String registrado = "1: Registrar";

        if (Usuarios[7] != null) {
            registrado = "Usuario: " + Usuarios[7];
        }

        byte opcion = Byte.parseByte(JOptionPane.showInputDialog("MENU PRINCIPAL\n " + registrado + "\n" + "2: Ver personas en curso\n" + "3: Notas del curso\n" + "4: Salir\n" + "ELIJA SU OPCION"));
        do {
            switch (opcion) {

                case 1:

                    JOptionPane.showMessageDialog(null, "Registrando usuario");
                    ingreso();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Mostrando usuarios cursando");
                    cursando();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Mostrando estado del curso");

                    notas();
                    break;
                case 4:
                    opcion = 4;
                    break;
                default:

                    JOptionPane.showMessageDialog(null, "Entrada invalida");
                    menu();

                    break;
            }
        } while (opcion != 4);
        JOptionPane.showMessageDialog(null, "Esperamos regrese pronto");
    }
}
