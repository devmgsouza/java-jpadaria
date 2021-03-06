/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.marcio.padaria.front;

import br.com.marcio.padaria.front.funcoes.TableModelListaCompra;
import br.com.marcio.padaria.model.ProdutoVenda;
import br.com.marcio.padaria.model.Produtos;
import br.com.marcio.padaria.repositorio.Imp.ProdutosImp;
import br.com.marcio.padaria.repositorio.model.Exception.ProdutosException;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author MgSouza
 */
public class jTela_ListaCompra extends javax.swing.JDialog {
    ArrayList<ProdutoVenda> lista;
    double valorFinal = 0;
    String retornoFinal = "";
    /**
     * Creates new form jTela_ListaCompra
     */
    public jTela_ListaCompra() {
        initComponents();
        lista = new ArrayList<>();
        setAcessibilidade();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldCodBarras = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProdutos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();
        jButtonAdicionarVenda = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(280, 320));
        setMinimumSize(new java.awt.Dimension(280, 320));
        setType(java.awt.Window.Type.UTILITY);

        jTextFieldCodBarras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodBarrasActionPerformed(evt);
            }
        });
        jTextFieldCodBarras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCodBarrasKeyPressed(evt);
            }
        });

        jLabel1.setText("Código de barras:");

        jTableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableProdutos);

        jLabel2.setText("Total:");

        jLabelTotal.setText("00,00");

        jButtonAdicionarVenda.setMnemonic('a');
        jButtonAdicionarVenda.setText("Adicionar Venda");
        jButtonAdicionarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarVendaActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 279, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelTotal))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonAdicionarVenda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCancelar))))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 383, Short.MAX_VALUE))
                    .addComponent(jTextFieldCodBarras))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCodBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabelTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdicionarVenda)
                    .addComponent(jButtonCancelar))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCodBarrasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCodBarrasKeyPressed
         if (evt.getKeyCode() == KeyEvent.VK_ENTER)  {
             ProdutosImp pimp = new ProdutosImp();
             double valorProduto;
             
             jInputBoxLivre inputBox = new jInputBoxLivre();
             inputBox.setModal(true);
                 
             Produtos produto;
             ProdutoVenda prodVenda = new ProdutoVenda();
             ArrayList<Produtos> item = new ArrayList<>();
             try {
                 item = pimp.pesquisar(jTextFieldCodBarras.getText()); 
                 if (item.isEmpty()) {
                     JOptionPane.showMessageDialog(this, "Produto não encontrado", "Erro", JOptionPane.ERROR_MESSAGE);
                     jTextFieldCodBarras.setText("");
                 } else {
                 produto = item.remove(0);
                 inputBox.setVisible(true);
                 double quantidade = inputBox.getQuantidade();
                 if (quantidade == 0){
                     jTextFieldCodBarras.setText("");
                 } else {
                 prodVenda.setDescricao(produto.getDescricao());
                 valorProduto = Double.parseDouble(produto.getValor());
                 prodVenda.setValorUnitario(valorProduto);
                 prodVenda.setQuantidade(quantidade);
                 prodVenda.setValorTotal(valorProduto * quantidade);
                 lista.add(prodVenda);
                 
                 String valor = produto.getValor();
                 valor = String.valueOf(Double.parseDouble(valor) * quantidade);
                 produto.setValor(valor);  
                 
                 jTableProdutos.setAutoCreateRowSorter(true);
                 jTableProdutos.setModel(new TableModelListaCompra((ArrayList<ProdutoVenda>) lista));
                 valorFinal = valorFinal + Double.parseDouble(valor);
                 jLabelTotal.setText(String.valueOf(valorFinal));
                 retornoFinal = jLabelTotal.getText().replace(".", ",");
                 jTextFieldCodBarras.setText("");
                 } 
                 }
             } catch (ProdutosException ex) {
                 
             }
             
            
         }
    }//GEN-LAST:event_jTextFieldCodBarrasKeyPressed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
       retornoFinal = "";
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTextFieldCodBarrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodBarrasActionPerformed
     
    }//GEN-LAST:event_jTextFieldCodBarrasActionPerformed

    private void jButtonAdicionarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarVendaActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonAdicionarVendaActionPerformed

    private void jTableProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProdutosMouseClicked
        if (evt.getClickCount() == 2 && !evt.isConsumed()) {   
            int lin = jTableProdutos.getSelectedRow();
            Double valor = (Double)jTableProdutos.getValueAt(lin, 3);
            valorFinal = valorFinal - valor;
            lista.remove(lin);
            jTableProdutos.setModel(new TableModelListaCompra((ArrayList<ProdutoVenda>) lista));
            jLabelTotal.setText(String.valueOf(valorFinal));
           retornoFinal = jLabelTotal.getText().replace(".", ",");
            jTextFieldCodBarras.setText("");       
            
        }
    }//GEN-LAST:event_jTableProdutosMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(jTela_ListaCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new jTela_ListaCompra().setVisible(true);
            }
        });
    }
    
    
    public String getValorFinal(){
        return retornoFinal;
    }
    private void setAcessibilidade() {
        JRootPane meuJPanel = getRootPane();
        meuJPanel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "ESCAPE");
        meuJPanel.getRootPane().getActionMap().put("ESCAPE", new AbstractAction("ESCAPE") {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
       });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionarVenda;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProdutos;
    private javax.swing.JTextField jTextFieldCodBarras;
    // End of variables declaration//GEN-END:variables
}
