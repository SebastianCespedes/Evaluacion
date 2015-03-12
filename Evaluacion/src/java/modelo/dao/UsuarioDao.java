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
public class UsuarioDao {
        PreparedStatement ps = null;
        Connection cn = null;
        ResultSet rs = null;
        
        public UsuarioDao() {
        cn = Conexion.getInstance();
    }
        
    
}
