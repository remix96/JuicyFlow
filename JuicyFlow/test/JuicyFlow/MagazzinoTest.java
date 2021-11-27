package JuicyFlow;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author juicyflowgroup
 */
public class MagazzinoTest {
    
    Magazzino magazzino;
    Prodotto arancia, additivo, spremuta, spremutaGialla, spremutaRossa, spremutaBlu;
   
    public MagazzinoTest() {
        magazzino = new Magazzino();
        for(int i = 0; i < magazzino.getSerbatoi().length; i++){
            magazzino.getSerbatoi()[i] = new Serbatoio(i+1, 500);
        }
        arancia = new Prodotto("arancia", "arancia");
        additivo = new Prodotto("zucchero", "additivo");
        spremuta = new Prodotto("succo", "spremuta");
        spremutaGialla = new Prodotto("spremutaGialla", "spremuta");
        spremutaRossa = new Prodotto("rossa", "spremuta");
        spremutaBlu = new Prodotto("spremutaBlu", "spremuta");
    }
    
    /*
     * Test del metodo aggiungiQuantitàBuffer, della classe Magazzino.
    */
    @Test
    public void testAggiungiQuantitàBuffer1() {
        //Verifica che la lista bufferRigheMagazzino non sia vuota
        System.out.println("aggiungiQuantitàBuffer TC1");
        //chiamo il metodo per istanziare la lista bufferRigheMagazzino..
        magazzino.avviaInserimento();
        
        magazzino.creaRiga(arancia, 1.1F);
        magazzino.creaRiga(additivo, 2.1F);
        magazzino.creaRiga(spremuta, 2.4F);
        float quantitàTest = 3.2F;
        magazzino.aggiungiQuantitàBuffer(arancia, quantitàTest);
        assertTrue(!magazzino.getBufferRigheMagazzino().isEmpty());
    }
    
    /**
     * Test del metodo tornaSerbatoiDisponibili, della classe Magazzino.
     */
    @Test
    public void testTornaSerbatoiDisponibili1(){
        //Verifica che non vengano restituiti serbatoi disponibili nel caso in cui siano pieni.
        System.out.println("tornaSerbatoiDisponibili TC1");
        
        magazzino.aggiungiQuantitàSerbatoio(magazzino.getSerbatoi()[0], spremutaGialla, 500F);
        magazzino.aggiungiQuantitàSerbatoio(magazzino.getSerbatoi()[1], spremutaGialla, 500F);
        magazzino.aggiungiQuantitàSerbatoio(magazzino.getSerbatoi()[2], spremutaGialla, 500F);
        magazzino.aggiungiQuantitàSerbatoio(magazzino.getSerbatoi()[3], spremutaGialla, 500F);
        magazzino.aggiungiQuantitàSerbatoio(magazzino.getSerbatoi()[4], spremutaGialla, 500F);
        
        assertTrue(magazzino.tornaSerbatoiDisponibili(spremutaGialla, 30).isEmpty());
    }
    
    @Test
    public void testTornaSerbatoiDisponibili2(){
        //Verifica che venga restituito un serbatoio avendone solo uno vuoto.        System.out.println("tornaSerbatoiDisponibili TC2");
        
        magazzino.aggiungiQuantitàSerbatoio(magazzino.getSerbatoi()[0], new Prodotto("rossa", "spremuta"), 500F);
        magazzino.aggiungiQuantitàSerbatoio(magazzino.getSerbatoi()[2], new Prodotto("rossa", "spremuta"), 480F);
        magazzino.aggiungiQuantitàSerbatoio(magazzino.getSerbatoi()[3], new Prodotto("rossa", "spremuta"), 500F);
        magazzino.aggiungiQuantitàSerbatoio(magazzino.getSerbatoi()[4], new Prodotto("rossa", "spremuta"), 500F);
        
        assertTrue(!magazzino.tornaSerbatoiDisponibili(spremutaGialla, 490).isEmpty());
    }
    @Test
    public void testTornaSerbatoiDisponibili3(){
        /*Verifica che venga restituito un serbatoio, 
        *nel caso in cui questo anche se non del tutto vuoto, abbia spazio per spremuta.
        */
        System.out.println("tornaSerbatoiDisponibili TC3");
        
        magazzino.aggiungiQuantitàSerbatoio(magazzino.getSerbatoi()[0], spremutaGialla, 500F);
        //serbatoio quasi pieno ma con abbastanza spazio
        magazzino.aggiungiQuantitàSerbatoio(magazzino.getSerbatoi()[1], spremutaGialla, 470F);
        //-------------------------------------
        magazzino.aggiungiQuantitàSerbatoio(magazzino.getSerbatoi()[2], spremutaGialla, 500F);
        magazzino.aggiungiQuantitàSerbatoio(magazzino.getSerbatoi()[3], spremutaGialla, 500F);
        magazzino.aggiungiQuantitàSerbatoio(magazzino.getSerbatoi()[4], spremutaGialla, 500F);
        
        assertTrue(!magazzino.tornaSerbatoiDisponibili(spremutaGialla, 30).isEmpty());
    }
    
