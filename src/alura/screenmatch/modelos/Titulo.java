package alura.screenmatch.modelos;

public class Titulo {

    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    void getFichaTecnica(){
        System.out.println("Nome: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setAnoDeLancamento(int anoDeLancamento){
        this.anoDeLancamento = anoDeLancamento;
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes ++;
    }

    public double retornaMedia(){
        return  somaDasAvaliacoes / totalDeAvaliacoes;
    }

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public int getDuracaoEmMinutos(){ return this.duracaoEmMinutos; }
    public void setDuracaoEmMinutos(int duracaoEmMinutos){
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

}
