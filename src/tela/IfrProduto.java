package tela;

import apoio.Formatacao;
import apoio.Validar;
import dao.ProdutoDAO;
import entidade.Produto;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.Border;

/**
 *
 * @author felip
 */
public class IfrProduto extends javax.swing.JInternalFrame {

    int idProduto = 0;

    Border erro = BorderFactory.createEtchedBorder(Color.red, Color.red);
    Border normal = BorderFactory.createEtchedBorder(null, null);

    /**
     * Creates new form IfrProduto
     */
    public IfrProduto() {
        initComponents();

        setTitle("Produtos");
        new ProdutoDAO().popularTabela(tblProduto, "");

        Formatacao.formatarValor(tffValorProd);
        Formatacao.formatarValor(tffQtdeProd);

        this.getContentPane().setBackground(new Color(245, 255, 250));
        jPanel1.setBackground(new Color(240, 248, 255));
        jPanel2.setBackground(new Color(240, 248, 255));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduto = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        tfdPesquisar = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfdDescricaoProd = new javax.swing.JTextField();
        tffValorProd = new javax.swing.JFormattedTextField();
        tffQtdeProd = new javax.swing.JFormattedTextField();
        btnFechar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        BtnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        tblProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblProduto);

        jLabel3.setText("Busca");

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(tfdPesquisar)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfdPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Listagem", jPanel1);

        jLabel1.setText("Descrição:");

        jLabel2.setText("Valor R$:");

        jLabel4.setText("Quantidade:");

        tfdDescricaoProd.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tfdDescricaoProd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfdDescricaoProdFocusLost(evt);
            }
        });

        tffValorProd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tffValorProdFocusLost(evt);
            }
        });

        tffQtdeProd.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tffQtdeProd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tffQtdeProdFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfdDescricaoProd, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                    .addComponent(tffValorProd)
                    .addComponent(tffQtdeProd))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfdDescricaoProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tffValorProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tffQtdeProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(151, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Cadastro", jPanel2);

        btnFechar.setText("Fechar");
        btnFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFecharMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFecharMouseExited(evt);
            }
        });
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salvar.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        BtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/excluir.png"))); // NOI18N
        BtnExcluir.setText("Excluir");
        BtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExcluirActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
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
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar)
                        .addGap(11, 11, 11)
                        .addComponent(btnSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(btnFechar))
                    .addComponent(jTabbedPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFechar)
                    .addComponent(btnSalvar)
                    .addComponent(BtnExcluir)
                    .addComponent(btnEditar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnFecharMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFecharMouseEntered
        btnFechar.setBackground(new Color(255, 100, 100));
    }//GEN-LAST:event_btnFecharMouseEntered

    private void btnFecharMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFecharMouseExited
        Color corPadrao = UIManager.getColor("Button.background");
        btnFechar.setBackground(corPadrao);
    }//GEN-LAST:event_btnFecharMouseExited

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        new ProdutoDAO().popularTabela(tblProduto, tfdPesquisar.getText());
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        String descricaoProd = tfdDescricaoProd.getText();
        String valorProd = tffValorProd.getText();
        String qtdeProd = tffQtdeProd.getText();

        if (!Validar.validarDescricao(descricaoProd)) {
            JOptionPane.showMessageDialog(this, "Descrição inválida");
            return; // Sai do método sem salvar
        }
        
        if (!Validar.validarNumero(valorProd)) {
            JOptionPane.showMessageDialog(this, "Valor inválido");
            return;
        }

        if (!Validar.validarNumero(qtdeProd)) {
            JOptionPane.showMessageDialog(this, "Quantidade inválida");
            return;
        }

        Produto produto = new Produto();
        produto.setId(idProduto);
        produto.setDescricao(descricaoProd);
        produto.setValor(valorProd);
        produto.setQtde(qtdeProd);

        ProdutoDAO produtoDao = new ProdutoDAO();

        if (idProduto == 0) {
            if (produtoDao.salvar(produto) == null) {
                tfdDescricaoProd.setText("");
                tffValorProd.setText("");
                tffQtdeProd.setText("");

                JOptionPane.showMessageDialog(this, "Registro salvo com sucesso!");
                new ProdutoDAO().popularTabela(tblProduto, "");

                tfdDescricaoProd.requestFocus();

            } else {
                JOptionPane.showMessageDialog(this, "Problemas ao salvar registro!");
            }
        } else {
            if (produtoDao.atualizar(produto) == null) {
                tfdDescricaoProd.setText("");
                tffValorProd.setText("");
                tffQtdeProd.setText("");

                JOptionPane.showMessageDialog(this, "Registro editado com sucesso!");
                new ProdutoDAO().popularTabela(tblProduto, "");

                tfdDescricaoProd.requestFocus();

            } else {
                JOptionPane.showMessageDialog(this, "Problemas ao salvar registro!");
            }
        }

        idProduto = 0;

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        String idTabela = String.valueOf(tblProduto.getValueAt(tblProduto.getSelectedRow(), 0));

        idProduto = Integer.parseInt(idTabela);

        Produto produto = new ProdutoDAO().consultarId(idProduto);

        if (produto != null) {
            jTabbedPane2.setSelectedIndex(1);

            tfdDescricaoProd.setText(produto.getDescricao());
            tffValorProd.setText(produto.getValor());
            tffQtdeProd.setText(produto.getQtde());

            tfdDescricaoProd.requestFocus();

        } else {
            JOptionPane.showMessageDialog(this, "Id do produto não encontrado! ");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void BtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExcluirActionPerformed
        String idTabela = String.valueOf(tblProduto.getValueAt(tblProduto.getSelectedRow(), 0));

        idProduto = Integer.parseInt(idTabela);

        int confirmacao = JOptionPane.showConfirmDialog(this, "Deseja excluir o registro selecionado?", "Confirmação de exclusão", JOptionPane.YES_NO_OPTION);

        if (confirmacao == JOptionPane.YES_OPTION) {
            // Caso o usuário confirme a exclusão
            if (new ProdutoDAO().excluir(idProduto) == null) {
                JOptionPane.showMessageDialog(this, "Registro excluído com sucesso!");

                new ProdutoDAO().popularTabela(tblProduto, "");
            } else {
                JOptionPane.showMessageDialog(this, "Problemas ao excluir registro!");
            }
        }

        idProduto = 0;
    }//GEN-LAST:event_BtnExcluirActionPerformed

    private void tfdDescricaoProdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfdDescricaoProdFocusLost
        if (!Validar.validarDescricao(tfdDescricaoProd.getText())) {
            tfdDescricaoProd.setBorder(erro);
        } else {
            tfdDescricaoProd.setBorder(normal);
        }
    }//GEN-LAST:event_tfdDescricaoProdFocusLost

    private void tffValorProdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tffValorProdFocusLost
        if (!Validar.validarNumero(tffValorProd.getText())) {
            tffValorProd.setBorder(erro);
        } else {
            tffValorProd.setBorder(normal);
        }
    }//GEN-LAST:event_tffValorProdFocusLost

    private void tffQtdeProdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tffQtdeProdFocusLost
        if (!Validar.validarNumero(tffQtdeProd.getText())) {
            tffQtdeProd.setBorder(erro);
        } else {
            tffQtdeProd.setBorder(normal);
        }
    }//GEN-LAST:event_tffQtdeProdFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnExcluir;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable tblProduto;
    private javax.swing.JTextField tfdDescricaoProd;
    private javax.swing.JTextField tfdPesquisar;
    private javax.swing.JFormattedTextField tffQtdeProd;
    private javax.swing.JFormattedTextField tffValorProd;
    // End of variables declaration//GEN-END:variables
}