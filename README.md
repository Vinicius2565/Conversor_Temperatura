<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Conversor de Temperatura</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            line-height: 1.6;
            background-color: #f4f4f9;
            margin: 0;
            padding: 0;
        }

        .container {
            max-width: 800px;
            margin: 20px auto;
            background: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
        }

        h1, h2 {
            color: #333;
        }

        h1 {
            text-align: center;
            margin-bottom: 20px;
        }

        ul {
            list-style: disc;
            margin-left: 20px;
        }

        .code {
            background-color: #f4f4f4;
            border: 1px solid #ddd;
            padding: 10px;
            border-radius: 5px;
            overflow-x: auto;
        }

        a {
            color: #007BFF;
            text-decoration: none;
        }

        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Conversor de Temperatura</h1>

        <p>Simulação de um conversor de temperaturas para converter valores entre Celsius, Fahrenheit e Kelvin. Desenvolvido para praticar conceitos de desenvolvimento web com integração de frontend e backend.</p>

        <h2>Funcionalidades</h2>
        <ul>
          <li><strong>Conversão de Temperaturas</strong>: Permite converter valores entre Celsius, Fahrenheit e Kelvin.</li>
          <li><strong>Interface de Usuário</strong>: Frontend responsivo para inserção de dados e visualização dos resultados.</li>
          <li><strong>API REST</strong>: Backend robusto para manipulação dos dados de forma segura e eficiente.</li>
        </ul>

        <h2>Estrutura do Projeto</h2>
        <ul>
          <li><strong>Backend</strong>: Desenvolvido em Java com Spring Boot. Fornece uma API REST com endpoints para realizar as conversões.</li>
          <li><strong>Frontend</strong>: Desenvolvido com HTML, CSS e JavaScript, permitindo uma interação amigável para o usuário.</li>
        </ul>

        <h2>Requisitos</h2>
        <ul>
          <li>Java 8 ou superior</li>
          <li>Browser moderno para executar o frontend</li>
        </ul>

        <h2>Como Executar</h2>
        <h3>Backend</h3>
        <ol>
          <li>Clone o repositório:
            <pre class="code">git clone https://github.com/seu-usuario/conversor-temperatura.git</pre>
          </li>
          <li>Navegue até a pasta do backend:
            <pre class="code">cd backend</pre>
          </li>
          <li>Inicie o servidor:
            <pre class="code">./mvnw spring-boot:run</pre>
          </li>
        </ol>

        <h3>Frontend</h3>
        <ol>
          <li>Clone o repositório (se ainda não tiver feito isso).</li>
          <li>Abra o arquivo <code>index.html</code> no navegador.</li>
          <li>Certifique-se de que o backend está rodando e configurado para aceitar requisições CORS.</li>
        </ol>

        <h2>Exemplo de Uso</h2>
        <pre class="code">
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
        </pre>

        <h2>Contribuição</h2>
        <p>Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests para aprimorar o projeto.</p>

        <h2>Licença</h2>
        <p>Este projeto está licenciado sob a Licença MIT.</p>
    </div>
</body>
</html>
