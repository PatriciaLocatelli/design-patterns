package br.com.patricia.designpatterns.templatemethod;

import br.com.patricia.designpatterns.strategy.Imposto;
import br.com.patricia.designpatterns.strategy.OrcamentoStrategy;

public class ICPP extends TemplateDeImpostoCondicional {

    public ICPP() {
    }

    public ICPP(Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    public double calcula(OrcamentoStrategy orcamentoStrategy) {
        return 0;
    }

    @Override
    protected double minimaTaxacao(OrcamentoStrategy orcamento) {
        return orcamento.getValor() * 0.05;
    }

    @Override
    public double maximaTaxacao(OrcamentoStrategy orcamento) {
        return orcamento.getValor() * 0.07;
    }

    @Override
    public boolean deveUsarMaximaTaxacao(OrcamentoStrategy orcamento) {
        return orcamento.getValor() > 500;
    }
}
