package br.com.patricia.designpatterns.templatemethod;

import br.com.patricia.designpatterns.chainofresposability.Item;
import br.com.patricia.designpatterns.chainofresposability.Orcamento;
import br.com.patricia.designpatterns.strategy.Imposto;
import br.com.patricia.designpatterns.strategy.OrcamentoStrategy;

public class IKCV extends TemplateDeImpostoCondicional {

    public IKCV() {}

    public IKCV(Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    public double calcula(OrcamentoStrategy orcamentoStrategy) {
        return 0;
    }

    private boolean temMaiorQue100ReaisNo(OrcamentoStrategy orcamento) {
        for (Item item : orcamento.getItens()) {
            if (item.getValor() > 100) {
                return true;
            }
        }
        return false;
    }

    @Override
    protected double minimaTaxacao(OrcamentoStrategy orcamento) {
        return orcamento.getValor() * 0.06;
    }

    @Override
    public double maximaTaxacao(OrcamentoStrategy orcamento) {
        return orcamento.getValor() * 0.10;
    }

    @Override
    public boolean deveUsarMaximaTaxacao(OrcamentoStrategy orcamento) {
        return orcamento.getValor() > 500 && temMaiorQue100ReaisNo(orcamento);
    }
}
