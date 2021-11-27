package JuicyFlow;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author juicyflowgroup
 */
public class Lavorazione {
    private Magazzino magazzino;
    private LinkedList<ProdottoInLavorazione> prodottiInLavorazione;
    
    public Lavorazione(){
    }
    
    
    public Lavorazione(Magazzino mag){
        magazzino = mag;
    }
    public String inizializzaLavorazione(List<RigaRicetta> righeRicetta) throws Exception{
        ProdottoInLavorazione prodottoInLavorazioneCorrente;
        String nomeProdottoPrincipale = null;
        prodottiInLavorazione = new LinkedList<>();
        boolean esistePrincipale = false;
        
        for (RigaRicetta rigaRicetta : righeRicetta) {
            prodottoInLavorazioneCorrente = new ProdottoInLavorazione(rigaRicetta);
            
            prodottiInLavorazione.add(prodottoInLavorazioneCorrente);
            if(rigaRicetta.getPrincipale()){
                nomeProdottoPrincipale = rigaRicetta.getNomeProdotto();
                esistePrincipale = true;
            }
        }
        
        if(!esistePrincipale)
            throw new Exception("ProdottoPrincipaleMancante");
        
        return nomeProdottoPrincipale;
    }
    public LinkedList<ProdottoInLavorazione> inserisciQuantità(float quantitàImmessa){
        float quantitàDisponibile = 0;
        boolean ingresso;
        Prodotto prodotto;
        String tipo;
        
        for(ProdottoInLavorazione corrente: prodottiInLavorazione){
            corrente.calcolaQuantitàTotale(quantitàImmessa, corrente.getDoseRigaRicetta());
            
            prodotto = corrente.getProdottoRiga();
            ingresso = corrente.getFlagIngresso();
            tipo = corrente.getTipoProdotto();

            if(ingresso){
                if(tipo.equalsIgnoreCase("spremuta")) 
                    quantitàDisponibile = this.magazzino.calcolaTotaleInSerbatoi(prodotto);
                else 
                    quantitàDisponibile = this.magazzino.getQuantitàRigaMagazzino(prodotto);
                
                if(corrente.getQuantità() <= quantitàDisponibile)
                    corrente.setDisponibilità(true);
                else
                    corrente.setDisponibilità(false);   
            }
        }
        return prodottiInLavorazione;
    }
    public LinkedList<Serbatoio> verificaSerbatoiDisponibili(){
        LinkedList<Serbatoio> serbatoiDisponibili = null;
        Prodotto prodotto;
        float quantità;
        boolean ingresso;
        String tipo;
        for(ProdottoInLavorazione prodInLavorazione: prodottiInLavorazione){
            quantità = prodInLavorazione.getQuantità();
            prodotto = prodInLavorazione.getProdottoRiga();
            ingresso = prodInLavorazione.getFlagIngresso();
            tipo = prodInLavorazione.getTipoProdotto();
            //SE NON è UN PRODOTTO IN INGRESSO ED è UNA SPREMUTA
            if((!ingresso) && (tipo.equalsIgnoreCase("spremuta"))) 
                    serbatoiDisponibili = magazzino.tornaSerbatoiDisponibili(prodotto, quantità);
        }
        return serbatoiDisponibili;
    }
    public void terminaLavorazione(){
        Prodotto prodotto;
        for(ProdottoInLavorazione corrente: prodottiInLavorazione){
            prodotto = corrente.getRigaRicetta().getProdotto();
            if(corrente.getRigaRicetta().getIngresso()){
                if(prodotto.getTipo().equalsIgnoreCase("spremuta")){
                    magazzino.sottraiQuantitàSerbatoio(prodotto, corrente.getQuantità());
                }else 
                    magazzino.sottraiQuantitàRigaMagazzino(prodotto, corrente.getQuantità());
            }else
                magazzino.aggiungiQuantitàRigaMagazzino(prodotto, corrente.getQuantità());
        }
    }
    public void terminaLavorazione(Serbatoio serbatoioSelezionato){
        Prodotto prodotto;
        for(ProdottoInLavorazione corrente: prodottiInLavorazione){
            prodotto = corrente.getProdottoRiga();
            if(corrente.getFlagIngresso()){
                if(corrente.getTipoProdotto().equalsIgnoreCase("spremuta")){
                    magazzino.sottraiQuantitàSerbatoio(prodotto, corrente.getQuantità());
                }else 
                    magazzino.sottraiQuantitàRigaMagazzino(prodotto, corrente.getQuantità());
                // Se non è un prodotto d'ingresso
            }else{
                if(prodotto.getTipo().equalsIgnoreCase("spremuta")){
                    magazzino.aggiungiQuantitàSerbatoio(serbatoioSelezionato, prodotto, corrente.getQuantità());
                    
                } else {
                    magazzino.aggiungiQuantitàRigaMagazzino(prodotto, corrente.getQuantità());
                }
            }
        }
        prodottiInLavorazione = null;
    }

    public Magazzino getMagazzino() {
        return magazzino;
    }

    public void setMagazzino(Magazzino magazzino) {
        this.magazzino = magazzino;
    }

    public LinkedList<ProdottoInLavorazione> getProdottiInLavorazione() {
        return this.prodottiInLavorazione;
    }

    public void setProdottiInLavorazione(LinkedList<ProdottoInLavorazione> prodottiInLavorazione) {
        this.prodottiInLavorazione = prodottiInLavorazione;
    }
}
