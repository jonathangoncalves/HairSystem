package Others;

import java.util.Iterator;

public class Lista<T> implements Iterable<T> {
    private int p;
    private T e;    

    private No<T> inicio;

    public Lista() {
        this.inicio = null;
    }

    public boolean isEmpty() {
        return inicio == null;
    }

    public void add(T valor) {
        No novo = new No(valor);
        novo.prox = inicio;
        inicio = novo;
    }
    
    public int size(){
        if (!isEmpty()) {
            No aux = inicio;
            int conta = 1;
            
            while (aux.prox != null) {
                aux = aux.prox;
                conta++;
            }
            
            return conta;
        }else{
            return 0;
        }
    }
    
    /**Metodos que devem sem implementados get, set e iterato
     * @return r**/
    public T get(int index){
        return get(index);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void set(int p, T e) {
        this.p=p;
        this.e=e;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void remove(int p) {
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
