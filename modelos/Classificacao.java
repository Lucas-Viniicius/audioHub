package audioHub.modelos;

public class Classificacao{
    
    public void mostrarClassificacao(Audio audio){
        if(audio.classificar() == 10){
            System.out.println("Classificação do titulo: '"+audio.getTitulo()+"' -> Sucesso absoluto!");
        }else if(audio.classificar() == 8){
            System.out.println("Classificação: do titulo: '"+audio.getTitulo()+ "' -> Muito boa!");
        }else{
            System.out.println("Classificação: do titulo: '"+audio.getTitulo()+"' -> Boa!");
        }
    }
}
