package com.example.demo;

public class Calculadora {

    public float calculate(String option, float valor) {

        return switch (option.toUpperCase()) {
            case "CF" -> // Celsius para Fahrenheit
                    (valor * 9 / 5) + 32;
            case "CK" -> // Celsius para Kelvin
                    valor + 273.15f;
            case "FC" -> // Fahrenheit para Celsius
                    (valor - 32) * 5 / 9;
            case "KC" -> // Kelvin para Celsius
                    valor - 273.15f;
            case "KF" -> // Kelvin para Fahrenheit
                    (valor - 273.15f) * 9 / 5 + 32;
            case "FK" -> // Fahrenheit para Kelvin
                    (valor - 32) * 5 / 9 + 273.15f;
            default -> throw new IllegalArgumentException("Opção inválida");
        };
    }
}
