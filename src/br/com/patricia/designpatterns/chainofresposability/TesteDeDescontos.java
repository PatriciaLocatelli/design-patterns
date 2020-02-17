package br.com.patricia.designpatterns.chainofresposability;

public class TesteDeDescontos {
    public static void main(String[] args) {
        CalculadorDeDesconto descontos = new CalculadorDeDesconto();
        Orcamento orcamento = new Orcamento(500.0);
        orcamento.adicionaItem(new Item("Caneta", 250.0));
        orcamento.adicionaItem(new Item("Lápis", 250.0));
        orcamento.adicionaItem(new Item("borracha", 15.00));

        double descontoFinal = descontos.calcula(orcamento);
        System.out.println(descontoFinal);
    }
}
