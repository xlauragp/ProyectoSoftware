package ProyectoF;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
public class NuevaC extends javax.swing.JFrame {
    private String ide;
    public NuevaC(String id) {
        initComponents();
        this.setLocationRelativeTo(this);
        this.ide = id;
        this.Ocultar.setVisible(false);
    }

    private NuevaC() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Confirmar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        Ocultar = new javax.swing.JLabel();
        Ver = new javax.swing.JLabel();
        contrasena = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setText("Introduzca su nueva contraseña");

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

        Ocultar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        Ocultar.setText("Ocultar");
        Ocultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OcultarMouseClicked(evt);
            }
        });

        Ver.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        Ver.setText("Ver");
        Ver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VerMouseClicked(evt);
            }
        });

        contrasena.setText("********");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(Confirmar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Cancelar)
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ocultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ver))
                    .addComponent(jLabel1))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Ocultar)
                        .addComponent(Ver))
                    .addComponent(contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Confirmar)
                    .addComponent(Cancelar))
                .addGap(0, 19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private ConexionBD cc;
    private Connection cn; 
    private void ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarActionPerformed
        String pass = contrasena.getText();
        if (pass.equals("")){
            JOptionPane.showMessageDialog(null,"Escriba una contraseña");
        }
        try{
            cc = new ConexionBD();
            cn = cc.conexion();
            PreparedStatement st = cn.prepareStatement("select * from usuarios where id_usuario=?");
            st.setString(1,ide);
            ResultSet rs=st.executeQuery();
            if(rs.next()){
                PreparedStatement stmt = cn.prepareStatement("UPDATE usuarios SET contraseña=? WHERE id_usuario=?");
                stmt.setString(1, pass);
                stmt.setString(2, ide);
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null,"Contraseña cambiada");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"No se pudo cambiar la contraseña, hubo un error");
        }
        Inicio newframe = new Inicio(); //Llama a la clase principal
        newframe.setVisible(true); //Se abre
        dispose(); //Se quita este JFrame
    }//GEN-LAST:event_ConfirmarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        int a = JOptionPane.YES_NO_OPTION;
        int resultado = JOptionPane.showConfirmDialog(this, "DESEA CANCELAR EL PROCESO?", "CANCELAR",a);
        if(resultado == 0){
            Inicio newframe = new Inicio(); //Llama a la clase principal
            newframe.setVisible(true); //Se abre
            dispose(); //Se quita este JFrame
        }
    }//GEN-LAST:event_CancelarActionPerformed

    private void OcultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OcultarMouseClicked
        Ver.setVisible(true);
        Ocultar.setVisible(false);
        contrasena.setEchoChar('*');
    }//GEN-LAST:event_OcultarMouseClicked

    private void VerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VerMouseClicked
        Ver.setVisible(false);
        Ocultar.setVisible(true);
        contrasena.setEchoChar((char)0);
    }//GEN-LAST:event_VerMouseClicked

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
            java.util.logging.Logger.getLogger(NuevaC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevaC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevaC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevaC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevaC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Confirmar;
    private javax.swing.JLabel Ocultar;
    private javax.swing.JLabel Ver;
    private javax.swing.JPasswordField contrasena;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
