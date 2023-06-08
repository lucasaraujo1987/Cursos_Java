/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.br.VIEW;

import com.br.DAO.MembroDAO;
import com.br.DTO.MembroDTO;
import java.awt.Color;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lukas
 */
public class FrmPrincipalVIEW extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipalVIEW
     */
    public FrmPrincipalVIEW() {
        initComponents();
        getContentPane().setBackground(Color.white);
        ListarAniversarioMembros();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jPanel1 = new javax.swing.JPanel();
        btnAdicionarMembro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaMembro = new javax.swing.JTable();
        btnListaDeMembros = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenuItem1.setText("jMenuItem1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        btnAdicionarMembro.setBackground(new java.awt.Color(0, 255, 255));
        btnAdicionarMembro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdicionarMembro.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionarMembro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/AdicionarMembro.png"))); // NOI18N
        btnAdicionarMembro.setText("<html>ADICIONAR <br> MEMBRO</html>");
        btnAdicionarMembro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdicionarMembro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarMembroActionPerformed(evt);
            }
        });

        tabelaMembro.setBackground(new java.awt.Color(255, 255, 255));
        tabelaMembro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tabelaMembro.setForeground(new java.awt.Color(0, 0, 0));
        tabelaMembro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COD.", "NOME", "SOBRENOME", "IDADE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaMembro.setGridColor(new java.awt.Color(102, 102, 102));
        tabelaMembro.setRowMargin(5);
        tabelaMembro.setSelectionBackground(new java.awt.Color(102, 102, 102));
        tabelaMembro.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tabelaMembro.setShowHorizontalLines(true);
        tabelaMembro.getTableHeader().setResizingAllowed(false);
        tabelaMembro.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabelaMembro);
        if (tabelaMembro.getColumnModel().getColumnCount() > 0) {
            tabelaMembro.getColumnModel().getColumn(0).setResizable(false);
            tabelaMembro.getColumnModel().getColumn(0).setPreferredWidth(10);
            tabelaMembro.getColumnModel().getColumn(1).setResizable(false);
            tabelaMembro.getColumnModel().getColumn(1).setPreferredWidth(60);
            tabelaMembro.getColumnModel().getColumn(2).setResizable(false);
            tabelaMembro.getColumnModel().getColumn(2).setPreferredWidth(130);
            tabelaMembro.getColumnModel().getColumn(3).setResizable(false);
            tabelaMembro.getColumnModel().getColumn(3).setPreferredWidth(30);
        }

        btnListaDeMembros.setBackground(new java.awt.Color(0, 51, 51));
        btnListaDeMembros.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnListaDeMembros.setForeground(new java.awt.Color(255, 255, 255));
        btnListaDeMembros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ListaDeMembros.png"))); // NOI18N
        btnListaDeMembros.setText("<html>LISTA DE<br> MEMBROS</html>");
        btnListaDeMembros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListaDeMembros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaDeMembrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(btnAdicionarMembro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnListaDeMembros, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarMembro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListaDeMembros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarMembroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarMembroActionPerformed
        FrmCadastrarMembro objFrmCadastrarMembro = null;
        try {
            objFrmCadastrarMembro = new FrmCadastrarMembro();
        } catch (ParseException ex) {
            Logger.getLogger(FrmPrincipalVIEW.class.getName()).log(Level.SEVERE, null, ex);
        }
        objFrmCadastrarMembro.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAdicionarMembroActionPerformed

    private void btnListaDeMembrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaDeMembrosActionPerformed
        FrmListaDeMembros objFrmListaDeMembros = new FrmListaDeMembros();
        objFrmListaDeMembros.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnListaDeMembrosActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipalVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipalVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipalVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipalVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipalVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarMembro;
    private javax.swing.JButton btnListaDeMembros;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JTable tabelaMembro;
    // End of variables declaration//GEN-END:variables


    private void ListarAniversarioMembros() {

        try {
            MembroDAO objMembroDAO = new MembroDAO();
            DefaultTableModel model = (DefaultTableModel) tabelaMembro.getModel();
            model.setNumRows(0);

            ArrayList<MembroDTO> lista_membro = objMembroDAO.pesquisarMembro();

            for (int num = 0; num < lista_membro.size(); num++) {
                model.addRow(new Object[]{
                    lista_membro.get(num).getId_membro(),
                    lista_membro.get(num).getNome_membro(),
                    lista_membro.get(num).getSobrenome_membro(),
                    lista_membro.get(num).getIdade_membro() + " anos"
                });

            }
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Exibir Lista de Aniversariantes " + e);

        }

    }

}
