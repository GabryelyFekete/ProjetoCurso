/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.view;

import br.com.projeto.dao.LivrosDAO;
import br.com.projeto.model.Livros;
import br.com.projeto.model.Utilitarios;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author predu
 */
public class JFrmLivro extends javax.swing.JFrame {

    /**
     * Creates new form JFrmCliente
     */
    public JFrmLivro() {
        initComponents();
    }
    
    public void listar(){
        LivrosDAO dao = new LivrosDAO();
        
        List<Livros> lista = dao.listarLivros();
        DefaultTableModel dados = (DefaultTableModel) tbLivros.getModel();
        dados.setNumRows(0);
        
        for (Livros livros : lista) {
            dados.addRow(new Object[]{
                livros.getId(),
                livros.getTitulodaobra(),
                livros.getAutor(),
                livros.getEditora(),
                livros.getColecao(),
                livros.getNumerodepaginas(),
                livros.getNota(),
                livros.getRecomendacao(),
                livros.getRecomendaria(),
                livros.getGenero(),
                livros.getFilme(),              
                livros.getPersonagemfavorito(),
            });
        }
        
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
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPDadosObra = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtRecomendacao = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtRecomendaria = new javax.swing.JTextField();
        txtEditora = new javax.swing.JTextField();
        txtNumPaginas = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtColecao = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtGenero = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtFilme = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtPersonagemFavorito = new javax.swing.JTextField();
        txtNota = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtNomeTabela = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbLivros = new javax.swing.JTable();
        btnPesquisarTabela = new javax.swing.JToggleButton();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(225, 225, 250));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("My Book List");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPDadosObra.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Cod:");

        txtId.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Titulo da obra:");

        txtTitulo.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Autor(a):");

        txtAutor.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAutorActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Editora:");

        btnPesquisar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Nº de páginas:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Nota:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Recomendação:");

        txtRecomendacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRecomendacaoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Recomendaria?");

        txtRecomendaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRecomendariaActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel17.setText("Coleção:");

        txtColecao.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtColecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColecaoActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel18.setText("Gênero:");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel19.setText("Filme:");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Personagem favorito:");

