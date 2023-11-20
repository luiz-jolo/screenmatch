package alura.screenmatch.modelos;

public class Serie extends Titulo{
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;
    private int temporadas;
    private boolean ativa;

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }
    public void setTemporadas(int temporadas){
        this.temporadas = temporadas;
    }
    public int getTemporadas(){
        return this.temporadas;
    }

    public void setAtiva(boolean ativa){
        this.ativa = ativa;
    }

    public boolean getAtiva(){
        return this.ativa;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    //função com cunho educativo
    @Override
    public int getDuracaoEmMinutos(){
        return episodiosPorTemporada* episodiosPorTemporada * minutosPorEpisodio;
    }

}
