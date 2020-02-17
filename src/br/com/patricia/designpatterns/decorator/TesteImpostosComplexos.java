package br.com.patricia.designpatterns.decorator;

import br.com.patricia.designpatterns.strategy.ICMS;
import br.com.patricia.designpatterns.strategy.ISS;
import br.com.patricia.designpatterns.strategy.Imposto;
import br.com.patricia.designpatterns.strategy.OrcamentoStrategy;

public class TesteImpostosComplexos {
    public static void main(String[] args) {
        Imposto iss = new ISS(new ICMS());
        Imposto impostos = new ImpostoMuitoAlto(new ICMS());
        OrcamentoStrategy orcamento = new OrcamentoStrategy(500.0);

        double valor = iss.calcula(orcamento);

        System.out.println(valor);
        System.out.println(impostos.calcula(orcamento));
    }
}
