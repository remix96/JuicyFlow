package JuicyFlow;

import java.util.LinkedList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author juicyflowgroup
 */
public class JuicyFlowTest {
    
    JuicyFlow juicyFlow;
    Ricetta rossa;
    Lavorazione lavorazione;
    Magazzino magazzino;
    Prodotto p1, p2, p3;
    
    @Before
    public void setUp() {
        juicyFlow = JuicyFlow.getIstanza();
        LinkedList<Ricetta> ricette = new LinkedList<>();   
        Serbatoio[] serbatoi;
        
        magazzino = juicyFlow.getMagazzino();
        
        p1 = new Prodotto("disponibile", "finito");
        p2 = new Prodotto("disponibile2", "finito");
        p3 = new Prodotto("nonDisponibile", "finito");
        
        magazzino.creaRiga(p1, 100);
        magazzino.creaRiga(p2, 100);
        magazzino.creaRiga(p3, 100);
        
        //Classi d'equivalenza corrette.
        //1# vari tipi di prodotti:
        Prodotto arancia = new Prodotto("arancia", "arancia");
        Prodotto additivo = new Prodotto("zucchero", "additivo");
        Prodotto spremuta = new Prodotto("succo", "spremuta");
        Prodotto finito = new Prodotto("fanta", "finito");
        
        //2# Ricetta:
        rossa = new Ricetta("rossa");
        
        //#3 vari tipi di righe ricetta:
        RigaRicetta r1 = new RigaRicetta(true, arancia, 1, true);
        RigaRicetta r2 = new RigaRicetta(false, spremuta, (float) 0.8, false);
        RigaRicetta r3 = new RigaRicetta(true, additivo, (float) 0.3, false);
         
        rossa.getRigheRicetta().add(r1);
        rossa.getRigheRicetta().add(r2);
        rossa.getRigheRicetta().add(r3);
        
        juicyFlow.getRicette().add(rossa);
    }
    
    @After
    public void tearDown() {
        this.juicyFlow = null;
    }

    /**
     * Test del metodo inserisciQuantità, della classe JuicyFlow.
     */
    @Test
    public void testInserisciQuantità1() {
        //Verifica che la quantità aggiornata di un ProdottoInLavorazione, sia corretta, nel caso di input corretto.
        System.out.println("inserisciQuantità TC1");
        Prodotto arancia = new Prodotto("arancia", "arancia");
        RigaRicetta r1 = new RigaRicetta(true, arancia, 1, true);
        ProdottoInLavorazione prodottoInLavorazione = new ProdottoInLavorazione(r1, 3F);
        float quantitàExp = 1.1F;
        float quantitàImmessa = 2.2F;
        float dose = 0.5F;
        prodottoInLavorazione.setQuantità(quantitàImmessa * dose);
        float quantitàFinale = prodottoInLavorazione.getQuantità();
        if (quantitàExp == quantitàFinale)
            assertEquals(quantitàExp, quantitàFinale, 0.0F);
        else 
            fail("testInserisciQuantità1 fallito");
    }
    
    @Test
    public void testInserisciQuantità2() {
        //Verifica che la quantità aggiornata di un ProdottoInLavorazione, non sia corretta, nel caso di input errato.
        System.out.println("inserisciQuantità TC2");
        Prodotto arancia = new Prodotto("arancia", "arancia");
        RigaRicetta r1 = new RigaRicetta(true, arancia, 1, true);
        ProdottoInLavorazione prodottoInLavorazione = new ProdottoInLavorazione(r1, 3F);
        float quantitàExp = 1.1F;
        float quantitàImmessa = 3.5F;
        float dose = 0.5F;
        prodottoInLavorazione.setQuantità(quantitàImmessa * dose);
        float quantitàFinale = prodottoInLavorazione.getQuantità();
        if (quantitàExp != quantitàFinale)
            assertNotEquals(quantitàExp, quantitàFinale, 0.0F);
        else 
            fail("testInserisciQuantità2 fallito");
    }
    
    @Test
    public void testInserisciQuantità3() {
        //Verifica che venga lanciata un’eccezione in caso di input <= 0.
        System.out.println("inserisciQuantità TC3");
        float quantitàImmmessa = -2.2F;
        try {
            juicyFlow.inserisciQuantità(quantitàImmmessa);
            fail("testInserisciQuantità3 fallito");
        }catch(Exception ex){
            assertTrue(true);
        }
    }
    
