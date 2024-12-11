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
    <div class="container">
        <h1>Conversor de Temperatura</h1>

        <p>Bem-vindo ao <strong>Conversor de Temperatura</strong>, um projeto desenvolvido para converter valores entre as escalas Celsius, Fahrenheit e Kelvin. O sistema utiliza uma arquitetura de frontend e backend separados para aprendizado e prática de integrações web modernas.</p>

        <h2>Funcionalidades</h2>
        <ul>
            <li>Conversão de temperaturas entre Celsius, Fahrenheit e Kelvin.</li>
            <li>API REST desenvolvida em Java Spring Boot.</li>
            <li>Interface web responsiva para interação fácil com o sistema.</li>
        </ul>

        <h2>Tecnologias Utilizadas</h2>
        <ul>
            <li><strong>Backend:</strong> Java Spring Boot, Maven.</li>
            <li><strong>Frontend:</strong> HTML, CSS e JavaScript.</li>
            <li><strong>Controle de Versão:</strong> Git e GitHub.</li>
        </ul>

        <h2>Como Executar o Projeto</h2>
        <h3>Backend</h3>
        <ol>
            <li>Clone o repositório:
                <div class="code">git clone https://github.com/seu-usuario/conversor-temperatura.git</div>
            </li>
            <li>Navegue até a pasta do backend:</li>
            <div class="code">cd backend</div>
            <li>Execute o projeto:</li>
            <div class="code">./mvnw spring-boot:run</div>
            <li>A API estará disponível em <a href="http://localhost:8080">http://localhost:8080</a>.</li>
        </ol>

        <h3>Frontend</h3>
        <ol>
            <li>Clone o repositório (se ainda não tiver feito isso).</li>
            <li>Abra o arquivo <code>index.html</code> no navegador.</li>
            <li>Certifique-se de que o backend está rodando e configurado para aceitar requisições CORS.</li>
        </ol>

        <h2>Contribuição</h2>
        <p>Contribuições são bem-vindas! Sinta-se à vontade para abrir <a href="https://github.com/seu-usuario/conversor-temperatura/issues">issues</a> ou enviar pull requests.</p>

        <h2>Licença</h2>
        <p>Este projeto está licenciado sob a Licença MIT. Para mais informações, consulte o arquivo LICENSE no repositório.</p>

    </div>
