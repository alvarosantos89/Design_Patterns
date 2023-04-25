package model;

import java.math.BigDecimal;

public class Orcamento
{
    private BigDecimal valorOrcamento;
    private String IcmsRegiao;

    public Orcamento(BigDecimal valorOrcamento, String icmsRegiao) {
        this.valorOrcamento = valorOrcamento;
        IcmsRegiao = icmsRegiao;
    }

    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    public void setValorOrcamento(BigDecimal valorOrcamento) {
        this.valorOrcamento = valorOrcamento;
    }

    public String getIcmsRegiao() {
        return IcmsRegiao;
    }

    public void setIcmsRegiao(String icmsRegiao) {
        IcmsRegiao = icmsRegiao;
    }

}
