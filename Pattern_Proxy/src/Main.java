import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("200"), 2, new BigDecimal("0"));
        OrcamentoProxy proxy = new OrcamentoProxy(orcamento);
        System.out.println("Valor desconto antes = " + proxy.getDescontoOrcamento());
                System.out.println("Valor desconto depois= " + proxy.getDescontoOrcamento());
        System.out.println("Valor desconto antes = " + orcamento.getValorOrcamento());
        System.out.println("Valor desconto antes = " + orcamento.getDescontoOrcamento());
//2segundos
    }
}