     /**
     * Test del metodo avviaVendita, della classe JuicyFlow.
     */
    @Test
    public void testAvviaVendita1() {
        //Verifica che la listaProdottiVendita tornata non sia vuota, in quanto è presente un prodotto finito
        System.out.println("getProdottiVendita TC1");
        magazzino.creaRiga(new Prodotto("a","finito"), 1.1F);
        magazzino.creaRiga(new Prodotto("a","additivo"), 2.1F);
        magazzino.creaRiga(new Prodotto("a","arancia"), 2.4F); 
        magazzino.creaRiga(new Prodotto("a","arancia"), 3.1F);
        assertNotNull(juicyFlow.avviaVendita());
    }
    
    @Test
    public void testAvviaVendita2() {
        //Verifica che la listaProdottiVendita tornata sia vuota, in quanto i prodotti non sono finiti
        System.out.println("getProdottiVendita TC2");
        magazzino.creaRiga(new Prodotto("a","additivo"), 2.1F);
        magazzino.creaRiga(new Prodotto("a","arancia"), 2.4F); 
        magazzino.creaRiga(new Prodotto("a","arancia"), 3.1F);
        assertTrue(juicyFlow.avviaVendita().isEmpty());
    }
    
    /**
     * Test del metodo inserisciProdotto, della classe JuicyFlow.
     */
    @Test
    public void testInserisciProdotto1() {
        //Verifica che venga gestito correttamente l’inserimento di una quantità <= 0.
        System.out.println("inserisciProdotto TC1");
        Prodotto arancia = new Prodotto("arancia", "arancia");
        float quantità = -2.1F;
        try {
            juicyFlow.inserisciProdotto(arancia, quantità);
            fail("testInserisciProdotto1 fallito");
        }catch(Exception ex){
            assertTrue(true);
        }
    }
            
    /**
     * Test del metodo selezionaRicetta, della classe JuicyFlow.
     */
    @Test
    public void testSelezionaRicetta1() {
        //Verifica che venga restituito il corretto nome del prodotto principale
        System.out.println("selezionaRicetta TC1");
        try{
            assertEquals("arancia", juicyFlow.selezionaRicetta(rossa));
        }catch(Exception ex){
            fail("testSelezionaRicetta1 fallito");
        }
    }

    @Test
    public void testSelezionaRicetta2(){
        //Verifica che il metodo lanci un’’eccezione nel caso in cui la ricetta selezionata non ha nessun prodotto principale.
        System.out.println("selezionaRicetta TC2");
        Ricetta r = new Ricetta("r");
        try{
            r.inserisciRigaRicetta(true, new Prodotto("test", "test"), 5, false);
        }catch(Exception ex){
            fail("selezioneRicetta TC2 fallito");
                    }
        try{
            juicyFlow.selezionaRicetta(r);
            fail("testSelezionaRicetta2 fallito");
        }catch (Exception ex){
            assertTrue(true);
        }
    }
    
    /**
     * Test del metodo selezionaProdotto, della classe JuicyFlow.
     */
    @Test
    public void testSelezionaProdotto1() {
        //Verifica che venga gestito correttamente l’inserimento di una quantità <= 0.
        System.out.println("selezionaProdotto TC1");
        Prodotto arancia = new Prodotto("rosaria", "arancia");
        float quantità = -1.2F;
        try {
            juicyFlow.selezionaProdotto(arancia, quantità);
            fail("testSelezionaProdotto1 fallito");
        }catch(Exception ex){
            assertTrue(true);
        }
    }  
    
     /**
     * Test del metodo terminaCreaRicetta, della classe JuicyFlow.
     */
     @Test
    public void testTerminaCreaRicetta1() throws Exception {
        //Verifica che non vengano create due ricette con lo stesso nome
        System.out.println("terminaCreaRicetta TC1");
        juicyFlow.setRicettaCorrente(new Ricetta());
        try{
            juicyFlow.terminaCreaRicetta("rossa");
            fail("terminaCreaRicetta TC1 fallito");
        }catch (Exception ex){
            assertTrue(true);
        }
    }
    
