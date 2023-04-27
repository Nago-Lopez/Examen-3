/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package parcial_3_abdenagolopez;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abdenago
 */
public class control_de_inventario extends javax.swing.JFrame {

    
   ClsInventario inventario = new ClsInventario();
   DefaultTableModel modeloTabla = new DefaultTableModel();
   
     
    public control_de_inventario() {
        initComponents();
        String[] columnas = new String[]{"Codigo: ", "Descripcion: ", "Cantidad: ", "Tipo: ", "Activo: ", "Precio:" };
         modeloTabla.setColumnIdentifiers(columnas);
         ttabla.setModel(modeloTabla);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bagregar = new javax.swing.JButton();
        bborrar = new javax.swing.JButton();
        breporte = new javax.swing.JButton();
        tcantidad = new javax.swing.JTextField();
        tcodigo = new javax.swing.JTextField();
        tdescripcion = new javax.swing.JTextField();
        bmodificar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ttipo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        tprecio = new javax.swing.JTextField();
        rsi = new javax.swing.JRadioButton();
        rno = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ttabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setText("Control de inventarios");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(22, 24, 500, 110);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        jLabel2.setText("Codigo");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(22, 22, 70, 16);

        jLabel3.setText("Descripcion ");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(210, 20, 80, 16);

        jLabel4.setText("Cantidad");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 80, 48, 16);

        bagregar.setText("Agregar");
        bagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagregarActionPerformed(evt);
            }
        });
        jPanel2.add(bagregar);
        bagregar.setBounds(10, 300, 90, 23);

        bborrar.setText("Borrar");
        bborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bborrarActionPerformed(evt);
            }
        });
        jPanel2.add(bborrar);
        bborrar.setBounds(130, 300, 80, 23);

        breporte.setText("Reporte");
        breporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                breporteActionPerformed(evt);
            }
        });
        jPanel2.add(breporte);
        breporte.setBounds(380, 300, 80, 23);
        jPanel2.add(tcantidad);
        tcantidad.setBounds(80, 80, 80, 22);
        jPanel2.add(tcodigo);
        tcodigo.setBounds(80, 20, 90, 22);
        jPanel2.add(tdescripcion);
        tdescripcion.setBounds(294, 20, 170, 22);

        bmodificar.setText("Modificar");
        bmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmodificarActionPerformed(evt);
            }
        });
        jPanel2.add(bmodificar);
        bmodificar.setBounds(240, 300, 100, 23);

        jLabel6.setText("Activo");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(300, 60, 34, 16);

        jLabel7.setText("Tipo");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(200, 60, 23, 16);

        ttipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(ttipo);
        ttipo.setBounds(180, 80, 72, 22);

        jLabel8.setText("Precio");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(410, 60, 33, 16);
        jPanel2.add(tprecio);
        tprecio.setBounds(380, 80, 100, 22);

        rsi.setText("Si");
        jPanel2.add(rsi);
        rsi.setBounds(270, 80, 50, 21);

        buttonGroup1.add(rno);
        rno.setText("No");
        jPanel2.add(rno);
        rno.setBounds(320, 80, 50, 21);

        ttabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Descripcion", "Cantidad", "Tipo", "Activo", "Precio"
            }
        ));
        jScrollPane1.setViewportView(ttabla);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(20, 120, 452, 150);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 150, 500, 340);

        jLabel1.setText("Logo");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(570, 10, 70, 16);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(540, 30, 100, 100);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void Insertar(){
    String Tipo = "";
        
        boolean tieneactivo = false;
               if (rsi.isSelected()) {
                   tieneactivo = true;
                   inventario.setSiActivo();
               } else if (rno.isSelected()) {
                   tieneactivo = false;
                   inventario.setNoActivo();
        
          Tipo = ttipo.getSelectedItem().toString();
          
        modeloTabla.addRow(new Object[] {tcodigo.getText(), tieneactivo, Tipo,tdescripcion.getText(), tcantidad.getText(), tprecio.getText()});
    
    }
    private void bagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagregarActionPerformed
     
     Insertar();
        
       
    }//GEN-LAST:event_bagregarActionPerformed

    private void breporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_breporteActionPerformed

        FrmReporte reporte = new FrmReporte();
        reporte.setSize(700, 500);
        reporte.setVisible(true);
    }//GEN-LAST:event_breporteActionPerformed

    private void bmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmodificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bmodificarActionPerformed

    private void bborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bborrarActionPerformed

    }//GEN-LAST:event_bborrarActionPerformed

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
            java.util.logging.Logger.getLogger(control_de_inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(control_de_inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(control_de_inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(control_de_inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new control_de_inventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bagregar;
    private javax.swing.JButton bborrar;
    private javax.swing.JButton bmodificar;
    private javax.swing.JButton breporte;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rno;
    private javax.swing.JRadioButton rsi;
    private javax.swing.JTextField tcantidad;
    private javax.swing.JTextField tcodigo;
    private javax.swing.JTextField tdescripcion;
    private javax.swing.JTextField tprecio;
    private javax.swing.JTable ttabla;
    private javax.swing.JComboBox<String> ttipo;
    // End of variables declaration//GEN-END:variables
}
