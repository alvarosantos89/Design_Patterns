import java.math.BigDecimal;
public class Gerente implements Observer {
    private String nome;//coloque os atributos que desejar
    public Gerente(){}; //Construtoras
    public Gerente(String nome) {
        this.nome = nome;
    }
    @Override
    public void update(Estoque estoque) {
        BigDecimal valor = estoque.getValor();
        BigDecimal limite = new BigDecimal("1000.0");
        if (valor.compareTo(limite) > 0) {
            System.out.println("Gerente " + nome + ": Valor do produto " + estoque.getProduto() + " é maior que 1000.");
        } // veja nosso método, se entrar no estoque compra acima de mil, o gerente será avisado.
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