    /**
     * Test del metodo confermaVendita, della classe JuicyFlow.
     */
    @Test 
    public void testConfermaVendita1(){
        //Verifico caso 1° riga non disponibile
        System.out.println("ConfermaVendita TC1");

        OrdineVendita nonEffettuabile = new OrdineVendita();
        juicyFlow.setOrdineVenditaCorrente(nonEffettuabile);
        
        //Dei prodotti p1,p2,p3 sono disponibili 100 quantità
        try {
            juicyFlow.getOrdineVenditaCorrente().inserisciRigaOrdineVendita(p1, 110);
            juicyFlow.getOrdineVenditaCorrente().inserisciRigaOrdineVendita(p2, 80);
            juicyFlow.getOrdineVenditaCorrente().inserisciRigaOrdineVendita(p3, 80);
            this.juicyFlow.confermaVendita();
            
            assertFalse(juicyFlow.getOrdineVenditaCorrente().getDisponibilità());
        } catch (Exception ex) {
            fail("ConfermaVendita TC1 fallito: lanciata eccezione " + ex.getMessage());
        }
    }
    
    @Test 
    public void testConfermaVendita2(){
        //Verifico caso 1° e 2° riga non disponibile
        System.out.println("ConfermaVendita TC2");
        
        OrdineVendita nonEffettuabile = new OrdineVendita();
        juicyFlow.setOrdineVenditaCorrente(nonEffettuabile);
        //Dei prodotti p1,p2,p3 sono disponibili 100 quantità
        try {
            juicyFlow.getOrdineVenditaCorrente().inserisciRigaOrdineVendita(p1, 110);
            juicyFlow.getOrdineVenditaCorrente().inserisciRigaOrdineVendita(p2, 110);
            juicyFlow.getOrdineVenditaCorrente().inserisciRigaOrdineVendita(p3, 80);
            this.juicyFlow.confermaVendita();
            
            assertFalse(juicyFlow.getOrdineVenditaCorrente().getDisponibilità());
        } catch (Exception ex) {
            fail("ConfermaVendita TC2 fallito: lanciata eccezione " + ex.getMessage());
        }
    }
    
    @Test 
    public void testConfermaVendita3(){
        //Verifico caso con tutte le righe non disponibili
        System.out.println("ConfermaVendita TC3");
        
        OrdineVendita nonEffettuabile = new OrdineVendita();
        juicyFlow.setOrdineVenditaCorrente(nonEffettuabile);
        //Dei prodotti p1,p2,p3 sono disponibili 100 quantità
        try {
            juicyFlow.getOrdineVenditaCorrente().inserisciRigaOrdineVendita(p1, 110);
            juicyFlow.getOrdineVenditaCorrente().inserisciRigaOrdineVendita(p2, 110);
            juicyFlow.getOrdineVenditaCorrente().inserisciRigaOrdineVendita(p3, 110);
            this.juicyFlow.confermaVendita();
            
            assertFalse(juicyFlow.getOrdineVenditaCorrente().getDisponibilità());
        } catch (Exception ex) {
            fail("ConfermaVendita TC3 fallito: lanciata eccezione " + ex.getMessage());
        }
    }
    
    @Test 
    public void testConfermaVendita4(){
        //Verifico caso 2° riga mon disponibile
        System.out.println("ConfermaVendita TC4");
        
        OrdineVendita nonEffettuabile = new OrdineVendita();
        juicyFlow.setOrdineVenditaCorrente(nonEffettuabile);
        //Dei prodotti p1,p2,p3 sono disponibili 100 quantità
        try {
            juicyFlow.getOrdineVenditaCorrente().inserisciRigaOrdineVendita(p1, 80);
            juicyFlow.getOrdineVenditaCorrente().inserisciRigaOrdineVendita(p2, 110);
            juicyFlow.getOrdineVenditaCorrente().inserisciRigaOrdineVendita(p3, 80);
            this.juicyFlow.confermaVendita();
            
            assertFalse(juicyFlow.getOrdineVenditaCorrente().getDisponibilità());
        } catch (Exception ex) {
            fail("ConfermaVendita TC4 fallito: lanciata eccezione " + ex.getMessage());
        }
    }
    
