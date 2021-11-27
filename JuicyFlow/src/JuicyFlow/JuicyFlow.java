package JuicyFlow;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author juicyflowgroup
 */
public class JuicyFlow {
    private static JuicyFlow singleton;
    
    private final Magazzino magazzino;
    private final LinkedList<Ricetta> ricette;
    private OrdineVendita ordineVenditaCorrente;
    private final LinkedList<OrdineVendita> listaOrdiniPendenti;
    private final LinkedList<Prodotto> listaProdotti;
    private Ricetta ricettaCorrente;
    private final Lavorazione lavorazione;
    
    
    public static JuicyFlow getIstanza() {
        if (singleton == null) {
            singleton = new JuicyFlow();
        }
        return singleton;
    }
    
    private JuicyFlow(){
        this.magazzino = new Magazzino();
        this.ricette = new LinkedList<>();
        this.ordineVenditaCorrente = null;
        this.listaOrdiniPendenti = new LinkedList<>();
        this.listaProdotti = new LinkedList<>();
        this.ricettaCorrente = null;
        this.lavorazione = new Lavorazione(this.magazzino);
    }
    
    public LinkedList<OrdineVendita> getListaOrdiniPendenti(){
        return this.listaOrdiniPendenti;
    }

    public LinkedList<Ricetta> getRicette(){
        return this.ricette;
    }
    public Magazzino getMagazzino(){
        return this.magazzino;
    }
    
    public LinkedList<Prodotto> getListaProdotti(){
        return this.listaProdotti;
    }
    
    public LinkedList<Prodotto> avviaInserimento(){
        LinkedList<Prodotto> listaProdottiFiniti = new LinkedList<>();
        for(RigaMagazzino corrente : this.magazzino.getRigheMagazzino()){
            if(!corrente.getProdotto().getTipo().equalsIgnoreCase("finito"))
            listaProdottiFiniti.add(corrente.getProdotto());
        }
        this.magazzino.avviaInserimento();
        return listaProdottiFiniti;
    }
    public void inserisciProdotto(Prodotto selezionato, float quantità) throws Exception{
        if(quantità <= 0) 
            throw new Exception("Quantità <= 0");
        this.magazzino.aggiungiQuantitàBuffer(selezionato, quantità);
    }
    public void terminaInserimento(){
        this.magazzino.terminaInserimento();
    }
    public String selezionaRicetta(Ricetta ricetta) throws Exception{
        
        return this.lavorazione.inizializzaLavorazione(ricetta.getRigheRicetta());
        
    }
    public LinkedList<ProdottoInLavorazione> inserisciQuantità(float quantitàImmessa) throws Exception{
        if(quantitàImmessa <= 0) 
            throw new Exception("Quantità immessa <= 0");
        
        return lavorazione.inserisciQuantità(quantitàImmessa);
        
    }
    public LinkedList<Serbatoio> verificaSerbatoiDisponibili(){
        
        return this.lavorazione.verificaSerbatoiDisponibili();
    }
    public void terminaLavorazione(){
        this.lavorazione.terminaLavorazione();
    }
    public void terminaLavorazione(Serbatoio serbatoioSelezionato){
        this.lavorazione.terminaLavorazione(serbatoioSelezionato);
    }
    public LinkedList<Prodotto> avviaVendita(){
        ordineVenditaCorrente = new OrdineVendita();
        LinkedList<Prodotto> prodottiVendita = new LinkedList<>();
        for(Prodotto corrente: listaProdotti){
            if(corrente.getTipo().equalsIgnoreCase("finito"))
                prodottiVendita.add(corrente);
        }
        return prodottiVendita;
    }
    public void selezionaProdotto(Prodotto selezionato, float quantità) throws Exception{
        if(quantità <= 0) 
            throw new Exception("Quantità <= 0");
        
        ordineVenditaCorrente.inserisciRigaOrdineVendita(selezionato, quantità);
    }
    public void confermaVendita(){
        Prodotto prodotto;
        float quantitàNecessaria;
        float quantitàDisponibile;
        for(RigaOrdineVendita corrente : ordineVenditaCorrente.getRigheOrdineVendita()){
            prodotto = corrente.getProdotto();
            quantitàDisponibile = magazzino.getQuantitàRigaMagazzino(prodotto);
            quantitàNecessaria = corrente.getQuantità();
            if(quantitàDisponibile < quantitàNecessaria)
                    ordineVenditaCorrente.setDisponibilità(false);
        }
    }
    
    public void confermaVendita(OrdineVendita ordineSelezionato){
        this.setOrdineVenditaCorrente(ordineSelezionato);
        this.ordineVenditaCorrente.setDisponibilità(true);
            
        this.confermaVendita();
    }
    public void setOrdineVenditaCorrente(OrdineVendita ordine){
        this.ordineVenditaCorrente = ordine;
    }
    
