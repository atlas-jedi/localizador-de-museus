Readme - API de Busca de Museus
===============================

Este é um projeto Java que implementa uma API web usando o framework Spring para facilitar a busca por museus com base em sua localização. Os dados utilizados foram obtidos da série histórica do Cadastro Nacional de Museus disponível em [dados.cultura.gov.br](http://dados.cultura.gov.br/dataset/series-historicas-cadastro-nacional-de-museus).

Funcionalidades Principais
--------------------------

1.  **Busca de Museus por Localização**: A API permite a busca de museus com base em critérios de localização, fornecendo informações detalhadas sobre os museus encontrados.

Capacidades Demonstradas
------------------------

Este projeto demonstra várias capacidades essenciais para o desenvolvimento de aplicativos em Java com o framework Spring:

*   **Criação de Classes de Controle e Rotas**: Foram criadas classes de controle que definem as rotas da API para acessar as funcionalidades.
    
*   **Criação de Classes de Serviço**: As classes de serviço são responsáveis por conter a lógica de negócios da aplicação, separando-a das classes de controle.
    
*   **Injeção de Dependências**: O Spring Framework é usado para realizar a injeção de dependências, melhorando a modularidade e testabilidade do código.
    
*   **Tratamento de Exceções Customizadas**: Foram implementadas exceções personalizadas para lidar com situações específicas de erro.
    
*   **Gerenciamento de Exceções da API**: Um sistema de gerenciamento de erros robusto foi implementado para tratar exceções de forma adequada e retornar respostas significativas para o cliente.
    
*   **Testes Unitários**: Foram criados testes unitários para garantir a cobertura de código e a qualidade do software.
    
*   **Configuração Docker**: Uma configuração Docker foi criada para facilitar a implantação e execução da aplicação em contêineres.
    

Tecnologias Utilizadas
----------------------

*   **Docker**: Para containerização da aplicação.
    
*   **Java**: Linguagem de programação principal.
    
*   **Spring**: Framework utilizado para desenvolver a API.
    
*   **JUnit**: Framework de teste unitário.
    
*   **Maven**: Gerenciador de dependências e build.
    

Pré-requisitos
--------------

Antes de executar o projeto, certifique-se de que as seguintes ferramentas estejam instaladas:

*   Java 8 ou superior
*   Maven

Como Executar o Projeto
-----------------------

Siga os passos abaixo para executar o projeto:

1.  Clone este repositório para sua máquina local:
    
    bash
    
    ```bash
    git clone https://github.com/seu-usuario/nome-do-repositorio.git
    ```
    
2.  Acesse o diretório do projeto:
    
    arduino
    
    ```arduino
    cd nome-do-repositorio
    ```
    
3.  Execute o maven para instalar dependências e executar os testes
    
    `mvn install`
    

Como Testar a Aplicação
-----------------------

Basta executar o comando do maven: `mvn test`

Contribuição
------------

Sinta-se à vontade para contribuir com este projeto. Você pode abrir problemas (issues) ou enviar solicitações de pull (pull requests) para melhorias ou correções.

Licença
-------

Este projeto está licenciado sob a [Licença MIT](LICENSE). Sinta-se à vontade para utilizá-lo conforme necessário.

---
