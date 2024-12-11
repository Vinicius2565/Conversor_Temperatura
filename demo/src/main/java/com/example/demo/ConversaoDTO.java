package com.example.demo;

public class ConversaoDTO {
    private String option; // 'f', 'k', 'c', 'r'
    private float valor; // Valor numérico para conversão

    // Getters e Setters
    public String getOption() {
        return option;
    }

    public void setOpcao(char opcao) {
        this.option = option;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
