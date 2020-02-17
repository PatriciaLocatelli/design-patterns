package br.com.patricia.designpatterns.chainofresposability;

public interface Desconto {
    double desconta(Orcamento orcamento);
    void setProximo(Desconto proximo);
}
