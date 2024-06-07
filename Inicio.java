package ProyectoF;

import javax.swing.JOptionPane;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class Inicio extends javax.swing.JFrame {
    int xMouse,yMouse;
    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(this); //Para centrar la ventana
        this.Ocultar.setVisible(false); //Lo que es el jpane Ocultar no aparezca y si salga Ver
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        Pass = new javax.swing.JPasswordField();
        ID = new javax.swing.JTextField();
        Ver = new javax.swing.JLabel();
        Ocultar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Entrar = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        Xfondo = new javax.swing.JPanel();
        Salir = new javax.swing.JLabel();
        aqui = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setForeground(new java.awt.Color(255, 255, 255));
        bg.setOpaque(false);
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setText("INICIAR SESION");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel4.setText("ID");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel5.setText("CONTRASEÑA");
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 180, 10));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 160, 10));

        Pass.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        Pass.setForeground(java.awt.Color.gray);
        Pass.setText("**********");
        Pass.setBorder(null);
        Pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PassMousePressed(evt);
            }
        });
        bg.add(Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 160, -1));

        ID.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        ID.setForeground(java.awt.Color.gray);
        ID.setText("Ingresa ID de trabajador");
        ID.setBorder(null);
        ID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IDMousePressed(evt);
            }
        });
        bg.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 180, -1));

        Ver.setText("Ver");
        Ver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VerMouseClicked(evt);
            }
        });
        bg.add(Ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, -1));

        Ocultar.setText("Ocultar");
        Ocultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OcultarMouseClicked(evt);
            }
        });
        bg.add(Ocultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, -1));

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));
        jPanel1.setForeground(new java.awt.Color(0, 102, 255));

        Entrar.setBackground(new java.awt.Color(51, 102, 255));
        Entrar.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        Entrar.setForeground(new java.awt.Color(255, 255, 255));
        Entrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Entrar.setText("Entrar");
        Entrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EntrarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 110, 50));

        Header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HeaderMouseDragged(evt);
            }
        });
        Header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HeaderMousePressed(evt);
            }
        });

        Xfondo.setBackground(new java.awt.Color(255, 255, 255));

        Salir.setBackground(new java.awt.Color(255, 255, 255));
        Salir.setFont(new java.awt.Font("Verdana", 0, 48)); // NOI18N
        Salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Salir.setText("X");
        Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SalirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout XfondoLayout = new javax.swing.GroupLayout(Xfondo);
        Xfondo.setLayout(XfondoLayout);
        XfondoLayout.setHorizontalGroup(
            XfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, XfondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Salir)
                .addContainerGap())
        );
        XfondoLayout.setVerticalGroup(
            XfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(XfondoLayout.createSequentialGroup()
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addGap(0, 585, Short.MAX_VALUE)
                .addComponent(Xfondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Xfondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 40));

        aqui.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        aqui.setText("Para recuperar su contraseña da click aqui");
        aqui.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aqui.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aquiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aquiMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                aquiMousePressed(evt);
            }
        });
        bg.add(aqui, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, -1, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private ConexionBD cc; //Conexiones con la base de datos llamando la clase y dandole un valor
    private Connection cn;
    private void PassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassMousePressed
        /*Similar a los al de usuario excepto que esta ocasion es para la contraseña
        sobre que se toma lo que es los asteriscos, los quita y de ahi si los demas esta vacio
        pues el pondra el texto correspondiente
        */
        if(String.valueOf(Pass.getPassword()).equals("**********")){
            Pass.setText("");
            Pass.setForeground(Color.black);
            
        }
        if(ID.getText().isEmpty()){
            ID.setText("Ingresa ID de trabajador");
            ID.setForeground(Color.gray);
        }
    }//GEN-LAST:event_PassMousePressed

    private void IDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IDMousePressed
        /*Al igual que los anteriores cuando se presione el texto de ID se quitara y en los 
        demas en caso de que esten vacio se les pondra el texto correspondiente
        */
        if(ID.getText().equals("Ingresa ID de trabajador")){
            ID.setText("");
            ID.setForeground(Color.black);
            
        }
        if(String.valueOf(Pass.getPassword()).isEmpty()){
            Pass.setText("**********");
            Pass.setForeground(Color.gray);
        }
    }//GEN-LAST:event_IDMousePressed

    private void OcultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OcultarMouseClicked
        //Ocultar la contraseña
        Ver.setVisible(true);
        Ocultar.setVisible(false);
        Pass.setEchoChar('*');
    }//GEN-LAST:event_OcultarMouseClicked

    private void VerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VerMouseClicked
       //Ver la contraseña
        Ver.setVisible(false);
        Ocultar.setVisible(true);
        Pass.setEchoChar((char)0);
    }//GEN-LAST:event_VerMouseClicked

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        //Salir para Inicio de sesion y pregunta si se desea salir
        int a = JOptionPane.YES_NO_OPTION;
        int resultado = JOptionPane.showConfirmDialog(this, "DESEA SALIR?", "SALIR",a);
        if(resultado == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_SalirMouseClicked

    private void SalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseEntered
        Xfondo.setBackground(Color.red); //Cambio de color del fondo que esta de X
        Salir.setForeground(Color.white); //Cambio de color de X
    }//GEN-LAST:event_SalirMouseEntered

    private void SalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseExited
        Xfondo.setBackground(new Color(242,242,242)); //Cambio de color del fondo que esta en X
        Salir.setForeground(Color.black); //Cambio de color de X
    }//GEN-LAST:event_SalirMouseExited

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
   
    }//GEN-LAST:event_formMousePressed

    private void EntrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntrarMousePressed
        //Ingresar para Inicio de Sesion
        cc = new ConexionBD(); //Se llama a la clase para conexion de base de datos
        cn = cc.conexion(); //Se ejecuta la conexion y se conecta a esta misma
        try{
            //Toma los valores que se pusieron en los Text field
            String id_usuario = ID.getText();
            String contrasena = Pass.getText();
            
            Statement stm = cn.createStatement(); //Crea una nueva tarea
            //Realiza un query para revisar si existe el usuario, contraseña y el id
            String sql = "select * from usuarios where contraseña='"+contrasena+"' and id_usuario='"+id_usuario+"'";
            ResultSet rs = stm.executeQuery(sql); //Ejecutamos el Query
            
            if(rs.next()){ //Si existe el usuario entonces se cumple la condicion
                String comprueba = "select * from usuarios where contraseña='"+contrasena+"' and id_usuario='"+id_usuario+"' and admin = '"+ "true" +"' ";
                ResultSet resultado = stm.executeQuery(comprueba);
                if(resultado.next()){
                    Principal newframe = new Principal(0); //Llama a la clase principal
                    newframe.setVisible(true); //Se abre
                    dispose(); //Se quita este JFrame
                }
                else{
                    Principal newframe = new Principal(2); //Llama a la clase principal
                    newframe.setVisible(true); //Se abre
                    dispose(); //Se quita este JFrame
                }
       
            }
            else{//Por lo menos un de los datos es correcto o no existe pues entra aqui
                JOptionPane.showMessageDialog(null,"Datos Incorrectos");
                ID.setText("");
                Pass.setText("");
            }
            cn.close(); //Se cierra la base de datos
        }
        catch(Exception e){//En caso de errores con la conexion de base de datos aparece un mensaje
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_EntrarMousePressed

    private void HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMousePressed
        xMouse = evt.getX();//Tomar los valores de mouse 
        yMouse = evt.getY();
    }//GEN-LAST:event_HeaderMousePressed

    private void HeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseDragged
        int x = evt.getXOnScreen(); //Lo valores de la ventana
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse,y - yMouse); //Se restan para que se pueda mover correctamente y fluida la ventana
    }//GEN-LAST:event_HeaderMouseDragged

    private void aquiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aquiMousePressed
        Recuperar dialog = new Recuperar(this,true);
        dialog.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_aquiMousePressed

    private void aquiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aquiMouseEntered
        this.aqui.setForeground(Color.blue);//Cambio de color cuando entra el mouse
    }//GEN-LAST:event_aquiMouseEntered

    private void aquiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aquiMouseExited
        this.aqui.setForeground(Color.black);//Cambio de color cuando sale el mouse
    }//GEN-LAST:event_aquiMouseExited

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Entrar;
    private javax.swing.JPanel Header;
    private javax.swing.JTextField ID;
    private javax.swing.JLabel Ocultar;
    private javax.swing.JPasswordField Pass;
    private javax.swing.JLabel Salir;
    private javax.swing.JLabel Ver;
    private javax.swing.JPanel Xfondo;
    private javax.swing.JLabel aqui;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
