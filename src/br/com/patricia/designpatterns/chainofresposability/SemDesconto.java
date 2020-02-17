package br.com.patricia.designpatterns.chainofresposability;

public class SemDesconto implements Desconto {
    public double desconta(Orcamento orcamento) {
        return 0;
    }

    public void setProximo(Desconto desconto) {
        // nao tem!
    }
}
