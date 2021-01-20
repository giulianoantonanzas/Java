/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin.administrative.runEntityManager;

import admin.administrative.models.Usuario;

/**
 *
 * @author patyg
 */
public class ManagerUser {

    EntitiesManager em;

    public ManagerUser() {
    }

    public boolean getUsuario(String usuario, String contrasenia) {
        EntitiesManager em = new EntitiesManager();
        Usuario usuarioReturn = null;
        em.getManager().getTransaction().begin();
        try {
            usuarioReturn = em.getManager().createQuery("SELECT u FROM usuario u WHERE"
                    + " u.nombre_usuario= '" + usuario + "' and u.contrasenia= '" + contrasenia + "'", Usuario.class)
                    .getSingleResult();
            if (usuarioReturn != null) {
                return true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;

    }

}
