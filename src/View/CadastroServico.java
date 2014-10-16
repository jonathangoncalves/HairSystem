package View;

import Control.FuncionarioDAL;
import Control.ServicoDAL;
import Entity.Funcionario;
import Entity.Servico;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadastroServico extends javax.swing.JPanel {
    
    Servico itemUpdate;
    
    public CadastroServico() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpCadastroServico = new javax.swing.JPanel();
        lbNomeCadastro = new javax.swing.JLabel();
        tfNomeCadastro = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        lbSiglaCadastro = new javax.swing.JLabel();
        tfSiglaCadastro = new javax.swing.JTextField();
        jpPesquisaServico = new javax.swing.JPanel();
        spServico = new javax.swing.JScrollPane();
        tbServico = new javax.swing.JTable();
        lbNomePesquisa = new javax.swing.JLabel();
        tfNomePesquisa = new javax.swing.JTextField();
        btPesquisar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(680, 366));

        jpCadastroServico.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro / Edição de serviços", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 0))); // NOI18N

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

        lbSiglaCadastro.setText("Sigla");

        tfSiglaCadastro.setDocument(new JTextFieldLimit(4));

        javax.swing.GroupLayout jpCadastroServicoLayout = new javax.swing.GroupLayout(jpCadastroServico);
        jpCadastroServico.setLayout(jpCadastroServicoLayout);
        jpCadastroServicoLayout.setHorizontalGroup(
            jpCadastroServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadastroServicoLayout.createSequentialGroup()
                .addComponent(lbNomeCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNomeCadastro))
            .addGroup(jpCadastroServicoLayout.createSequentialGroup()
                .addGroup(jpCadastroServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCadastroServicoLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(btLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSalvar))
                    .addGroup(jpCadastroServicoLayout.createSequentialGroup()
                        .addComponent(lbSiglaCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfSiglaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpCadastroServicoLayout.setVerticalGroup(
            jpCadastroServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadastroServicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCadastroServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomeCadastro)
                    .addComponent(tfNomeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCadastroServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSiglaCadastro)
                    .addComponent(tfSiglaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpCadastroServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar)
                    .addComponent(btLimpar)
                    .addComponent(btCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpPesquisaServico.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisa Serviço", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 0))); // NOI18N
        jpPesquisaServico.setPreferredSize(new java.awt.Dimension(399, 519));

        tbServico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Sigla"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbServico.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbServico.getTableHeader().setReorderingAllowed(false);
        spServico.setViewportView(tbServico);
        tbServico.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tbServico.getColumnModel().getColumnCount() > 0) {
            tbServico.getColumnModel().getColumn(0).setResizable(false);
            tbServico.getColumnModel().getColumn(1).setResizable(false);
        }

        lbNomePesquisa.setText("Nome");

        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpPesquisaServicoLayout = new javax.swing.GroupLayout(jpPesquisaServico);
        jpPesquisaServico.setLayout(jpPesquisaServicoLayout);
        jpPesquisaServicoLayout.setHorizontalGroup(
            jpPesquisaServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spServico, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jpPesquisaServicoLayout.createSequentialGroup()
                .addComponent(lbNomePesquisa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNomePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btPesquisar)
                .addGap(0, 60, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPesquisaServicoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btAlterar))
        );
        jpPesquisaServicoLayout.setVerticalGroup(
            jpPesquisaServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPesquisaServicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPesquisaServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomePesquisa)
                    .addComponent(tfNomePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spServico, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPesquisaServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAlterar)
                    .addComponent(btExcluir))
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpCadastroServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpPesquisaServico, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpCadastroServico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpPesquisaServico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        String validacao = validarCadastro();
        if(validacao.length() == 0){
            Servico item = new Servico();
            item.setNmServico(tfNomeCadastro.getText().trim());
            item.setNmSigla(tfSiglaCadastro.getText().trim().toUpperCase());
            
            if(itemUpdate != null){
                item.setIdServico(this.itemUpdate.getIdServico());
                
                new ServicoDAL().update(item);
            }else{
                new ServicoDAL().add(item);
            }
            
            itemUpdate = null;
            
            limparCadastro();
            
            btLimpar.setEnabled(true);
            btCancelar.setEnabled(false);
            btPesquisarActionPerformed(evt);
            
            JOptionPane.showMessageDialog(null, "Dados salvo com sucesso", "Salvo", JOptionPane.PLAIN_MESSAGE);
        }
        else
            JOptionPane.showMessageDialog(null, validacao, "Campos inválidos", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        String validacao = validarPesquisa();
        if(validacao.length() == 0){
            String col[] = {"ID", "Nome", "Sigla"};

            DefaultTableModel tableModel = new DefaultTableModel(col, 0) {
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            
            ArrayList<Servico> lstServico = new ServicoDAL().getList(new Servico(tfNomePesquisa.getText().trim()));

            for (int i = 0; i < lstServico.size(); i++) {
                Object[] data = {lstServico.get(i).getIdServico(), lstServico.get(i).getNmServico(), lstServico.get(i).getNmSigla()};

                tableModel.addRow(data);
            }
            
            tbServico.setModel(tableModel);
            
            tbServico.getColumnModel().getColumn(0).setMinWidth(0);
            tbServico.getColumnModel().getColumn(0).setMaxWidth(0);
            tbServico.getColumnModel().getColumn(0).setWidth(0);
        }else
            JOptionPane.showMessageDialog(null, validacao, "Campos inválidos", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limparCadastro();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.itemUpdate = null;
        
        limparCadastro();

        btLimpar.setEnabled(true);
        btCancelar.setEnabled(false);
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        if(tbServico.getSelectedRow() >= 0){
            int idServico = Integer.parseInt(tbServico.getValueAt(tbServico.getSelectedRow(), 0).toString());
            carregarCadastro(new ServicoDAL().getItem(idServico));

            btLimpar.setEnabled(false);
            btCancelar.setEnabled(true);
        }else{
            JOptionPane.showMessageDialog(null, "Nenhuma linha selecionada", "Linha", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        if(tbServico.getSelectedRow() >= 0){
            Object[] options = { "Sim", "Não" };  
            int opt = JOptionPane.showOptionDialog(null,  
                "Você deseja excluir este serviço? ",  
                "Serviço", JOptionPane.YES_NO_OPTION,  
                JOptionPane.QUESTION_MESSAGE, null, options, options[0]);  
            
            if(opt == 0){
                int idServico = Integer.parseInt(tbServico.getValueAt(tbServico.getSelectedRow(), 0).toString());
                
                Boolean permitirExclusao = true;
                ArrayList<Funcionario> lstFuncionario = new FuncionarioDAL().getList();
                for (Funcionario item : lstFuncionario) {
                    for (Servico itemServico : item.getLstServico()) {    
                        if(itemServico.getIdServico() == idServico)
                            permitirExclusao = false;
                    }
                }
                
                if(permitirExclusao){
                    new ServicoDAL().remove(idServico);

                    btPesquisarActionPerformed(evt);
                    btCancelarActionPerformed(evt);
                }else{
                    JOptionPane.showMessageDialog(null, "Não foi possível a exclusão pois há vínculo com funcionários", "Serviço", JOptionPane.ERROR_MESSAGE);
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Nenhuma linha selecionada", "Linha", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void carregarCadastro(Servico item){
        this.itemUpdate = item;
        
        tfSiglaCadastro.setText(item.getNmSigla());
        tfNomeCadastro.setText(item.getNmServico());
    }
    
    private void limparCadastro(){
        tfNomeCadastro.setText("");
        tfSiglaCadastro.setText("");
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
        
        p = Pattern.compile("^[a-zA-Z]{1,4}$");
        m = p.matcher(tfSiglaCadastro.getText().trim());
        
        if(!m.find()){
            stValidacao += "Preencha corretamente o campo Sigla\n";
        }
        
        Servico itemSearch = new Servico();
        itemSearch.setNmSigla(tfSiglaCadastro.getText().trim());
        
         ;
        if(new ServicoDAL().getList(itemSearch).size() > 0 && 
                (
                    (itemUpdate != null && !itemUpdate.getNmSigla().equalsIgnoreCase(itemSearch.getNmSigla())) ||
                    (itemUpdate == null)
                )){
            stValidacao += "Já existe um item com essa Sigla. Favor preencha com outra sigla\n";
        }
        
        return stValidacao;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JPanel jpCadastroServico;
    private javax.swing.JPanel jpPesquisaServico;
    private javax.swing.JLabel lbNomeCadastro;
    private javax.swing.JLabel lbNomePesquisa;
    private javax.swing.JLabel lbSiglaCadastro;
    private javax.swing.JScrollPane spServico;
    private javax.swing.JTable tbServico;
    private javax.swing.JTextField tfNomeCadastro;
    private javax.swing.JTextField tfNomePesquisa;
    private javax.swing.JTextField tfSiglaCadastro;
    // End of variables declaration//GEN-END:variables
}