    @Test
    public void testTornaSerbatoiDisponibili4(){
        /*Verifica che non vengano restituiti serbatoi,  
        nel caso in cui, uno di questi, abbia spazio disponibile, ma tipo di succo diverso.
        */
        System.out.println("tornaSerbatoiDisponibili TC4");
         
        magazzino.aggiungiQuantitàSerbatoio(magazzino.getSerbatoi()[0], spremutaGialla, 500F);
        //serbatoio con abbastanza spazio ma prodotto diverso
        magazzino.aggiungiQuantitàSerbatoio(magazzino.getSerbatoi()[1], spremutaGialla, 300F);
        //-------------------------------------
        magazzino.aggiungiQuantitàSerbatoio(magazzino.getSerbatoi()[2], spremutaGialla, 500F);
        magazzino.aggiungiQuantitàSerbatoio(magazzino.getSerbatoi()[3], spremutaGialla, 500F);
        magazzino.aggiungiQuantitàSerbatoio(magazzino.getSerbatoi()[4], spremutaGialla, 500F);
        
        
        assertTrue(magazzino.tornaSerbatoiDisponibili(spremutaRossa, 100).isEmpty());
    }
    
    @Test
    public void testTornaSerbatoiDisponibili5(){
        /*Verifica che non vengano restituiti serbatoi,  
        nel caso in cui questi,  non abbiano capienza sufficiente avendo lo stesso prodotto contenuto*/
        
        System.out.println("tornaSerbatoiDisponibili TC5");

        /*I serbatoi hanno capienza a 500, mettendo 10000 come quantità sul prodottto
        *in lavorazione, mi aspetto che venga tortnata una lista vuota.
        */
        assertTrue(magazzino.tornaSerbatoiDisponibili(spremutaGialla,1000).isEmpty());
    }
    
    @Test
    public void testTornaSerbatoiDisponibili6(){
        /*Verifica nel caso limite, in cui la capienza del serbatoio sia esattamente uguale
        alla quantità di prodotto di cui si desidera lo stoccaggio
        */
        System.out.println("tornaSerbatoiDisponibili TC6");
        
        /*I serbatoi hanno capienza a 500, mettendo 500 come quantità sul prodottto
        *in lavorazione, mi aspetto che venga tortnata una lista di 5 serbatoi.
        */
        assertTrue(5 == magazzino.tornaSerbatoiDisponibili(spremutaGialla,500).size());
    }
    
    /**
     * Test del metodo calcolaTotaleInSerbatoi, della classe Magazzino.
     */
    @Test
    public void testCalcolaTotaleInSerbatoi1(){
        //Verifica che sia restituita la corretta quantità di un determinato prodotto, anche in presenza di tipi diversi di prodotto.
        System.out.println("CalcolaTotaleInSerbatoi TC1");
        
        magazzino.aggiungiQuantitàSerbatoio(magazzino.getSerbatoi()[0], spremutaGialla, 100F);
        magazzino.aggiungiQuantitàSerbatoio(magazzino.getSerbatoi()[1], spremutaRossa, 500F);
        magazzino.aggiungiQuantitàSerbatoio(magazzino.getSerbatoi()[2], spremutaRossa, 500F);
        magazzino.aggiungiQuantitàSerbatoio(magazzino.getSerbatoi()[3], spremutaGialla, 350F);
        magazzino.aggiungiQuantitàSerbatoio(magazzino.getSerbatoi()[4], spremutaGialla, 500F);
        
        assertEquals(950F, magazzino.calcolaTotaleInSerbatoi(spremutaGialla), 0.0F);   
    }
    
    @Test
    public void testCalcolaTotaleInSerbatoi2(){
        //Verifica che le quantità dei prodotti non interessati non vengano conteggiate
        System.out.println("CalcolaTotaleInSerbatoi TC2");
        
        magazzino.aggiungiQuantitàSerbatoio(magazzino.getSerbatoi()[0], spremutaGialla, 100F);
        magazzino.aggiungiQuantitàSerbatoio(magazzino.getSerbatoi()[1], spremutaRossa, 500F);
        magazzino.aggiungiQuantitàSerbatoio(magazzino.getSerbatoi()[2], spremutaRossa, 500F);
        magazzino.aggiungiQuantitàSerbatoio(magazzino.getSerbatoi()[3], spremutaGialla, 350F);
        magazzino.aggiungiQuantitàSerbatoio(magazzino.getSerbatoi()[4], spremutaGialla, 500F);
        
        assertEquals(0F, magazzino.calcolaTotaleInSerbatoi(spremutaBlu), 0.0F);   
    }
    
    
}
