package audioHub.modelos;

import java.util.Scanner;

public class Musica extends Audio {
    Scanner input = new Scanner(System.in);
    private String nomeCantor;
    private boolean favoritada;
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

    public boolean getFavoritada(){
        return this.favoritada;
    }

    
    public String getFavorita(){
        if(this.favoritada == true){
            return "✅";
        }else{
            return "❌";
        }
    }

    
    // Polimorfismo: pega um método da class mãe e modifica para a propria necessidade da subclass
    @Override
    public void reproduzir(){
        while(true){
            this.quantidadeReproducoes++;
            this.interacoes++;

            System.out.println("Música: "+this.titulo+", foi reproduzida com sucesso! +1✅");

            System.out.print("\nDeseja reproduzir: "+this.titulo+", novamente ? ");
            String opcao01 = input.nextLine();
            if(opcao01.equalsIgnoreCase("nao")){
                limpaTela();
                break;
            }        
        }
    } 

    @Override
    public int classificar(){
        if(this.interacoes >= 2000){
            return 10;
        }else if(this.interacoes >= 1000 && this.interacoes < 2000){
            return 8;
        }else{
            return 5;
        }
    }

    @Override
    public void exibirDadosDoTitulo(){
        super.exibirDadosDoTitulo();
        System.out.println("Nome do cantor: "+this.nomeCantor);
        System.out.println("Gênero: "+this.genero);
        System.out.println("Favorita: "+getFavorita());
    }

    public void tornarFavorita(){
        limpaTela();
        System.out.println("Gostou da música ? Se sim, então imagino que queria deixa-la como favoritada");
        System.out.print("Deseja favoritar a música: '"+this.titulo+"'  ? ");
        String opcao02 = input.nextLine();
        if(opcao02.equalsIgnoreCase("sim")){
            this.favoritada = true;
            limpaTela();
        }else{
            this.favoritada = false;
            limpaTela();
        }
    }
}
