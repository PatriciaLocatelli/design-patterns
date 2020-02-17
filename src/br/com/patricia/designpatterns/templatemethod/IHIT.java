package br.com.patricia.designpatterns.templatemethod;

import br.com.patricia.designpatterns.chainofresposability.Item;
import br.com.patricia.designpatterns.chainofresposability.Orcamento;
import br.com.patricia.designpatterns.strategy.Imposto;
import br.com.patricia.designpatterns.strategy.OrcamentoStrategy;

import java.util.ArrayList;
import java.util.List;

public class IHIT extends TemplateDeImpostoCondicional {

    public IHIT(Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    public double calcula(OrcamentoStrategy orcamentoStrategy) {
        return 0;
    }

    public IHIT() {
    }

    @Override
    protected double minimaTaxacao(OrcamentoStrategy orcamento) {
        return orcamento.getValor() * (0.01 * orcamento.getItens().size());
    }

    @Override
    public double maximaTaxacao(OrcamentoStrategy orcamento) {
        return orcamento.getValor() * 0.13 + 100;
    }

    @Override
    public boolean deveUsarMaximaTaxacao(OrcamentoStrategy orcamento) {
        List<String> noOrcamento = new ArrayList<String>();

        for (Item item : orcamento.getItens()) {
            if (noOrcamento.contains(item.getNome())) {
                return true;
            } else {
                noOrcamento.add(item.getNome());
            }
        }

        return false;
    }
}
