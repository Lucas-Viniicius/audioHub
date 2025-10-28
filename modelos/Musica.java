package audioHub.modelos;

public class Musica extends Audio {
    private String nomeCantor;
    private int favoritada;
    private String genero;

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

    
    // Polimorfismo: pega um método da class mãe e modifica para a propria necessidade da subclass
    @Override
    public void reproduzir(){
        while(true){
            this.quantidadeReproducoes++;
            System.out.println("\nMúsica: "+this.titulo+", foi reproduzida com sucesso! +1✅");
            if(this.quantidadeReproducoes > 1){
                System.out.println("A música: "+this.titulo+", tem "+this.quantidadeReproducoes+" reproduções");
            }else{
                System.out.println("A música: "+this.titulo+", tem "+this.quantidadeReproducoes+" reprodução");
            }

            System.out.print("\nDeseja reproduzir: "+this.titulo+", novamente ? ");
            String opcao01 = input.nextLine();
            if(opcao01.equalsIgnoreCase("nao")){
                limpaTela();
                break;
            }        
        }
    } 
}
