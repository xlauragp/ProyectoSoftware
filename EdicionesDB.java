package ProyectoF;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import javax.swing.JOptionPane;

public class EdicionesDB extends javax.swing.JFrame {
    int xmouse, ymouse;
    public EdicionesDB() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.Ocultar.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        UsuarioE = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        AgregarU = new javax.swing.JButton();
        BorrarU = new javax.swing.JButton();
        EditarU = new javax.swing.JButton();
        Ocultar = new javax.swing.JLabel();
        Ver = new javax.swing.JLabel();
        ContrasenaE = new javax.swing.JPasswordField();
        Salir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Correo = new javax.swing.JTextField();
        IDE = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        checkbox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel1.setText("Ediciones para Administradores");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("Usuario");

        UsuarioE.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        UsuarioE.setForeground(java.awt.Color.gray);
        UsuarioE.setText("Ingresa Usuario");
        UsuarioE.setBorder(null);
        UsuarioE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                UsuarioEMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("ID");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setText("Contraseña");

        AgregarU.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        AgregarU.setText("Agregar Usuario");
        AgregarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarUActionPerformed(evt);
            }
        });

        BorrarU.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        BorrarU.setText("Borrar Usuario");
        BorrarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarUActionPerformed(evt);
            }
        });

        EditarU.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        EditarU.setText("Editar Usuario");
        EditarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarUActionPerformed(evt);
            }
        });

        Ocultar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        Ocultar.setText("Ocultar");
        Ocultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OcultarMouseClicked(evt);
            }
        });

        Ver.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        Ver.setText("Ver");
        Ver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VerMouseClicked(evt);
            }
        });

        ContrasenaE.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        ContrasenaE.setForeground(java.awt.Color.gray);
        ContrasenaE.setText("********");
        ContrasenaE.setBorder(null);
        ContrasenaE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ContrasenaEMousePressed(evt);
            }
        });

        Salir.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        Salir.setText("Regresar");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel6.setText("Correo");

        Correo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        Correo.setForeground(java.awt.Color.gray);
        Correo.setText("Introduce Correo");
        Correo.setBorder(null);
        Correo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CorreoMousePressed(evt);
            }
        });

        IDE.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        IDE.setForeground(java.awt.Color.gray);
        IDE.setText("Ingresa ID");
        IDE.setBorder(null);
        IDE.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                IDEFocusLost(evt);
            }
        });
        IDE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IDEMousePressed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        checkbox.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        checkbox.setText("Admin");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(113, 113, 113))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(UsuarioE, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDE, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ContrasenaE, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Ocultar))
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkbox)
                            .addComponent(Ver))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AgregarU, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Salir, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(EditarU, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BorrarU, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UsuarioE, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IDE, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AgregarU, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(BorrarU, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ContrasenaE, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ocultar)
                    .addComponent(Ver))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addComponent(EditarU, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Salir)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(checkbox)
                        .addGap(20, 20, 20)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private ConexionBD cc;
    private Connection cn; 
    private void AgregarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarUActionPerformed

        String usuario = UsuarioE.getText();
        String id_usuario = IDE.getText();
        String contrasena = ContrasenaE.getText();
        String correo = Correo.getText();
        String admin;
        if(checkbox.isSelected()){
            admin = "true";
        }
        else{
            admin = "false";
        }
        
        try{
            cc = new ConexionBD();
            cn = cc.conexion();
            String sql = "select * from usuarios where id_usuario='"+id_usuario+"'";
            Statement st = cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            
            if (rs.next()){
                JOptionPane.showMessageDialog(null,"Ya existe el usuario");
            }
            else{
                PreparedStatement stmt = cn.prepareStatement("INSERT INTO usuarios (admin,id_usuario, nombre, contraseña, correo) values(?,?,?,?,?,?)");
                stmt.setString(1, admin);
                stmt.setString(2, id_usuario);
                stmt.setString(3, usuario);
                stmt.setString(4, contrasena);
                stmt.setString(5, correo);
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Usuario Creado");
            }
            cn.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Ya existe el usuario");
        }
    }//GEN-LAST:event_AgregarUActionPerformed

    private void OcultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OcultarMouseClicked
        Ver.setVisible(true);
        Ocultar.setVisible(false);
        ContrasenaE.setEchoChar('*');
        
    }//GEN-LAST:event_OcultarMouseClicked

    private void VerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VerMouseClicked
        Ver.setVisible(false);
        Ocultar.setVisible(true);
        ContrasenaE.setEchoChar((char)0);
    }//GEN-LAST:event_VerMouseClicked

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        Principal newframe = new Principal(0);
        newframe.setVisible(true);
        dispose();                                  
    }//GEN-LAST:event_SalirActionPerformed

    private void BorrarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarUActionPerformed

        String usuario = UsuarioE.getText();
        String id_usuario = IDE.getText();
        try{
            cc = new ConexionBD();
            cn = cc.conexion();
            String sql = "select * from usuarios where id_usuario='"+id_usuario+"'";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                PreparedStatement stmt = cn.prepareStatement("DELETE FROM usuarios where id_usuario = ? and nombre = ?");
                stmt.setString(1,id_usuario);
                stmt.setString(2,usuario);
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null,"Usuario Borrado");
            }
            else{
                JOptionPane.showMessageDialog(null,"El usuario no existe");
            }
            cn.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"El usuario no existe");
        }
    }//GEN-LAST:event_BorrarUActionPerformed

    private void EditarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarUActionPerformed
   
        String usuario = UsuarioE.getText();
        String id_usuario = IDE.getText();
        String contrasena = ContrasenaE.getText();
        String correo = Correo.getText();
        String admin;
        
        try{
            cc = new ConexionBD();
            cn = cc.conexion();
            PreparedStatement st = cn.prepareStatement("select * from usuarios where id_usuario=?");
            st.setString(1,id_usuario);
            ResultSet rs=st.executeQuery();
            
            if(rs.next()){
                String user = rs.getString(3);
                String pass = rs.getString(4);
                String email = rs.getString(5);
                if (checkbox.isSelected()) {
                    admin = "true";
                } else {
                    admin = "false";
                }
                PreparedStatement stmt = cn.prepareStatement("UPDATE usuarios SET admin=?,nombre=?,contraseña=?,correo=? WHERE id_usuario=?");
                if(usuario.equals("Ingresa Usuario")){
                    usuario = user;
                }
                if(contrasena.equals("********")){
                    contrasena = pass;
                }
                if(correo.equals("Introduce Correo")){
                    correo = email;
                }
                stmt.setString(1, admin);
                stmt.setString(2,usuario);
                stmt.setString(3,contrasena);
                stmt.setString(4, correo);
                stmt.setString(5, id_usuario);
                stmt.executeUpdate();
                
                JOptionPane.showMessageDialog(null,"Usuario Editado");
            }
            else{
                JOptionPane.showMessageDialog(null,"No existe el usuario");
            }
            cn.close();        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"No existe el usuario");
        }
    }//GEN-LAST:event_EditarUActionPerformed

    private void UsuarioEMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsuarioEMousePressed
        if(UsuarioE.getText().equals("Ingresa Usuario")){
            UsuarioE.setText("");
            UsuarioE.setForeground(Color.black);
        }
        if(IDE.getText().isEmpty()){
            IDE.setText("Ingresa ID");
            IDE.setForeground(Color.gray);
        }
        if(String.valueOf(ContrasenaE.getText()).isEmpty()){
            ContrasenaE.setText("********");
            ContrasenaE.setForeground(Color.gray);
        }
        if(Correo.getText().isEmpty()){
            Correo.setText("Introduce Correo");
            Correo.setForeground(Color.gray);
        }
    }//GEN-LAST:event_UsuarioEMousePressed

    private void IDEMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IDEMousePressed
        if (IDE.getText().equals("Ingresa ID")) {
            IDE.setText("");
            IDE.setForeground(Color.black);
        }
        if (UsuarioE.getText().isEmpty()) {
            UsuarioE.setText("Ingresa Usuario");
            UsuarioE.setForeground(Color.gray);
        }
        if (String.valueOf(ContrasenaE.getText()).isEmpty()) {
            ContrasenaE.setText("********");
            ContrasenaE.setForeground(Color.gray);
        }
        if (Correo.getText().isEmpty()) {
            Correo.setText("Introduce Correo");
            Correo.setForeground(Color.gray);
        }
    }//GEN-LAST:event_IDEMousePressed

    private void ContrasenaEMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContrasenaEMousePressed
        if (String.valueOf(ContrasenaE.getPassword()).equals("********")) {
            ContrasenaE.setText("");
            ContrasenaE.setForeground(Color.black);
        }
        if (UsuarioE.getText().isEmpty()) {
            UsuarioE.setText("Ingresa Usuario");
            UsuarioE.setForeground(Color.gray);
        }
        if (IDE.getText().isEmpty()) {
            IDE.setText("Ingresa ID");
            IDE.setForeground(Color.gray);
        }
        if (Correo.getText().isEmpty()) {
            Correo.setText("Introduce Correo");
            Correo.setForeground(Color.gray);
        }
    }//GEN-LAST:event_ContrasenaEMousePressed

    private void CorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CorreoMousePressed
        if (Correo.getText().equals("Introduce Correo")) {
            Correo.setText("");
            Correo.setForeground(Color.black);
        }
        if (UsuarioE.getText().isEmpty()) {
            UsuarioE.setText("Ingresa Usuario");
            UsuarioE.setForeground(Color.gray);
        }
        if (String.valueOf(ContrasenaE.getText()).isEmpty()) {
            ContrasenaE.setText("********");
            ContrasenaE.setForeground(Color.gray);
        }
        if (IDE.getText().isEmpty()) {
            IDE.setText("Ingresa ID");
            IDE.setForeground(Color.gray);
        }
    }//GEN-LAST:event_CorreoMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xmouse, y - ymouse);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xmouse = evt.getX();
        ymouse = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void IDEFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IDEFocusLost
        String id = IDE.getText();
        checkbox.setSelected(false);
        try {
            cc = new ConexionBD();
            cn = cc.conexion();
            String sql = "select admin from usuarios where id_usuario='" + id + "'";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                String administrador = rs.getString(1);
                if(administrador.equals("true")){
                    checkbox.setSelected(true);
                }
            } 
            cn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_IDEFocusLost

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
            java.util.logging.Logger.getLogger(EdicionesDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EdicionesDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EdicionesDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EdicionesDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EdicionesDB().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarU;
    private javax.swing.JButton BorrarU;
    private javax.swing.JPasswordField ContrasenaE;
    private javax.swing.JTextField Correo;
    private javax.swing.JButton EditarU;
    private javax.swing.JTextField IDE;
    private javax.swing.JLabel Ocultar;
    private javax.swing.JButton Salir;
    private javax.swing.JTextField UsuarioE;
    private javax.swing.JLabel Ver;
    private javax.swing.JCheckBox checkbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    // End of variables declaration//GEN-END:variables
}
