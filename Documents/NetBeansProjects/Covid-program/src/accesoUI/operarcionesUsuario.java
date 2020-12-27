package accesoUI;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import accesoDB.MySQLConexion;
import modeloClases.Ciudadano;
import modeloClases.Medico;
import modeloClases.Persona;

public class operarcionesUsuario {

    public Persona obtenerUsuario(Persona uso) {
        Persona usuario = null;
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            con = MySQLConexion.getConexion();
            String sql = "select * from persona where DNI=? and apellido=?";
            pst = con.prepareStatement(sql);
            //logear desde el dni como usuario y apellido como contrasenia
            pst.setInt(1, uso.getDNI());
            pst.setString(2, uso.getApellido());
            rs = pst.executeQuery();

            while (rs.next()) { 
                usuario = new Persona(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getBoolean(7));
            }
            
            pst.close();
            con.close();
            
        } catch (Exception e) {
            System.out.println("no se encontra un usuario.");
        }
        return usuario;
    }

    public boolean existeNombreUsuario(int uso) {
        Persona usuario = null;
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            con = MySQLConexion.getConexion();
            String sql = "select * from persona where DNI="+uso;
            pst = con.prepareStatement(sql);
            //pst.setInt(1, uso);
            rs = pst.executeQuery();
            
            while (rs.next()) {    
                usuario = new Persona();
            }
            
            pst.close();
            con.close();
        } catch (Exception e) {
            return false;
        }

        if (usuario==null) {
            return true;
        }
        return false;
    }

    public void AgregarUsuario(Persona uso) {
        Persona usuario = null;
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            con = MySQLConexion.getConexion();
            String sql = "INSERT INTO persona (DNI,apellido,nombre,edad,localidad,genero,actividadEscencial)" + " VALUES ("+uso.getDNI()+",?,?,?,?,?,?)";
            pst = con.prepareStatement(sql);

            pst.setString(1, uso.getApellido());
            pst.setString(2, uso.getNombre());
            pst.setInt(3, uso.getEdad());
            pst.setString(4, uso.getLocalidad());
            pst.setString(5, uso.getGenero());
            pst.setBoolean(6, uso.isActividadEscencial());
            pst.executeUpdate();//usar executeuptdate para subir contenido (para setear)
            
            pst.close();
            con.close();
        } catch (Exception e) {
            System.out.println("no se guardo el usuario");
        }
    }
    
    
    
    
        public void AgregarMedico(Medico uso) {
        Persona usuario = null;
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            con = MySQLConexion.getConexion();
            String sql = "INSERT INTO medico"+" VALUES (?,?,"+uso.getDNI()+")";
            pst = con.prepareStatement(sql);
            pst.setInt(1,uso.getNumeroMatricula());
            pst.setString(2, uso.getEspecialidad());
            
            pst.executeUpdate();//usar executeuptdate para subir contenido (para setear)
            
            pst.close();
            con.close();
            
        } catch (Exception e) {
            System.out.println("no se guardo el usuario");
        }
    }

        
        public void AgregarCiudadano(Ciudadano uso) {
        Persona usuario = null;
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            con = MySQLConexion.getConexion();
            String sql = "INSERT INTO ciudadano"+" VALUES (?,?,"+uso.getDNI()+")";
            pst = con.prepareStatement(sql);
            pst.setString(1,uso.getPatente());
            pst.setString(2, uso.getDomicilio());
            pst.executeUpdate();//usar executeuptdate para subir contenido (para setear)
            
            pst.close();
            con.close();
        } catch (Exception e) {
            System.out.println("no se guardo el usuario");
        }
    }

    public Ciudadano obtenerCiudadano(Persona uso) {
        Ciudadano usuario = null;
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            con = MySQLConexion.getConexion();
            String sql = "select * from ciudadano where DNI_persona="+uso.getDNI();
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while (rs.next()) {
                usuario = new Ciudadano(rs.getString(1), rs.getString(2));
            }
            
            pst.close();
            con.close();
            
        } catch (Exception e) {
            System.out.println("no se encontra un usuario.");
        }
        
        return usuario;
    }
    
    public Medico obtenerMedico(Persona uso) {
        Medico usuario = null;
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            con = MySQLConexion.getConexion();
            String sql = "select * from medico where DNI_persona="+uso.getDNI();
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while (rs.next()) {
                usuario = new Medico(rs.getInt(1), rs.getString(2));
            }
            
            pst.close();
            con.close();
            
        } catch (Exception e) {
            System.out.println("no se encontra un usuario.");
        }
        return usuario;
    }
}
