
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pared
 */
public class Frame2 extends javax.swing.JFrame {

    /**
     * Creates new form Frame2
     */
    double v[];
    public Frame2() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtLongitud = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        cmbCrear = new javax.swing.JButton();
        cmbLlenadoManual = new javax.swing.JButton();
        cmbLlenadoAutom = new javax.swing.JButton();
        cmbMostrar = new javax.swing.JButton();
        cmbBorrar = new javax.swing.JButton();
        cmbNumPares = new javax.swing.JButton();
        cmbNumerosImpares = new javax.swing.JButton();
        cmbNumerosPrimos = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Iniciales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Longitud:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));
        jPanel2.add(txtLongitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 70, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 180, 90));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Botones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbCrear.setText("Crear");
        cmbCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCrearActionPerformed(evt);
            }
        });
        jPanel3.add(cmbCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 120, -1));

        cmbLlenadoManual.setText("Llenado Manual");
        cmbLlenadoManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLlenadoManualActionPerformed(evt);
            }
        });
        jPanel3.add(cmbLlenadoManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 120, -1));

        cmbLlenadoAutom.setText("Llenado Autom");
        cmbLlenadoAutom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLlenadoAutomActionPerformed(evt);
            }
        });
        jPanel3.add(cmbLlenadoAutom, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 120, -1));

        cmbMostrar.setText("Mostrar");
        cmbMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMostrarActionPerformed(evt);
            }
        });
        jPanel3.add(cmbMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 120, -1));

        cmbBorrar.setText("Borrar");
        cmbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBorrarActionPerformed(evt);
            }
        });
        jPanel3.add(cmbBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 120, -1));

        cmbNumPares.setText("Numeros Pares");
        cmbNumPares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNumParesActionPerformed(evt);
            }
        });
        jPanel3.add(cmbNumPares, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 120, -1));

        cmbNumerosImpares.setText("Numeros Impar");
        cmbNumerosImpares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNumerosImparesActionPerformed(evt);
            }
        });
        jPanel3.add(cmbNumerosImpares, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 120, -1));

        cmbNumerosPrimos.setText("Numeros Primos");
        cmbNumerosPrimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNumerosPrimosActionPerformed(evt);
            }
        });
        jPanel3.add(cmbNumerosPrimos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 120, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 180, 280));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 220, 140));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 250, 170));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCrearActionPerformed
        // TODO add your handling code here:
        int longitud;
        if (txtLongitud.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Ingrese la Longitud del vector", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtLongitud.requestFocusInWindow();
        }
        else if (Integer.parseInt(txtLongitud.getText().trim())==0) 
        {
      
            JOptionPane.showMessageDialog(this, "La Longitud no puede ser cero", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtLongitud.requestFocusInWindow();
            txtLongitud.selectAll();
        }
        else 
        {
        longitud= Integer.parseInt(txtLongitud.getText().trim());
        v= new double [longitud];
        JOptionPane.showMessageDialog(this ,"Vector Creado correctamente");
        }
        
    }//GEN-LAST:event_cmbCrearActionPerformed

    private void cmbLlenadoManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLlenadoManualActionPerformed
        // TODO add your handling code here:
        double n;
        for (int i = 0; i < v.length; i++) 
        {
            n= Double.parseDouble(JOptionPane.showInputDialog(this, "Ingrese los numeros"));
            v[i]=n;
        }
    }//GEN-LAST:event_cmbLlenadoManualActionPerformed

    private void cmbLlenadoAutomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLlenadoAutomActionPerformed
        // TODO add your handling code here:
        double n;
        for (int i = 0; i < v.length; i++) 
        {
           n= (int)(Math.random()* 50 + 1);
            v[i]=n;    
        }
    }//GEN-LAST:event_cmbLlenadoAutomActionPerformed

    private void cmbMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMostrarActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < v.length; i++) 
        {
            txtResultado.append(v[i]+"\n");
        }
    }//GEN-LAST:event_cmbMostrarActionPerformed

    private void cmbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBorrarActionPerformed
        // TODO add your handling code here:
        txtLongitud.setText("");
        txtResultado.setText("");
        txtLongitud.requestFocusInWindow();
        v= null;
    }//GEN-LAST:event_cmbBorrarActionPerformed

    private void cmbNumParesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNumParesActionPerformed
        // TODO add your handling code here:
        double cont=0;
        for (int i = 0; i < v.length; i++) 
        {
            if (v[i]%2==0){
               
             cont= cont + 1;
            }
        }
        txtResultado.append("Cantidad de Numeros Pares:"+ cont+"\n");
    }//GEN-LAST:event_cmbNumParesActionPerformed

    private void cmbNumerosImparesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNumerosImparesActionPerformed
        // TODO add your handling code here:
        double cont=0;
        for (int i = 0; i < v.length; i++) 
        {
            if (v[i] % 2 !=0)
            {
            cont= cont + 1;
            }
        }
        txtResultado.append("Cantidad de Numeros Impares:"+cont+"\n");
    }//GEN-LAST:event_cmbNumerosImparesActionPerformed

    private void cmbNumerosPrimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNumerosPrimosActionPerformed
        // TODO add your handling code here:
        double cont=2;
        boolean primo=true;
        double cont2=0;
        for (int i = 0; i < v.length; i++) 
        {
         if (v[i]%cont==0)
         {
             primo = false;
         }
         else 
         {
             cont2 = cont2+1;
         }
        }
        txtResultado.append("Cantidad de Numeros primos:"+ cont2+"\n");
    }//GEN-LAST:event_cmbNumerosPrimosActionPerformed

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
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmbBorrar;
    private javax.swing.JButton cmbCrear;
    private javax.swing.JButton cmbLlenadoAutom;
    private javax.swing.JButton cmbLlenadoManual;
    private javax.swing.JButton cmbMostrar;
    private javax.swing.JButton cmbNumPares;
    private javax.swing.JButton cmbNumerosImpares;
    private javax.swing.JButton cmbNumerosPrimos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtLongitud;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