        javax.swing.GroupLayout jPDadosObraLayout = new javax.swing.GroupLayout(jPDadosObra);
        jPDadosObra.setLayout(jPDadosObraLayout);
        jPDadosObraLayout.setHorizontalGroup(
            jPDadosObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDadosObraLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPDadosObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDadosObraLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(txtPersonagemFavorito, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPDadosObraLayout.createSequentialGroup()
                        .addGroup(jPDadosObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPDadosObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPDadosObraLayout.createSequentialGroup()
                                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPesquisar))
                            .addGroup(jPDadosObraLayout.createSequentialGroup()
                                .addComponent(txtEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txtRecomendacao, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txtRecomendaria, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPDadosObraLayout.createSequentialGroup()
                                .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtNumPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(txtColecao, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPDadosObraLayout.createSequentialGroup()
                                .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)
                                .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel19)
                                .addGap(18, 18, 18)
                                .addComponent(txtFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        jPDadosObraLayout.setVerticalGroup(
            jPDadosObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDadosObraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDadosObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDadosObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btnPesquisar))
                .addGap(7, 7, 7)
                .addGroup(jPDadosObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(txtRecomendacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtRecomendaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDadosObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(txtNumPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txtColecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDadosObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDadosObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel18)
                        .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19)
                        .addComponent(txtFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDadosObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtPersonagemFavorito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dados da obra", jPDadosObra);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel16.setText("Nome:");

        txtNomeTabela.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtNomeTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeTabelaActionPerformed(evt);
            }
        });
        txtNomeTabela.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeTabelaKeyPressed(evt);
            }
        });

        tbLivros.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tbLivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Titulo da obra", "Editora", "Recomendação", "Recomendaria", "Autor (a)", "Nº de páginas", "Coleção", "Nota", "Gênero", "Filme", "Inicio da leitura", "Fim da leitura", "Personagem favorito"
            }
        ));
        tbLivros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbLivrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbLivros);

        btnPesquisarTabela.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnPesquisarTabela.setText("Pesquisar");
        btnPesquisarTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarTabelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNomeTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPesquisarTabela)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 921, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(btnPesquisarTabela))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consulta de livro", jPanel3);

        btnNovo.setText("+(Novo)");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(262, 262, 262))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcluir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Livros liv = new Livros();
        
        liv.setTitulodaobra(txtTitulo.getText());
        liv.setAutor(txtAutor.getText());
        liv.setEditora(txtEditora.getText());
        liv.setColecao(txtColecao.getText());
        liv.setNumerodepaginas(Integer.parseInt(txtNumPaginas.getText()));
        liv.setNota(Integer.parseInt(txtNota.getText()));
        liv.setRecomendacao(txtRecomendacao.getText());
        liv.setRecomendaria(txtRecomendaria.getText());
        liv.setGenero(txtGenero.getText());
        liv.setFilme(txtFilme.getText());
        liv.setPersonagemfavorito(txtPersonagemFavorito.getText());
        
        LivrosDAO dao = new LivrosDAO();
        dao.cadastrarLivros(liv);
        
        new Utilitarios().limpaTela(jPDadosObra);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        listar();
    }//GEN-LAST:event_formWindowActivated

    private void tbLivrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbLivrosMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);
        txtId.setText(tbLivros.getValueAt(tbLivros.getSelectedRow(), 0).toString());
        txtTitulo.setText(tbLivros.getValueAt(tbLivros.getSelectedRow(), 1).toString());
        txtAutor.setText(tbLivros.getValueAt(tbLivros.getSelectedRow(), 2).toString());
        txtEditora.setText(tbLivros.getValueAt(tbLivros.getSelectedRow(), 3).toString());
        txtColecao.setText(tbLivros.getValueAt(tbLivros.getSelectedRow(), 4).toString());
        txtNumPaginas.setText(tbLivros.getValueAt(tbLivros.getSelectedRow(), 5).toString());
        txtNota.setText(tbLivros.getValueAt(tbLivros.getSelectedRow(), 6).toString());
        txtRecomendacao.setText(tbLivros.getValueAt(tbLivros.getSelectedRow(), 7).toString());
        txtRecomendaria.setText(tbLivros.getValueAt(tbLivros.getSelectedRow(), 8).toString());
        txtGenero.setText(tbLivros.getValueAt(tbLivros.getSelectedRow(), 9).toString());
        txtFilme.setText(tbLivros.getValueAt(tbLivros.getSelectedRow(), 10).toString());
       txtPersonagemFavorito.setText(tbLivros.getValueAt(tbLivros.getSelectedRow(), 13).toString());
    }//GEN-LAST:event_tbLivrosMouseClicked

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        Livros liv = new Livros();
        liv.setId(Integer.parseInt(txtId.getText()));
        
        LivrosDAO dao = new LivrosDAO();
        dao.excluirLivro(liv);
        
        new Utilitarios().limpaTela(jPDadosObra);
       
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        Livros liv = new Livros();
        
        liv.setTitulodaobra(txtTitulo.getText());
        liv.setAutor(txtAutor.getText());
        liv.setEditora(txtEditora.getText());
        liv.setColecao(txtColecao.getText());
        liv.setNumerodepaginas(Integer.parseInt(txtNumPaginas.getText()));
        liv.setNota(Integer.parseInt(txtNota.getText()));
        liv.setRecomendacao(txtRecomendacao.getText());
        liv.setRecomendaria(txtRecomendaria.getText());
        liv.setGenero(txtGenero.getText());
        liv.setFilme(txtFilme.getText());
        liv.setPersonagemfavorito(txtPersonagemFavorito.getText());
        
        liv.setId(Integer.parseInt(txtId.getText()));
        
        LivrosDAO dao = new LivrosDAO();
        dao.alterarLivro(liv);
        
        new Utilitarios().limpaTela(jPDadosObra);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
        new Utilitarios().limpaTela(jPDadosObra);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void txtNomeTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeTabelaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeTabelaActionPerformed

    private void btnPesquisarTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarTabelaActionPerformed
        // TODO add your handling code here:
        String nome = txtNomeTabela.getText();
        
        LivrosDAO dao = new LivrosDAO();
        
        List<Livros>lista = dao.consultaPorNome(nome);
        DefaultTableModel dados = (DefaultTableModel)tbLivros.getModel();
        dados.setNumRows(0);
        
        for (Livros livros : lista) {
            dados.addRow(new Object[]{
                livros.getId(),
                livros.getTitulodaobra(),
                livros.getAutor(),
                livros.getEditora(),
                livros.getColecao(),
                livros.getNumerodepaginas(),
                livros.getNota(),
                livros.getRecomendacao(),
                livros.getRecomendaria(),
                livros.getGenero(),
                livros.getFilme(),
                livros.getPersonagemfavorito()
            });
        }
    }//GEN-LAST:event_btnPesquisarTabelaActionPerformed

    private void txtNomeTabelaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeTabelaKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtNomeTabelaKeyPressed

    private void txtRecomendariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRecomendariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRecomendariaActionPerformed

    private void txtRecomendacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRecomendacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRecomendacaoActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void txtAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAutorActionPerformed

    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtColecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColecaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColecaoActionPerformed

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
            java.util.logging.Logger.getLogger(JFrmLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new JFrmLivro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JToggleButton btnPesquisar;
    private javax.swing.JToggleButton btnPesquisarTabela;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPDadosObra;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbLivros;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtColecao;
    private javax.swing.JTextField txtEditora;
    private javax.swing.JTextField txtFilme;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNomeTabela;
    private javax.swing.JTextField txtNota;
    private javax.swing.JTextField txtNumPaginas;
    private javax.swing.JTextField txtPersonagemFavorito;
    private javax.swing.JTextField txtRecomendacao;
    private javax.swing.JTextField txtRecomendaria;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}