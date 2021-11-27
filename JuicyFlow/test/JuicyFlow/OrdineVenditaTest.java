package JuicyFlow;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author juicyflowgroup
 */
public class OrdineVenditaTest {
    
    OrdineVendita ordineVenditaCorrente;
    Prodotto p1, p2;
    
    public OrdineVenditaTest() {
        ordineVenditaCorrente  = new OrdineVendita();
        p1 = new Prodotto("a","finito");
        p2 = new Prodotto("a","additivo");
    }

    /**
     * Test del metodo inserisciRigaOrdineVendita, della classe OrdineVendita.
     */
    @Test
    public void testInserisciRigaOrdineVendita1() {
        //Verifica che la lista righeOrdineVendita sia non vuota
        System.out.println("inserisciRigaOrdineVendita TC1");
        try{
            ordineVenditaCorrente.inserisciRigaOrdineVendita(p1, 1.1F);
            ordineVenditaCorrente.inserisciRigaOrdineVendita(p2, 2.1F);
            assertFalse(ordineVenditaCorrente.getRigheOrdineVendita().isEmpty());
        }catch(Exception ex){
            fail("inserisciRigaOrdineVendita TC1 fallito");
        }
    }
    
    @Test
    public void testInserisciRigaOrdineVendita2() {
        //Verifica che non vengano inseriti due prodotti uguali
        System.out.println("inserisciRigaOrdineVendita TC2");
        
        try{
            ordineVenditaCorrente.inserisciRigaOrdineVendita(p1, 1.1F);
            ordineVenditaCorrente.inserisciRigaOrdineVendita(p2, 2.1F);
            ordineVenditaCorrente.inserisciRigaOrdineVendita(p1, 2.4F); 
            fail("inserisciRigaOrdineVendita TC2 fallito");
        }catch(Exception ex){
            assertTrue(true);
        }
    }

}
