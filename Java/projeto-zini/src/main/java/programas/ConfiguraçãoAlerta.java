/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programas;
import classes.DataAtual;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Pichau
 */
public class ConfiguraçãoAlerta extends javax.swing.JFrame {
    DataAtual data = new DataAtual(new Date());   
    String dia = data.getDiaSemana();
    Date date;
    /**
     * Creates new form ConfiguraçãoAlerta
     */
    public ConfiguraçãoAlerta() {
        initComponents();
        
    }

    /**
     * This method   is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Copyright ©2020  ini. Designed By   INI DEVELOPMENT"); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(230, 510, 390, 50);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(252, 197, 119));
        jLabel2.setText("Z");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(468, 527, 10, 17);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(252, 197, 119));
        jLabel3.setText("Z");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(344, 527, 10, 17);

        jPanel2.setBackground(new java.awt.Color(252, 197, 119));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 110, 750, 1);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.setLayout(null);

        jRadioButton1.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Segunda a sexta");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButton1);
        jRadioButton1.setBounds(28, 111, 191, 33);

        jRadioButton2.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Segunda, quarta e sexta");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButton2);
        jRadioButton2.setBounds(28, 162, 279, 33);

        jRadioButton3.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("Todos os dias");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButton3);
        jRadioButton3.setBounds(28, 264, 169, 33);

        jRadioButton4.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setText("Terça, quinta e sabado");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButton4);
        jRadioButton4.setBounds(28, 213, 267, 33);

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Rotina");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(84, 68, 74, 25);

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Alertas de pausa ");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(340, 68, 187, 25);

        jRadioButton5.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jRadioButton5.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton5.setText("A cada 15 min");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButton5);
        jRadioButton5.setBounds(340, 111, 169, 33);

        jRadioButton6.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(jRadioButton6);
        jRadioButton6.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jRadioButton6.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton6.setText("A cada 20 min");
        jPanel3.add(jRadioButton6);
        jRadioButton6.setBounds(340, 162, 169, 33);

        jRadioButton7.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(jRadioButton7);
        jRadioButton7.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jRadioButton7.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton7.setText("A cada 25 min");
        jPanel3.add(jRadioButton7);
        jRadioButton7.setBounds(340, 213, 169, 33);

        jRadioButton8.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(jRadioButton8);
        jRadioButton8.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jRadioButton8.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton8.setText("A cada 30 min");
        jPanel3.add(jRadioButton8);
        jRadioButton8.setBounds(340, 264, 169, 33);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Definir alertas");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(190, 0, 170, 50);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(130, 160, 550, 320);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Configurações de alertas");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(260, 40, 320, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 790, 560);

        setSize(new java.awt.Dimension(803, 601));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        if(jRadioButton1.isSelected()){   
            if(dia.equals("Segunda-Feira") || dia.equals("Terça-Feira") || 
                    dia.equals("Quarta-Feira") || dia.equals("Quinta-Feira") ||
                    dia.equals("Sexta-Feira")){
                JOptionPane.showMessageDialog(null,data.getDiaSemana());
                JOptionPane.showMessageDialog(null, data.getDataHora());
            }
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        if(jRadioButton4.isSelected()){
            if(dia.equals("Terça-Feira") || dia.equals("Quinta-Feira") || 
                    dia.equals("Sabado")){
                JOptionPane.showMessageDialog(null,data.getDiaSemana());
                JOptionPane.showMessageDialog(null, data.getDataHora());
                
            }
        }
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        if(jRadioButton5.isSelected()){
            
        }
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        if(jRadioButton2.isSelected()){
            if(dia.equals("Segunda-Feira") || dia.equals("Quarta-Feira") || 
                    dia.equals("Sexta-Feira")){
                 JOptionPane.showMessageDialog(null,data.getDiaSemana());
                 JOptionPane.showMessageDialog(null, data.getDataHora());
            }
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        if(jRadioButton3.isSelected()){
             JOptionPane.showMessageDialog(null,data.getDiaSemana());
             JOptionPane.showMessageDialog(null, data.getDataHora());
        }
    }//GEN-LAST:event_jRadioButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(ConfiguraçãoAlerta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfiguraçãoAlerta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfiguraçãoAlerta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfiguraçãoAlerta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfiguraçãoAlerta().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    // End of variables declaration//GEN-END:variables
}
