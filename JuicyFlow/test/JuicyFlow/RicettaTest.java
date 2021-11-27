package JuicyFlow;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author juicyflowgroup
 */
public class RicettaTest {
    JuicyFlow juicyFlow;
    Ricetta test;
    
    public RicettaTest() {
        test = new Ricetta();
    }

    /**
     * Test of inserisciRigaRicetta method, of class Ricetta.
     */
    @Test
    public void testInserisciRigaRicetta1() throws Exception {
        //Verifica che non venga permessa la creazione di una ricetta, nel caso in cui venga settato come principale più di un prodotto
        System.out.println("inserisciRigaRicetta TC1");
        
        //inserisco due prodotti settati a principale nella ricetta, ciò dovrebbe generare un eccezione.
        try{
            test.inserisciRigaRicetta(false, new Prodotto("test1","test1"), 0, true);
            test.inserisciRigaRicetta(true, new Prodotto("test2","test2"), 0, true);
            fail("inserisciRigaRicetta TC1 fallito");
        }catch (Exception ex){
            assertTrue(true);
        }
    }
    
    @Test
    public void testInserisciRigaRicetta2() throws Exception {
        //Verifica che non venga permessa la creazione di una ricetta, nel caso in cui venga settato come spremuta più di un prodotto
        System.out.println("inserisciRigaRicetta TC2");
        
        //inserisco due prodotti i cui attributi daranno vita al tipo spremuta in uscita per entrambi.
        try{
            test.inserisciRigaRicetta(false, new Prodotto("test1","spremuta"), 0, false);
            test.inserisciRigaRicetta(false, new Prodotto("test2","spremuta"), 0, true);
            fail("inserisciRigaRicetta TC2 fallito");
        }catch (Exception ex){
            assertTrue(true);
        }
    }
    
    @Test
    public void testInserisciRigaRicetta3() throws Exception {
        //Verifica che la lista righeRicette, dopo aver passato delle righe ricetta corrette, non sia vuota
        System.out.println("inserisciRigaRicetta TC3");
        juicyFlow = JuicyFlow.getIstanza();
        
        juicyFlow.avviaCreaRicetta();
        try{
            test.inserisciRigaRicetta(true, new Prodotto("test1","spremuta"), 0, false);
            test.inserisciRigaRicetta(false, new Prodotto("test2","spremuta"), 0, true);
            assertFalse(test.getRigheRicetta().isEmpty());
        }catch (Exception ex){
            fail("inserisciRigaRicetta TC3 fallito");
        }
    }
    
    @Test
    public void testInserisciRigaRicetta4() throws Exception {
        //Verifica che non siano inseriti due prodotti uguali in una nuova ricetta
        System.out.println("inserisciRigaRicetta TC4");
        
        Prodotto p1 = new Prodotto("test1","spremuta");
        try{
            test.inserisciRigaRicetta(true, p1, 0, false);
            test.inserisciRigaRicetta(false, p1, 0, true);
            fail("inserisciRigaRicetta TC4 fallito");
        }catch (Exception ex){
            assertTrue(true);
        }
    }
    
   
    
}
