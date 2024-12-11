package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calculadora")
public class CalculadoraController {

    private final Calculadora calculadora = new Calculadora();

    @PostMapping("/converter")
    public ResultadoDTO converter(@RequestBody ConversaoDTO conversao) {
        float resultado = calculadora.calculate(conversao.getOption(), conversao.getValor());
        return new ResultadoDTO(resultado);
    }
}
