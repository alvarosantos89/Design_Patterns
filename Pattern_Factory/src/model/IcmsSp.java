package model;

import java.math.BigDecimal;

public class IcmsSp implements CalculoPorRegiao{
    @Override
    public BigDecimal calculoPorRegiao(Orcamento orcamento) {
        return orcamento.getValorOrcamento().multiply(new
                BigDecimal("0.14"));
    }
}