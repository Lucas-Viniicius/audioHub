package audioHub;

import java.util.Scanner;

import audioHub.modelos.*;

public class MainAudioHub {

    static void limparTela(){
        System.out.print("\033[H\033[2J"); // Limpar a tela
        System.out.flush();
    }
    
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        //MÚSCAs
        Musica musica01 = new Musica();
        musica01.setTitulo("A hora é agora");
        musica01.setGenero("Sertanejo");
        musica01.setNomeCantor("Jorge e Matheus");
        limparTela();
        System.out.print("Deseja reproduzir a música: "+musica01.getTitulo()+" ? ");
        String opcao01m = input.nextLine();
        if(opcao01m.equalsIgnoreCase("sim")){
            musica01.reproduzir();
        }

        System.out.print("\nDeseja curtir a música: "+musica01.getTitulo()+" ? ");
        String opcao02m = input.nextLine();
        if(opcao02m.equalsIgnoreCase("sim")){
            musica01.curtir();
        }


        // PODCASTs:
        Podcast podcast01 = new Podcast();
        podcast01.setTitulo("PodPah Weslwy Alemão");
        podcast01.setDescricao("O próprio weslwy alemão, fala sobre a história dele: De como ele conseguiu vencer na vida.");
        podcast01.setNomeDosConvidados("Weslwy Alemão, Igão e Mítico");
        podcast01.setTema("Perguntas sobre a história do vonidado");

        System.out.print("\nDeseja reproduzir: "+podcast01.getTitulo()+" ? ");
        String opcao01p = input.nextLine();
        if(opcao01p.equalsIgnoreCase("sim")){
            podcast01.reproduzir();
        }

        System.out.print("\nDeseja curtir o podcast: "+podcast01.getTitulo()+" ? ");
        String opcao02p = input.nextLine();
        if(opcao02p.equalsIgnoreCase("sim")){
            podcast01.curtir();
        }

        
        System.out.println("Obrigado por acessar nossos serviços!!");
    }
}
