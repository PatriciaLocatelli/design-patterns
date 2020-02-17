package br.com.patricia.designpatterns.decorator;

import br.com.patricia.designpatterns.strategy.Imposto;
import br.com.patricia.designpatterns.strategy.OrcamentoStrategy;

public class ImpostoMuitoAlto extends Imposto {

    public ImpostoMuitoAlto(Imposto imposto) {
        super(imposto);
    }

    public ImpostoMuitoAlto() {
        super();
    }

    public double calcula(OrcamentoStrategy orcamento) {
        return orcamento.getValor() * 0.2 + calculoDoOutroImposto(orcamento);
    }

}
