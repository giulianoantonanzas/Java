package mantenimiento;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.Usuario;
import conectorBD.MySQLConexion;

public class GestionUsuario {

    public Usuario obtenerUsuario(Usuario uso) {

        Usuario usuario = null;

        Connection con = null;

        PreparedStatement pst = null;

        ResultSet rs = null;

        try {

            con = MySQLConexion.getConexion();

            String sql = "select * from usuario where id_usuario=? and clave=?";

            pst = con.prepareStatement(sql);

            pst.setString(1, uso.getId_usuario());
            pst.setString(2, uso.getClave());

            rs = pst.executeQuery();

            while (rs.next()) {
                //                        usuario         nombre            apellido        clave
                usuario = new Usuario(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
            }

        } catch (Exception e) {

            System.out.println("no se encontra un usuario.");

        }

        return usuario;
    }

    public boolean existeNombreUsuario(String uso) {

        Usuario usuario = null;

        Connection con = null;

        PreparedStatement pst = null;

        ResultSet rs = null;

        try {

            con = MySQLConexion.getConexion();

            String sql = "select * from usuario where id_usuario=?";

            pst = con.prepareStatement(sql);

            pst.setString(1, uso);

            rs = pst.executeQuery();

            while (rs.next()) {
                //                        usuario         nombre            apellido        clave
                usuario = new Usuario(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
            }

        } catch (Exception e) {

            return false;

        }

        if (uso != null) {
            return true;
        }
        return false;
    }

    public void AgregarUsuario(Usuario uso) {
        Usuario usuario = null;

        Connection con = null;

        PreparedStatement pst = null;

        ResultSet rs = null;

        try {
            con = MySQLConexion.getConexion();

            String sql = "INSERT INTO usuario (id_usuario, clave)"+ " VALUES (?,?)";

            pst = con.prepareStatement(sql);

            pst.setString(1, uso.getId_usuario());
            pst.setString(2, uso.getClave());

            pst.executeUpdate();//usar executeuptdate para subir contenido (para setear)

        } catch (Exception e) {

            System.out.println("no se guardo el usuario");

        }
    }

}
