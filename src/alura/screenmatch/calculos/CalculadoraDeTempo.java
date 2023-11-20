package alura.screenmatch.calculos;
import alura.screenmatch.modelos.Filme;
import alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {

    private int tempoTotal;


    public int getTempoTotal() {
        return tempoTotal;
    }
    /*polimorfismo -> poderia ter metodo com sobrescrita
    um para filme e outro para titulo, porém posso trazer direto
    a superclasse Titulo, assim posso receber Filme ou Serie*/
    public void inclui(Titulo titulo){
        tempoTotal += titulo.getDuracaoEmMinutos();
    }

}
