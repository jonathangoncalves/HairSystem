package View;

import Others.Lista;
import Control.ClienteDAL;
import Entity.Cliente;
//import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadastroCliente extends javax.swing.JPanel {

    private Cliente itemUpdate;
        
    public CadastroCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgSexo = new javax.swing.ButtonGroup();
        jpCadastroCliente = new javax.swing.JPanel();
        lbNomeCadastro = new javax.swing.JLabel();
        tfNomeCadastro = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        lbEnderecoCadastro = new javax.swing.JLabel();
        tfEnderecoCadastro = new javax.swing.JTextField();
        tfNumeroCadastro = new javax.swing.JTextField();
        lbNumeroCadastro = new javax.swing.JLabel();
        lbCEPCadastro = new javax.swing.JLabel();
        lbCidadeCadastro = new javax.swing.JLabel();
        tfCidadeCadastro = new javax.swing.JTextField();
        lbUFCadastro = new javax.swing.JLabel();
        tfUFCadastro = new javax.swing.JTextField();
        lbTelefoneCadastro = new javax.swing.JLabel();
        lbCelularCadastro = new javax.swing.JLabel();
        lbEmailCadastro = new javax.swing.JLabel();
        tfEmailCadastro = new javax.swing.JTextField();
        lbSexoCadastro = new javax.swing.JLabel();
        rbMasculinoCadastro = new javax.swing.JRadioButton();
        rbFemininoCadastro = new javax.swing.JRadioButton();
        tfCEPCadastro = new javax.swing.JFormattedTextField();
        tfCelularCadastro = new javax.swing.JFormattedTextField();
        tfTelefoneCadastro = new javax.swing.JFormattedTextField();
        jpPesquisaCliente = new javax.swing.JPanel();
        spCliente = new javax.swing.JScrollPane();
        tbCliente = new javax.swing.JTable();
        btExcluir = new javax.swing.JButton();
        lbNomePesquisa = new javax.swing.JLabel();
        btAlterar = new javax.swing.JButton();
        btPesquisar = new javax.swing.JButton();
        tfNomePesquisa = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(680, 366));

        jpCadastroCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro / Edição de cliente", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 0))); // NOI18N

        lbNomeCadastro.setText("Nome");

        tfNomeCadastro.setDocument(new JTextFieldLimit(40));

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.setEnabled(false);
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        lbEnderecoCadastro.setText("Endereço");

        tfEnderecoCadastro.setDocument(new JTextFieldLimit(40));

        tfNumeroCadastro.setDocument(new JTextFieldLimit(6));

        lbNumeroCadastro.setText("Nº");

        lbCEPCadastro.setText("CEP");

        lbCidadeCadastro.setText("Cidade");

        tfCidadeCadastro.setDocument(new JTextFieldLimit(40));

        lbUFCadastro.setText("UF");

        tfUFCadastro.setDocument(new JTextFieldLimit(2));

        lbTelefoneCadastro.setText("Telefone");

        lbCelularCadastro.setText("Celular");

        lbEmailCadastro.setText("Email");

        tfEmailCadastro.setDocument(new JTextFieldLimit(40));

        lbSexoCadastro.setText("Sexo");

        bgSexo.add(rbMasculinoCadastro);
        rbMasculinoCadastro.setSelected(true);
        rbMasculinoCadastro.setText("Masculino");

        bgSexo.add(rbFemininoCadastro);
        rbFemininoCadastro.setText("Feminino");

        try {
            tfCEPCadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfCEPCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCEPCadastroActionPerformed(evt);
            }
        });

        try {
            tfCelularCadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfCelularCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCelularCadastroActionPerformed(evt);
            }
        });

        try {
            tfTelefoneCadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfTelefoneCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTelefoneCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpCadastroClienteLayout = new javax.swing.GroupLayout(jpCadastroCliente);
        jpCadastroCliente.setLayout(jpCadastroClienteLayout);
        jpCadastroClienteLayout.setHorizontalGroup(
            jpCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jpCadastroClienteLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSalvar))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpCadastroClienteLayout.createSequentialGroup()
                .addGroup(jpCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpCadastroClienteLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lbEmailCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfEmailCadastro))
                    .addGroup(jpCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jpCadastroClienteLayout.createSequentialGroup()
                            .addComponent(lbCidadeCadastro)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tfCidadeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpCadastroClienteLayout.createSequentialGroup()
                            .addComponent(lbNomeCadastro)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tfNomeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jpCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpCadastroClienteLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(lbUFCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfUFCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbTelefoneCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfTelefoneCadastro))
                    .addGroup(jpCadastroClienteLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbEnderecoCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfEnderecoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpCadastroClienteLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lbSexoCadastro)
                        .addGap(4, 4, 4)
                        .addComponent(rbMasculinoCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbFemininoCadastro)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCadastroClienteLayout.createSequentialGroup()
                        .addComponent(lbCelularCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCelularCadastro))
                    .addGroup(jpCadastroClienteLayout.createSequentialGroup()
                        .addComponent(lbNumeroCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNumeroCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbCEPCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCEPCadastro))))
        );
        jpCadastroClienteLayout.setVerticalGroup(
            jpCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadastroClienteLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jpCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomeCadastro)
                    .addComponent(tfNomeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEnderecoCadastro)
                    .addComponent(tfEnderecoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNumeroCadastro)
                    .addComponent(tfNumeroCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCEPCadastro)
                    .addComponent(tfCEPCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCidadeCadastro)
                    .addComponent(tfCidadeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbUFCadastro)
                    .addComponent(tfUFCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTelefoneCadastro)
                    .addComponent(lbCelularCadastro)
                    .addComponent(tfCelularCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTelefoneCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbSexoCadastro)
                        .addComponent(rbFemininoCadastro)
                        .addComponent(rbMasculinoCadastro))
                    .addGroup(jpCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbEmailCadastro)
                        .addComponent(tfEmailCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar)
                    .addComponent(btCancelar)
                    .addComponent(btLimpar)))
        );

        jpPesquisaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisa Cliente", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 0))); // NOI18N
        jpPesquisaCliente.setPreferredSize(new java.awt.Dimension(399, 519));

        tbCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Endereço", "Celular", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbCliente.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbCliente.getTableHeader().setReorderingAllowed(false);
        spCliente.setViewportView(tbCliente);
        tbCliente.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tbCliente.getColumnModel().getColumnCount() > 0) {
            tbCliente.getColumnModel().getColumn(0).setResizable(false);
            tbCliente.getColumnModel().getColumn(1).setResizable(false);
            tbCliente.getColumnModel().getColumn(2).setResizable(false);
            tbCliente.getColumnModel().getColumn(3).setResizable(false);
            tbCliente.getColumnModel().getColumn(4).setResizable(false);
        }

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        lbNomePesquisa.setText("Nome");

        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        tfNomePesquisa.setDocument(new JTextFieldLimit(40));

        javax.swing.GroupLayout jpPesquisaClienteLayout = new javax.swing.GroupLayout(jpPesquisaCliente);
        jpPesquisaCliente.setLayout(jpPesquisaClienteLayout);
        jpPesquisaClienteLayout.setHorizontalGroup(
            jpPesquisaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
            .addGroup(jpPesquisaClienteLayout.createSequentialGroup()
                .addComponent(lbNomePesquisa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNomePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btPesquisar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpPesquisaClienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btAlterar))
        );
        jpPesquisaClienteLayout.setVerticalGroup(
            jpPesquisaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPesquisaClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPesquisaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomePesquisa)
                    .addComponent(tfNomePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPesquisaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btExcluir)
                    .addComponent(btAlterar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPesquisaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
            .addComponent(jpCadastroCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        String validacao = validarCadastro();
        if(validacao.length() == 0){
            Cliente item = new Cliente();
            item.setNmCliente(tfNomeCadastro.getText());
            item.setStCEP(tfCEPCadastro.getText());
            item.setStCelular(tfCelularCadastro.getText());
            item.setStCidade(tfCidadeCadastro.getText());
            item.setStEmail(tfEmailCadastro.getText());
            item.setStEndereco(tfEnderecoCadastro.getText());
            item.setStUF(tfUFCadastro.getText());
            item.setStNumero(tfNumeroCadastro.getText());
            item.setStTelefone(tfTelefoneCadastro.getText());
            if(rbMasculinoCadastro.isSelected())
                item.setItSexo(Cliente.MASCULINO);
            else
                item.setItSexo(Cliente.FEMININO);
            
            if(itemUpdate != null){
                item.setIdCliente(this.itemUpdate.getIdCliente());
                
                new ClienteDAL().update(item);
            }else{
                new ClienteDAL().add(item);
            }
            
            itemUpdate = null;
            
            limparCadastro();
            
            btLimpar.setEnabled(true);
            btCancelar.setEnabled(false);
            
            btPesquisarActionPerformed(evt);
            
            JOptionPane.showMessageDialog(null, "Dados salvo com sucesso", "Salvo", JOptionPane.PLAIN_MESSAGE);
            
        }else{
            JOptionPane.showMessageDialog(null, validacao, "Campos inválidos", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        String validacao = validarPesquisa();
        if(validacao.length() == 0){
            String col[] = {"ID", "Nome", "Endereço", "Celular", "Telefone"};

            DefaultTableModel tableModel = new DefaultTableModel(col, 0) {
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            
            Lista<Cliente> lstCliente = new ClienteDAL().getList(new Cliente(tfNomePesquisa.getText().trim()));

            for (int i = 0; i < lstCliente.size(); i++) {
                Cliente item = lstCliente.get(i);
                Object[] data = {item.getIdCliente(), item.getNmCliente(), item.getStEndereco(), item.getStCelular(), item.getStTelefone()};

                tableModel.addRow(data);
            }
            
            tbCliente.setModel(tableModel);
            
            tbCliente.getColumnModel().getColumn(0).setMinWidth(0);
            tbCliente.getColumnModel().getColumn(0).setMaxWidth(0);
            tbCliente.getColumnModel().getColumn(0).setWidth(0);
        }else
            JOptionPane.showMessageDialog(null, validacao, "Campos inválidos", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        if(tbCliente.getSelectedRow() >= 0){
            Object[] options = { "Sim", "Não" };  
            int opt = JOptionPane.showOptionDialog(null,  
                "Você deseja excluir este cliente? ",  
                "Cliente", JOptionPane.YES_NO_OPTION,  
                JOptionPane.QUESTION_MESSAGE, null, options, options[0]);  
            
            if(opt == 0){
                int idCliente = Integer.parseInt(tbCliente.getValueAt(tbCliente.getSelectedRow(), 0).toString());
                new ClienteDAL().remove(idCliente);
                
                btPesquisarActionPerformed(evt);
                btCancelarActionPerformed(evt);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Nenhuma linha selecionada", "Linha", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.itemUpdate = null;
        
        limparCadastro();

        btLimpar.setEnabled(true);
        btCancelar.setEnabled(false);
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        if(tbCliente.getSelectedRow() >= 0){
            int idCliente = Integer.parseInt(tbCliente.getValueAt(tbCliente.getSelectedRow(), 0).toString());
            carregarCadastro(new ClienteDAL().getItem(idCliente));

            btLimpar.setEnabled(false);
            btCancelar.setEnabled(true);
        }else{
            JOptionPane.showMessageDialog(null, "Nenhuma linha selecionada", "Linha", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limparCadastro();
    }//GEN-LAST:event_btLimparActionPerformed

    private void tfCEPCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCEPCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCEPCadastroActionPerformed

    private void tfCelularCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCelularCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCelularCadastroActionPerformed

    private void tfTelefoneCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTelefoneCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTelefoneCadastroActionPerformed
    
    private void carregarCadastro(Cliente item){
        this.itemUpdate = item;
        
        tfNomeCadastro.setText(item.getNmCliente());
        tfCEPCadastro.setText(item.getStCEP());
        tfCelularCadastro.setText(item.getStCelular());
        tfCidadeCadastro.setText(item.getStCidade());
        tfEmailCadastro.setText(item.getStEmail());
        tfEnderecoCadastro.setText(item.getStEndereco());
        tfUFCadastro.setText(item.getStUF());
        tfNumeroCadastro.setText(item.getStNumero());
        tfTelefoneCadastro.setText(item.getStTelefone());
        if(item.getItSexo() == Cliente.MASCULINO)
            rbMasculinoCadastro.setSelected(true);
        else
            rbFemininoCadastro.setSelected(true);
    }
    
    public void limparCadastro(){
        tfNomeCadastro.setText("");
        tfCEPCadastro.setText("");
        tfCelularCadastro.setText("");
        tfCidadeCadastro.setText("");
        tfEmailCadastro.setText("");
        tfEnderecoCadastro.setText("");
        tfUFCadastro.setText("");
        tfNumeroCadastro.setText("");
        tfTelefoneCadastro.setText("");
        rbMasculinoCadastro.setSelected(true);
    }
    
    private String validarPesquisa(){
        String stValidacao = "";
        
        Pattern p;
        Matcher m;
                
        p = Pattern.compile("^[a-zA-ZáéíóúàâêôãõüçÁÉÍÓÚÀÂÊÔÃÕÜÇ ]+$");
        m = p.matcher(tfNomePesquisa.getText().trim());
        
        if(!m.find() && tfNomePesquisa.getText().trim().length() > 0){
            stValidacao += "Preencha corretamente o campo Nome\n";
        }
        
        return stValidacao;
    }
    
    private String validarCadastro(){
        String stValidacao = "";
        
        Pattern p;
        Matcher m;
                
        p = Pattern.compile("^[a-zA-ZáéíóúàâêôãõüçÁÉÍÓÚÀÂÊÔÃÕÜÇ ]+$");
        m = p.matcher(tfNomeCadastro.getText().trim());
        
        if(!m.find()){
            stValidacao += "Preencha corretamente o campo Nome\n";
        }

        p = Pattern.compile("^[a-zA-ZáéíóúàâêôãõüçÁÉÍÓÚÀÂÊÔÃÕÜÇ. ]+$");
        m = p.matcher(tfEnderecoCadastro.getText().trim());
        
        if(!m.find()){
            stValidacao += "Preencha corretamente o campo Endereço\n";
        }
        
        p = Pattern.compile("^[0-9]{5}-[0-9]{3}$");
        m = p.matcher(tfCEPCadastro.getText().trim());
        
        if(!m.find()){
            stValidacao += "Preencha corretamente o campo CEP\n";
        }
        
        p = Pattern.compile("^\\([0-9]{3}\\)[0-9]{5}\\-[0-9]{4}$");
        m = p.matcher(tfCelularCadastro.getText().trim());
        
        if(!m.find()){
            stValidacao += "Preencha corretamente o campo Celular\n";
        }
        
        p = Pattern.compile("^\\([0-9]{3}\\)[0-9]{4}\\-[0-9]{4}$");
        m = p.matcher(tfTelefoneCadastro.getText().trim());
        
        if(!m.find()){
            stValidacao += "Preencha corretamente o campo Telefone\n";
        }
        
        p = Pattern.compile("^[a-zA-Z]+$");
        m = p.matcher(tfUFCadastro.getText().trim());
        
        if(!m.find()){
            stValidacao += "Preencha corretamente o campo UF\n";
        }

        p = Pattern.compile("^[a-zA-ZáéíóúàâêôãõüçÁÉÍÓÚÀÂÊÔÃÕÜÇ ]+$");
        m = p.matcher(tfCidadeCadastro.getText().trim());
        
        if(!m.find()){
            stValidacao += "Preencha corretamente o campo Cidade\n";
        }
        
        p = Pattern.compile("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$");
        m = p.matcher(tfEmailCadastro.getText().trim());
        
        if(!m.find()){
            stValidacao += "Preencha corretamente o campo E-mail\n";
        }

        p = Pattern.compile("^[a-zA-Z0-9]+$");
        m = p.matcher(tfNumeroCadastro.getText().trim());
        
        if(!m.find()){
            stValidacao += "Preencha corretamente o campo Número\n";
        }
        
        return stValidacao;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgSexo;
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JPanel jpCadastroCliente;
    private javax.swing.JPanel jpPesquisaCliente;
    private javax.swing.JLabel lbCEPCadastro;
    private javax.swing.JLabel lbCelularCadastro;
    private javax.swing.JLabel lbCidadeCadastro;
    private javax.swing.JLabel lbEmailCadastro;
    private javax.swing.JLabel lbEnderecoCadastro;
    private javax.swing.JLabel lbNomeCadastro;
    private javax.swing.JLabel lbNomePesquisa;
    private javax.swing.JLabel lbNumeroCadastro;
    private javax.swing.JLabel lbSexoCadastro;
    private javax.swing.JLabel lbTelefoneCadastro;
    private javax.swing.JLabel lbUFCadastro;
    private javax.swing.JRadioButton rbFemininoCadastro;
    private javax.swing.JRadioButton rbMasculinoCadastro;
    private javax.swing.JScrollPane spCliente;
    private javax.swing.JTable tbCliente;
    private javax.swing.JFormattedTextField tfCEPCadastro;
    private javax.swing.JFormattedTextField tfCelularCadastro;
    private javax.swing.JTextField tfCidadeCadastro;
    private javax.swing.JTextField tfEmailCadastro;
    private javax.swing.JTextField tfEnderecoCadastro;
    private javax.swing.JTextField tfNomeCadastro;
    private javax.swing.JTextField tfNomePesquisa;
    private javax.swing.JTextField tfNumeroCadastro;
    private javax.swing.JFormattedTextField tfTelefoneCadastro;
    private javax.swing.JTextField tfUFCadastro;
    // End of variables declaration//GEN-END:variables
}
