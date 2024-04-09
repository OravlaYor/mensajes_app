package org.example.platzi.main;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class inicio {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        int  opcion = 0;

        do{
            System.out.println("-----------------");
            System.out.println("Aplicacion de mensajes");
            System.out.println("1. craar mensaje");
            System.out.println("2. listar mensaje");
            System.out.println("3. editar mensaje");
            System.out.println("4. eliminar mensaje");
            System.out.println("5. salir");
            ///veremos la opcion del teclado que seleccionaran
            opcion=sc.nextInt();

            switch (opcion){
                case 1:
                    mensajesService.crearMensaje();
                    break;
                case 2:
                    mensajesService.listarMensajes();
                    break;
                case 3:
                    mensajesService.editarMensaje();
                    break;
                case 4:
                    mensajesService.borrarMensaje();
                    break;
                default:
                    break;
            }

        }while (opcion != 5);



    }
}
