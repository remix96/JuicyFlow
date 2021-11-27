package JuicyFlow;

/**
 *
 * @author juicyflowgroup
 */
public class RigaMagazzino {
    private Prodotto prodotto;
    private float quantità;
    
    RigaMagazzino(Prodotto prodotto, float quantità){
        this.prodotto = prodotto;
        this.quantità = quantità;
    }
    public void setProdotto(Prodotto prodotto){
        this.prodotto = prodotto;
    }
    public Prodotto getProdotto(){
        return prodotto;
    }
    public void setQuantità(float quantità){
        this.quantità = quantità;
    }
    public float getQuantità(){
        return quantità;
    }
    public void aggiungiProdotto(float quantità){
        this.quantità += quantità;
    }
    public void sottraiProdotto(float quantità){
        this.quantità -= quantità;
    }
    public String getNomeProdotto(){
        return this.prodotto.getNome();
    }
    public String getTipoProdotto(){
        return this.prodotto.getTipo();
    }
}
