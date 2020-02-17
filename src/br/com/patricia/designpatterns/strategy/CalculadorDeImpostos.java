package br.com.patricia.designpatterns.strategy;

public class CalculadorDeImpostos {

    public void realizaCalculoICMS(OrcamentoStrategy orcamentoStrategy, Imposto impostoQualquer) {
        double icms = impostoQualquer.calcula(orcamentoStrategy);
        System.out.println(icms);
    }

}
