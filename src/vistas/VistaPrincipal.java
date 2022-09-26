
package vistas;

/**
 *
 * @author Rojas Alejandro Yonatan
 */

//Funciones principales de las vistas.

public class VistaPrincipal extends javax.swing.JDialog {
    private ConvertirMonedas convertidormoneda;
    private Convertirtemperatura convertirtemperatura;
   
    public VistaPrincipal(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(this);
    }

    private void abrirConvertidorMonedas(){
        convertidormoneda=new ConvertirMonedas(null, true);
        convertidormoneda.setVisible(true);
    }
    
    private void abrirConvertidorTemperatura(){
        convertirtemperatura=new Convertirtemperatura(null, true);
        convertirtemperatura.setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        btnTemperatura = new org.edisoncor.gui.button.ButtonAqua();
        btnMonedas = new org.edisoncor.gui.button.ButtonAqua();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelImage1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Conversor", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Gabriola", 0, 24), new java.awt.Color(153, 0, 0))); // NOI18N
        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/challengeImage.jpg"))); // NOI18N
        panelImage1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTemperatura.setBackground(new java.awt.Color(142, 0, 0));
        btnTemperatura.setText("TEMPERATURA");
        btnTemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTemperaturaActionPerformed(evt);
            }
        });
        panelImage1.add(btnTemperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 150, 40));

        btnMonedas.setBackground(new java.awt.Color(40, 102, 255));
        btnMonedas.setText("MONEDAS");
        btnMonedas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMonedasActionPerformed(evt);
            }
        });
        panelImage1.add(btnMonedas, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 150, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMonedasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonedasActionPerformed
        abrirConvertidorMonedas();
    }//GEN-LAST:event_btnMonedasActionPerformed

    private void btnTemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTemperaturaActionPerformed
        abrirConvertidorTemperatura();
    }//GEN-LAST:event_btnTemperaturaActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VistaPrincipal dialog = new VistaPrincipal(new javax.swing.JFrame(), true);
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
    private org.edisoncor.gui.button.ButtonAqua btnMonedas;
    private org.edisoncor.gui.button.ButtonAqua btnTemperatura;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    // End of variables declaration//GEN-END:variables
}
