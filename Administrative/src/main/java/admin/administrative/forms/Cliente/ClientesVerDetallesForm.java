/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin.administrative.forms.Cliente;

import admin.administrative.forms.Confirmar;
import admin.administrative.models.Cliente;
import java.awt.Color;
import java.text.SimpleDateFormat;
import admin.administrative.runEntityManager.ManagerCliente;

/**
 *
 * @author patyg
 */
public class ClientesVerDetallesForm extends javax.swing.JFrame {

    private static Cliente cliente = new Cliente();
    private ManagerCliente managerCliente;

    private boolean editable = false;
    private boolean pudoSerEditado = false;

    public ClientesVerDetallesForm(Cliente cliente) {
        initComponents();
        managerCliente = new ManagerCliente();
        this.cliente = cliente;
        darValoresTextField();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        whatsappTxt = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        paisTxt = new javax.swing.JTextField();
        direccionTxt = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        localidadTxt = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JTextField();
        provinciaTxt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        apellidoTxt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        fechaNacimientoTxt = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        telefonoTxt = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        eliminarBtn = new javax.swing.JButton();
        aceptarBtn = new javax.swing.JButton();
        editarBtn = new javax.swing.JToggleButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("WhatsApp");

        whatsappTxt.setEditable(false);
        whatsappTxt.setBackground(java.awt.Color.lightGray);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Pais");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Direccion");

        paisTxt.setEditable(false);
        paisTxt.setBackground(java.awt.Color.lightGray);

        direccionTxt.setEditable(false);
        direccionTxt.setBackground(java.awt.Color.lightGray);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Localidad");

        localidadTxt.setEditable(false);
        localidadTxt.setBackground(java.awt.Color.lightGray);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Provincia");

        nombreTxt.setEditable(false);
        nombreTxt.setBackground(java.awt.Color.lightGray);

        provinciaTxt.setEditable(false);
        provinciaTxt.setBackground(java.awt.Color.lightGray);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Apellido");

        apellidoTxt.setEditable(false);
        apellidoTxt.setBackground(java.awt.Color.lightGray);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Fecha de nacimiento");

        fechaNacimientoTxt.setEditable(false);
        fechaNacimientoTxt.setBackground(java.awt.Color.lightGray);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Telefono");

