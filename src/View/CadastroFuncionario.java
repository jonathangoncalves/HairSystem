package View;

import Control.FuncionarioDAL;
import Control.ServicoDAL;
import Entity.Servico;
import Entity.CargaHoraria;
import Entity.Dia;
import Entity.Funcionario;
import Entity.Horario;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadastroFuncionario extends javax.swing.JPanel {

    private Funcionario itemUpdate;
    private ArrayList<CargaHoraria> lstCargaHoraria;
    
    public CadastroFuncionario() {
        initComponents();
        
        lstCargaHoraria = new ArrayList<CargaHoraria>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpCadastroFuncionario = new javax.swing.JPanel();
        lbNomeCadastro = new javax.swing.JLabel();
        tfNomeCadastro = new javax.swing.JTextField();
        spServicoPrestado = new javax.swing.JScrollPane();
        ltServicoPrestado = new javax.swing.JList();
        lbServicoPrestado = new javax.swing.JLabel();
        lbCargaHoraria = new javax.swing.JPanel();
        lbDiaCadastro = new javax.swing.JLabel();
        cbSegunda = new javax.swing.JCheckBox();
        cbTerca = new javax.swing.JCheckBox();
        cbQuarta = new javax.swing.JCheckBox();
        cbQuinta = new javax.swing.JCheckBox();
        cbSabado = new javax.swing.JCheckBox();
        cbDomingo = new javax.swing.JCheckBox();
        cbSexta = new javax.swing.JCheckBox();
        lbHorarioCadastro = new javax.swing.JLabel();
        lbHorarioInicio = new javax.swing.JLabel();
        cbHoraInicio = new javax.swing.JComboBox();
        cbMinutoInicio = new javax.swing.JComboBox();
        lbHorarioPontoInicio = new javax.swing.JLabel();
        cbMinutoFim = new javax.swing.JComboBox();
        lbHorarioPontoFim = new javax.swing.JLabel();
        cbHoraFim = new javax.swing.JComboBox();
        lbHorarioFim = new javax.swing.JLabel();
        btAdicionarCarga = new javax.swing.JButton();
        jpCargaHoraria = new javax.swing.JScrollPane();
        tbCargaHoraria = new javax.swing.JTable();
        btExcluirCargaHoraria = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jpPesquisaFuncionario = new javax.swing.JPanel();
        spFuncionario = new javax.swing.JScrollPane();
        tbFuncionario = new javax.swing.JTable();
        lbNomePesquisa = new javax.swing.JLabel();
        tfNomePesquisa = new javax.swing.JTextField();
        btPesquisar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(680, 366));

        jpCadastroFuncionario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro / Edição de funcionários", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 0))); // NOI18N

        lbNomeCadastro.setText("Nome");

        tfNomeCadastro.setDocument(new JTextFieldLimit(40));

        spServicoPrestado.setViewportView(ltServicoPrestado);

        lbServicoPrestado.setText("Serviço prestado");

        lbCargaHoraria.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Carga Horária", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 0))); // NOI18N

        lbDiaCadastro.setText("Dias");

        cbSegunda.setText("Segunda");

        cbTerca.setText("Terça");

        cbQuarta.setText("Quarta");

        cbQuinta.setText("Quinta");

        cbSabado.setText("Sábado");

        cbDomingo.setText("Domingo");

        cbSexta.setText("Sexta");

        lbHorarioCadastro.setText("Horário");

        lbHorarioInicio.setText("Inicio");

        cbHoraInicio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        cbMinutoInicio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "15", "30", "45" }));

        lbHorarioPontoInicio.setText(":");

        cbMinutoFim.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "15", "30", "45" }));

        lbHorarioPontoFim.setText(":");

        cbHoraFim.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        lbHorarioFim.setText("Fim");

        btAdicionarCarga.setText("Adicionar");
        btAdicionarCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarCargaActionPerformed(evt);
            }
        });

        tbCargaHoraria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dias", "Inicio", "Fim"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbCargaHoraria.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbCargaHoraria.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbCargaHoraria.getTableHeader().setResizingAllowed(false);
        tbCargaHoraria.getTableHeader().setReorderingAllowed(false);
        jpCargaHoraria.setViewportView(tbCargaHoraria);
        if (tbCargaHoraria.getColumnModel().getColumnCount() > 0) {
            tbCargaHoraria.getColumnModel().getColumn(0).setResizable(false);
            tbCargaHoraria.getColumnModel().getColumn(1).setResizable(false);
            tbCargaHoraria.getColumnModel().getColumn(2).setResizable(false);
        }

        btExcluirCargaHoraria.setText("Excluir");
        btExcluirCargaHoraria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirCargaHorariaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lbCargaHorariaLayout = new javax.swing.GroupLayout(lbCargaHoraria);
        lbCargaHoraria.setLayout(lbCargaHorariaLayout);
        lbCargaHorariaLayout.setHorizontalGroup(
            lbCargaHorariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lbCargaHorariaLayout.createSequentialGroup()
                .addComponent(lbHorarioInicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbHorarioPontoInicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbMinutoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbHorarioFim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbHoraFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbHorarioPontoFim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbMinutoFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(lbCargaHorariaLayout.createSequentialGroup()
                .addGroup(lbCargaHorariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDiaCadastro)
                    .addComponent(lbHorarioCadastro)
                    .addGroup(lbCargaHorariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btAdicionarCarga)
                        .addGroup(lbCargaHorariaLayout.createSequentialGroup()
                            .addGroup(lbCargaHorariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbSegunda)
                                .addComponent(cbSexta))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(lbCargaHorariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbSabado)
                                .addComponent(cbTerca))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(lbCargaHorariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(lbCargaHorariaLayout.createSequentialGroup()
                                    .addComponent(cbQuarta)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbQuinta))
                                .addComponent(cbDomingo)))
                        .addComponent(jpCargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btExcluirCargaHoraria)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        lbCargaHorariaLayout.setVerticalGroup(
            lbCargaHorariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lbCargaHorariaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbDiaCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lbCargaHorariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSegunda)
                    .addComponent(cbTerca)
                    .addComponent(cbQuarta)
                    .addComponent(cbQuinta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(lbCargaHorariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSabado)
                    .addComponent(cbDomingo)
                    .addComponent(cbSexta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbHorarioCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(lbCargaHorariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbHorarioInicio)
                    .addComponent(cbHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMinutoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbHorarioPontoInicio)
                    .addComponent(lbHorarioFim)
                    .addComponent(cbHoraFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMinutoFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbHorarioPontoFim))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btAdicionarCarga)
                .addGap(18, 18, 18)
                .addComponent(jpCargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btExcluirCargaHoraria)
                .addGap(4, 4, 4))
        );

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

        javax.swing.GroupLayout jpCadastroFuncionarioLayout = new javax.swing.GroupLayout(jpCadastroFuncionario);
        jpCadastroFuncionario.setLayout(jpCadastroFuncionarioLayout);
        jpCadastroFuncionarioLayout.setHorizontalGroup(
            jpCadastroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadastroFuncionarioLayout.createSequentialGroup()
                .addComponent(lbNomeCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNomeCadastro))
            .addGroup(jpCadastroFuncionarioLayout.createSequentialGroup()
                .addGroup(jpCadastroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpCadastroFuncionarioLayout.createSequentialGroup()
                        .addComponent(btLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSalvar))
                    .addGroup(jpCadastroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(spServicoPrestado, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbServicoPrestado, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbCargaHoraria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpCadastroFuncionarioLayout.setVerticalGroup(
            jpCadastroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadastroFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCadastroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomeCadastro)
                    .addComponent(tfNomeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbServicoPrestado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spServicoPrestado, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbCargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpCadastroFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar)
                    .addComponent(btCancelar)
                    .addComponent(btLimpar)))
        );

        jpPesquisaFuncionario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisa Funcionário", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 0))); // NOI18N
        jpPesquisaFuncionario.setPreferredSize(new java.awt.Dimension(399, 519));

        tbFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Serviços", "Horário", "Dias"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbFuncionario.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbFuncionario.getTableHeader().setReorderingAllowed(false);
        spFuncionario.setViewportView(tbFuncionario);
        tbFuncionario.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tbFuncionario.getColumnModel().getColumnCount() > 0) {
            tbFuncionario.getColumnModel().getColumn(0).setResizable(false);
            tbFuncionario.getColumnModel().getColumn(1).setResizable(false);
            tbFuncionario.getColumnModel().getColumn(2).setResizable(false);
            tbFuncionario.getColumnModel().getColumn(3).setResizable(false);
        }

        lbNomePesquisa.setText("Nome");

        tfNomePesquisa.setDocument(new JTextFieldLimit(40));

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

        javax.swing.GroupLayout jpPesquisaFuncionarioLayout = new javax.swing.GroupLayout(jpPesquisaFuncionario);
        jpPesquisaFuncionario.setLayout(jpPesquisaFuncionarioLayout);
        jpPesquisaFuncionarioLayout.setHorizontalGroup(
            jpPesquisaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jpPesquisaFuncionarioLayout.createSequentialGroup()
                .addComponent(lbNomePesquisa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNomePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btPesquisar)
                .addGap(0, 60, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPesquisaFuncionarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btAlterar))
        );
        jpPesquisaFuncionarioLayout.setVerticalGroup(
            jpPesquisaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPesquisaFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPesquisaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomePesquisa)
                    .addComponent(tfNomePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPesquisaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btExcluir)
                    .addComponent(btAlterar)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpCadastroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpPesquisaFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpCadastroFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpPesquisaFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        String validacao = validarCadastro();
        if(validacao.length() == 0){
            ArrayList<Servico> lstServico = new ArrayList<Servico>();
            for(Object item : ltServicoPrestado.getSelectedValues()){
                lstServico.add((Servico)item);
            }
                
            Funcionario item = new Funcionario();
            item.setNmFuncionario(tfNomeCadastro.getText().trim());
            item.setLstServico(lstServico);
            item.setLstCargaHoraria(lstCargaHoraria);
            
            if(itemUpdate != null){
                item.setIdFuncionario(this.itemUpdate.getIdFuncionario());
                
                new FuncionarioDAL().update(item);
            }else{
                new FuncionarioDAL().add(item);
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

    private void btAdicionarCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarCargaActionPerformed
        String validacao = validarCargaHoraria();
        if(validacao.length() == 0){
            lstCargaHoraria.add(criarCargaHoraria());
            
            carregarCargaHoraria();
            
            limparCargaHoraria();
        }else
            JOptionPane.showMessageDialog(null, validacao, "Campos inválidos", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btAdicionarCargaActionPerformed

    private void btExcluirCargaHorariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirCargaHorariaActionPerformed
        if(tbCargaHoraria.getSelectedRow() >= 0){
            lstCargaHoraria.remove(tbCargaHoraria.getSelectedRow());
            
            carregarCargaHoraria();
        }else{
            JOptionPane.showMessageDialog(null, "Nenhuma linha selecionada", "Linha", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btExcluirCargaHorariaActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        String validacao = validarPesquisa();
        if(validacao.length() == 0){
            String col[] = {"ID", "Nome", "Serviços", "Horário", "Dias"};

            DefaultTableModel tableModel = new DefaultTableModel(col, 0) {
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            
            ArrayList<Funcionario> lstFuncionario = new FuncionarioDAL().getList(new Funcionario(tfNomePesquisa.getText().trim()));

            for (int i = 0; i < lstFuncionario.size(); i++) {
                Funcionario item = lstFuncionario.get(i);
                Object[] data = {item.getIdFuncionario(), item.getNmFuncionario(), item.toStringServicos(), item.toStringDias(), item.toStringHorario()};

                tableModel.addRow(data);
            }
            
            tbFuncionario.setModel(tableModel);
            
            tbFuncionario.getColumnModel().getColumn(0).setMinWidth(0);
            tbFuncionario.getColumnModel().getColumn(0).setMaxWidth(0);
            tbFuncionario.getColumnModel().getColumn(0).setWidth(0);
        }else
            JOptionPane.showMessageDialog(null, validacao, "Campos inválidos", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        if(tbFuncionario.getSelectedRow() >= 0){
            Object[] options = { "Sim", "Não" };  
            int opt = JOptionPane.showOptionDialog(null,  
                "Você deseja excluir este funcionário? ",  
                "Funcionário", JOptionPane.YES_NO_OPTION,  
                JOptionPane.QUESTION_MESSAGE, null, options, options[0]);  
            
            if(opt == 0){
                int idFuncionario = Integer.parseInt(tbFuncionario.getValueAt(tbFuncionario.getSelectedRow(), 0).toString());
                new FuncionarioDAL().remove(idFuncionario);
                
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
        if(tbFuncionario.getSelectedRow() >= 0){
            int idFuncionario = Integer.parseInt(tbFuncionario.getValueAt(tbFuncionario.getSelectedRow(), 0).toString());
            carregarCadastro(new FuncionarioDAL().getItem(idFuncionario));

            btLimpar.setEnabled(false);
            btCancelar.setEnabled(true);
        }else{
            JOptionPane.showMessageDialog(null, "Nenhuma linha selecionada", "Linha", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limparCadastro();
    }//GEN-LAST:event_btLimparActionPerformed
    
    private void carregarCadastro(Funcionario item){
        this.itemUpdate = item;
        
        tfNomeCadastro.setText(item.getNmFuncionario());
        lstCargaHoraria = item.getLstCargaHoraria();
        
        carregarServicoPrestado();
        carregarCargaHoraria();
        
        ArrayList<Servico> lstServico = new ServicoDAL().getList();
        ArrayList<Integer> lstIndices = new ArrayList<Integer>();
        for(int i = 0; i < lstServico.size(); i++){
            for(int a = 0; a < item.getLstServico().size(); a++){    
                if (lstServico.get(i).getIdServico() == item.getLstServico().get(a).getIdServico()) {
                    lstIndices.add(i);
                }
            }
        }
        
        int[] indiceServico = new int[lstIndices.size()];
        for(int i = 0; i < lstIndices.size(); i++){
            indiceServico[i] = lstIndices.get(i);
        }
        
        ltServicoPrestado.setSelectedIndices(indiceServico);
    }
    
    public void limparCadastro(){
        tfNomeCadastro.setText("");
        lstCargaHoraria = new ArrayList<CargaHoraria>();

        carregarServicoPrestado();
        carregarCargaHoraria();
        
        limparCargaHoraria();
    }
    
    public void limparCargaHoraria(){
        cbSegunda.setSelected(false);
        cbTerca.setSelected(false);
        cbQuarta.setSelected(false);
        cbQuinta.setSelected(false);
        cbSexta.setSelected(false);
        cbSabado.setSelected(false);
        cbDomingo.setSelected(false);
        
        cbHoraInicio.setSelectedIndex(0);
        cbMinutoInicio.setSelectedIndex(0);
        cbHoraFim.setSelectedIndex(0);
        cbMinutoFim.setSelectedIndex(0);
    }
    
    public CargaHoraria criarCargaHoraria(){
        ArrayList<Dia> lstDias = new ArrayList<Dia>();
        if(cbSegunda.isSelected())
            lstDias.add(new Dia(Dia.SEGUNDA));
        if(cbTerca.isSelected())
            lstDias.add(new Dia(Dia.TERCA));
        if(cbQuarta.isSelected())
            lstDias.add(new Dia(Dia.QUARTA));
        if(cbQuinta.isSelected())
            lstDias.add(new Dia(Dia.QUINTA));
        if(cbSexta.isSelected())
            lstDias.add(new Dia(Dia.SEXTA));
        if(cbSabado.isSelected())
            lstDias.add(new Dia(Dia.SABADO));
        if(cbDomingo.isSelected())
            lstDias.add(new Dia(Dia.DOMINGO));

        Horario HoInicio = new Horario(Integer.parseInt(cbHoraInicio.getSelectedItem().toString()),
                                        Integer.parseInt(cbMinutoInicio.getSelectedItem().toString()));
        Horario HoFim = new Horario(Integer.parseInt(cbHoraFim.getSelectedItem().toString()),
                                    Integer.parseInt(cbMinutoFim.getSelectedItem().toString()));

        return new CargaHoraria(lstDias, HoInicio, HoFim);
    }
    
    public void carregarCargaHoraria(){
        String col[] = {"Dias", "Inicio", "Fim"};

        DefaultTableModel tableModel = new DefaultTableModel(col, 0) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        for (int i = 0; i < lstCargaHoraria.size(); i++) {
            CargaHoraria item = lstCargaHoraria.get(i);
            Object[] data = {lstCargaHoraria.get(i).toStringDias(), item.getHoInicio().toString(), item.getHoFinal().toString()};

            tableModel.addRow(data);
        }

        tbCargaHoraria.setModel(tableModel);
        
        tbCargaHoraria.getColumnModel().getColumn(0).setMinWidth(160);
        tbCargaHoraria.getColumnModel().getColumn(0).setMaxWidth(160);
        tbCargaHoraria.getColumnModel().getColumn(0).setWidth(160);
    }
    
    public void carregarServicoPrestado(){
        ArrayList<Servico> lstServico = new ServicoDAL().getList();
        
        DefaultListModel modelList = new DefaultListModel();  

        for (Servico item : lstServico) {
            modelList.addElement(item);
        }
        
        ltServicoPrestado.setModel(modelList);  
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
        
        if(ltServicoPrestado.getSelectedValues().length == 0){
            stValidacao += "Selecione algum Serviço\n";
        }
        
        if(lstCargaHoraria.size() == 0){
            stValidacao += "Adicione alguma Carga Horária\n";
        }
        
        return stValidacao;
    }
    
    private String validarCargaHoraria(){
        String stValidacao = "";
        
        if(!cbSegunda.isSelected() && !cbTerca.isSelected() &&
           !cbQuarta.isSelected() && !cbQuinta.isSelected() && 
           !cbSexta.isSelected() && !cbSabado.isSelected() &&
           !cbDomingo.isSelected())
                stValidacao += "Selecione algum dia para adicionar\n";
        
        
        Horario HoInicio = new Horario(Integer.parseInt(cbHoraInicio.getSelectedItem().toString()),
                                        Integer.parseInt(cbMinutoInicio.getSelectedItem().toString()));
        Horario HoFim = new Horario(Integer.parseInt(cbHoraFim.getSelectedItem().toString()),
                                    Integer.parseInt(cbMinutoFim.getSelectedItem().toString()));
        if(HoInicio.compare(HoFim) <= 0)
            stValidacao += "Horário Inicial deve ser menor que o Horário Final\n";
        
        if(criarCargaHoraria().haConflito(lstCargaHoraria))
            stValidacao += "Horario que será adicionada está em conflito com outro\n";                
            
        return stValidacao;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionarCarga;
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btExcluirCargaHoraria;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JCheckBox cbDomingo;
    private javax.swing.JComboBox cbHoraFim;
    private javax.swing.JComboBox cbHoraInicio;
    private javax.swing.JComboBox cbMinutoFim;
    private javax.swing.JComboBox cbMinutoInicio;
    private javax.swing.JCheckBox cbQuarta;
    private javax.swing.JCheckBox cbQuinta;
    private javax.swing.JCheckBox cbSabado;
    private javax.swing.JCheckBox cbSegunda;
    private javax.swing.JCheckBox cbSexta;
    private javax.swing.JCheckBox cbTerca;
    private javax.swing.JPanel jpCadastroFuncionario;
    private javax.swing.JScrollPane jpCargaHoraria;
    private javax.swing.JPanel jpPesquisaFuncionario;
    private javax.swing.JPanel lbCargaHoraria;
    private javax.swing.JLabel lbDiaCadastro;
    private javax.swing.JLabel lbHorarioCadastro;
    private javax.swing.JLabel lbHorarioFim;
    private javax.swing.JLabel lbHorarioInicio;
    private javax.swing.JLabel lbHorarioPontoFim;
    private javax.swing.JLabel lbHorarioPontoInicio;
    private javax.swing.JLabel lbNomeCadastro;
    private javax.swing.JLabel lbNomePesquisa;
    private javax.swing.JLabel lbServicoPrestado;
    public javax.swing.JList ltServicoPrestado;
    private javax.swing.JScrollPane spFuncionario;
    private javax.swing.JScrollPane spServicoPrestado;
    private javax.swing.JTable tbCargaHoraria;
    private javax.swing.JTable tbFuncionario;
    private javax.swing.JTextField tfNomeCadastro;
    private javax.swing.JTextField tfNomePesquisa;
    // End of variables declaration//GEN-END:variables
}
