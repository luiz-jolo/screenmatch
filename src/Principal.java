public class Principal {
    public static void main(String[] args){

        Filme meuFilme = new Filme();
        meuFilme.nome = "O poderoso chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.somaDasAvaliacoes = 9;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(5);
        System.out.println("A média é: " + meuFilme.retornaMedia());
    }
}
