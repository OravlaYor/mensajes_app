package org.example.platzi.main;

import java.sql.Connection;
import java.sql.SQLException;

public class inicio {
    public static void main(String[] args) throws SQLException {
        conexion conexion = new conexion();
        try(Connection cnx = conexion.get_connection()){

        }catch (Exception e){
            System.out.println(e);

        }

    }
}
