import alura.screenmatch.calculos.CalculadoraDeTempo;
import alura.screenmatch.calculos.FiltroRecomendacao;
import alura.screenmatch.modelos.Episodio;
import alura.screenmatch.modelos.Filme;
import alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args){

        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setDuracaoEmMinutos(152);
        meuFilme.setAnoDeLancamento(1970);

        meuFilme.avalia(10);
        meuFilme.avalia(10);
        meuFilme.avalia(5);
        System.out.println("Total de avaliações é: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("A média é: " + meuFilme.retornaMedia());

        Serie minhaSerie = new Serie();
        minhaSerie.setNome("X-Man");
        minhaSerie.setMinutosPorEpisodio(10);
        minhaSerie.setTemporadas(3);
        minhaSerie.setEpisodiosPorTemporada(8);
        System.out.println("Nome da série: " + minhaSerie.getNome());
        System.out.println("Para maratonar são " + minhaSerie.getDuracaoEmMinutos() + " minutos");

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avtar");
        outroFilme.setDuracaoEmMinutos(205);
        outroFilme.setAnoDeLancamento(2015);

        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
        calculadoraDeTempo.inclui(meuFilme);
        calculadoraDeTempo.inclui(outroFilme);
        System.out.println("Usando modelo caluladora: " + calculadoraDeTempo.getTempoTotal());

        System.out.println("Filme!");
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        System.out.println("Episódio!");
        Episodio episodio = new Episodio();
        episodio.setSerie(minhaSerie);
        episodio.setNumero(2);
        episodio.setTotalVisualizacoes(2);
        episodio.getClassificacao();
        filtro.filtra(episodio);

    }
}
