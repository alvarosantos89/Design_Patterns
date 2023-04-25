package model;

import java.math.BigDecimal;

public class IcmsRj implements CalculoPorRegiao{
    @Override
    public BigDecimal calculoPorRegiao(Orcamento orcamento) {
        return orcamento.getValorOrcamento().multiply(new
                BigDecimal("0.17"));
    }
}