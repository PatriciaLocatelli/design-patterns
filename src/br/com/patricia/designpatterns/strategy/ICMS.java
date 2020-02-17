package br.com.patricia.designpatterns.strategy;

public class ICMS extends Imposto {

    public ICMS(Imposto outroImposto) {
        super(outroImposto);
    }

    public ICMS() {
        
    }

    @Override
    public double calcula(OrcamentoStrategy orcamentoStrategy) {
        return orcamentoStrategy.getValor() * 0.1;
    }

    public double calculoDoOutroImposto(OrcamentoStrategy orcamento) {
        return outroImposto.calcula(orcamento);
    }
}
