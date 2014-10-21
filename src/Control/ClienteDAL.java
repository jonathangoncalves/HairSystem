package Control;

import Others.Lista;
import Entity.Cliente;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ClienteDAL {
    private final String fileName = "dbCliente.txt";
    
    public void add(Cliente item){
        item.setIdCliente(this.getNewId());
        
        Lista<Cliente> lstCliente;
        lstCliente = this.getList();
        lstCliente.add(item);
        
        saveList(lstCliente);
    }
    
    public void update(Cliente item){
        Lista<Cliente> lstCliente;
        lstCliente = this.getList();
        
        for(int i = 0; i < lstCliente.size(); i++){
            if(lstCliente.get(i).getIdCliente() == item.getIdCliente()){
                lstCliente.set(i, item);
            }
        }
        
        saveList(lstCliente);
    }
    
    public void remove(int idCliente){
        Lista<Cliente> lstCliente;
        lstCliente = this.getList();
        
        for(int i = 0; i < lstCliente.size(); i++){
            if(lstCliente.get(i).getIdCliente() == idCliente){
                lstCliente.remove(i);
            }
        }
        
        saveList(lstCliente);
    }
    
    private void saveList(Lista<Cliente> lstCliente){
        try(PrintWriter pwArquivo = new PrintWriter(new FileWriter(this.fileName))){
            for (Cliente itemSave : lstCliente){
                pwArquivo.println(itemSave.toStringSave()); 
            }
        } catch (IOException ex) {
        }
    }
    
    public Cliente getItem(int idCliente){
        return this.getList(new Cliente(idCliente)).get(0);
    }
    
    public Lista<Cliente> getList(){
        return this.getList(new Cliente());
    }
    
    public Lista<Cliente> getList(Cliente itemSearch){
        Lista<Cliente> lstCliente = new Lista<Cliente>();
        
        try(BufferedReader brArquivo = new BufferedReader(new FileReader(this.fileName))){
            String stLinha = brArquivo.readLine();

            while (stLinha != null) {
                String[] itemSplit = stLinha.split(";");
                
                Cliente item = new Cliente();
                item.setIdCliente(Integer.parseInt(itemSplit[0]));
                item.setNmCliente(itemSplit[1]);
                item.setStEndereco(itemSplit[2]);
                item.setStNumero(itemSplit[3]);
                item.setStCEP(itemSplit[4]);
                item.setStCidade(itemSplit[5]);
                item.setStUF(itemSplit[6]);
                item.setStTelefone(itemSplit[7]);
                item.setStCelular(itemSplit[8]);
                item.setStEmail(itemSplit[9]);
                item.setItSexo(Byte.parseByte(itemSplit[10]));
                
                lstCliente.add(item);
                
                stLinha = brArquivo.readLine();
            }
        }catch(IOException ex){
        }
        
        Lista<Cliente> lstClienteRetorno = new Lista<Cliente>();
        if(itemSearch.getNmCliente() != null){
            for(int i = 0; i < lstCliente.size(); i++){
                Cliente item = lstCliente.get(i);
                if(item.getNmCliente().contains(itemSearch.getNmCliente())){
                    lstClienteRetorno.add(item);
                }
            }
            
            return lstClienteRetorno;
        } else if(itemSearch.getIdCliente() > 0){
                for(int i = 0; i < lstCliente.size(); i++){
                    Cliente item = lstCliente.get(i);
                    if(item.getIdCliente() == itemSearch.getIdCliente()){
                        lstClienteRetorno.add(item);
                    }
                }
                
                return lstClienteRetorno;
        } else{
            return lstCliente;
        }
    }
    
    private int getNewId(){
        Lista<Cliente> lstCliente;
        lstCliente = this.getList();
        
        int idMax = 0;
        
        for(int i = 0; i < lstCliente.size(); i++){
            Cliente item = lstCliente.get(i);
            if(item.getIdCliente() > idMax){
                idMax = item.getIdCliente();
            }
        }
        
        return ++idMax;
    }
}
