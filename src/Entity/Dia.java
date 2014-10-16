package Entity;

public class Dia {
    public static final int DOMINGO = 0;
    public static final int SEGUNDA = 1;
    public static final int TERCA = 2;
    public static final int QUARTA = 3;
    public static final int QUINTA = 4;
    public static final int SEXTA = 5;
    public static final int SABADO = 6;
    
    private static final String[] nomeDia = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};
    private static final String[] nomeDiaCurto = {"Dom", "Seg", "Ter", "Qua", "Qui", "Sex", "Sab"};
    
    private int itDia;

    public Dia(int itDia) {
        this.itDia = itDia;
    }

    public int getItDia() {
        return itDia;
    }

    public void setItDia(int itDia) {
        this.itDia = itDia;
    }

    public String toString() {
        return nomeDia[itDia];
    }
    
    public String toStringDiaCurto() {
        return nomeDiaCurto[itDia];
    }
}
