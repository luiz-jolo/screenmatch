import alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args){

        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);

        meuFilme.avalia(10);
        meuFilme.avalia(10);
        meuFilme.avalia(5);
        System.out.println("Total de avaliações é: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("A média é: " + meuFilme.retornaMedia());

    }
}
