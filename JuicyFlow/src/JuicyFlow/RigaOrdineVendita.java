package JuicyFlow;

/**
 *
 * @author juicyflowgroup
 */
public class RigaOrdineVendita {
    private Prodotto prodotto;
    private float quantità;
    
    RigaOrdineVendita(){ 
    }
    RigaOrdineVendita(Prodotto prodotto, float quantità){
        this.prodotto = prodotto; 
        this.quantità = quantità;
    }    
    public float getQuantità(){
        return quantità;
    }
    public void setQuantità(float quantità){
        this.quantità = quantità;
    }
    public void setProdotto(Prodotto prodotto){
        this.prodotto = prodotto;
    }
    public Prodotto getProdotto(){
        return prodotto;
    }
    public String getNomeProdotto(){
        return prodotto.getNome();
    }
}
