/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.dto.LibroDto;
import utilidades.Conexion;

/**
 *
 * @author Sena
 */
public class LibroDao {

    Connection cnn = null;
    PreparedStatement pstm = null;
    ResultSet rs = null;
    String mensaje = "";
    int registro = 0;

    public LibroDao() {
        cnn = Conexion.getInstance();
    }

    public String ingresarLibro() {
        LibroDto libro = new LibroDto();
        try {
            pstm = cnn.prepareStatement("INSERT INTO libros VALUES(null,?,?,?,?);");

            pstm.setString(1, libro.getIsbn());
            pstm.setString(2, libro.getTitulo());
            pstm.setInt(3, libro.getPrecioLibro());
            pstm.setInt(4, libro.getEstado());
            registro = pstm.executeUpdate();
            if (registro != 0) {
                mensaje = "Registro exitoso";
            } else {
                mensaje = "Ocurrio algo";
            }

        } catch (SQLException ex) {

        }
        return mensaje;
    }
}