    @Test 
    public void testConfermaVendita5(){
        //Verifico caso 2° e 3° riga non disponibile
        System.out.println("ConfermaVendita TC5");
        
        OrdineVendita nonEffettuabile = new OrdineVendita();
        juicyFlow.setOrdineVenditaCorrente(nonEffettuabile);
        //Dei prodotti p1,p2,p3 sono disponibili 100 quantità
        try {
            juicyFlow.getOrdineVenditaCorrente().inserisciRigaOrdineVendita(p1, 80);
            juicyFlow.getOrdineVenditaCorrente().inserisciRigaOrdineVendita(p2, 110);
            juicyFlow.getOrdineVenditaCorrente().inserisciRigaOrdineVendita(p3, 110);
            this.juicyFlow.confermaVendita();
            
            assertFalse(juicyFlow.getOrdineVenditaCorrente().getDisponibilità());
        } catch (Exception ex) {
            fail("ConfermaVendita TC5 fallito: lanciata eccezione " + ex.getMessage());
        }
    }
    
    @Test 
    public void testConfermaVendita6(){
        //Verifico caso 3° riga non disponibile
        System.out.println("ConfermaVendita TC6");
        
        OrdineVendita nonEffettuabile = new OrdineVendita();
        juicyFlow.setOrdineVenditaCorrente(nonEffettuabile);
        //Dei prodotti p1,p2,p3 sono disponibili 100 quantità
        try {
            juicyFlow.getOrdineVenditaCorrente().inserisciRigaOrdineVendita(p1, 80);
            juicyFlow.getOrdineVenditaCorrente().inserisciRigaOrdineVendita(p2, 80);
            juicyFlow.getOrdineVenditaCorrente().inserisciRigaOrdineVendita(p3, 110);
            this.juicyFlow.confermaVendita();
            
            assertFalse(juicyFlow.getOrdineVenditaCorrente().getDisponibilità());
        } catch (Exception ex) {
            fail("ConfermaVendita TC6 fallito: lanciata eccezione " + ex.getMessage());
        }
    }
    @Test 
    public void testConfermaVendita7(){
        //Verifico caso 1° e 3° riga non disponibile
        System.out.println("ConfermaVendita TC7");
        
        OrdineVendita nonEffettuabile = new OrdineVendita();
        juicyFlow.setOrdineVenditaCorrente(nonEffettuabile);
        //Dei prodotti p1,p2,p3 sono disponibili 100 quantità
        try {
            juicyFlow.getOrdineVenditaCorrente().inserisciRigaOrdineVendita(p1, 110);
            juicyFlow.getOrdineVenditaCorrente().inserisciRigaOrdineVendita(p2, 80);
            juicyFlow.getOrdineVenditaCorrente().inserisciRigaOrdineVendita(p3, 110);
            this.juicyFlow.confermaVendita();
            
            assertFalse(juicyFlow.getOrdineVenditaCorrente().getDisponibilità());
        } catch (Exception ex) {
            fail("ConfermaVendita TC7 fallito: lanciata eccezione " + ex.getMessage());
        }
    }
    
    @Test 
    public void testConfermaVendita8(){
        //Verifico caso con tutte le righe disponibili
        System.out.println("ConfermaVendita TC8");
        
        OrdineVendita effettuabile = new OrdineVendita();
        juicyFlow.setOrdineVenditaCorrente(effettuabile);
        //Dei prodotti p1,p2,p3 sono disponibili 100 quantità
        try {
            juicyFlow.getOrdineVenditaCorrente().inserisciRigaOrdineVendita(p1, 80);
            juicyFlow.getOrdineVenditaCorrente().inserisciRigaOrdineVendita(p2, 80);
            juicyFlow.getOrdineVenditaCorrente().inserisciRigaOrdineVendita(p3, 80);
            this.juicyFlow.confermaVendita();
            
            assertTrue(juicyFlow.getOrdineVenditaCorrente().getDisponibilità());
        } catch (Exception ex) {
            fail("ConfermaVendita TC8 fallito: lanciata eccezione " + ex.getMessage());
        }
    }
    
