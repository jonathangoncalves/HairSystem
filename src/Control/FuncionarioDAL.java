package Control;

import Others.Lista;
import Entity.CargaHoraria;
import Entity.Dia;
import Entity.Funcionario;
import Entity.Horario;
import Entity.Servico;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
//import java.util.ArrayList;

public class FuncionarioDAL {
    private final String fileName = "dbFuncionario.txt";
    
    public void add(Funcionario item){
        item.setIdFuncionario(this.getNewId());
        
        Lista<Funcionario> lstFuncionario;
        lstFuncionario = this.getList();
        lstFuncionario.add(item);
        
        saveList(lstFuncionario);
    }
    
    public void update(Funcionario item){
        Lista<Funcionario> lstFuncionario;
        lstFuncionario = this.getList();
        
        for(int i = 0; i < lstFuncionario.size(); i++){
            if(lstFuncionario.get(i).getIdFuncionario() == item.getIdFuncionario()){
                lstFuncionario.set(i, item);
            }
        }
        
        saveList(lstFuncionario);
    }
    
    public void remove(int idFuncionario){
        Lista<Funcionario> lstFuncionario;
        lstFuncionario = this.getList();
        
        for(int i = 0; i < lstFuncionario.size(); i++){
            if(lstFuncionario.get(i).getIdFuncionario() == idFuncionario){
                lstFuncionario.remove(i);
            }
        }
        
        saveList(lstFuncionario);
    }
    
    private void saveList(Lista<Funcionario> lstFuncionario){
        try(PrintWriter pwArquivo = new PrintWriter(new FileWriter(this.fileName))){
            for (Funcionario itemSave : lstFuncionario){
                pwArquivo.println(itemSave.toStringSave()); 
            }
        } catch (IOException ex) {
        }
    }
    
    public Funcionario getItem(int idFuncionario){
        return this.getList(new Funcionario(idFuncionario)).get(0);
    }
    
    public Lista<Funcionario> getList(){
        return this.getList(new Funcionario());
    }
    
    public Lista<Funcionario> getList(Funcionario itemSearch){
        Lista<Funcionario> lstFuncionario = new Lista<Funcionario>();
        
        try(BufferedReader brArquivo = new BufferedReader(new FileReader(this.fileName))){
            String stLinha = brArquivo.readLine();

            while (stLinha != null) {
                String[] itemSplit = stLinha.split(";");
                
                Funcionario item = new Funcionario();
                item.setIdFuncionario(Integer.parseInt(itemSplit[0]));
                item.setNmFuncionario(itemSplit[1]);
                
                String[] itemServicos = itemSplit[2].split("-");
                Lista<Servico> lstServico = new Lista<Servico>();
                for (String idServico : itemServicos) {
                    lstServico.add(new ServicoDAL().getItem(Integer.parseInt(idServico)));
                }
                
                item.setLstServico(lstServico);
                
                String[] itemLstCargaHoraria = itemSplit[3].split(",");
                Lista<CargaHoraria> lstCargaHoraria = new Lista<CargaHoraria>();
                for (String itemCargaHoraria : itemLstCargaHoraria) {
                    String[] itemCarga = itemCargaHoraria.split("/");
                    CargaHoraria obCargaHoraria = new CargaHoraria();
                    
                    String[] itemLstDias = itemCarga[0].split("-");

                    Lista<Dia> lstDias = new Lista<Dia>();
                    for (String itemDias : itemLstDias) {
                        lstDias.add(new Dia(Integer.parseInt(itemDias)));
                    }
                    
                    obCargaHoraria.setLstDias(lstDias);
                    
                    obCargaHoraria.setHoInicio(new Horario(Integer.parseInt(itemCarga[1].split(":")[0]),
                                                           Integer.parseInt(itemCarga[1].split(":")[1])));
                    
                    obCargaHoraria.setHoFinal(new Horario(Integer.parseInt(itemCarga[2].split(":")[0]),
                                                           Integer.parseInt(itemCarga[2].split(":")[1])));
                    
                    lstCargaHoraria.add(obCargaHoraria);
                }
                
                item.setLstCargaHoraria(lstCargaHoraria);
                
                lstFuncionario.add(item);
                
                stLinha = brArquivo.readLine();
            }
        }catch(IOException ex){
        }
        
        Lista<Funcionario> lstServicoRetorno = new Lista<Funcionario>();
        if(itemSearch.getNmFuncionario()!= null){
            for(int i = 0; i < lstFuncionario.size(); i++){
                Funcionario item = lstFuncionario.get(i);
                if(item.getNmFuncionario().contains(itemSearch.getNmFuncionario())){
                    lstServicoRetorno.add(item);
                }
            }
            
            return lstServicoRetorno;
        } else if(itemSearch.getIdFuncionario() > 0){
                for(int i = 0; i < lstFuncionario.size(); i++){
                    Funcionario item = lstFuncionario.get(i);
                    if(item.getIdFuncionario() == itemSearch.getIdFuncionario()){
                        lstServicoRetorno.add(item);
                    }
                }
                
                return lstServicoRetorno;
        } else{
            return lstFuncionario;
        }
    }
    
    private int getNewId(){
        Lista<Funcionario> lstServico;
        lstServico = this.getList();
        
        int idMax = 0;
        
        for(int i = 0; i < lstServico.size(); i++){
            Funcionario item = lstServico.get(i);
            if(item.getIdFuncionario() > idMax){
                idMax = item.getIdFuncionario();
            }
        }
        
        return ++idMax;
    }
}
