public class Main {
    public static void main(String[] args) {
     // Classe  Objeto           Construtor
        Turista mochileiro = new Turista(); // Padrão

        // Definir formato do objeto
        mochileiro.setNome("Lindsay Lohan");
        mochileiro.setCpf(Validacao.cpf("123"));
        Turista mochileira = new Turista("Agnes"); // Personalizado
        // Definir comportamento
        String retorno = mochileira.viajar();
        System.out.println(retorno);

    }
}