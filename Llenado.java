package ProyectoF;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class Llenado extends javax.swing.JFrame {
    private Principal p;
    private String workorder;
    private String noperador;
    private String IDH;
    private JTable Tabla;
    private int FilaS;
    HoraSistema time;
    
    public Llenado(String Datos[], Principal p, JTable Tabla, int fila){
        this.p = p;
        this.FilaS = fila;
        this.Tabla = Tabla;
        initComponents();
        renglon(Datos);
        this.setLocationRelativeTo(this);
        NombreO.setText(Datos[1]);
        IDO.setText(noperador);
        Depart.setText(Datos[3]);
        Herra.setText(Datos[4]);
        IDHerra.setText(IDH);
    }

    private Llenado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private ConexionBD cc;
    private Connection cn; 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        NombreO = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        IDO = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Depart = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Herra = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        IDHerra = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        EstadoHerra = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        Cantidad = new javax.swing.JTextField();
        Confirmar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Llenado de devolucion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel1.setText("Nombre del Operador");

        NombreO.setEditable(false);
        NombreO.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setText("No. del Operador");

        IDO.setEditable(false);
        IDO.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setText("Departamento");

        Depart.setEditable(false);
        Depart.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setText("Herramienta");

        Herra.setEditable(false);
        Herra.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel5.setText("ID de la Herramienta");

        IDHerra.setEditable(false);

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel6.setText("Estado de la Herramienta");

        EstadoHerra.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        EstadoHerra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el estado", "Excelente", "Bueno", "Decente", "Malo" }));

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel7.setText("Cantidad");

        Cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CantidadKeyTyped(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addComponent(Cancelar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(NombreO, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(Depart, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(IDHerra, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(67, 67, 67)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EstadoHerra, 0, 1, Short.MAX_VALUE)
                                    .addComponent(IDO)
                                    .addComponent(Herra, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel2))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Confirmar)
                        .addGap(73, 73, 73))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NombreO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDO, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Depart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Herra, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDHerra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EstadoHerra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Confirmar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cancelar))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    public void renglon(String DatosC[]){
        workorder = DatosC[0];
        noperador = DatosC[2];
        IDH = DatosC[5];
    }
    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        int a = JOptionPane.YES_NO_OPTION;
        int resultado = JOptionPane.showConfirmDialog(this, "DESEA CANCELAR EL REGISTRO?", "REGISTRO", a);
        if (resultado == 0) {
            setRootPane(null);
            p.setVisible(true); //Se abre
            dispose(); //Se quita este JFrame
        }
    }//GEN-LAST:event_CancelarActionPerformed

    private void ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarActionPerformed
        time = new HoraSistema();
        String Registro = "Devuelto";
        String cant = Cantidad.getText();
        Object State = EstadoHerra.getSelectedItem();
        if((cant.equals(""))||(State == "Seleccione el estado")){
            JOptionPane.showMessageDialog(null,"Faltan Datos");
        }
        else if(compare_canth(IDH,cant,workorder)==true){
            String[] row = new String[4];
            row[0] = (String)State;//Estado de herramienta
            row[1] = time.getFormatoTime();//Hora de devolucion
            row[2] = cant;//Cantidad
            row[3] = Registro;//Estado
            Tabla.setValueAt(row[0], FilaS, 6);
            Tabla.setValueAt(row[1], FilaS, 8);
            Tabla.setValueAt(row[2], FilaS, 10);
            Tabla.setValueAt(row[3], FilaS, 11);
            Tabla.getColumnModel().getColumn(11).setCellRenderer(new PintarFila(11));
            Tabla.updateUI();
            try{
                cc = new ConexionBD();
                cn = cc.conexion();
                PreparedStatement stmt = cn.prepareStatement("UPDATE pedidos SET estado_devuelta=?,cantidad_devuelta=?,Hora_de_salida=?,estado=? WHERE workorder=? and Numero_de_Operador=?");
                stmt.setString(1,row[0]);
                stmt.setString(2,row[2]);
                stmt.setString(3,row[1]);
                stmt.setString(4,row[3]);
                stmt.setString(5,workorder);
                stmt.setString(6,noperador);
                stmt.executeUpdate();
                
                cn.close();
            }
            catch(Exception e){
            JOptionPane.showMessageDialog(null,"Ya existe el usuario");
            }
            p.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_ConfirmarActionPerformed

    private void CantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CantidadKeyTyped
        char c = evt.getKeyChar(); //se llama el evento
        if((c != '\b')&&(c != '\n')&&(c != '\t')){
            if (!Character.isDigit(c)) { //se compara que si se ingresa una letra
                evt.consume(); //evitar que se capture el digito
                JOptionPane.showMessageDialog(this, "Solo se permiten numeros", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_CantidadKeyTyped
    private boolean compare_canth(String id, String cantidad,String work) {
        boolean resultado = true;
        try {
            cc = new ConexionBD();
            cn = cc.conexion();
            PreparedStatement stm = cn.prepareStatement("select cantidad_entregada from pedidos where workorder = ?");
            stm.setString(1, work);
            ResultSet rsm = stm.executeQuery();
            if (rsm.next()) {
                int cant_entregada = Integer.parseInt(rsm.getString(1));
                int cant_devuelta = Integer.parseInt(cantidad);
                if (cant_devuelta > cant_entregada) {
                    JOptionPane.showMessageDialog(null, "NO PUEDES DEVOLVER MAS DE LAS HERRAMIENTAS PEDIDAS");
                    resultado = false;
                } else {
                    PreparedStatement stmt = cn.prepareStatement("select cantidad from herramientas WHERE nombre=?");
                    stmt.setString(1,id);
                    ResultSet rsmt = stmt.executeQuery();
                    if(rsmt.next()){
                        int cant_real = Integer.parseInt(rsmt.getString(1));
                        PreparedStatement st = cn.prepareStatement("UPDATE herramientas SET cantidad=? WHERE nombre=?");
                        st.setString(2, id);
                        st.setString(1, Integer.toString(cant_devuelta + cant_real));
                        st.executeUpdate();
                    }
                }
            }
            cn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }
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
            java.util.logging.Logger.getLogger(Llenado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Llenado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Llenado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Llenado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Llenado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    public javax.swing.JTextField Cantidad;
    private javax.swing.JButton Confirmar;
    public javax.swing.JTextField Depart;
    public javax.swing.JComboBox<String> EstadoHerra;
    private javax.swing.JTextField Herra;
    public javax.swing.JTextField IDHerra;
    public javax.swing.JTextField IDO;
    public javax.swing.JTextField NombreO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
