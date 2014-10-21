package Control;

import Others.Lista;
import Entity.Servico;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
//import java.util.ArrayList;

public class ServicoDAL {
    private final String fileName = "dbServico.txt";
    
    public void add(Servico item){
        item.setIdServico(this.getNewId());
        
        Lista<Servico> lstServico;
        lstServico = this.getList();
        lstServico.add(item);
        
        saveList(lstServico);
    }
    
    public void update(Servico item){
        Lista<Servico> lstServico;
        lstServico = this.getList();
        
        for(int i = 0; i < lstServico.size(); i++){
            if(lstServico.get(i).getIdServico() == item.getIdServico()){
                lstServico.set(i, item);
            }
        }
        
        saveList(lstServico);
    }
    
    public void remove(int idServico){
        Lista<Servico> lstServico;
        lstServico = this.getList();
        
        for(int i = 0; i < lstServico.size(); i++){
            if(lstServico.get(i).getIdServico() == idServico){
                lstServico.remove(i);
            }
        }
        
        saveList(lstServico);
    }
    
    private void saveList(Lista<Servico> lstServico){
        try(PrintWriter pwArquivo = new PrintWriter(new FileWriter(this.fileName))){
            for (Servico itemSave : lstServico){
                pwArquivo.println(itemSave.toStringSave()); 
            }
        } catch (IOException ex) {
        }
    }
    
    public Servico getItem(int idServico){
        return this.getList(new Servico(idServico)).get(0);
    }
    
    public Lista<Servico> getList(){
        return this.getList(new Servico());
    }
    
    public Lista<Servico> getList(Servico itemSearch){
        Lista<Servico> lstServico = new Lista<Servico>();
        
        try(BufferedReader brArquivo = new BufferedReader(new FileReader(this.fileName))){
            String stLinha = brArquivo.readLine();

            while (stLinha != null) {
                String[] itemSplit = stLinha.split(";");
                
                Servico item = new Servico();
                item.setIdServico(Integer.parseInt(itemSplit[0]));
                item.setNmSigla(itemSplit[1]);
                item.setNmServico(itemSplit[2]);
                
                lstServico.add(item);
                
                stLinha = brArquivo.readLine();
            }
        }catch(IOException ex){
        }
        
        Lista<Servico> lstServicoRetorno = new Lista<Servico>();
        if(itemSearch.getNmServico() != null){
            for(int i = 0; i < lstServico.size(); i++){
                Servico item = lstServico.get(i);
                if(item.getNmServico().contains(itemSearch.getNmServico())){
                    lstServicoRetorno.add(item);
                }
            }
            
            return lstServicoRetorno;
        }else if(itemSearch.getNmSigla()!= null){
                for(int i = 0; i < lstServico.size(); i++){
                    Servico item = lstServico.get(i);
                    if(item.getNmSigla().equalsIgnoreCase(itemSearch.getNmSigla())){
                        lstServicoRetorno.add(item);
                    }
                }
                
                return lstServicoRetorno;
        } else if(itemSearch.getIdServico() > 0){
                for(int i = 0; i < lstServico.size(); i++){
                    Servico item = lstServico.get(i);
                    if(item.getIdServico() == itemSearch.getIdServico()){
                        lstServicoRetorno.add(item);
                    }
                }
                
                return lstServicoRetorno;
        } else{
            return lstServico;
        }
    }
    
    private int getNewId(){
        Lista<Servico> lstServico;
        lstServico = this.getList();
        
        int idMax = 0;
        
        for(int i = 0; i < lstServico.size(); i++){
            Servico item = lstServico.get(i);
            if(item.getIdServico() > idMax){
                idMax = item.getIdServico();
            }
        }
        
        return ++idMax;
    }
}
