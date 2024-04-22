package org.example.platzi.main;

import javax.sound.midi.Soundbank;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.SortedMap;

public class mensajesService {
    public static void crearMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("escribe tu mensaje");
        String mensajeaPublicar = sc.nextLine();

        System.out.println("nombre del autor");
        String nombreAutor =sc.nextLine();

        Mensajes registro = new Mensajes();
        registro.setMensaje(mensajeaPublicar);
        registro.setAutor_mensaje(nombreAutor);
        MensajesDAO.creadorMensajeDB(registro);

    }
    public static void listarMensajes(){
        MensajesDAO.leerMensajesDB();
    }
    public static void borrarMensaje() throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("indica el id del mensaje a borrar");
        int id_mensaje = sc.nextInt();
        MensajesDAO.eliminarMensajeDB(id_mensaje);
    }
    public static void editarMensaje() throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("escribe tu nuevo mensaje");
        String mensajeNuevo = sc.nextLine();

        System.out.println("indica el id del mensaje ");
        int id_mensaje = sc.nextInt();
        Mensajes actualizar = new Mensajes();
        actualizar.setId_mensaje(id_mensaje);
        actualizar.setMensaje(mensajeNuevo);
        MensajesDAO.actualizarMensajeDB(actualizar);

    }
}

