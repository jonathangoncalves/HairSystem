package Entity;

public class Servico {
    private int idServico;
    private String nmSigla;
    private String nmServico;
    
    public Servico(){
    }
    
    public Servico(int idServico) {
        this.idServico = idServico;
    }
    
    public Servico(String nmServico) {
        this.nmServico = nmServico;
    }

    public Servico(String nmSigla, String nmServico) {
        this.nmSigla = nmSigla;
        this.nmServico = nmServico;
    }
    
    public Servico(int idServico, String nmSigla, String nmServico) {
        this.idServico = idServico;
        this.nmSigla = nmSigla;
        this.nmServico = nmServico;
    }
    
    public int getIdServico() {
        return idServico;
    }

    public void setIdServico(int idServico) {
        this.idServico = idServico;
    }
    
    public String getNmSigla() {
        return nmSigla;
    }

    public void setNmSigla(String nmSigla) {
        this.nmSigla = nmSigla;
    }

    public String getNmServico() {
        return nmServico;
    }

    public void setNmServico(String nmServico) {
        this.nmServico = nmServico;
    }
    
    public String toString(){
        return this.getNmServico();
    }
    
    public String toStringSave(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.getIdServico());
        sb.append(";");
        sb.append(this.getNmSigla());
        sb.append(";");
        sb.append(this.getNmServico());
        sb.append(";");
        
        return sb.toString();
    }
}
