/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author Piero Ortega
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        mnuFactura = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        mnuMantenimiento_clientes = new javax.swing.JMenuItem();
        mnuBusqueda_clientes = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnuMantenimiento_productos = new javax.swing.JMenuItem();
        mnuBusqueda_productos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuReporte = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 255, Short.MAX_VALUE)
        );

        jMenu5.setText("Factura");

        mnuFactura.setText("Crear factura");
        mnuFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFacturaActionPerformed(evt);
            }
        });
        jMenu5.add(mnuFactura);

        jMenuBar1.add(jMenu5);

        jMenu1.setText("Mantemiento");

        jMenu3.setText("Clientes");

        mnuMantenimiento_clientes.setText("Mantenimiento de clientes");
        mnuMantenimiento_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMantenimiento_clientesActionPerformed(evt);
            }
        });
        jMenu3.add(mnuMantenimiento_clientes);

        mnuBusqueda_clientes.setText("Búsqueda de clientes");
        mnuBusqueda_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBusqueda_clientesActionPerformed(evt);
            }
        });
        jMenu3.add(mnuBusqueda_clientes);

        jMenu1.add(jMenu3);

        jMenu4.setText("Productos");

        mnuMantenimiento_productos.setText("Mantenimiento de productos");
        mnuMantenimiento_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMantenimiento_productosActionPerformed(evt);
            }
        });
        jMenu4.add(mnuMantenimiento_productos);

        mnuBusqueda_productos.setText("Búsqueda de productos");
        mnuBusqueda_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBusqueda_productosActionPerformed(evt);
            }
        });
        jMenu4.add(mnuBusqueda_productos);

        jMenu1.add(jMenu4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Reportes");

        mnuReporte.setText("Generar reportes");
        mnuReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuReporteActionPerformed(evt);
            }
        });
        jMenu2.add(mnuReporte);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuMantenimiento_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMantenimiento_clientesActionPerformed
        Mantenimiento_clientes m=new Mantenimiento_clientes(this,true); //TRUE: es modal 
        m.setVisible(true);
    }//GEN-LAST:event_mnuMantenimiento_clientesActionPerformed

    private void mnuBusqueda_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBusqueda_clientesActionPerformed
        Busqueda_clientes b=new Busqueda_clientes(this,true); //TRUE: es modal 
        b.setVisible(true);
    }//GEN-LAST:event_mnuBusqueda_clientesActionPerformed

    private void mnuMantenimiento_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMantenimiento_productosActionPerformed
        Mantenimiento_productos m=new Mantenimiento_productos(this,true); 
        m.setVisible(true);
    }//GEN-LAST:event_mnuMantenimiento_productosActionPerformed

    private void mnuBusqueda_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBusqueda_productosActionPerformed
        Busqueda_productos b=new Busqueda_productos(this,true); 
        b.setVisible(true);
    }//GEN-LAST:event_mnuBusqueda_productosActionPerformed

    private void mnuFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFacturaActionPerformed
        Factura f= new Factura(this, true);
        f.setVisible(true);
    }//GEN-LAST:event_mnuFacturaActionPerformed

    private void mnuReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuReporteActionPerformed
        Generar_reportes g=new Generar_reportes(this, true);
        g.setVisible(true);
    }//GEN-LAST:event_mnuReporteActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem mnuBusqueda_clientes;
    private javax.swing.JMenuItem mnuBusqueda_productos;
    private javax.swing.JMenuItem mnuFactura;
    private javax.swing.JMenuItem mnuMantenimiento_clientes;
    private javax.swing.JMenuItem mnuMantenimiento_productos;
    private javax.swing.JMenuItem mnuReporte;
    // End of variables declaration//GEN-END:variables
}
