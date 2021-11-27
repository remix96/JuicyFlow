package JuicyFlow;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author juicyflowgroup
 */
public class Ricetta {
    private List<RigaRicetta> righeRicetta;
    private String nome;
    
    Ricetta(){
        this.righeRicetta = new LinkedList<>();
    }
    Ricetta(String nome){
        this.nome = nome;
        this.righeRicetta = new LinkedList<>();
    }
    Ricetta(String nome, List<RigaRicetta> ricette){
        this.nome = nome;
        this.righeRicetta = ricette;
    }
    public String getNome(){
        return nome;
    }
    public List<RigaRicetta> getRigheRicetta(){
        return righeRicetta;
    }
    public void inserisciRigaRicetta(boolean ingresso, Prodotto prodotto, float dose, boolean principale) throws Exception{
        boolean contienePrincipale, contieneSpremutaInUscita;
        contienePrincipale = false;
        contieneSpremutaInUscita = false;
        
        for(RigaRicetta corrente : this.righeRicetta){
            if(corrente.getPrincipale()){
                contienePrincipale = true;
            }
            if(corrente.geTipoProdotto().equalsIgnoreCase("spremuta") && !corrente.getIngresso()){
                contieneSpremutaInUscita = true;
            }
            if(corrente.getProdotto() == prodotto){
                throw new Exception("prodottoPresente");
            }
        }
        
        if(principale && contienePrincipale){
            throw new Exception("principalePresente");
        }
        else if((prodotto.getTipo().equalsIgnoreCase("spremuta") && !ingresso) && contieneSpremutaInUscita){
            throw new Exception("spremutaUscitaPresente");
        } else {
            RigaRicetta rigaRicetta= new RigaRicetta(ingresso, prodotto, dose, principale);
            righeRicetta.add(rigaRicetta);
        }
    }
    public void eliminaRigheRicetta(){
        righeRicetta = null;
    }
    public void modificaDose(float dose, RigaRicetta riga){
        riga.setDose(dose);
    }
    @Override
    public String toString(){
        return this.nome;
    }
}
