package model;

import java.math.BigDecimal;

public class IcmsEs implements CalculoPorRegiao{
    @Override
    public BigDecimal calculoPorRegiao(Orcamento orcamento) {
        return orcamento.getValorOrcamento().multiply(new
                BigDecimal("0.12"));
    }
}