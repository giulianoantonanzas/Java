package formulario.Medicos;


import accesoUI.operaracionesDiagnostico;
import formulario.JavierMorenoInfo;
import formulario.LoginForm;
import accesoUI.operarcionesUsuario;
import java.util.ArrayList;
import modeloClases.Medico;
import modeloClases.Persona;

public class MedicoForm extends javax.swing.JFrame {

    Persona persona;

    public MedicoForm() {
        initComponents();
    }

    public void setPersona(Persona medico) {
        this.persona = medico;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VolverBTN = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        VerInformesBTN = new javax.swing.JButton();
        MisDatosBTN = new javax.swing.JButton();
        AyudaBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        VolverBTN.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        VolverBTN.setText("Volver");
        VolverBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverBTNActionPerformed(evt);
            }
        });

        VerInformesBTN.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        VerInformesBTN.setText("Ver Infrormes");
        VerInformesBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerInformesBTNActionPerformed(evt);
            }
        });

        MisDatosBTN.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        MisDatosBTN.setText("Mis datos");
        MisDatosBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MisDatosBTNActionPerformed(evt);
            }
        });

        AyudaBTN.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        AyudaBTN.setText("Ayuda");
        AyudaBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AyudaBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AyudaBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MisDatosBTN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(VerInformesBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(VerInformesBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MisDatosBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AyudaBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(VolverBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(VolverBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverBTNActionPerformed
        LoginForm ventanaLogin = new LoginForm();
        this.dispose();
        ventanaLogin.setVisible(true);

    }//GEN-LAST:event_VolverBTNActionPerformed

    private void MisDatosBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MisDatosBTNActionPerformed
        MedicoDatos datosDelMedico = new MedicoDatos();
        operarcionesUsuario gestUsuario= new operarcionesUsuario();
        Medico medico=gestUsuario.obtenerMedico(persona);
        
        datosDelMedico.getNombre().setText(persona.getNombre());
        datosDelMedico.getApellido().setText(persona.getApellido());
        datosDelMedico.getDNI().setText(Integer.toString(persona.getDNI()));
        datosDelMedico.getEdad().setText(Integer.toString(persona.getEdad()));
        datosDelMedico.getLocaldiad().setText(persona.getLocalidad());
        datosDelMedico.getGenero().setText(persona.getGenero());
        datosDelMedico.getActividadEscencial().setText(Boolean.toString(persona.isActividadEscencial()));
        
        datosDelMedico.getNumeroMatricula().setText(Integer.toString(medico.getNumeroMatricula()));
        datosDelMedico.getEspecialidad().setText(medico.getEspecialidad());
        
        
        datosDelMedico.setVisible(true);
    }//GEN-LAST:event_MisDatosBTNActionPerformed

    private void VerInformesBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerInformesBTNActionPerformed
        MedicoInformes medicoInformes=new MedicoInformes();
        operaracionesDiagnostico buscarDiagnosticos =new operaracionesDiagnostico();
        ArrayList<Persona> personas=new ArrayList<>();
        
        
        
        medicoInformes.getCasosInformados().setText(buscarDiagnosticos.CantidadCasosHoy());
        personas=buscarDiagnosticos.personasDiagnosticadas();
        

        for(int i=0;i<personas.size();i++){
            medicoInformes.getTablaDiagnosticadosDelDia().getModel().setValueAt(Integer.toString(personas.get(i).getDNI()), i, 0);
            medicoInformes.getTablaDiagnosticadosDelDia().getModel().setValueAt(personas.get(i).getApellido(), i, 1);
            medicoInformes.getTablaDiagnosticadosDelDia().getModel().setValueAt(personas.get(i).getNombre(), i, 2);
            medicoInformes.getTablaDiagnosticadosDelDia().getModel().setValueAt(Integer.toString(personas.get(i).getEdad()), i, 3);
            medicoInformes.getTablaDiagnosticadosDelDia().getModel().setValueAt(personas.get(i).getLocalidad(), i, 4);
            medicoInformes.getTablaDiagnosticadosDelDia().getModel().setValueAt(personas.get(i).getGenero(), i, 5);
            medicoInformes.getTablaDiagnosticadosDelDia().getModel().setValueAt(personas.get(i).isActividadEscencial(), i, 6);
        }
        
        
        medicoInformes.setVisible(true);
        
    }//GEN-LAST:event_VerInformesBTNActionPerformed

    private void AyudaBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AyudaBTNActionPerformed
        JavierMorenoInfo mostrarMiInfo=new JavierMorenoInfo();
        mostrarMiInfo.setVisible(true);
    }//GEN-LAST:event_AyudaBTNActionPerformed

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
            java.util.logging.Logger.getLogger(MedicoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedicoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedicoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedicoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MedicoForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AyudaBTN;
    private javax.swing.JButton MisDatosBTN;
    private javax.swing.JButton VerInformesBTN;
    private javax.swing.JButton VolverBTN;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
