package br.com.patricia.designpatterns.strategy;

public class ISS extends Imposto {

    public ISS(Imposto outroImposto) {
        super(outroImposto);
    }

    public ISS() {
    }

    public double calcula(OrcamentoStrategy orcamentoStrategy) {
        return orcamentoStrategy.getValor() * 0.06;
    }

    public double calculoDoOutroImposto(OrcamentoStrategy orcamento) {
        return outroImposto.calcula(orcamento);
    }
}
