package org.example.platzi.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MensajesDAO {
public static void creadorMensajeDB(Mensajes mensajes){
conexion db_connect  = new conexion();
try(Connection conexion= db_connect.get_connection()){
    PreparedStatement myStam = null;
    try{
        String query="INSERT INTO `mensajes` (mensaje, autor_mensaje) VALUES (?,?);";
            myStam = conexion.prepareStatement(query);
            myStam.setString(1, mensajes.getMensaje());
            myStam.setString(2, mensajes.getAutor_mensaje());
            myStam.executeUpdate();
        System.out.println("el mensaje ,fue creado correctamente ");
    }catch (SQLException e){
        System.out.println(e);
    }
}catch (SQLException e){
    System.out.println(e);
}
}

public static void leerMensajesDB(){
    conexion db_connect  = new conexion();
    PreparedStatement myStam = null;
    ResultSet myRest = null;

    try(Connection conexion= db_connect.get_connection()){
        String query="SELECT *FROM mensajes";
        myStam = conexion.prepareStatement(query);
        myRest = myStam.executeQuery();

        while (myRest.next()){
            System.out.println("ID: "+myRest.getInt("id_mensaje"));
            System.out.println("mensajes: "+myRest.getString("mensaje"));
            System.out.println("fecha: "+myRest.getString("fecha_mensaje"));




        }
    }catch (SQLException e){
        System.out.println("no se puede recuperar los mensajes");
        System.out.println(e);
    }
}

public static void eliminarMensajeDB(int id_mensaje) throws SQLException {
    conexion db_connect  = new conexion();
    try(Connection conexion= db_connect.get_connection()){
        PreparedStatement myStam = null;
        try {
            String query="DELETE FROM mensajes WHERE id_mensaje = ?";
            myStam = conexion.prepareStatement(query);
            myStam.setInt(1,id_mensaje);
            myStam.executeUpdate();
            System.out.println("el mensaje fue borrado exitosamente");

        }catch (SQLException e){

            System.out.println(e);
            System.out.println("no se pudo borrar el mensaje");

        }



    }catch (SQLException e){
        System.out.println(e);
    }
}
public static void actualizarMensajeDB(Mensajes mensajes) throws SQLException {
    conexion db_connect  = new conexion();
    try(Connection conexion= db_connect.get_connection()){
        PreparedStatement myStam = null;
        try {
        String query ="UPDATE mensajes SET mensaje = ? WHERE id_mensaje = ?";
        myStam=conexion.prepareStatement(query);
        myStam.setString(1,mensajes.getMensaje());
        myStam.setInt(2,mensajes.getId_mensaje());
        myStam.executeUpdate();
            System.out.println("se actualizo con exito");
        }catch (SQLException ex){
            System.out.println(ex);
            System.out.println("no se actualizo correctamente");
        }
    }catch (SQLException e){
        System.out.println(e);
    }

}


}
