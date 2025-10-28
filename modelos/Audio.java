package audioHub.modelos;

import java.util.Scanner;

public class Audio {
    Scanner input = new Scanner(System.in);
    protected String titulo;
    protected int quantidadeReproducoes;
    protected int interacoes;
    protected int curtidas;

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }

    public int getQuantidadeReproducoes(){
        return this.quantidadeReproducoes;
    }

    public int getinteracoes() {
        return this.interacoes;
    } 

    public int getCurtidas(){
        return this.curtidas;
    }

    public void limpaTela(){
        System.out.print("\033[H\033[2J"); // Limpar a tela
        System.out.flush();
    }

    
    public void reproduzir(){
        while (true){
            this.quantidadeReproducoes++;
            System.out.println(this.titulo+" foi reproduzido(a) com sucesso! +1✅");


            System.out.print("\nDeseja reproduzir: "+this.titulo+", novamente ? ");
            String opcao01 = input.nextLine();
            if(opcao01.equalsIgnoreCase("nao")){
                limpaTela();
                break;
            }
        } 
    }

    public void curtir(){
        while(true){
            this.curtidas++;
            System.out.println(this.titulo+" foi curtido(a) com sucesso! +1✅");

            System.out.print("\nDeseja curtir: "+this.titulo+", novamente ? ");
            String opcao02 = input.nextLine();
            if(opcao02.equalsIgnoreCase("nao")){
                limpaTela();
                break;
            }          
        }
    }

    public int classificar(){
        if(this.interacoes > 100){
            return 10;
        }else if(this.interacoes >= 50 && this.interacoes <= 100){
            return 8;
        }else{
            return 5;
        }
    }

    public void exibirDadosDoTitulo(){
        limpaTela();
        System.out.println("\n****************************");
        System.out.println("      DADOS DO TITULO");
        System.out.println("****************************\n");
        System.out.println("\nTitulo: "+this.titulo);
        System.out.println("Quantidade de reproduções: "+this.quantidadeReproducoes);
        System.out.println("Quantidade de Curtidas: "+this.curtidas);
    }
}
