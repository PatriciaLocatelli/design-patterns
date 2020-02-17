package br.com.patricia.designpatterns.templatemethod;

import br.com.patricia.designpatterns.strategy.Imposto;
import br.com.patricia.designpatterns.strategy.OrcamentoStrategy;

public abstract class TemplateDeImpostoCondicional extends Imposto{

    public TemplateDeImpostoCondicional(Imposto outroImposto) {
        super(outroImposto);
    }

    public TemplateDeImpostoCondicional() {
    }

    protected abstract double minimaTaxacao(OrcamentoStrategy orcamento);

    public abstract double maximaTaxacao(OrcamentoStrategy orcamento);

    public abstract boolean deveUsarMaximaTaxacao(OrcamentoStrategy orcamento);
}
