package JuicyFlow;

/**
 *
 * @author juicyflowgroup
 */
public class Prodotto {
    private String nome;
    private String tipo;
    Prodotto(Prodotto prodotto){
        this.nome = prodotto.getNome();
        this.tipo = prodotto.getTipo();
    }
    Prodotto(String nome, String tipo){
        this.nome = nome;
        this.tipo = tipo;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    @Override
    public String toString(){
        return this.nome;
    }
}
