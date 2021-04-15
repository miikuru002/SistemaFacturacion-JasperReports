package vista;

import clases.Clases;

public class Generar_reportes extends javax.swing.JDialog {

    public Generar_reportes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    Clases c = new Clases();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo_producto = new javax.swing.JTextField();
        btnBuscar_codigo_productos = new javax.swing.JButton();
        btnVer_productos = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCodigo_cliente = new javax.swing.JTextField();
        txtRuc_cliente = new javax.swing.JTextField();
        btnVer_clientes = new javax.swing.JButton();
        btnBuscar_codigo_clientes = new javax.swing.JButton();
        btnBuscar_ruc_clientes = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNumero_factura = new javax.swing.JTextField();
        txtFecha_factura = new javax.swing.JTextField();
        txtId_cliente_factura = new javax.swing.JTextField();
        btnVer_facturas = new javax.swing.JButton();
        btnBuscar_numero_factura = new javax.swing.JButton();
        btnBuscar_fecha_factura = new javax.swing.JButton();
        btnBuscar_id_factura = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Búsqueda productos"));

        jLabel1.setText("Código:");

        btnBuscar_codigo_productos.setText("Buscar por código");
        btnBuscar_codigo_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar_codigo_productosActionPerformed(evt);
            }
        });

        btnVer_productos.setText("Ver registros");
        btnVer_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVer_productosActionPerformed(evt);
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
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtCodigo_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVer_productos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar_codigo_productos)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigo_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVer_productos)
                    .addComponent(btnBuscar_codigo_productos))
                .addGap(27, 27, 27))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Búsqueda clientes"));

        jLabel2.setText("Código:");

        jLabel3.setText("R.U.C:");

        btnVer_clientes.setText("Ver registros");
        btnVer_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVer_clientesActionPerformed(evt);
            }
        });

        btnBuscar_codigo_clientes.setText("Buscar por código");
        btnBuscar_codigo_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar_codigo_clientesActionPerformed(evt);
            }
        });

        btnBuscar_ruc_clientes.setText("Buscar por R.U.C");
        btnBuscar_ruc_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar_ruc_clientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCodigo_cliente)
                                    .addComponent(txtRuc_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnVer_clientes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscar_codigo_clientes))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(btnBuscar_ruc_clientes)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtRuc_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVer_clientes)
                    .addComponent(btnBuscar_codigo_clientes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar_ruc_clientes))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Búsqueda facturas"));

        jLabel4.setText("Número:");

        jLabel5.setText("Fecha:");

        jLabel6.setText("ID Cliente:");

        btnVer_facturas.setText("Ver registros");
        btnVer_facturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVer_facturasActionPerformed(evt);
            }
        });

        btnBuscar_numero_factura.setText("Buscar por número");
        btnBuscar_numero_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar_numero_facturaActionPerformed(evt);
            }
        });

        btnBuscar_fecha_factura.setText("Buscar por fecha");
        btnBuscar_fecha_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar_fecha_facturaActionPerformed(evt);
            }
        });

        btnBuscar_id_factura.setText("Buscar por ID");
        btnBuscar_id_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar_id_facturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtId_cliente_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFecha_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumero_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnBuscar_fecha_factura)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar_id_factura))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnVer_facturas)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar_numero_factura)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNumero_factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtFecha_factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtId_cliente_factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVer_facturas)
                    .addComponent(btnBuscar_numero_factura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar_fecha_factura)
                    .addComponent(btnBuscar_id_factura)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscar_codigo_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar_codigo_productosActionPerformed
        int cod=Integer.parseInt(txtCodigo_producto.getText());
        c.EjecutarReporte_productos_cod(cod);
    }//GEN-LAST:event_btnBuscar_codigo_productosActionPerformed

    private void btnVer_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVer_productosActionPerformed
        c.EjecutarReporte_productos();
    }//GEN-LAST:event_btnVer_productosActionPerformed

    private void btnVer_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVer_clientesActionPerformed
        c.EjecutarReporte_clientes();
    }//GEN-LAST:event_btnVer_clientesActionPerformed

    private void btnVer_facturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVer_facturasActionPerformed
        c.EjecutarReporte_facturas();
    }//GEN-LAST:event_btnVer_facturasActionPerformed

    private void btnBuscar_codigo_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar_codigo_clientesActionPerformed
        int cod=Integer.parseInt(txtCodigo_cliente.getText());
        c.EjecutarReporte_clientes_cod(cod);
    }//GEN-LAST:event_btnBuscar_codigo_clientesActionPerformed

    private void btnBuscar_ruc_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar_ruc_clientesActionPerformed
        String ruc=txtRuc_cliente.getText();
        c.EjecutarReporte_clientes_ruc(ruc);
    }//GEN-LAST:event_btnBuscar_ruc_clientesActionPerformed

    private void btnBuscar_numero_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar_numero_facturaActionPerformed
        int num=Integer.parseInt(txtNumero_factura.getText());
        c.EjecutarReporte_facturas_num(num);
    }//GEN-LAST:event_btnBuscar_numero_facturaActionPerformed

    private void btnBuscar_fecha_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar_fecha_facturaActionPerformed
        String fecha=txtFecha_factura.getText();
        c.EjecutarReporte_facturas_fecha(fecha);
    }//GEN-LAST:event_btnBuscar_fecha_facturaActionPerformed

    private void btnBuscar_id_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar_id_facturaActionPerformed
        int cod=Integer.parseInt(txtId_cliente_factura.getText());
        c.EjecutarReporte_facturas_id(cod);
    }//GEN-LAST:event_btnBuscar_id_facturaActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Generar_reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Generar_reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Generar_reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Generar_reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                Generar_reportes dialog = new Generar_reportes(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar_codigo_clientes;
    private javax.swing.JButton btnBuscar_codigo_productos;
    private javax.swing.JButton btnBuscar_fecha_factura;
    private javax.swing.JButton btnBuscar_id_factura;
    private javax.swing.JButton btnBuscar_numero_factura;
    private javax.swing.JButton btnBuscar_ruc_clientes;
    private javax.swing.JButton btnVer_clientes;
    private javax.swing.JButton btnVer_facturas;
    private javax.swing.JButton btnVer_productos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtCodigo_cliente;
    private javax.swing.JTextField txtCodigo_producto;
    private javax.swing.JTextField txtFecha_factura;
    private javax.swing.JTextField txtId_cliente_factura;
    private javax.swing.JTextField txtNumero_factura;
    private javax.swing.JTextField txtRuc_cliente;
    // End of variables declaration//GEN-END:variables
}
