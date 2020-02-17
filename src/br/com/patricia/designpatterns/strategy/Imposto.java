package br.com.patricia.designpatterns.strategy;

public abstract class Imposto {

    protected final Imposto outroImposto;

    public Imposto() {
        this.outroImposto = null;
    }

    public Imposto(Imposto outroImposto) {
        this.outroImposto = outroImposto;
    }

    public abstract double calcula(OrcamentoStrategy orcamentoStrategy);

    protected double calculoDoOutroImposto(OrcamentoStrategy orcamento) {
        if (outroImposto == null) {
            return 0;
        }
        return outroImposto.calcula(orcamento);
    }
}
