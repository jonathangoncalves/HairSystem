package Entity;

public class Cliente {
    public static final int MASCULINO = 0;
    public static final int FEMININO = 1;
    
    private int idCliente;
    private String nmCliente;
    private String stEndereco;
    private String stNumero;
    private String stCEP;
    private String stCidade;
    private String stUF;
    private String stTelefone;
    private String stCelular;
    private String stEmail;
    private int itSexo;

    public Cliente() {
    }
   
    public Cliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Cliente(String nmCliente) {
        this.nmCliente = nmCliente;
    }
    
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNmCliente() {
        return nmCliente;
    }

    public void setNmCliente(String nmCliente) {
        this.nmCliente = nmCliente;
    }

    public String getStEndereco() {
        return stEndereco;
    }

    public void setStEndereco(String stEndereco) {
        this.stEndereco = stEndereco;
    }

    public String getStNumero() {
        return stNumero;
    }

    public void setStNumero(String stNumero) {
        this.stNumero = stNumero;
    }

    public String getStCEP() {
        return stCEP;
    }

    public void setStCEP(String stCEP) {
        this.stCEP = stCEP;
    }

    public String getStCidade() {
        return stCidade;
    }

    public void setStCidade(String stCidade) {
        this.stCidade = stCidade;
    }

    public String getStUF() {
        return stUF;
    }

    public void setStUF(String stUF) {
        this.stUF = stUF;
    }

    public String getStTelefone() {
        return stTelefone;
    }

    public void setStTelefone(String stTelefone) {
        this.stTelefone = stTelefone;
    }

    public String getStCelular() {
        return stCelular;
    }

    public void setStCelular(String stCelular) {
        this.stCelular = stCelular;
    }

    public String getStEmail() {
        return stEmail;
    }

    public void setStEmail(String stEmail) {
        this.stEmail = stEmail;
    }

    public int getItSexo() {
        return itSexo;
    }

    public void setItSexo(int itSexo) {
        this.itSexo = itSexo;
    }
    
    public String toStringSave(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.getIdCliente());
        sb.append(";");
        sb.append(this.getNmCliente());
        sb.append(";");
        sb.append(this.getStEndereco());
        sb.append(";");
        sb.append(this.getStNumero());
        sb.append(";");
        sb.append(this.getStCEP());
        sb.append(";");
        sb.append(this.getStCidade());
        sb.append(";");
        sb.append(this.getStUF());
        sb.append(";");
        sb.append(this.getStTelefone());
        sb.append(";");
        sb.append(this.getStCelular());
        sb.append(";");
        sb.append(this.getStEmail());
        sb.append(";");
        sb.append(this.getItSexo());
        sb.append(";");
        
        return sb.toString();
    }
}
