package audioHub;

public class Musica extends Audio {
    private String nomeCantor;
    private int favoritada;
    private String genero;
    private int reproducao;

    public void setNomeCantor(String nomeCantor){
        this.nomeCantor = nomeCantor;
    }
    public String getNomeCantor(){
        return this.nomeCantor;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }
    public String getGenero(){
        return this.genero;
    }

    public int getFavoritada(){
        return this.favoritada;
    }
}
