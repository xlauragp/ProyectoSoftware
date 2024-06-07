package ProyectoF;

import java.io.IOException;
import javax.swing.table.DefaultTableModel;
//Para la sesion y el envio del correo
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

import javax.swing.table.TableRowSorter;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.RowFilter;

public class Principal extends javax.swing.JFrame {
    int xMouse,yMouse;
    Exportar exportar = null;
    Enviar enviar = null;
    FechaSistema fecha = null;//instancia de fecha
    HoraSistema time;
    
    private boolean operadorV;
    private boolean herraV;
    private String IDEH;
    
    
    private TableRowSorter trsfiltro;
    String filtro;
    
    public Principal(int persona/*, String correo*/) {
        initComponents();
        fecha = new FechaSistema(); //Llamar a la clase que pone la fecha del sistema
        pedidos();
        poputTable();
        this.setLocationRelativeTo(this);
        Tabla.setRowHeight(25);
        if(persona == 0){
            this.Usuarios.setVisible(true);
            this.Solicitar.setVisible(true);
        }
        else{
            this.Usuarios.setVisible(false);
            this.Solicitar.setVisible(true);
        }
        deshabilitar();//Deshabilitamos el inicio que no se pueda hacer nada hasta el boton de nuevo
        BtnAgregar.setEnabled(false);
        BtnBorrar.setEnabled(false);
        BtnEnviar.setEnabled(false);
        BtnGenerar.setEnabled(true);
        
    }

    private Principal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void deshabilitar(){ //deshabilitar lo campos a llenar
        txtNombreO.setEnabled(false);
        IDOperador.setEnabled(false);
        txtDepart.setEnabled(false);
        txtHerra.setEnabled(false);
        IDHerra.setEnabled(false);
        State.setEnabled(false);
        Cantidad.setEnabled(false);
    }
    public void habilitar(){ //Habilitar o que se pueda escribir en los campos a llenar
        txtNombreO.setEnabled(true);
        IDOperador.setEnabled(true);
        txtDepart.setEnabled(true);
        txtHerra.setEnabled(true);
        IDHerra.setEnabled(true);
        State.setEnabled(true);
        Cantidad.setEnabled(true);
    }
    
    public void limpiar(){ //Para que este en un estado default
        txtNombreO.setText("");
        IDOperador.setText("");
        txtDepart.setText("");
        txtHerra.setText("");
        IDHerra.setText("");
        State.setSelectedItem("Seleccione el estado");
        Cantidad.setText("");
    }
    
