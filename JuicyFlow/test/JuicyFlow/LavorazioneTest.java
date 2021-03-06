package JuicyFlow;

import java.util.LinkedList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author juicyflowgroup
 */
public class LavorazioneTest {
    
    Lavorazione lavorazione;
    Magazzino magazzino;
    ProdottoInLavorazione pl1, pl2, pl3;
    Prodotto spremutaGialla, fanta, zucchero, spremutaRossa, arancia;
    
    public LavorazioneTest() {
        magazzino = new Magazzino();
        lavorazione = new Lavorazione(magazzino);
        for(int i = 0; i < magazzino.getSerbatoi().length; i++){
            magazzino.getSerbatoi()[i] = new Serbatoio(i+1, 500);
        }
        
        spremutaGialla = new Prodotto("spremutaGialla", "spremuta");
        spremutaRossa = new Prodotto("spremutaRossa", "spremuta");
        fanta = new Prodotto("fanta", "finito");
        zucchero = new Prodotto("zucchero", "additivo");
        arancia = new Prodotto("arancia", "arancia");
        
        RigaRicetta r1 = new RigaRicetta(false, fanta, 1, false);
        RigaRicetta r2 = new RigaRicetta(true, zucchero, (float) 0.3, false);
        RigaRicetta r3 = new RigaRicetta(true, spremutaGialla, (float) 0.7, false);
        
        pl1 = new ProdottoInLavorazione(r1, 1);
        pl2 = new ProdottoInLavorazione(r2, 0.3F);
        pl3 = new ProdottoInLavorazione(r3, 0.7F);
    }

    /**
     * Test del metodo inizializzaLavorazione, della classe Lavorazione.
     */
    @Test
    public void testInizializzaLavorazione1(){
        //Verifico che venga creata e popolata la lista prodottiInLavorazione
        System.out.println("inizializzaLavorazione TC1");
        
        Ricetta rossa = new Ricetta("rossa");        
        RigaRicetta r1 = new RigaRicetta(true, arancia, 1, true);
        RigaRicetta r2 = new RigaRicetta(true, zucchero, (float) 0.3, false);
        rossa.getRigheRicetta().add(r1);
        rossa.getRigheRicetta().add(r2);
        try{
            lavorazione.inizializzaLavorazione(rossa.getRigheRicetta());
            assertFalse(lavorazione.getProdottiInLavorazione().isEmpty());
        }catch (Exception ex){
            fail("Prodotti in lavorazione vuota");
        }
    }
    
     /**
     * Test del metodo inserisciQuantit??, della classe Lavorazione.
     */
    @Test
    public void testInserisciQuantit??1(){
        //Verifica che, avendo inserito solo quantit?? disponibili,
        //i prodotti in lavorazione vengano settati tutti a disponibile.
        System.out.println("inserisciQuantit?? TC1");
        
        LinkedList<ProdottoInLavorazione> prodottiInLavorazione = new LinkedList<>();
        
        prodottiInLavorazione.add(pl1);
        prodottiInLavorazione.add(pl2);
        prodottiInLavorazione.add(pl3);
        
        
        magazzino.creaRiga(zucchero, 53.23F);
        magazzino.creaRiga(fanta, 10F);
        
        magazzino.aggiungiQuantit??Serbatoio(magazzino.getSerbatoi()[2], spremutaGialla, 20F);
        magazzino.aggiungiQuantit??Serbatoio(magazzino.getSerbatoi()[3], spremutaRossa, 50F);
        magazzino.aggiungiQuantit??Serbatoio(magazzino.getSerbatoi()[4], spremutaGialla, 51F);
        
        lavorazione.setProdottiInLavorazione(prodottiInLavorazione);
        
        prodottiInLavorazione = lavorazione.inserisciQuantit??(100);
        
        for(ProdottoInLavorazione corrente: prodottiInLavorazione){
            if(corrente.getFlagIngresso()){
                assertTrue(corrente.getDisponibilit??());
            }
        }
        
    }
    
    @Test
    public void testInserisciQuantit??2(){
        //Verifica che avendo una lista prodottiInLavorazione e la sua relativa quantit??, venga verificata correttamente la disponibilit?? dei serbatoi in magazzino
        System.out.println("inserisciQuantit?? TC2");
        
        LinkedList<ProdottoInLavorazione> prodottiInLavorazione = new LinkedList<>();
        
        prodottiInLavorazione.add(pl1);
        prodottiInLavorazione.add(pl2);
        prodottiInLavorazione.add(pl3);
        
        
        magazzino.creaRiga(zucchero, 23.23F);
        magazzino.creaRiga(fanta, 10F);
        
        magazzino.aggiungiQuantit??Serbatoio(magazzino.getSerbatoi()[2], spremutaGialla, 20F);
        magazzino.aggiungiQuantit??Serbatoio(magazzino.getSerbatoi()[3], spremutaRossa, 50F);
        magazzino.aggiungiQuantit??Serbatoio(magazzino.getSerbatoi()[4], spremutaGialla, 51F);
        
        lavorazione.setProdottiInLavorazione(prodottiInLavorazione);
        
        prodottiInLavorazione = lavorazione.inserisciQuantit??(100);
        
        
        assertFalse(prodottiInLavorazione.get(1).getDisponibilit??());
        assertTrue(prodottiInLavorazione.get(2).getDisponibilit??());
    }
    
    @Test
    public void testInserisciQuantit??3(){
        //Verifica che avendo una lista prodottiInLavorazione e la sua relativa quantit??, con dati diversi, venga verificata correttamente la disponibilit?? dei serbatoi in magazzino
        System.out.println("inserisciQuantit?? TC3");
        
        LinkedList<ProdottoInLavorazione> prodottiInLavorazione = new LinkedList<>();
        
        prodottiInLavorazione.add(pl1);
        prodottiInLavorazione.add(pl2);
        prodottiInLavorazione.add(pl3);
        
        
        magazzino.creaRiga(zucchero, 53.23F);
        magazzino.creaRiga(fanta, 10F);
        
        magazzino.aggiungiQuantit??Serbatoio(magazzino.getSerbatoi()[2], spremutaGialla, 20F);
        magazzino.aggiungiQuantit??Serbatoio(magazzino.getSerbatoi()[3], spremutaRossa, 50F);
        magazzino.aggiungiQuantit??Serbatoio(magazzino.getSerbatoi()[4], spremutaGialla, 27F);
        
        lavorazione.setProdottiInLavorazione(prodottiInLavorazione);
        
        prodottiInLavorazione = lavorazione.inserisciQuantit??(100);
        
        
        assertTrue(prodottiInLavorazione.get(1).getDisponibilit??());
        assertFalse(prodottiInLavorazione.get(2).getDisponibilit??());
    }
    
}
