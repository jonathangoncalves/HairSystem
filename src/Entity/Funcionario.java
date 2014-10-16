package Entity;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {
    private int idFuncionario;
    private String nmFuncionario;
    private ArrayList<Servico> lstServico;
    private ArrayList<CargaHoraria> lstCargaHoraria;

    public Funcionario() {
    }

    public Funcionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public Funcionario(String nmFuncionario) {
        this.nmFuncionario = nmFuncionario;
    }
    
    public Funcionario(int idFuncionario, String nmFuncionario, ArrayList<Servico> lstServico, ArrayList<CargaHoraria> lstCargaHoraria) {
        this.idFuncionario = idFuncionario;
        this.nmFuncionario = nmFuncionario;
        this.lstServico = lstServico;
        this.lstCargaHoraria = lstCargaHoraria;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNmFuncionario() {
        return nmFuncionario;
    }

    public void setNmFuncionario(String nmFuncionario) {
        this.nmFuncionario = nmFuncionario;
    }

    public List<Servico> getLstServico() {
        return lstServico;
    }

    public void setLstServico(ArrayList<Servico> lstServico) {
        this.lstServico = lstServico;
    }

    public ArrayList<CargaHoraria> getLstCargaHoraria() {
        return lstCargaHoraria;
    }

    public void setLstCargaHoraria(ArrayList<CargaHoraria> lstCargaHoraria) {
        this.lstCargaHoraria = lstCargaHoraria;
    }
    
    public String toStringServicos(){
        StringBuilder sb = new StringBuilder();
        
        for (Servico itemServico : lstServico) {
            sb.append(itemServico.getNmServico());
            sb.append("/");    
        }
        
        sb.delete(sb.length()-1, sb.length());
        
        return sb.toString();
    }
    
    public String toStringDias(){
        StringBuilder sb = new StringBuilder();
        
        for (CargaHoraria itemCargaHoraria : lstCargaHoraria) {
            for (Dia itemDia : itemCargaHoraria.getLstDias()) {
                sb.append(itemDia.toStringDiaCurto());
                sb.append(",");    
            }
            sb.delete(sb.length()-1, sb.length());
            
            sb.append("/");    
        }
        
        sb.delete(sb.length()-1, sb.length());
       
        return sb.toString();
    }
    
    public String toStringHorario(){
        StringBuilder sb = new StringBuilder();
        
        for (CargaHoraria itemCargaHoraria : lstCargaHoraria) {
            sb.append(itemCargaHoraria.getHoInicio().toString());
            sb.append(" à ");    
            sb.append(itemCargaHoraria.getHoFinal().toString());
            sb.append("/");    
        }
        
        sb.delete(sb.length()-1, sb.length());
        
        return sb.toString();
    }
    
    public String toStringSave(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.getIdFuncionario());
        sb.append(";");
        sb.append(this.getNmFuncionario());
        sb.append(";");
        
        for (Servico itemServico : lstServico) {
            sb.append(itemServico.getIdServico());
            sb.append("-");    
        }
        
        sb.delete(sb.length()-1, sb.length());
        sb.append(";");
        
        for (CargaHoraria itemCarga : lstCargaHoraria) {
            sb.append(itemCarga.toStringSave());    
            sb.append(",");    
        }
        
        sb.delete(sb.length()-1, sb.length());
        sb.append(";");
        
        return sb.toString();
    }
}
