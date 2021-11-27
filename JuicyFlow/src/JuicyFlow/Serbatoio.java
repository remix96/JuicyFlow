package JuicyFlow;

/**
 *
 * @author juicyflowgroup
 */
public class Serbatoio {
    private final int id;
    private float quantità;
    private final float capienza;
    private Prodotto contenuto;
       
    Serbatoio(int id, float capienza){
        this.id = id;
        this.capienza = capienza;
        this.contenuto = null;
        this.quantità=0;
    }
    public int getId(){
        return id;
    }
    public Prodotto getProdotto(){
        return contenuto;
    }   
    public float getQuantitàContenuta(){
        return quantità;
    }
    public float getCapienza(){
        return capienza;
    }   
    
    
    public boolean aggiungiSpremuta(Prodotto prodotto, float quantità){
        boolean esito = false;
        if(prodotto == contenuto || contenuto == null){
            if((this.capienza - this.quantità) >= quantità){
                this.quantità += quantità;
                quantità = 0;
                this.contenuto = prodotto;
                esito = true;
            }
            else{
                quantità -= (this.capienza - this.quantità);
                this.quantità = this.capienza;
                this.contenuto = prodotto;
                esito = true;
            }
            esito = true;
        }
        return esito;
    }
    public float sottraiSpremuta(Prodotto prodotto, float quantità){
        if(prodotto == contenuto)
            if(this.quantità >= quantità){
                this.quantità -= quantità;
                quantità = 0;
            }
            else{
             quantità -= this.quantità;
             this.quantità = 0;
             this.contenuto = null;
            }
            return quantità;
    }
    public String getNomeProdotto(){
        return this.contenuto.getNome();
    }

    @Override
    public String toString() {
        return "Serbatoio " + id;
    }
}
