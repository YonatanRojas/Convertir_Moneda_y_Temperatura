package vistas;

import clases.ConversionTemperatura;
import javax.swing.JOptionPane;

/**
 *
 * @author Rojas Alejandro Yonatan
 */

//Funciones del Convertidor de temperatura.

public class Convertirtemperatura extends javax.swing.JDialog {

    private String deTemperatura;
    private String paraTemperatura;
    private double cantidadTemperatura;

    public Convertirtemperatura(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(this);
    }
    //validacion de campos
    private boolean validarCampos() {
        boolean respuesta = false;
        deTemperatura = (String) comboDe.getSelectedItem();
        paraTemperatura = (String) comboPara.getSelectedItem();

        if (!txtCantidad.getText().isEmpty()) {
            try {
                cantidadTemperatura = Double.parseDouble(txtCantidad.getText());
                if (!deTemperatura.equals("Seleccione")) {
                    if (!paraTemperatura.equals("Seleccione")) {
                        respuesta = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Por favor elegir una temperatura PARA Conversión");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor elegir una temperatura DE Conversión");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese la cantidad a Valida");
                txtCantidad.setText(null);
                txtCantidad.requestFocus();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Por favor ingrese la cantidad a convertir");
        }

        return respuesta;
    }

    private void convertirtemperatura() {
        double temperaturaFinal = 0;
        ConversionTemperatura conversiontemperatura = new ConversionTemperatura();
        temperaturaFinal = conversiontemperatura.conversion(deTemperatura, paraTemperatura,
                cantidadTemperatura);
        txtConversion.setText(String.valueOf(temperaturaFinal));

    }

    @SuppressWarnings("unchecked")
    // add the components 
    //no function in context before
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        jPanel1 = new javax.swing.JPanel();
        comboDe = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        comboPara = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtConversion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btnConvertir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelImage1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Conversión de Temperatura", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Gabriola", 0, 28), new java.awt.Color(255, 255, 255))); // NOI18N
        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Imagen1.png"))); // NOI18N
        panelImage1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "De Grados", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Gabriola", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboDe.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        comboDe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Celcius", "Kelvin", "Fahrenheit", " " }));
        jPanel1.add(comboDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 43, 200, 30));

        panelImage1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 260, 100));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "A Grados", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Gabriola", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboPara.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        comboPara.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Kelvin", "Fahrenheit", "Celcius" }));
        jPanel2.add(comboPara, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 43, 200, 30));

        panelImage1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 260, 100));

        jLabel1.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Conversión");
        panelImage1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 235, 100, 20));

        txtConversion.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        panelImage1.add(txtConversion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 180, 30));

        jLabel2.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingresar Grados");
        panelImage1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 150, 130, 30));

        txtCantidad.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });
        panelImage1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 180, 30));

        btnConvertir.setBackground(new java.awt.Color(255, 0, 0));
        btnConvertir.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        btnConvertir.setForeground(new java.awt.Color(255, 255, 255));
        btnConvertir.setText("Convertir");
        btnConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertirActionPerformed(evt);
            }
        });
        panelImage1.add(btnConvertir, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 120, 40));

        getContentPane().add(panelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertirActionPerformed
        if (validarCampos()) {
            convertirtemperatura();
        }
    }//GEN-LAST:event_btnConvertirActionPerformed

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && c != '.' && c!='-') {
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadKeyTyped

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Convertirtemperatura dialog = new Convertirtemperatura(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnConvertir;
    private javax.swing.JComboBox<String> comboDe;
    private javax.swing.JComboBox<String> comboPara;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtConversion;
    // End of variables declaration//GEN-END:variables
}
