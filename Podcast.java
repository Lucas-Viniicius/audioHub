package audioHub;

public class Podcast extends Audio {
    private String tema;
    private String nomeDosConvidados;
    private String descricao;
    private int curtidas;

    public void setTema(String tema){
        this.tema = tema;
    }
    public String getTema(){
        return this.tema;
    }

    public void setNomeDosConvidados(String nomeDosConvidados){
        this.nomeDosConvidados = nomeDosConvidados;
    }
    public String getNomeDosConvidados(){
        return this.nomeDosConvidados;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return this.descricao;
    }
}
