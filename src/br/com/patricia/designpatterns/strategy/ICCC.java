package br.com.patricia.designpatterns.strategy;

public class ICCC extends Imposto {
    public ICCC(Imposto outroImposto) {
        super(outroImposto);
    }

    public ICCC() {
    }

    @Override
    public double calcula(OrcamentoStrategy orcamentoStrategy) {
        if (orcamentoStrategy.getValor() < 1000) {
            return orcamentoStrategy.getValor() * 0.05;
        } else if (orcamentoStrategy.getValor() <= 3000) {
            return orcamentoStrategy.getValor() * 0.07;
        } else {
            return orcamentoStrategy.getValor() * 0.08 + 30;
        }
    }

    public double calculoDoOutroImposto(OrcamentoStrategy orcamento) {
        return outroImposto.calcula(orcamento);
    }
}

