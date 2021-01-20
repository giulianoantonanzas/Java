package admin.administrative.forms.Producto;

import admin.administrative.forms.Confirmar;
import admin.administrative.models.Producto;
import java.awt.Color;
import admin.administrative.runEntityManager.ManagerProducto;
import javax.swing.JTextField;

public class ProductosVerDetallesForm extends javax.swing.JFrame {

    private static Producto producto;
    private ManagerProducto managerProducto;

    private boolean editable = false;
    private boolean pudoSerEditado = false;

    public ProductosVerDetallesForm(Producto producto) {
        initComponents();
        managerProducto = new ManagerProducto();
        this.producto = producto;
        darValoresTextField();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        detalleTxt = new javax.swing.JTextField();
        cantidadTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        precioPesoTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        precioDolarTxt = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        eliminarBtn = new javax.swing.JButton();
        aceptarBtn = new javax.swing.JButton();
        editarBtn = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nombre");

        nombreTxt.setEditable(false);
        nombreTxt.setBackground(java.awt.Color.lightGray);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Detalle");

        detalleTxt.setEditable(false);
        detalleTxt.setBackground(java.awt.Color.lightGray);

        cantidadTxt.setEditable(false);
        cantidadTxt.setBackground(java.awt.Color.lightGray);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Cantidad");

        precioPesoTxt.setEditable(false);
        precioPesoTxt.setBackground(java.awt.Color.lightGray);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Precio Peso");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Precio Dolar");

        precioDolarTxt.setEditable(false);
        precioDolarTxt.setBackground(java.awt.Color.lightGray);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantidadTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precioPesoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precioDolarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(detalleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(detalleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cantidadTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(precioPesoTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(precioDolarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
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
                .addGap(36, 36, 36)
                .addComponent(aceptarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(editarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(eliminarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarBtnActionPerformed
        if (pudoSerEditado) {
            try {

                producto.setNombre(nombreTxt.getText());
                producto.setDetalle(detalleTxt.getText());
                producto.setCantidad(Integer.parseInt(cantidadTxt.getText()));
                producto.setPrecio_peso(Float.parseFloat(precioPesoTxt.getText()));
                producto.setPrecio_dolar(Float.parseFloat(precioDolarTxt.getText()));

                managerProducto.margeProducto(producto);

                this.dispose();
            } catch (Exception e) {
                System.out.println(e);
            }
        }

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
                managerProducto.removeProducto(producto);
                this.dispose();
            } catch (Exception e) {
                //la razon por la que el producto no se elimina , es por que pertenece a una venta y por consecuente a una factura.
                //por ende elimino todas las ventas y las facturas a la que esta enlazado ese producto.
                MsjErrorAceptar mensajeErrorAceptar = new MsjErrorAceptar(this, true);
                mensajeErrorAceptar.setVisible(true);//abro una ventana para saber si es que esta seguro al eliminar al producto
                if (mensajeErrorAceptar.isDecision()) {//si esta de acuerdo o no
                    try {
                        managerProducto.removeProductoAndConections(producto);
                        this.dispose();

                    } catch (Exception ee) {
                        System.out.println(ee);
                    }

                }
            }
        }
    }//GEN-LAST:event_eliminarBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProductosVerDetallesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductosVerDetallesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductosVerDetallesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductosVerDetallesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductosVerDetallesForm(producto).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarBtn;
    private javax.swing.JTextField cantidadTxt;
    private javax.swing.JTextField detalleTxt;
    private javax.swing.JToggleButton editarBtn;
    private javax.swing.JButton eliminarBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JTextField precioDolarTxt;
    private javax.swing.JTextField precioPesoTxt;
    // End of variables declaration//GEN-END:variables

    public void darValoresTextField() {
        try {
            nombreTxt.setText(producto.getNombre());
            detalleTxt.setText(producto.getDetalle());
            cantidadTxt.setText(Integer.toString(producto.getCantidad()));
            precioPesoTxt.setText(Float.toString(producto.getPrecio_peso()));
            precioDolarTxt.setText(Float.toString(producto.getPrecio_dolar()));
        } catch (Exception e) {
            System.out.println("hubo un problema al cargar la informacion");
        }
    }

    public void cambiarColorFondoTextField(java.awt.Color color) {
        nombreTxt.setBackground(color);
        detalleTxt.setBackground(color);
        cantidadTxt.setBackground(color);
        precioPesoTxt.setBackground(color);
        precioDolarTxt.setBackground(color);
    }

    public void habilitarEditarInformacion(boolean editable) {
        nombreTxt.setEditable(editable);
        detalleTxt.setEditable(editable);
        cantidadTxt.setEditable(editable);
        precioPesoTxt.setEditable(editable);
        precioDolarTxt.setEditable(editable);
    }

    /*public void eliminarProductosSeleccionadosYSusRelaciones() {

        //la razon por la que el cliente no se elimina , es por que pertenece a una venta y por consecuente a una factura.
        //por ende elimino todas las ventas y las facturas a la que esta enlazado ese cliente.
        MsjErrorAceptar mensajeErrorAceptar = new MsjErrorAceptar(this, true);
        mensajeErrorAceptar.setVisible(true);//abro una ventana para saber si es que esta seguro al eliminar al cliente
        if (mensajeErrorAceptar.isDecision()) {//si esta de acuerdo o no
            try {
                em = new EntitiesManager();
                em.getManager().getTransaction().begin();

                CriteriaBuilder cb = em.getManager().getCriteriaBuilder();
                CriteriaQuery<ProductoFacturado> cqProductosFacturados = cb.createQuery(ProductoFacturado.class);
                Root<ProductoFacturado> rootProductosFacturados = cqProductosFacturados.from(ProductoFacturado.class);

                Predicate queryProductosFacturados = cb.equal(rootProductosFacturados.get("producto"), producto);
                cqProductosFacturados.select(rootProductosFacturados).where(queryProductosFacturados);

                List<ProductoFacturado> productosFacturados = em.getManager().createQuery(cqProductosFacturados).getResultList();

                for (int i = 0; i < productosFacturados.size(); i++) {
                    em.getManager().remove(productosFacturados.get(i));
                }

                producto = em.getManager().merge(producto);
                em.getManager().remove(producto);//elimino al cliente
                em.getManager().getTransaction().commit();
                em.getManager().close();
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }*/
    public boolean isPudoSerEditado() {
        return pudoSerEditado;
    }

    public JTextField getNombreTxt() {
        return nombreTxt;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }

    public void setPudoSerEditado(boolean pudoSerEditado) {
        this.pudoSerEditado = pudoSerEditado;
    }

}
