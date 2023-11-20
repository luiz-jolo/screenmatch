package alura.screenmatch.calculos;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4){
            System.out.println("Está entre os preferidos");
        }else {
            System.out.println("Não é preferido");
        }
    }
}