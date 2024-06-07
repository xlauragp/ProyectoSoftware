package ProyectoF;
import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Recuperar extends javax.swing.JDialog {
    private ConexionBD cc;
    private Connection cn;
    EnviarRecuperacion enviarequest = null;
    public Recuperar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(this);//Centrar la ventana
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        correoA = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Recuperar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        id = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RECUPERACION DE CONTRASEÑA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 0, 14))); // NOI18N

        correoA.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        correoA.setForeground(java.awt.Color.gray);
        correoA.setText("Introduce un correo");
        correoA.setBorder(null);
        correoA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                correoAMousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("introduzca su id y un correo electronico");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("Para reestablecer su contraseña ");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setText("de recuperacion.");

        Recuperar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        Recuperar.setText("Recuperar");
        Recuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecuperarActionPerformed(evt);
            }
        });

        Cancelar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        id.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        id.setForeground(java.awt.Color.gray);
        id.setText("Introduce tu id");
        id.setBorder(null);
        id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                idMousePressed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setText("registrado, donde se le enviara un codigo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE))
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(Recuperar)
                            .addGap(133, 133, 133)
                            .addComponent(Cancelar)
                            .addGap(31, 31, 31))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)
                                .addComponent(correoA, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, Short.MAX_VALUE)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(correoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Recuperar)
                    .addComponent(Cancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RecuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecuperarActionPerformed
        try{
            cc = new ConexionBD();
            cn = cc.conexion();
            String id_trabajador = id.getText();
            String correo = correoA.getText();
            if (id_trabajador.equals("") ||(correo.equals(""))){
                JOptionPane.showMessageDialog(this,"DEBES DE INGRESAR UN CORREO REGISTRADO Y UN CODIGO VALIDO", "RECUPERACION", JOptionPane.WARNING_MESSAGE);
            }
            else{
                Statement stm = cn.createStatement();
                String sql = "select * from usuarios where id_usuario='"+id_trabajador+"'and correo='"+correo+"'";
                ResultSet rs = stm.executeQuery(sql);

                if(rs.next()){
                    verificarCodigo(id_trabajador,correo);
                }
            }
            cn.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_RecuperarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_CancelarActionPerformed

    private void correoAMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_correoAMousePressed
        if(correoA.getText().equals("Introduce un correo")){
            correoA.setText("");
            correoA.setForeground(Color.black);
            
        }
        if(id.getText().isEmpty()){
            id.setText("Introduce tu id");
            id.setForeground(Color.gray);
        }
    }//GEN-LAST:event_correoAMousePressed

    private void idMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idMousePressed
        if(id.getText().equals("Introduce tu id")){
            id.setText("");
            id.setForeground(Color.black);
            
        }
        if(correoA.getText().isEmpty()){
            correoA.setText("Introduce un correo");
            correoA.setForeground(Color.gray);
        }
    }//GEN-LAST:event_idMousePressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Recuperar dialog = new Recuperar(new javax.swing.JFrame(), true);
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
    public void verificarCodigo(String id_work,String correo){
        try{
            String sql = "select * from usuarios where id_usuario='"+id_work+"'and correo='"+correo+"'";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                String user = rs.getString(3);
                String pass = rs.getString(5);
                enviarequest = new EnviarRecuperacion();
                //Aqui seria crea una variable donde en el login se resiva un parametro de quien entro en el login
                enviarequest.setCorreo(correo); //Correo de quien lo enviar
                String correoE = enviarequest.getCorreo();
                //Igual aqui la contraseña de la base de datos se tomaria
                enviarequest.setPass(pass); //Contraseña que genera
                String contra = enviarequest.getContra();
                //La idea aqui seria hacer otra ventana para que seleccione a quien en especifico se lo quien enviar
                enviarequest.setid(user); //Correo a quien se lo enviar
                String ide = enviarequest.getid();
                enviarequest.Recuperacion(correoE, ide, contra);//envio de reporte
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(this, "EL CODIGO O COREEO INGRESADO NO ES VALIDO, \nINGRESE UN CODIGO DE RECUPERACION O CORREO\n"
                + "VALIDO O CONTACTE AL ADMINISTRADOS DEL SISTEMA.", "!ERROR AL RECUPERAR!", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Recuperar;
    private javax.swing.JTextField correoA;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
