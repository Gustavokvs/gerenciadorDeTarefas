/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.GerenciadorDeTarefas;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno.saolucas
 */
public class GerenciadorDeTarefas extends javax.swing.JFrame {

    /**
     * Creates new form GerenciadorDeTarefas
     */
    public GerenciadorDeTarefas() {
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
        txtTitulo = new javax.swing.JTextField();
        lbTarefa = new javax.swing.JLabel();
        edtTarefa = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTarefas = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        lbTarefasTotais = new javax.swing.JLabel();
        txtTotalTarefas = new javax.swing.JTextField();
        btnOrdenar = new javax.swing.JButton();
        btnApagarTudo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));

        txtTitulo.setEditable(false);
        txtTitulo.setBackground(new java.awt.Color(255, 0, 0));
        txtTitulo.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setText("Gerenciador De Tarefas");
        txtTitulo.setBorder(null);
        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
            }
        });

        lbTarefa.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbTarefa.setForeground(new java.awt.Color(255, 255, 255));
        lbTarefa.setText("Digite a tarefa");

        edtTarefa.setBackground(new java.awt.Color(255, 255, 255));
        edtTarefa.setForeground(new java.awt.Color(51, 51, 51));

        btnSalvar.setBackground(new java.awt.Color(0, 0, 0));
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.setBorder(null);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(0, 0, 0));
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.setBorder(null);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(0, 0, 0));
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.setBorder(null);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnListar.setBackground(new java.awt.Color(0, 0, 0));
        btnListar.setForeground(new java.awt.Color(255, 255, 255));
        btnListar.setText("Listar");
        btnListar.setBorder(null);
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        txtTarefas.setEditable(false);
        txtTarefas.setBackground(new java.awt.Color(255, 255, 255));
        txtTarefas.setColumns(20);
        txtTarefas.setForeground(new java.awt.Color(0, 0, 0));
        txtTarefas.setRows(5);
        jScrollPane1.setViewportView(txtTarefas);

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Suas tarefas:");

        lbTarefasTotais.setBackground(new java.awt.Color(204, 0, 0));
        lbTarefasTotais.setForeground(new java.awt.Color(255, 255, 255));
        lbTarefasTotais.setText("Total de Tarefas");

        txtTotalTarefas.setEditable(false);
        txtTotalTarefas.setBackground(new java.awt.Color(255, 255, 255));
        txtTotalTarefas.setForeground(new java.awt.Color(0, 0, 0));

        btnOrdenar.setBackground(new java.awt.Color(0, 0, 0));
        btnOrdenar.setForeground(new java.awt.Color(255, 255, 255));
        btnOrdenar.setText("Ordenar");
        btnOrdenar.setBorder(null);
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });

        btnApagarTudo.setBackground(new java.awt.Color(0, 0, 0));
        btnApagarTudo.setForeground(new java.awt.Color(255, 255, 255));
        btnApagarTudo.setText("Apagar Tudo");
        btnApagarTudo.setBorder(null);
        btnApagarTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarTudoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbTarefa)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edtTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(247, 247, 247))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnApagarTudo)))
                .addGap(28, 28, 28))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtTotalTarefas))
                            .addComponent(lbTarefasTotais))))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTarefa)
                    .addComponent(edtTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnListar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnApagarTudo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbTarefasTotais)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalTarefas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127)))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Organizar obj1 = new Organizar();

    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        obj1.salvar(edtTarefa.getText());
        edtTarefa.setText("");
        edtTarefa.requestFocus();
        btnListar.doClick();


    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        int cod;
        cod = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Qual é Numero da tarefa??"));
        /* Aqui é input por que preciso digitar
        um valor dentro do Integer, portanto "input" significa inserir
        por isso que o código tá dentro do parseInt.*/

        obj1.apagar((cod - 1));
        btnListar.doClick();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        int cod;
        String novoElemento;

        cod = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Qual é o Código da Tarefa?"));

        novoElemento = JOptionPane.showInputDialog("Nova Tarefa:");

        obj1.editar((cod - 1), novoElemento); // O -1 é pra pegar o INDICE, não o numero na lista.
        btnListar.doClick();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed

        if (obj1.verVazio()) {
            JOptionPane.showMessageDialog(null, "Lista vazia");
        } else {

            txtTarefas.setText(obj1.listar());

            txtTotalTarefas.setText(obj1.contabilizarTarefas());
        }
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        obj1.ordenar();
        JOptionPane.showMessageDialog(null, "Tarefas Ordenadas com sucesso.");
        btnListar.doClick();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOrdenarActionPerformed

    private void btnApagarTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarTudoActionPerformed
        obj1.excluirBase();
        txtTarefas.setText("");
        txtTotalTarefas.setText("");
        edtTarefa.requestFocus();
    }//GEN-LAST:event_btnApagarTudoActionPerformed

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
            java.util.logging.Logger.getLogger(GerenciadorDeTarefas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciadorDeTarefas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciadorDeTarefas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciadorDeTarefas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciadorDeTarefas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApagarTudo;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField edtTarefa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTarefa;
    private javax.swing.JLabel lbTarefasTotais;
    private javax.swing.JTextArea txtTarefas;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txtTotalTarefas;
    // End of variables declaration//GEN-END:variables
}