    public void poputTable(){
        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem menuItem1 = new JMenuItem("Llenar regreso");
        menuItem1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                int FilaS = Tabla.getSelectedRow();
                if(FilaS >= 0){
                    String Datos[];
                    Datos = new String[12];
                    Datos[0] = Tabla.getValueAt(FilaS, 0).toString(); //WorkOrder
                    Datos[1] = Tabla.getValueAt(FilaS, 1).toString(); //Nombre
                    Datos[2] = Tabla.getValueAt(FilaS, 2).toString(); //No. de operador
                    Datos[3] = Tabla.getValueAt(FilaS, 3).toString(); //Departamento
                    Datos[4] = Tabla.getValueAt(FilaS, 4).toString(); //Herramienta
                    Datos[5] = Tabla.getValueAt(FilaS, 5).toString(); //ID Herramienta
                    Datos[6] = Tabla.getValueAt(FilaS, 6).toString(); //Estado de la herramienta
                    Datos[7] = Tabla.getValueAt(FilaS, 7).toString(); //Hora de entrega
                    Datos[8] = Tabla.getValueAt(FilaS, 8).toString(); //Hora de retorno
                    Datos[9] = Tabla.getValueAt(FilaS, 9).toString(); //Fecha
                    Datos[10] = Tabla.getValueAt(FilaS, 10).toString(); //cantidad
                    Datos[11] = Tabla.getValueAt(FilaS, 11).toString(); //Estado
                    if(Datos[11].equals("Pendiente")){
                        Llenado newframe = new Llenado(Datos, Principal.this, Tabla, FilaS);
                        newframe.setVisible(true); //Se abre
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"YA SE LLENO ESTE REGISTRO", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                    }
                }
            }
        });
        popupMenu.add(menuItem1);
        Tabla.setComponentPopupMenu(popupMenu);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        IDOperador = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtHerra = new javax.swing.JTextField();
        txtNombreO = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        IDHerra = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        State = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        Cantidad = new javax.swing.JTextField();
        txtDepart = new javax.swing.JTextField();
        BtnEnviar = new javax.swing.JButton();
        BtnGenerar = new javax.swing.JButton();
        BtnNuevo = new javax.swing.JButton();
        BtnAgregar = new javax.swing.JButton();
        BtnBorrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        Salir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Buscar = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        Solicitar = new javax.swing.JMenu();
        Usuarios = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Captura de Datos del operador", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel1.setText("Nombre del Operador");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setText("No. del Operador");

        IDOperador.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        IDOperador.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                IDOperadorFocusLost(evt);
            }
        });
        IDOperador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IDOperadorKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setText("Departamento");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel5.setText("Herramienta");

        txtHerra.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        txtNombreO.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel6.setText("ID de Herramienta");

        IDHerra.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        IDHerra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                IDHerraFocusLost(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel7.setText("Estado de Herramienta");

        State.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        State.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el estado", "Excelente", "Bueno", "Decente", "Malo" }));

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel8.setText("Cantidad:");

        Cantidad.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        Cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CantidadKeyTyped(evt);
            }
        });

        txtDepart.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(txtNombreO, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHerra, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(IDHerra, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IDOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(87, 87, 87)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDepart, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(State, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDepart, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreO, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHerra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(IDHerra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(State, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        BtnEnviar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        BtnEnviar.setText("Enviar Reporte");
        BtnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEnviarActionPerformed(evt);
            }
        });

        BtnGenerar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        BtnGenerar.setText("Generar Reporte");
        BtnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGenerarActionPerformed(evt);
            }
        });

        BtnNuevo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        BtnNuevo.setText("Nuevo");
        BtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevoActionPerformed(evt);
            }
        });

        BtnAgregar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        BtnAgregar.setText("Agregar");
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });

        BtnBorrar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        BtnBorrar.setText("Cancelar");
        BtnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrarActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Historial", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14))); // NOI18N

        Tabla = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        Tabla.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Work Order", "Nombre", "No. del operador", "Departamento", "Herramienta", "ID Herramienta", "Estado de Herramienta", "Hora de entrega", "Hora de devolucion", "Fecha", "Cantidad", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Tabla.setFocusable(false);
        Tabla.setSelectionBackground(new java.awt.Color(173, 216, 230));
        Tabla.setSurrendersFocusOnKeystroke(true);
        Tabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(Tabla);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addContainerGap())
        );

        Salir.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setText("Buscar:");

        Buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BuscarKeyTyped(evt);
            }
        });

        Solicitar.setText("Solicitar");
        jMenuBar1.add(Solicitar);

        Usuarios.setText("Usuarios");
        Usuarios.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                UsuariosMenuSelected(evt);
            }
        });
        jMenuBar1.add(Usuarios);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(BtnEnviar)
                                .addGap(72, 72, 72)
                                .addComponent(BtnGenerar)
                                .addGap(71, 71, 71)
                                .addComponent(BtnNuevo)
                                .addGap(110, 110, 110)
                                .addComponent(BtnAgregar)
                                .addGap(87, 87, 87)
                                .addComponent(BtnBorrar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnGenerar)
                        .addComponent(BtnEnviar)
                        .addComponent(BtnNuevo))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnAgregar)
                        .addComponent(BtnBorrar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Salir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private ConexionBD cc;
    private Connection cn; 
    private void UsuariosMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_UsuariosMenuSelected
        EdicionesDB newframe = new EdicionesDB();
        newframe.setVisible(true);
        dispose();
    }//GEN-LAST:event_UsuariosMenuSelected

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse,y - yMouse);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void BtnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarActionPerformed
        deshabilitar();
        limpiar();
        BtnAgregar.setEnabled(false);
        BtnBorrar.setEnabled(false);
        BtnNuevo.setEnabled(true);
        txtNombreO.setEditable(true);
        IDOperador.setEditable(true);
    }//GEN-LAST:event_BtnBorrarActionPerformed

    private void BtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevoActionPerformed
        habilitar();
        BtnNuevo.setEnabled(false);
        BtnBorrar.setEnabled(true);
        BtnAgregar.setEnabled(true);
        editable_O(true);
        editable_H(true);
    }//GEN-LAST:event_BtnNuevoActionPerformed

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
        fecha = new FechaSistema(); //Llamar a la clase que pone la fecha del sistema
        time = new HoraSistema();
        //Agregar los valores a la tabla
        String HoraEntrega = "-";
        String Nombre = txtNombreO.getText();
        String IDO = IDOperador.getText();
        String Depart = txtDepart.getText();
        
        String Herra = txtHerra.getText();
        String IDH = IDHerra.getText();
        Object Estado = State.getSelectedItem();
        String Cant = Cantidad.getText();
        
        String Registro = "Pendiente";
        
        if((Estado == "Seleccione el estado")||("".equals(Cant)||(operadorV==false)||(herraV==false))){
            JOptionPane.showMessageDialog(null,"Faltan Datos");
        }
        else if((Integer.parseInt(Cant) == 0)){
            JOptionPane.showMessageDialog(null, "PON UNA CANTIDAD VALIDA");
        }
        else if((compare_canth(IDH,Cant) == true)){
            DefaultTableModel modelot = (DefaultTableModel) Tabla.getModel();
            String[] colum = new String[12];
            
            colum[1] = Nombre;
            colum[2] = IDO;           
            colum[3] = Depart;
            colum[4] = Herra;
            colum[5] = IDH;
            colum[6] = Estado.toString();
            colum[7] = time.getFormatoTime();
            colum[8] = HoraEntrega;
            colum[9] = fecha.getFormatoFecha();
            colum[10] = Cant;
            colum[11] = Registro;
            colum[0] = BD(colum);
            modelot.addRow(colum); //Añadir la informacion a la tabla del historial
            Tabla.getColumnModel().getColumn(11).setCellRenderer(new PintarFila(11));
            int a = JOptionPane.YES_NO_OPTION;
            int resultado = JOptionPane.showConfirmDialog(this, "DESEA AGREGAR OTRA HERRAMIENTA?", "HERRAMIENTA", a);
            if (resultado == 0) {
                limpiar();
                guardar(Nombre, IDO, Depart);
                editable_H(true);
                BtnAgregar.setEnabled(true);
                BtnBorrar.setEnabled(true);
                BtnNuevo.setEnabled(false);
            }
            else{
                BtnAgregar.setEnabled(false);
                BtnBorrar.setEnabled(false);
                BtnNuevo.setEnabled(true);
                IDOperador.setEditable(true);
                editable_O(true);
                editable_H(true);
                limpiar();
                deshabilitar();
            }
        }
    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void BtnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGenerarActionPerformed
        String fecha_actual = fecha.getFormatoFecha();
        if(pedidos_pendientes(fecha_actual)){
            BtnEnviar.setEnabled(true);

            try {
                exportar = new Exportar();
                exportar.exportarExcel(Tabla,"Reporte");
                BtnGenerar.setEnabled(false);
                
            } catch (IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }  
            TablaHerramientas();
        }
    }//GEN-LAST:event_BtnGenerarActionPerformed

    private void BtnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEnviarActionPerformed
        CorreoSelect dialog = new CorreoSelect(this, true);
        dialog.setVisible(true);
        BtnEnviar.setEnabled(false);
    }//GEN-LAST:event_BtnEnviarActionPerformed

    private void BuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscarKeyTyped
        Buscar.addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(final KeyEvent e) {
                String cadena = Buscar.getText();
                repaint();
                filtro();
            }
        });
        trsfiltro = new TableRowSorter(Tabla.getModel());
        Tabla.setRowSorter(trsfiltro);
        
    }//GEN-LAST:event_BuscarKeyTyped

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        int a = JOptionPane.YES_NO_OPTION;
        int resultado = JOptionPane.showConfirmDialog(this, "DESEA CERRAR SESION?", "CERRAR SESION", a);
        if (resultado == 0) {
            Inicio newframe = new Inicio(); //Llama a la clase principal
            newframe.setVisible(true); //Se abre
            dispose(); //Se quita este JFrame
        }
    }//GEN-LAST:event_SalirActionPerformed

    private void IDOperadorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IDOperadorFocusLost
        String Operadornum = IDOperador.getText();
        try {
            cc = new ConexionBD();
            cn = cc.conexion();
            String sql = "select * from Operadores where Numero_de_Operador='" + Operadornum + "'";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                operadorV = true;
                String operador = rs.getString(1);
                String departamento = rs.getString(3);
                txtNombreO.setText(operador);
                txtDepart.setText(departamento);
                editable_O(false);
            }
            else{
                operadorV=false;
                JOptionPane.showMessageDialog(null, "Operador no encontrado");
                txtNombreO.setText("");
                txtDepart.setText("");
            }
            cn.close();
        } catch (Exception e) {
            operadorV=false;
            JOptionPane.showMessageDialog(null, "Operador no encontrado");
            txtNombreO.setText("");
            txtDepart.setText("");
            
        }
    }//GEN-LAST:event_IDOperadorFocusLost

    private void IDHerraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IDHerraFocusLost
        String Herra = IDHerra.getText();
        try {
            cc = new ConexionBD();
            cn = cc.conexion();
            String sql = "select * from herramientas where nombre='" + Herra + "'";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                IDEH=rs.getString(2);
                herraV=true;
                String operador = rs.getString(4);
                txtHerra.setText(operador);
                editable_H(false);
            }
            else{
                herraV=false;
                JOptionPane.showMessageDialog(null, "Herramienta no encontrada"); 
                txtHerra.setText("");
            }
            cn.close();
        } catch (Exception e) {
            herraV=false;
            JOptionPane.showMessageDialog(null, "Herramienta no encontrada"); 
            txtHerra.setText("");
        }
    }//GEN-LAST:event_IDHerraFocusLost

    private void CantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CantidadKeyTyped
        char c = evt.getKeyChar(); //se llama el evento
        if((c != '\b')&&(c != '\n')&&(c != '\t')){
            if (!Character.isDigit(c)) { //se compara que si se ingresa una letra
                evt.consume(); //evitar que se capture el digito
                JOptionPane.showMessageDialog(this, "Solo se permiten numeros", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_CantidadKeyTyped

    private void IDOperadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDOperadorKeyTyped
        char c = evt.getKeyChar(); //se llama el evento
        if ((c != '\b') && (c != '\n') && (c != '\t')) {
            if (!Character.isDigit(c)) { //se compara que si se ingresa una letra
                evt.consume(); //evitar que se capture el digito
                JOptionPane.showMessageDialog(this, "Solo se permiten numeros", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_IDOperadorKeyTyped
    public void filtro(){
        filtro = Buscar.getText();
        int[] colum = new int[7];
        colum[0] = 0;
        colum[1] = 1;
        colum[2] = 2;
        colum[3] = 3;
        colum[4] = 4;
        colum[5] = 5;
        colum[6] = 9;
        
        trsfiltro.setRowFilter(RowFilter.regexFilter(Buscar.getText(),colum));
    }
    public void guardar(String Name, String Numero, String Departamento){
        txtNombreO.setText(Name);
        IDOperador.setText(Numero);
        txtDepart.setText(Departamento);
        IDOperador.setEditable(false);
        editable_O(false);
    }
    private void editable_O(boolean state){
        txtNombreO.setEditable(state);
        txtDepart.setEditable(state);
    }
    private void editable_H(boolean state){
        txtHerra.setEditable(state);
    }
    private String BD(String Datos[]){
        String resultado = "0";
        try{
            cc = new ConexionBD();
            cn = cc.conexion();
            PreparedStatement stmt = cn.prepareStatement("INSERT INTO pedidos (Numero_de_Operador,ID, estado_entrega, estado_devuelta, cantidad_entregada,cantidad_devuelta,Hora_de_entrega,Hora_de_salida,fecha,estado) values(?,?,?,?,?,?,?,?,?,?)");
            
            stmt.setString(1, (String) Datos[2]);
            stmt.setString(2,IDEH);
            stmt.setString(3,Datos[6]);
            stmt.setString(4,"-");
            stmt.setString(5,Datos[10]);
            stmt.setString(6,"0");
            stmt.setString(7,Datos[7]);
            stmt.setString(8,"-");
            stmt.setString(9,Datos[9]);
            stmt.setString(10,Datos[11]);

            stmt.executeUpdate();
            String sql = "SELECT max(workorder) from pedidos";
            Statement st = cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            if(rs.next()){
                resultado = rs.getString(1);
            }
            
            cn.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error de conexion");
        }
        return resultado;
    }
    public boolean checar(String fecha,String tipo){
        boolean resultado = true;
        try{
            cc = new ConexionBD();
            cn = cc.conexion();
            PreparedStatement st = cn.prepareStatement("select estado from pedidos where fecha = ? and estado = ?");
            st.setString(1, fecha);
            st.setString(2, tipo);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                resultado = false;
            }
            cn.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return resultado;
         
    }
    private boolean pedidos_pendientes(String fecha){
        boolean resultado = checar(fecha,"Pendiente");
        if(resultado == false){
            JOptionPane.showMessageDialog(null,"Existen entregas pendientes");
        }
        return resultado;
    }
    private void pedidos(){
        String[] row = new String[12];
        DefaultTableModel modelot = (DefaultTableModel) Tabla.getModel();
        String fecha_actual = fecha.getFormatoFecha();
        String[] tipos = new String[2];
        tipos[0]="Pendiente";
        tipos[1]="Devuelto";
        for(int i = 0; i<2; i++){
            if(checar(fecha_actual,tipos[i])==true){
                continue;
            }
            try{
                cc = new ConexionBD();
                cn = cc.conexion();
                PreparedStatement st = cn.prepareStatement("select * from pedidos where fecha=? and estado = ?");
                st.setString(1, fecha_actual);
                st.setString(2, tipos[i]);
                ResultSet rs = st.executeQuery();
                while(rs.next()){
                    row[0]=rs.getString(1);//workorder
                    row[2]=rs.getString(2);//No.operador
                    row[5]=rs.getString(3);//ID herramienta
                    if(i == 1){
                        row[6] = rs.getString(5);  
                        row[10] = rs.getString(7);
                    }
                    else{
                        row[6]= rs.getString(4);
                        row[10] = rs.getString(6);
                    }
                    row[7]=rs.getString(8);
                    row[8]=rs.getString(9);
                    
                    row[9]=rs.getString(10);
                    row[11]=rs.getString(11);
                    PreparedStatement stmt = cn.prepareStatement("select Nombre_operador, Departamento from Operadores where Numero_de_Operador = ?");
                    stmt.setString(1, row[2]);
                    ResultSet rsmt = stmt.executeQuery();
                    if(rsmt.next()){
                        row[1]=rsmt.getString(1);
                        row[3]=rsmt.getString(2);
                    }
                    PreparedStatement stm = cn.prepareStatement("select nombre, categoria from herramientas where ID = ?");
                    stm.setString(1, row[5]);
                    ResultSet rsm = stm.executeQuery();
                    if(rsm.next()){
                        row[4]=rsm.getString(2);
                        row[5]=rsm.getString(1);
                    }
                    modelot.addRow(row); //Añadir la informacion a la tabla del historial
                    Tabla.getColumnModel().getColumn(11).setCellRenderer(new PintarFila(11));
                }
                
                cn.close();
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        
    }
    private boolean compare_canth(String id, String cantidad){
        boolean resultado = true;
        try{
            cc = new ConexionBD();
            cn = cc.conexion();
            PreparedStatement stm = cn.prepareStatement("select cantidad from herramientas where nombre = ?");
            stm.setString(1, id);
            ResultSet rsm = stm.executeQuery();
            if (rsm.next()) {
                int cant_real = Integer.parseInt(rsm.getString(1));
                int cant_solicitado = Integer.parseInt(cantidad);
                if (cant_solicitado > cant_real) {
                    JOptionPane.showMessageDialog(null, "HERRAMIENTAS INSUFICIENTES");
                    resultado = false;
                } 
                else{
                    PreparedStatement st = cn.prepareStatement("UPDATE herramientas SET cantidad=? WHERE nombre=?");
                    st.setString(2, id);
                    st.setString(1,Integer.toString(cant_real-cant_solicitado));
                    st.executeUpdate();
                }
            }
            cn.close();
        }
        
        catch(Exception e){
            System.out.println(e);
        }
        return resultado;
    }
    
    private void TablaHerramientas(){
        String[] columnas = {"Nombre","ID Herramienta", "Ubicacion","Cantidad"};
        DefaultTableModel model = new DefaultTableModel(columnas,0);
        String[] row = new String[4];
        try {
            cc = new ConexionBD();
            cn = cc.conexion();
            PreparedStatement st = cn.prepareStatement("select categoria, nombre, codigo, cantidad from ReporteStockBajo");
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                for(int i = 0; i<4; i++){
                    row[i] = rs.getString(i+1);
                }
                model.addRow(row);
            }
            cn.close();
            JTable table = new JTable(model);
            exportar = new Exportar();
            exportar.exportarExcel(table,"Stock");
        }
        catch (Exception e) {
            System.out.println(e);
        }
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnBorrar;
    private javax.swing.JButton BtnEnviar;
    private javax.swing.JButton BtnGenerar;
    private javax.swing.JButton BtnNuevo;
    private javax.swing.JTextField Buscar;
    private javax.swing.JTextField Cantidad;
    private javax.swing.JTextField IDHerra;
    private javax.swing.JTextField IDOperador;
    private javax.swing.JButton Salir;
    private javax.swing.JMenu Solicitar;
    private javax.swing.JComboBox<String> State;
    private javax.swing.JTable Tabla;
    private javax.swing.JMenu Usuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtDepart;
    private javax.swing.JTextField txtHerra;
    private javax.swing.JTextField txtNombreO;
    // End of variables declaration//GEN-END:variables

    private void getInt() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
