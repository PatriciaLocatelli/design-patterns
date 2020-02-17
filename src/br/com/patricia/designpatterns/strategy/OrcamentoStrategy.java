package br.com.patricia.designpatterns.strategy;

import br.com.patricia.designpatterns.chainofresposability.Item;

import java.util.ArrayList;
import java.util.List;

public class OrcamentoStrategy{

    private final double valor;
    private final List<Item> itens;

    public OrcamentoStrategy(double valor) {
        this.valor = valor;
        itens = new ArrayList<Item>();
    }

    public double getValor() {
        return valor;
    }

    public void adicionaItem(Item item){
        itens.add(item);
    }

    public List<Item> getItens() {
        return itens;
    }
}
