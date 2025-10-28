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
            this.interacoes++;

            System.out.println("PodCast: "+this.titulo+", foi curtido com sucesso! +1✅");

            System.out.print("\nDeseja curtir: "+this.titulo+", novamente ? ");
            String opcao02 = input.nextLine();
            if(opcao02.equalsIgnoreCase("nao")){
                limpaTela();
                break;
            }          
        }
    }

    @Override
    public int classificar(){
        if(this.interacoes >= 500){
            return 10;
        }else if(this.interacoes >= 250 && this.interacoes < 500){
            return 8;
        }else{
            return 5;
        }
    }

    @Override
    public void exibirDadosDoTitulo(){
        super.exibirDadosDoTitulo();
        System.out.println("Nome dos convidados: "+this.nomeDosConvidados);
        System.out.println("Descrição: "+this.descricao);
    }
}
