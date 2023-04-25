import model.IcmsFactory;
import model.Orcamento;

import java.math.BigDecimal;

public class TesteMainICMS {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new
                BigDecimal("800.0"), "ICMS_MG");
        IcmsFactory icmsFactory = new IcmsFactory();
        BigDecimal resultado = icmsFactory.getIcmsPorEstado(
                "ICMS_SP").calculoPorRegiao(orcamento);
        System.out.println(resultado);
    }
}