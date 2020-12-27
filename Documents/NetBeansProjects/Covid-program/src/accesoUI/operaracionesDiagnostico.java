package accesoUI;

import accesoDB.MySQLConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import modeloClases.Ciudadano;
import modeloClases.Diagnostico;
import modeloClases.Persona;

public class operaracionesDiagnostico {

    public void AgregarDiagnostico(Ciudadano uso, int temperatura, boolean Detectable, int cantSintomas) {
        java.util.Date date = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            con = MySQLConexion.getConexion();
            String sql = "INSERT INTO diagnostico(fecha_informe,temperatura,Detectable,cantidad_sintomas,patente_ciudadano)" + " VALUES (?,?,?,?,?)";

            pst = con.prepareStatement(sql);

            pst.setDate(1, sqlDate);
            pst.setInt(2, temperatura);
            pst.setBoolean(3, Detectable);
            pst.setInt(4, cantSintomas);
            pst.setString(5, uso.getPatente());

            pst.executeUpdate();//usar executeuptdate para subir contenido (para setear)

            pst.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public ArrayList<Diagnostico> obtenerDiagnosticos(Ciudadano uso) {
        ArrayList<Diagnostico> diagnosticos = new ArrayList<>();

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            con = MySQLConexion.getConexion();
            String sql = "select * from diagnostico where patente_ciudadano ='" + uso.getPatente() + "'";
            pst = con.prepareStatement(sql);

            rs = pst.executeQuery();

            while (rs.next()) {
                //tengo que parsear el sqlDate por javaUtilDate (ya que sino tira error)
                java.sql.Date dbSqlDate = rs.getDate(2);
                java.util.Date dbSqlTimeConverted = dbSqlDate;

                Diagnostico diagnostico = new Diagnostico(dbSqlTimeConverted, rs.getInt(3), rs.getBoolean(4), rs.getInt(5));
                diagnosticos.add(diagnostico);
            }

            pst.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return diagnosticos;
    }

    public Diagnostico obtenerSuUltimoDiagnostico(Ciudadano uso) {
        Diagnostico diagnostico = new Diagnostico();

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            con = MySQLConexion.getConexion();
            String sql = "select * from diagnostico where patente_ciudadano ='" + uso.getPatente() + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                diagnostico = new Diagnostico(rs.getInt(1));
            }

            pst.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return diagnostico;
    }

    public void generarGestionDiagnostico(Diagnostico diagnostico, Persona persona) {
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            con = MySQLConexion.getConexion();
            String sql = "INSERT INTO gestion_diagnostico(DNI_persona,id_diagnostico)" + " VALUES (?,?)";

            pst = con.prepareStatement(sql);

            pst.setInt(1, persona.getDNI());
            pst.setInt(2, diagnostico.getIdDiagnostico());

            pst.executeUpdate();//usar executeuptdate para subir contenido (para setear)

            pst.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public ArrayList<Persona> personasDiagnosticadas() {
        java.util.Date date = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());

        ArrayList<Persona> personas = new ArrayList<>();
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            con = MySQLConexion.getConexion();

            String sql = "SELECT p.DNI,p.apellido,p.nombre,p.edad,p.localidad,p.genero,p.actividadEscencial"
                    + " FROM gestion_diagnostico gd ,diagnostico d , persona p"
                    + " WHERE (gd.DNI_persona=p.DNI AND gd.id_diagnostico=d.id_Diagnostico) and d.fecha_informe='" + sqlDate + "'";

            pst = con.prepareStatement(sql);

            rs = pst.executeQuery();

            while (rs.next()) {
//int DNI, String nombre, String apellido, int edad, String localidad, String genero, boolean actividadEscencial
                Persona persona = new Persona(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getBoolean(7));
                personas.add(persona);
            }

            pst.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return personas;
    }

    public String CantidadCasosHoy() {
        java.util.Date date = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        int cantCasoshoy = 0;

        try {
            con = MySQLConexion.getConexion();
//           SELECT COUNT(*)
//           FROM diagnostico 
//           WHERE fecha_informe = '2020-10-22'  
            String sql = "SELECT COUNT(*) FROM diagnostico WHERE fecha_informe ='" + sqlDate + "'";
            pst = con.prepareStatement(sql);

            rs = pst.executeQuery();

            while (rs.next()) {
                cantCasoshoy = rs.getInt(1);
            }

            pst.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return Integer.toString(cantCasoshoy);
    }
}
