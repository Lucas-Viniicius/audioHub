package audioHub.modelos;

public class Podcast extends Audio {
    private String tema;
    private String nomeDosConvidados;
    private String descricao;

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
    
    // Polimorfismo: pega um método da class mãe e modifica para a propria necessidade da subclass
    @Override
    public void curtir(){
        while(true){
            this.curtidas++;
            this.classificacao++;

            System.out.println("\nPodCast: "+this.titulo+" curtido com sucesso! +1✅");
            if(this.quantidadeReproducoes > 1){
                System.out.println("O podcast: "+this.titulo+", tem "+this.curtidas+" curtida(s)");                
            }else{
               System.out.println("O podcast: "+this.titulo+", tem "+this.curtidas+" curtida"); 
            }

            System.out.print("\nDeseja curtir: "+this.titulo+", novamente ? ");
            String opcao02 = input.nextLine();
            if(opcao02.equalsIgnoreCase("nao")){
                limpaTela();
                break;
            }          
        }
    }
}
