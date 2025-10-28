package audioHub.modelos;

import java.util.Scanner;

public class Audio {
    Scanner input = new Scanner(System.in);
    protected String titulo;
    protected int quantidadeReproducoes;
    protected int classificacao;
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

    public int getClassificacao() {
        return this.classificacao;
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
            System.out.println("\n"+this.titulo+" foi reproduzido(a) com sucesso! +1✅");
            if(this.quantidadeReproducoes > 1){
                System.out.println(this.titulo+" tem "+this.quantidadeReproducoes+" reproduções");
            }else{
                System.out.println(this.titulo+" tem "+this.quantidadeReproducoes+" reprodução");
            }

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
            System.out.println("\n"+this.titulo+" foi curtido(a) com sucesso! +1✅");
            if(this.quantidadeReproducoes > 1){
                System.out.println(this.titulo+" tem "+this.curtidas+" curtidas");
            }else{
                System.out.println(this.titulo+" tem "+this.curtidas+" curtida");
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
