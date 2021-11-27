package JuicyFlow;

/**
 *
 * @author juicyflowgroup
 */
public class StartUp {
    private JuicyFlow juicyFlow;
    private Ricetta ricetta1, ricetta3;
    private Prodotto fanta, rossa, gialla, zucchero, olio1, olio2, aranciaRossa, aranciaGialla;
    
    public StartUp(JuicyFlow juicyFlow){
        this.juicyFlow = juicyFlow;
        
        ricetta1 = new Ricetta("spremutaRossa");
        ricetta3 = new Ricetta("Fanta");
        
        fanta = new Prodotto("Fanta", "finito");
        rossa = new Prodotto("spremutaRossa", "spremuta");
        gialla = new Prodotto("spremutaGialla", "spremuta");
        zucchero = new Prodotto("zucchero", "additivo");
        olio1 = new Prodotto("olio1","additivo");
        olio2 = new Prodotto("olio2","additivo");
        aranciaRossa = new Prodotto("aranciaRossa","arancia");
        aranciaGialla = new Prodotto("aranciaGialla","arancia");
        
        //popolo la lista delle ricette
        this.juicyFlow.getRicette().add(ricetta1);
        this.juicyFlow.getRicette().add(ricetta3);
        //imposto id e capienza serbatoi
        
        for(int i = 0; i < this.juicyFlow.getMagazzino().getSerbatoi().length; i++){
            this.juicyFlow.getMagazzino().getSerbatoi()[i] = new Serbatoio(i+1, 500);
        }
        //popolo i serbatoi, l'esito del riempimento può essere salvato una un oggetto String
        this.juicyFlow.getMagazzino().getSerbatoi()[1].aggiungiSpremuta(rossa, 80);
        this.juicyFlow.getMagazzino().getSerbatoi()[2].aggiungiSpremuta(gialla, 100);
        //popolo il magazzino
        this.juicyFlow.getMagazzino().creaRiga(zucchero, 10);
        this.juicyFlow.getMagazzino().creaRiga(olio1, 5);
        this.juicyFlow.getMagazzino().creaRiga(olio2, 12);
        this.juicyFlow.getMagazzino().creaRiga(fanta, 52);
        this.juicyFlow.getMagazzino().creaRiga(aranciaRossa, 2000);
        this.juicyFlow.getMagazzino().creaRiga(aranciaGialla, 2400);
        
        //popolo le righe delle ricette
        try{
            this.juicyFlow.getRicette().get(0).inserisciRigaRicetta(true,aranciaRossa, 1, true);
            this.juicyFlow.getRicette().get(0).inserisciRigaRicetta(false,rossa, (float) 0.8, false);
            this.juicyFlow.getRicette().get(1).inserisciRigaRicetta(false, fanta, 1, true);
            this.juicyFlow.getRicette().get(1).inserisciRigaRicetta(true, zucchero, (float) 0.3, false);
            this.juicyFlow.getRicette().get(1).inserisciRigaRicetta(true, gialla, (float) 0.7, false);
        }catch (Exception ex){
            
        }
        //popolo la lista prodotti
        this.juicyFlow.getListaProdotti().add(fanta);
        this.juicyFlow.getListaProdotti().add(rossa);
        this.juicyFlow.getListaProdotti().add(gialla);
        this.juicyFlow.getListaProdotti().add(zucchero);
        this.juicyFlow.getListaProdotti().add(olio1);
        this.juicyFlow.getListaProdotti().add(olio2);
        this.juicyFlow.getListaProdotti().add(aranciaRossa);
        this.juicyFlow.getListaProdotti().add(aranciaGialla);
    }
}