        telefonoTxt.setEditable(false);
        telefonoTxt.setBackground(java.awt.Color.lightGray);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(localidadTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(direccionTxt)
                            .addComponent(provinciaTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(paisTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(37, 37, 37))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(25, 25, 25)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(telefonoTxt)
                            .addComponent(whatsappTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addGap(18, 18, 18)
                            .addComponent(fechaNacimientoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel13))
                            .addGap(37, 37, 37)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nombreTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                                .addComponent(apellidoTxt)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(apellidoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(fechaNacimientoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(telefonoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(whatsappTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(direccionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(localidadTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(provinciaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(paisTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        eliminarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eliminarBtn.setText("Eliminar");
        eliminarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarBtnActionPerformed(evt);
            }
        });

        aceptarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        aceptarBtn.setText("Aceptar");
        aceptarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarBtnActionPerformed(evt);
            }
        });

        editarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        editarBtn.setText("Editar");
        editarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(aceptarBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(eliminarBtn)
                .addGap(100, 100, 100))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(editarBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(aceptarBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(eliminarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarBtnActionPerformed
        if (pudoSerEditado) {
            try {

                cliente.setNombre(nombreTxt.getText());
                cliente.setApellido(apellidoTxt.getText());
                cliente.setFecha_nacimiento(new SimpleDateFormat("dd-MM-yyyy").parse(fechaNacimientoTxt.getText()));
                cliente.getContacto().setTelefono(telefonoTxt.getText());
                cliente.getContacto().setWhatsapp(whatsappTxt.getText());
                cliente.getDireccion().setDireccion(direccionTxt.getText());
                cliente.getDireccion().setLocalidad(localidadTxt.getText());
                cliente.getDireccion().setProvincia(provinciaTxt.getText());
                cliente.getDireccion().setPais(paisTxt.getText());

                managerCliente.margeCliente(cliente);

            } catch (Exception e) {
                System.out.println(e);
            }
        }
        this.dispose();
    }//GEN-LAST:event_aceptarBtnActionPerformed

    private void editarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarBtnActionPerformed
        if (editable == false) {
            editable = true;
            pudoSerEditado = true;
            cambiarColorFondoTextField(Color.WHITE);
        } else {
            editable = false;
            cambiarColorFondoTextField(Color.lightGray);
        }

        habilitarEditarInformacion(editable);

    }//GEN-LAST:event_editarBtnActionPerformed

    private void eliminarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBtnActionPerformed
        Confirmar confirmar = new Confirmar(this, true);
        confirmar.setVisible(true);

        if (confirmar.isOpcion()) {
            try {
                managerCliente.removeCliente(cliente);
                this.dispose();
            } catch (Exception e) {
                //la razon por la que el cliente no se elimina , es por que pertenece a una venta y por consecuente a una factura.
                //por ende elimino todas las ventas y las facturas a la que esta enlazado ese cliente.
                MsjErrorAceptar mensajeErrorAceptar = new MsjErrorAceptar(this, true);
                mensajeErrorAceptar.setVisible(true);//abro una ventana para saber si es que esta seguro al eliminar al cliente
                if (mensajeErrorAceptar.isDecision()) {//si esta de acuerdo o no
                    try {
                        managerCliente.removeClienteAndConections(cliente);
                        this.dispose();
                    } catch (Exception ee) {
                        System.out.println(ee);
                    }
                }
            }
        }
    }//GEN-LAST:event_eliminarBtnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientesVerDetallesForm(cliente).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarBtn;
    private javax.swing.JTextField apellidoTxt;
    private javax.swing.JTextField direccionTxt;
    public javax.swing.JToggleButton editarBtn;
    private javax.swing.JButton eliminarBtn;
    private javax.swing.JTextField fechaNacimientoTxt;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField localidadTxt;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JTextField paisTxt;
    private javax.swing.JTextField provinciaTxt;
    private javax.swing.JTextField telefonoTxt;
    private javax.swing.JTextField whatsappTxt;
    // End of variables declaration//GEN-END:variables

    public boolean isEditable() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }

    public boolean isPudoSerEditado() {
        return pudoSerEditado;
    }

    public void setPudoSerEditado(boolean pudoSerEditado) {
        this.pudoSerEditado = pudoSerEditado;
    }

    public void darValoresTextField() {
        try {
            nombreTxt.setText(cliente.getNombre());
            apellidoTxt.setText(cliente.getApellido());
            fechaNacimientoTxt.setText(new SimpleDateFormat("dd-MM-yyyy").format(cliente.getFecha_nacimiento()));
            telefonoTxt.setText(cliente.getContacto().getTelefono());
            whatsappTxt.setText(cliente.getContacto().getWhatsapp());
            direccionTxt.setText(cliente.getDireccion().getDireccion());
            localidadTxt.setText(cliente.getDireccion().getLocalidad());
            provinciaTxt.setText(cliente.getDireccion().getProvincia());
            paisTxt.setText(cliente.getDireccion().getPais());
        } catch (Exception e) {
            System.out.println("no se pudieron setear los valores");
        }
    }

    public void habilitarEditarInformacion(boolean operacion) {
        nombreTxt.setEditable(editable);
        apellidoTxt.setEditable(editable);
        fechaNacimientoTxt.setEditable(editable);
        telefonoTxt.setEditable(editable);
        whatsappTxt.setEditable(editable);
        direccionTxt.setEditable(editable);
        localidadTxt.setEditable(editable);
        provinciaTxt.setEditable(editable);
        paisTxt.setEditable(editable);
    }

    public void cambiarColorFondoTextField(java.awt.Color color) {
        nombreTxt.setBackground(color);
        apellidoTxt.setBackground(color);
        fechaNacimientoTxt.setBackground(color);
        telefonoTxt.setBackground(color);
        whatsappTxt.setBackground(color);
        direccionTxt.setBackground(color);
        localidadTxt.setBackground(color);
        provinciaTxt.setBackground(color);
        paisTxt.setBackground(color);
    }

    /* public void eliminarUsuarioSeleccionado() {
        em = new EntitiesManager();
        em.getManager().getTransaction().begin();
        cliente = em.getManager().merge(cliente);
        em.getManager().remove(cliente);
        em.getManager().getTransaction().commit();
        em.getManager().close();
    }*/

 /*public void eliminarUsuarioSeleccionadoYSusVentas() {
        //la razon por la que el cliente no se elimina , es por que pertenece a una venta y por consecuente a una factura.
        //por ende elimino todas las ventas y las facturas a la que esta enlazado ese cliente.
        MsjErrorAceptar mensajeErrorAceptar = new MsjErrorAceptar(this, true);
        mensajeErrorAceptar.setVisible(true);//abro una ventana para saber si es que esta seguro al eliminar al cliente
        if (mensajeErrorAceptar.isDecision()) {//si esta de acuerdo o no
            try {
                em = new EntitiesManager();
                em.getManager().getTransaction().begin();
                CriteriaBuilder cb = em.getManager().getCriteriaBuilder();
                CriteriaQuery<Venta> cqVenta = cb.createQuery(Venta.class);
                CriteriaQuery<Factura> cqFactura = cb.createQuery(Factura.class);
                Root<Venta> rootVentas = cqFactura.from(Venta.class);
                Root<Factura> rootFacturas = cqFactura.from(Factura.class);

                Predicate condicionFactura = cb.equal(rootFacturas.get("cliente"), cliente);

                cqFactura.select(rootFacturas).where(condicionFactura);
                List<Factura> resultadoFacturas = em.getManager().createQuery(cqFactura).getResultList();

                Predicate condicionVenta = cb.equal(rootVentas.get("factura"), resultadoFacturas);
                List<Venta> resultadoVentas = em.getManager().createQuery(cqVenta).getResultList();

                for (int i = 0; i < resultadoFacturas.size(); i++) {
                    em.getManager().remove(resultadoVentas.get(i)); //elimino las ventas
                    //em.getManager().remove(resultadoFacturas.get(i)); //elimino las facturas
                }

//               cliente = em.getManager().merge(cliente);
//               em.getManager().remove(cliente);//elimino al cliente
                em.getManager().getTransaction().commit();
                em.getManager().close();
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }

    }*/
}