    /*
     * Test del metodo confermaVendita(ordineSelezionato), della classe JuicyFlow.
     */
    @Test 
    public void testConfermaVenditaPendente1(){
        //Verifico caso 1° riga non disponibile
        System.out.println("ConfermaVenditaPendente TC1");

        OrdineVendita nonEffettuabile = new OrdineVendita();
        juicyFlow.setOrdineVenditaCorrente(nonEffettuabile);
        
        //Dei prodotti p1,p2,p3 sono disponibili 100 quantità
        try {
            juicyFlow.getOrdineVenditaCorrente().inserisciRigaOrdineVendita(p1, 110);
            juicyFlow.getOrdineVenditaCorrente().inserisciRigaOrdineVendita(p2, 80);
            juicyFlow.getOrdineVenditaCorrente().inserisciRigaOrdineVendita(p3, 80);
            this.juicyFlow.confermaVendita(nonEffettuabile);
            
            assertFalse(juicyFlow.getOrdineVenditaCorrente().getDisponibilità());
        } catch (Exception ex) {
            fail("ConfermaVenditaPendente TC1 fallito: lanciata eccezione " + ex.getMessage());
        }
    }
    
    @Test 
    public void testConfermaVenditaPendente2(){
        //Verifico caso 1° e 2° riga non disponibile
        System.out.println("ConfermaVenditaPendente TC2");
        
        OrdineVendita nonEffettuabile = new OrdineVendita();
        juicyFlow.setOrdineVenditaCorrente(nonEffettuabile);
        //Dei prodotti p1,p2,p3 sono disponibili 100 quantità
        try {
            juicyFlow.getOrdineVenditaCorrente().inserisciRigaOrdineVendita(p1, 110);
            juicyFlow.getOrdineVenditaCorrente().inserisciRigaOrdineVendita(p2, 110);
            juicyFlow.getOrdineVenditaCorrente().inserisciRigaOrdineVendita(p3, 80);
            this.juicyFlow.confermaVendita(nonEffettuabile);
            
            assertFalse(juicyFlow.getOrdineVenditaCorrente().getDisponibilità());
        } catch (Exception ex) {
            fail("ConfermaVenditaPendente TC2 fallito: lanciata eccezione " + ex.getMessage());
        }
    }
    
    @Test 
    public void testConfermaVenditaPendente3(){
        //Verifico caso con tutte le righe non disponibili
        System.out.println("ConfermaVenditaPendente TC3");
        
        OrdineVendita nonEffettuabile = new OrdineVendita();
        juicyFlow.setOrdineVenditaCorrente(nonEffettuabile);
        //Dei prodotti p1,p2,p3 sono disponibili 100 quantità
        try {
            juicyFlow.getOrdineVenditaCorrente().inserisciRigaOrdineVendita(p1, 110);
            juicyFlow.getOrdineVenditaCorrente().inserisciRigaOrdineVendita(p2, 110);
            juicyFlow.getOrdineVenditaCorrente().inserisciRigaOrdineVendita(p3, 110);
            this.juicyFlow.confermaVendita(nonEffettuabile);
            
            assertFalse(juicyFlow.getOrdineVenditaCorrente().getDisponibilità());
        } catch (Exception ex) {
            fail("ConfermaVenditaPendente TC3 fallito: lanciata eccezione " + ex.getMessage());
        }
    }
    
    @Test 
    public void testConfermaVenditaPendente4(){
        //Verifico caso 2° riga mon disponibile
        System.out.println("ConfermaVenditaPendente TC4");
        
        OrdineVendita nonEffettuabile = new OrdineVendita();
        juicyFlow.setOrdineVenditaCorrente(nonEffettuabile);
        //Dei prodotti p1,p2,p3 sono disponibili 100 quantità
        try {
            juicyFlow.getOrdineVenditaCorrente().inserisciRigaOrdineVendita(p1, 80);
            juicyFlow.getOrdineVenditaCorrente().inserisciRigaOrdineVendita(p2, 110);
            juicyFlow.getOrdineVenditaCorrente().inserisciRigaOrdineVendita(p3, 80);
            this.juicyFlow.confermaVendita(nonEffettuabile);
            
            assertFalse(juicyFlow.getOrdineVenditaCorrente().getDisponibilità());
        } catch (Exception ex) {
            fail("ConfermaVenditaPendente TC4 fallito: lanciata eccezione " + ex.getMessage());
        }
    }
    
