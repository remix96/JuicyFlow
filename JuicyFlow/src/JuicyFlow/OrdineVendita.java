package JuicyFlow;


import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author juicyflowgroup
 */
public class OrdineVendita {
    private int id;
    final private List<RigaOrdineVendita> righeOrdineVendita;
    private boolean disponibilità;
    
    OrdineVendita(){
        this.righeOrdineVendita = new LinkedList<>();
        this.disponibilità = true;
    } 
    OrdineVendita(int ID, List<RigaOrdineVendita> righeOrdineVendita){
        this.id = ID;
        this.righeOrdineVendita = righeOrdineVendita;
        this.disponibilità = true;
    }
    public void inserisciRigaOrdineVendita(Prodotto prod, float quantità) throws Exception{
        for(RigaOrdineVendita corrente: righeOrdineVendita){
            if(corrente.getProdotto() == prod)
                throw new Exception("prodottoGiàPresente");
        }
        
        righeOrdineVendita.add(new RigaOrdineVendita(prod,quantità));
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public List<RigaOrdineVendita> getRigheOrdineVendita(){
        return righeOrdineVendita;
    }
    public void setDisponibilità(boolean disponibilità){
        this.disponibilità = disponibilità;
    }
    public boolean getDisponibilità(){
        return this.disponibilità;
    }
    public String visualizzaRigheOrdine(){
        StringBuilder contenutoRigheOrdine = new StringBuilder("Contenuto Ordine Vendita:\n\n");
        for(RigaOrdineVendita corrente: righeOrdineVendita){
            contenutoRigheOrdine.append(corrente.getNomeProdotto());
            contenutoRigheOrdine.append(" - "+corrente.getQuantità()+"\n");
        }
        return contenutoRigheOrdine.toString();
    }

    @Override
    public String toString() {
        return "" + id;
    }
}
