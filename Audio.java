package audioHub;

public class Audio {
    protected String titulo;
    protected int duracaoMinutos;
    protected int quantidadeReproducoes;
    protected int avaliacao;
    protected int quantidadeDeAvaliacoes;
    protected int classificacao;

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }

    public void setDuracaoMinutos(int duracaoMinutos){
        this.duracaoMinutos = duracaoMinutos;
    }
    public int getDuracaoMinutos(){
        return this.duracaoMinutos;
    }

    public void setAvaliacao(int avaliacao){
        this.avaliacao = avaliacao;
    }
    public int getAvaliacao() {
        return avaliacao;
    }

    public int getQuantidadeReproducoes(){
        return this.quantidadeReproducoes;
    }

    public int getClassificacao() {
        return classificacao;
    } 

    public int getQuantidadeDeAvaliacoes(){
        return this.quantidadeDeAvaliacoes;
    }
}