    @Test 
    public void testConfermaVenditaPendente5(){
        //Verifico caso 2° e 3° riga non disponibile
        System.out.println("ConfermaVenditaPendente TC5");
        
        OrdineVendita nonEffettuabile = new OrdineVendita();
        juicyFlow.setOrdineVenditaCorrente(nonEffettuabile);
        //Dei prodotti p1,p2,p3 sono disponibili 100 quantità
        try {
            juicyFlow.getOrdineVenditaCorrente().inserisciRigaOrdineVendita(p1, 80);
            juicyFlow.getOrdineVenditaCorrente().inserisciRigaOrdineVendita(p2, 110);
            juicyFlow.getOrdineVenditaCorrente().inserisciRigaOrdineVendita(p3, 110);
            this.juicyFlow.confermaVendita(nonEffettuabile);
            
            assertFalse(juicyFlow.getOrdineVenditaCorrente().getDisponibilità());
        } catch (Exception ex) {
            fail("ConfermaVenditaPendente TC5 fallito: lanciata eccezione " + ex.getMessage());
        }
    }
    
    @Test 
    public void testConfermaVenditaPendente6(){
        //Verifico caso 3° riga non disponibile
        System.out.println("ConfermaVenditaPendente TC6");
        
        OrdineVendita nonEffettuabile = new OrdineVendita();
        juicyFlow.setOrdineVenditaCorrente(nonEffettuabile);
        //Dei prodotti p1,p2,p3 sono disponibili 100 quantità
        try {
            juicyFlow.getOrdineVenditaCorrente().inserisciRigaOrdineVendita(p1, 80);
            juicyFlow.getOrdineVenditaCorrente().inserisciRigaOrdineVendita(p2, 80);
            juicyFlow.getOrdineVenditaCorrente().inserisciRigaOrdineVendita(p3, 110);
            this.juicyFlow.confermaVendita(nonEffettuabile);
            
            assertFalse(juicyFlow.getOrdineVenditaCorrente().getDisponibilità());
        } catch (Exception ex) {
            fail("ConfermaVenditaPendente TC6 fallito: lanciata eccezione " + ex.getMessage());
        }
    }
    @Test 
    public void testConfermaVenditaPendente7(){
        //Verifico caso 1° e 3° riga non disponibile
        System.out.println("ConfermaVenditaPendente TC7");
        
        OrdineVendita nonEffettuabile = new OrdineVendita();
        juicyFlow.setOrdineVenditaCorrente(nonEffettuabile);
        //Dei prodotti p1,p2,p3 sono disponibili 100 quantità
        try {
            juicyFlow.getOrdineVenditaCorrente().inserisciRigaOrdineVendita(p1, 110);
            juicyFlow.getOrdineVenditaCorrente().inserisciRigaOrdineVendita(p2, 80);
            juicyFlow.getOrdineVenditaCorrente().inserisciRigaOrdineVendita(p3, 110);
            this.juicyFlow.confermaVendita(nonEffettuabile);
            
            assertFalse(juicyFlow.getOrdineVenditaCorrente().getDisponibilità());
        } catch (Exception ex) {
            fail("ConfermaVenditaPendente TC7 fallito: lanciata eccezione " + ex.getMessage());
        }
    }
    
    @Test 
    public void testConfermaVenditaPendente8(){
        //Verifico caso con tutte le righe disponibili
        System.out.println("ConfermaVenditaPendente TC8");
        
        OrdineVendita effettuabile = new OrdineVendita();
        juicyFlow.setOrdineVenditaCorrente(effettuabile);
        //Dei prodotti p1,p2,p3 sono disponibili 100 quantità
        try {
            juicyFlow.getOrdineVenditaCorrente().inserisciRigaOrdineVendita(p1, 80);
            juicyFlow.getOrdineVenditaCorrente().inserisciRigaOrdineVendita(p2, 80);
            juicyFlow.getOrdineVenditaCorrente().inserisciRigaOrdineVendita(p3, 80);
            this.juicyFlow.confermaVendita(effettuabile);
            
            assertTrue(juicyFlow.getOrdineVenditaCorrente().getDisponibilità());
        } catch (Exception ex) {
            fail("ConfermaVenditaPendente TC8 fallito: lanciata eccezione " + ex.getMessage());
        }
    }

}
