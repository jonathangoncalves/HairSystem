package Entity;

import java.util.ArrayList;
import java.util.List;

public class CargaHoraria {
    private List<Dia> lstDias;
    private Horario hoInicio;
    private Horario hoFinal;

    public CargaHoraria() {
    }
 
    public CargaHoraria(List<Dia> lstDias, Horario hoInicio, Horario hoFinal) {
        this.lstDias = lstDias;
        this.hoInicio = hoInicio;
        this.hoFinal = hoFinal;
    }
    
    public List<Dia> getLstDias() {
        return lstDias;
    }

    public void setLstDias(List<Dia> lstDias) {
        this.lstDias = lstDias;
    }

    public Horario getHoInicio() {
        return hoInicio;
    }

    public void setHoInicio(Horario hoInicio) {
        this.hoInicio = hoInicio;
    }

    public Horario getHoFinal() {
        return hoFinal;
    }

    public void setHoFinal(Horario hoFinal) {
        this.hoFinal = hoFinal;
    }
    
    public String toStringDias(){
        StringBuilder sb = new StringBuilder();
        for (Dia item : lstDias) {
            sb.append(item.toStringDiaCurto()+ "-");    
        }
        sb.delete(sb.length()-1, sb.length());
        
        return sb.toString();
    }
    
    public String toStringSave(){
        StringBuilder sb = new StringBuilder();
        for (Dia item : lstDias) {
            sb.append(item.getItDia() + "-");    
        }
        sb.delete(sb.length()-1, sb.length());
        sb.append("/");
        sb.append(hoInicio.toStringSave());
        sb.append("/");
        sb.append(hoFinal.toStringSave());
        
        return sb.toString();
    }
    
    public Boolean haConflito(ArrayList<CargaHoraria> lstCargaHoraria){
        Boolean blConflito = false;
        
        for(Dia item : lstDias){
            for(CargaHoraria itemCargaHoraria : lstCargaHoraria){
                for(Dia itemDiasCarga : itemCargaHoraria.getLstDias()){
                    if(item.getItDia() == itemDiasCarga.getItDia()){
                        if(!(((hoInicio.compare(itemCargaHoraria.getHoInicio()) >= 0 &&
                               hoInicio.compare(itemCargaHoraria.getHoFinal()) >= 0) &&
                              (hoFinal.compare(itemCargaHoraria.getHoInicio()) >= 0 &&
                               hoFinal.compare(itemCargaHoraria.getHoFinal()) >= 0)) ||
                            ((hoInicio.compare(itemCargaHoraria.getHoInicio()) <= 0 &&
                               hoInicio.compare(itemCargaHoraria.getHoFinal()) <= 0) &&
                              (hoFinal.compare(itemCargaHoraria.getHoInicio()) <= 0 &&
                               hoFinal.compare(itemCargaHoraria.getHoFinal()) <= 0))))
                            blConflito = true;
                        
                        if(hoInicio.compare(itemCargaHoraria.getHoInicio()) == 0 &&
                           hoFinal.compare(itemCargaHoraria.getHoFinal()) == 0)
                           blConflito = true;
                    }
                }
            }
        }
        
        return blConflito;
    }
}
