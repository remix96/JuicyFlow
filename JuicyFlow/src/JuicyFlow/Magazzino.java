package JuicyFlow;

import java.util.LinkedList;
import java.util.List;


/**
 *
 * @author dariorubino
 */
public class Magazzino {
    private final List<RigaMagazzino> righeMagazzino;
    private List<RigaMagazzino> bufferRigheMagazzino;
    private final Serbatoio[] serbatoi;
    
    public Magazzino(){
        this.serbatoi = new Serbatoio[5];
        this.righeMagazzino = new LinkedList<>();
    }
    public void creaRiga(Prodotto prod, float quantità){
        righeMagazzino.add(new RigaMagazzino(prod, quantità));
    }
    public void aggiungiQuantitàRigaMagazzino(Prodotto prod, float quantità){
        for(RigaMagazzino corrente : righeMagazzino){
            if(corrente.getNomeProdotto().equalsIgnoreCase(prod.getNome()))
                corrente.setQuantità(corrente.getQuantità() + quantità);
        }
    }
    public void sottraiQuantitàRigaMagazzino(Prodotto prod, float quantità){
        this.trovaRigaMagazzino(prod).sottraiProdotto(quantità);
    }
    public RigaMagazzino trovaRigaMagazzino(Prodotto prodotto){
        for(RigaMagazzino corrente : righeMagazzino){
            if(corrente.getNomeProdotto().equalsIgnoreCase(prodotto.getNome()))
                return corrente;
        }
        return null;
    }
    public float getQuantitàRigaMagazzino(Prodotto prodotto){
        float quantità = this.trovaRigaMagazzino(prodotto).getQuantità();
        return quantità;
    }
    public List<RigaMagazzino> getRigheMagazzino(){
        return this.righeMagazzino;
    }
    public Serbatoio[] getSerbatoi(){
        return this.serbatoi;
    }
    
    public List<RigaMagazzino> getBufferRigheMagazzino(){
        return this.bufferRigheMagazzino;
    }
    public void avviaInserimento(){
        this.bufferRigheMagazzino = new LinkedList<>();
    }
    public void aggiungiQuantitàBuffer(Prodotto prodotto, float quantità){
        float quantitàPresente = this.getQuantitàRigaMagazzino(prodotto);
        bufferRigheMagazzino.add(new RigaMagazzino(prodotto, quantitàPresente + quantità));
    }
    public void terminaInserimento(){
        float quantità;
        Prodotto prodottoRigaBuffer;
        for(RigaMagazzino rigaBufferCorrente: bufferRigheMagazzino){
            prodottoRigaBuffer = rigaBufferCorrente.getProdotto();
            quantità = rigaBufferCorrente.getQuantità();
            this.trovaRigaMagazzino(prodottoRigaBuffer).setQuantità(quantità);
        }
        this.bufferRigheMagazzino = null;
    }
    public String mostraProdottiInMagazzino(){
        StringBuilder contenutoMagazzino = new StringBuilder("Contenuto magazzino:\n\n\n");
        String nomeProdotto;
        float quantità;
        for(RigaMagazzino corrente : this.righeMagazzino){
            nomeProdotto = corrente.getNomeProdotto();
            quantità = corrente.getQuantità();
            contenutoMagazzino.append("-" + nomeProdotto + " : " + quantità + " Kg\n\n");
        }
        return contenutoMagazzino.toString();
    }
    public String mostraSerbatoi(){
        StringBuilder lista = new StringBuilder("Contenuto serbatoi: \n\n");
        for(Serbatoio corrente: serbatoi){
            lista.append("Serbatoio " + corrente.getId() + ": ");
            if(corrente.getQuantitàContenuta() == 0)
                lista.append("   vuoto\n");
            else{
                lista.append(corrente.getNomeProdotto() + " --> " + corrente.getQuantitàContenuta());
                if(corrente.getCapienza() == corrente.getQuantitàContenuta())
                    lista.append("   pieno\n");
                else 
                    lista.append("\n");
            }     
        }
        return lista.toString();
    }
    
    public float calcolaTotaleInSerbatoi(Prodotto prodotto){
        float counter = 0;
        for (Serbatoio serbatoio : serbatoi) {
            if (serbatoio.getProdotto() != null) {
                if (serbatoio.getProdotto() == prodotto) {
                    counter += serbatoio.getQuantitàContenuta();
                }
            }
        }
        return counter;
    }
    public LinkedList<Serbatoio> tornaSerbatoiDisponibili(Prodotto prodotto, float quantità){
        //Cambio SerbatoiDisponibili
        LinkedList<Serbatoio> serbatoiDisponibili = new LinkedList<>();
        
        for(Serbatoio serbatoioCorrente: serbatoi) {
            
            Prodotto prodottoSerbatoio = serbatoioCorrente.getProdotto();
            float quantitàPresente = serbatoioCorrente.getQuantitàContenuta();
            float capienza = serbatoioCorrente.getCapienza();
            if(((prodottoSerbatoio == prodotto) && (capienza >= quantitàPresente + quantità)) || ((prodottoSerbatoio == null) && (quantità <= capienza))) 
                serbatoiDisponibili.add(serbatoioCorrente);                           
        }
        return serbatoiDisponibili;
    }
    public void sottraiQuantitàSerbatoio(Prodotto prod, float quantità){
        for(Serbatoio serbatoioCorrente: serbatoi){
            if(quantità > 0){
                if(serbatoioCorrente.getProdotto() != null)
                    quantità = serbatoioCorrente.sottraiSpremuta(prod, quantità);
            }
        }
    }
    public void aggiungiQuantitàSerbatoio(Serbatoio serbatoioSelezionato, Prodotto prod, float quantità){
        serbatoioSelezionato.aggiungiSpremuta(prod, quantità);
    }
}
