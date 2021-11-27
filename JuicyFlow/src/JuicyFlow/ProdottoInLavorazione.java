package JuicyFlow;

/**
 *
 * @author juicyflowgroup
 */
public class ProdottoInLavorazione {
    private float quantità;
    private final RigaRicetta rigaRicetta;
    private boolean disponibile;
    
    ProdottoInLavorazione(RigaRicetta rigaRicetta, float quantità){
        this.rigaRicetta = rigaRicetta;
        this.quantità = quantità;
    }
    ProdottoInLavorazione(RigaRicetta rigaRicetta){
        this.rigaRicetta = rigaRicetta;
    }
    public float getQuantità(){
        return quantità;
    }
    public RigaRicetta getRigaRicetta(){
        return rigaRicetta;
    }
    public void setQuantità(float quantità){
        this.quantità = quantità;
    }
    public boolean getDisponibilità(){
        return disponibile;
    }
    public void setDisponibilità(boolean disponibile){
        this.disponibile = disponibile;
    }
    public float getDoseRigaRicetta(){
        return this.rigaRicetta.getDose();
    }
    public Prodotto getProdottoRiga(){
        return this.rigaRicetta.getProdotto();
    }
    public boolean getFlagIngresso(){
        return this.rigaRicetta.getIngresso();
    }
    public String getTipoProdotto(){
        return this.rigaRicetta.geTipoProdotto();
    }
    public void calcolaQuantitàTotale(float quantitàImmessa, float dose){
        float quantitàTotale = quantitàImmessa * dose;
        this.setQuantità(quantitàTotale);
    }
}

