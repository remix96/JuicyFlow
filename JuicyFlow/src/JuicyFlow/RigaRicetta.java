package JuicyFlow;

/**
 *
 * @author juicyflowgroup
 */
public class RigaRicetta {
    private float dose;
    private Prodotto prodotto;
    private final boolean ingresso;
    private final boolean principale;
    
    RigaRicetta(boolean ingresso, Prodotto prodotto, float dose, boolean principale){
        this.ingresso = ingresso;
        this.prodotto = prodotto;
        this.dose = dose;
        this.principale = principale;
    }
    public Prodotto getProdotto(){
        return prodotto;
    }
    public float getDose(){
        return dose;
    }
    public void setProdotto(Prodotto prodotto){
        this.prodotto=prodotto;
    }
    public void setDose(float dose){
        this.dose = dose;
    }
    public boolean getIngresso(){
        return ingresso;
    }
    public boolean getPrincipale(){
        return this.principale;
    }
    public String geTipoProdotto(){
        return this.prodotto.getTipo();
    }
    public String getNomeProdotto(){
        return this.prodotto.getNome();
    }
    @Override
    public String toString() {
        return "" +  prodotto;
    }
}
