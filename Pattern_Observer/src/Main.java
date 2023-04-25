import java.math.BigDecimal;
import java.util.Observer;

public class Main {
    public static void main(String[] args) {
        BigDecimal valorInicial = new BigDecimal("1900.0");
        BigDecimal desconto = new BigDecimal("10.0");
        Gerente gerente = new Gerente("João");
        Estoque estoque = new Estoque("Camiseta", valorInicial, desconto);
        estoque.attach((Observer) gerente);//attach - anexar
        estoque.setValor(valorInicial);
    }
}