    public OrdineVendita getOrdineVenditaCorrente(){
        return this.ordineVenditaCorrente;
    }
    public String visualizzaRigheOrdinePendente(OrdineVendita ordineSelezionato){
        return ordineSelezionato.visualizzaRigheOrdine();
    }
    public List<RigaOrdineVendita> getRigheOrdineVendita(OrdineVendita ordineVenditaSelezionato){
        return ordineVenditaSelezionato.getRigheOrdineVendita();
    }
    
    public void terminaVendita(){
        Prodotto prodotto;
        float quantità;
        if(ordineVenditaCorrente.getDisponibilità()){
            for(RigaOrdineVendita corrente : ordineVenditaCorrente.getRigheOrdineVendita()){
                prodotto = corrente.getProdotto();
                quantità = corrente.getQuantità();
                this.magazzino.sottraiQuantitàRigaMagazzino(prodotto, quantità);
                corrente = null;
            }
            //nel caso di ordini pendenti vengono rimossi dalla lista
            this.listaOrdiniPendenti.remove(ordineVenditaCorrente);
        }else{ //REGISTRA VENDITA PENDENTE
            this.listaOrdiniPendenti.add(ordineVenditaCorrente);
            /*Per settare l'id pari al valore dell'indice della lista.
            * Viene settato solo quando viene inserito un nuovo ordine vendita pendente, altrimenti restano invariati
            */
            this.ordinaListaOrdiniPendenti();
        }
        ordineVenditaCorrente = null;
    }
    
    public void ordinaListaOrdiniPendenti(){
        for(OrdineVendita corrente: this.listaOrdiniPendenti)
            corrente.setId(this.listaOrdiniPendenti.indexOf(corrente));
    }
    
    public void annullaVendita(){
        this.ordineVenditaCorrente = null;
    }
    public String mostraProdottiInMagazzino(){
        return this.magazzino.mostraProdottiInMagazzino();
    }

    public boolean aggiungiProdotto(String nome, String tipo){
        boolean trovato = this.verificaPresenza(nome);
        if(trovato == false){
            Prodotto nuovoProdotto = new Prodotto(nome, tipo);
            this.listaProdotti.add(nuovoProdotto);
            if(!tipo.equalsIgnoreCase("spremuta"))
                magazzino.creaRiga(nuovoProdotto, 0);
    }
        return trovato;
    }
    public Prodotto getProdotto(String nome){
        for(Prodotto corrente : listaProdotti){
            if(corrente.getNome().equalsIgnoreCase(nome))
                return corrente;
        }
        return null;
    }
    public Ricetta getRicettaCorrente(){
        return this.ricettaCorrente;
    }
    public void setRicettaCorrente(Ricetta ricetta){
        ricettaCorrente = ricetta;
    }
    public LinkedList<Prodotto> avviaCreaRicetta(){
        this.ricettaCorrente = new Ricetta();
        return listaProdotti;
    }
    public boolean verificaPresenza(String nome){
        boolean trovato = false;
        for(RigaMagazzino corrente : this.magazzino.getRigheMagazzino()){
            if(corrente.getProdotto().getNome().equalsIgnoreCase(nome))
                trovato = true;         
        }
        return trovato;
    }
    public void inserisciRigaRicetta(Prodotto prodotto, float dose, boolean ingresso, boolean principale) throws Exception{
        ricettaCorrente.inserisciRigaRicetta(ingresso, prodotto, dose, principale);
    }
    public void terminaCreaRicetta(String nome) throws Exception{
        float dosePrincipale = 1;
        if(nome.equalsIgnoreCase(""))
            throw new Exception("Nessun nome inserito");
        //controllo che non vi sia già una ricetta con lo stesso nome
        for(Ricetta riCorrente : this.ricette){
            if(riCorrente.getNome().equalsIgnoreCase(nome)){
                throw new Exception("ricettaPresente");
            }
        }
        
        for(RigaRicetta corrente : ricettaCorrente.getRigheRicetta()){
            if(corrente.getPrincipale()){
                dosePrincipale = corrente.getDose();
            }
        }
        
        for(RigaRicetta corrente : ricettaCorrente.getRigheRicetta()){
            corrente.setDose(corrente.getDose()/dosePrincipale);
        }
        Ricetta ricetta = new Ricetta(nome, ricettaCorrente.getRigheRicetta());
        ricette.add(ricetta);
        ricettaCorrente = null;
    }
    public List<RigaRicetta> ottieniRigheRicetta(Ricetta ricettaSelezionata){
        this.ricettaCorrente = ricettaSelezionata;
        return ricettaSelezionata.getRigheRicetta();
    }
    public void impostaNuovaDose(float dose, RigaRicetta rigaRicetta) throws Exception{
        if(dose <= 0)
            throw new Exception("Dose negativa");
        this.ricettaCorrente.modificaDose(dose, rigaRicetta);
    }
    public void terminaEliminaRicetta(Ricetta ricettaSelezionata){
        ricettaSelezionata.eliminaRigheRicetta();
        ricette.remove(ricettaSelezionata);
        ricettaSelezionata = null;
    }
    public String mostraSerbatoi(){
        return this.magazzino.mostraSerbatoi();
    }
}