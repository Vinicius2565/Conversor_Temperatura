# Conversor de Temperatura

Simulação de um conversor de temperaturas para converter valores entre Celsius, Fahrenheit e Kelvin. Desenvolvido para praticar conceitos de desenvolvimento web com integração de frontend e backend.

## Funcionalidades

- **Conversão de Temperaturas**: Permite converter valores entre Celsius, Fahrenheit e Kelvin.
- **Interface de Usuário**: Frontend responsivo para inserção de dados e visualização dos resultados.
- **API REST**: Backend robusto para manipulação dos dados de forma segura e eficiente.

## Estrutura do Projeto

- **Backend**: Desenvolvido em Java com Spring Boot. Fornece uma API REST com endpoints para realizar as conversões.
- **Frontend**: Desenvolvido com HTML, CSS e JavaScript, permitindo uma interação amigável para o usuário.

## Requisitos

- Java 8 ou superior
- Browser moderno para executar o frontend

## Como Executar

### Backend

1. Clone o repositório:
    ```bash
    git clone https://github.com/seu-usuario/conversor-temperatura.git
    ```

2. Navegue até a pasta do backend:
    ```bash
    cd backend
    ```

3. Inicie o servidor:
    ```bash
    ./mvnw spring-boot:run
    ```

### Frontend

1. Clone o repositório (se ainda não tiver feito isso).
2. Abra o arquivo `index.html` no navegador.
3. Certifique-se de que o backend está rodando e configurado para aceitar requisições CORS.

## Exemplo de Uso

Exemplo de chamada à API utilizando JavaScript:

```javascript
fetch("http://localhost:8080/api/converter", {
    method: "POST",
    headers: {
        "Content-Type": "application/json"
    },
    body: JSON.stringify({
        opcao: "CelsiusParaFahrenheit",
        valor: 25
    })
})
.then(response => response.json())
.then(data => console.log(data))
.catch(error => console.error("Erro:", error));
```

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests para aprimorar o projeto.

## Licença

Este projeto está licenciado sob a Licença MIT.
