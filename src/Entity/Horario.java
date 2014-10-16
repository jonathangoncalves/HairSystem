package Entity;

public class Horario {
    private int itHora;
    private int itMinuto;

    public Horario(int itHora, int itMinuto) {
        this.itHora = itHora;
        this.itMinuto = itMinuto;
    }

    public int getItHora() {
        return itHora;
    }

    public void setItHora(int itHora) {
        this.itHora = itHora;
    }

    public int getItMinuto() {
        return itMinuto;
    }

    public void setItMinuto(int itMinuto) {
        this.itMinuto = itMinuto;
    }

    public String toString() {
        String horaFormato = "0" + this.getItHora();
        String minutoFormato = "0" + this.getItMinuto();
        
        StringBuilder sb = new StringBuilder();
        sb.append(horaFormato.substring(horaFormato.length() - 2, horaFormato.length()));
        sb.append(":");
        sb.append(minutoFormato.substring(minutoFormato.length() - 2, minutoFormato.length()));

        return sb.toString();
    }
    
    public String toStringSave(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.getItHora());
        sb.append(":");
        sb.append(this.getItMinuto());
        
        return sb.toString();
    }
    
    public int compare(Horario hoFinal){
        int inicio = (this.getItHora() * 60) + this.getItMinuto();
        int fim = (hoFinal.getItHora() * 60) + hoFinal.getItMinuto();
        
        return fim - inicio;
    }
}
