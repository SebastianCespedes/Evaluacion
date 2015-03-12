/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import utilidades.Conexion;

/**
 *
 * @author Sena
 */
public class PrestamoDao {
    PreparedStatement ps = null;
        Connection cn = null;
        ResultSet rs = null;
        
        public PrestamoDao() {
        cn = Conexion.getInstance();
    }
        public int validarUsuario(int idUsuario){
            String mensaje="";
            CallableStatement cstm;
            
            try{
                cstm = cn.prepareCall("{call sp_validarUsuario(?) }");
                cstm.setInt(1, idUsuario);
                cstm.executeQuery();
            } catch (SQLException ex) {
            mensaje = "Error: " + ex.getMessage();
        }
            return 0;
        }
    
}
