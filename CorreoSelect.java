package ProyectoF;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.swing.JOptionPane;

public class CorreoSelect extends javax.swing.JDialog {
    Enviar enviar = null;
    public CorreoSelect(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(this);//Centrar la ventana
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Confirmar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        CorreoC = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setText("Selecciona un correo al cual se le enviara los reportes");

        Confirmar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        Confirmar.setText("Confirmar");
        Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarActionPerformed(evt);
            }
        });

        Cancelar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        CorreoC.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        CorreoC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona un correo", "crissairprueba@gmail.com", "crissairprueba2@gmail.com", "crissairprueba3@gmail.com" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(Confirmar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Cancelar)
                .addGap(46, 46, 46))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CorreoC, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CorreoC, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Confirmar)
                    .addComponent(Cancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarActionPerformed
        Object correoA = CorreoC.getSelectedItem();
        if ((correoA == "Selecciona un correo")) {
            JOptionPane.showMessageDialog(null, "Seleccionar un correo");
        }
        else{
            try{
                enviar = new Enviar();
                //Aqui seria crea una variable donde en el login se resiva un parametro de quien entro en el login
                enviar.setCorreo("crissairsistema@gmail.com"); //Correo de quien lo enviar 
                String correo = enviar.getCorreo();
                //Igual aqui la contraseña de la base de datos se tomaria
                enviar.setContra("erqo dscf jakn oumo"); //Contraseña que genera
                String contra = enviar.getContra();
                //La idea aqui seria hacer otra ventana para que seleccione a quien en especifico se lo quien enviar
                enviar.setCorreoDestino((String) correoA); //Correo a quien se lo enviar
                String correoDestino = enviar.getCorreoDestino();
                enviar.EnviarReporte(correo, contra, correoDestino, "Reporte","Stock");//envio de reporte
            }
            catch(MessagingException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.dispose();
    }//GEN-LAST:event_ConfirmarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_CancelarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CorreoSelect dialog = new CorreoSelect(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Confirmar;
    private javax.swing.JComboBox<String> CorreoC;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
