/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author josen
 */
public class jfGuia1 extends javax.swing.JFrame {

    /**
     * Creates new form jfGuia1
     */
    public jfGuia1() {
        initComponents();
         this.getContentPane().setBackground(Color.BLUE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnAreaDiagonal = new javax.swing.JButton();
        btnCircunferencia = new javax.swing.JButton();
        btnVolEsfera = new javax.swing.JButton();
        btnVolCubo = new javax.swing.JButton();
        btn10Datos = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("QUE DESEA CALCULAR:");

        btnAreaDiagonal.setText("Area y diagonal ");
        btnAreaDiagonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAreaDiagonalActionPerformed(evt);
            }
        });

        btnCircunferencia.setText("Circunferencia");
        btnCircunferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCircunferenciaActionPerformed(evt);
            }
        });

        btnVolEsfera.setText("Volumen de una esfera ");
        btnVolEsfera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolEsferaActionPerformed(evt);
            }
        });

        btnVolCubo.setText("Volumen  de un cubo");

        btn10Datos.setText("Promedio 10 datos");
        btn10Datos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10DatosActionPerformed(evt);
            }
        });

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btnVolEsfera)
                            .addGap(18, 18, 18)
                            .addComponent(btnVolCubo))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(btnAreaDiagonal)
                            .addGap(87, 87, 87)
                            .addComponent(btnCircunferencia)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(btn10Datos)))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAreaDiagonal)
                    .addComponent(btnCircunferencia))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolEsfera)
                    .addComponent(btnVolCubo))
                .addGap(18, 18, 18)
                .addComponent(btn10Datos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAreaDiagonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAreaDiagonalActionPerformed
double resultado=0,diagonal=0;
       
      
            double base=Double.parseDouble(JOptionPane.showInputDialog("ingrese la base"));
            double altura=Double.parseDouble(JOptionPane.showInputDialog("ingrese la altura"));
            
            resultado=base*altura;
            diagonal=Math.sqrt(Math.pow(base,2)+Math.pow(altura,2));
            
            
        JOptionPane.showMessageDialog(null,"el area es: "+resultado+"la diagonal es: "+diagonal);   
    }//GEN-LAST:event_btnAreaDiagonalActionPerformed

    private void btnCircunferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCircunferenciaActionPerformed
        
          double resultado=0;
        
        double radio=Double.parseDouble(JOptionPane.showInputDialog("ingrese el radio de la circunferencia"));
        
        resultado=(3.14)*(radio*2);
        
        JOptionPane.showMessageDialog(null,"la circunferencia del circulo es: "+resultado);
    }//GEN-LAST:event_btnCircunferenciaActionPerformed

    private void btnVolEsferaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolEsferaActionPerformed
        
         double resultado=0;
        
        double radio=Double.parseDouble(JOptionPane.showInputDialog("ingrese el radio de la esfera"));
        
        
        resultado=(4.18666)*(Math.pow(radio,3));
        
        JOptionPane.showMessageDialog(null,"el volumen de la esfera es: "+resultado);
    }//GEN-LAST:event_btnVolEsferaActionPerformed

    private void btn10DatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10DatosActionPerformed
           double vector[]=new double[10];
        double suma=0,promedio=0;
        for(int i=0;i<10;i++){
            vector[i]=Double.parseDouble(JOptionPane.showInputDialog("Ingrese dato "+(i+1)));
            suma=suma+vector[i];
        }
        promedio=suma/10;
        
        JOptionPane.showMessageDialog(null,"el promedio de los datos ingresados es: "+promedio);
    }//GEN-LAST:event_btn10DatosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu men=new Menu();
        men.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(jfGuia1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfGuia1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfGuia1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfGuia1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfGuia1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn10Datos;
    private javax.swing.JButton btnAreaDiagonal;
    private javax.swing.JButton btnCircunferencia;
    private javax.swing.JButton btnVolCubo;
    private javax.swing.JButton btnVolEsfera;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}