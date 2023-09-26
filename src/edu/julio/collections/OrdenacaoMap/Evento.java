package collections.OrdenacaoMap;

public class Evento {
    private String nome;
    private String atracao;

    public Evento(String nome, String atracao) {
        this.nome = nome;
        this.atracao = atracao;
    }
    public String getNome() {
        return nome;
    }
    public String getAtracao() {
        return atracao;
    }
    public String toString() {
        return "Nome: " +nome+ "/Atração: " +atracao;
    }
}
